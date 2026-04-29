// URL da API Spring Boot (CORRIGIDA)
const API_URL = "http://localhost:8081/api/usuarios";  // ← AQUI ESTÁ O ERRO!

function cadastrar() {
    const nome = document.getElementById("nome").value.trim();
    const email = document.getElementById("email").value.trim();
    const senha = document.getElementById("senha").value;
    const confirmarSenha = document.getElementById("confirmarSenha").value;
    const msg = document.getElementById("mensagem");

    msg.textContent = "";

    // Validações
    if (nome === "" || email === "" || senha === "" || confirmarSenha === "") {
        msg.textContent = "Preencha todos os campos.";
        msg.style.color = "red";
        return;
    }

    if (nome.length < 3) {
        msg.textContent = "Nome deve ter pelo menos 3 caracteres.";
        msg.style.color = "red";
        return;
    }

    const emailRegex = /^[^\s@]+@([^\s@]+\.)+[^\s@]+$/;
    if (!emailRegex.test(email)) {
        msg.textContent = "Digite um e-mail válido.";
        msg.style.color = "red";
        return;
    }

    if (senha.length < 6) {
        msg.textContent = "A senha deve ter pelo menos 6 caracteres.";
        msg.style.color = "red";
        return;
    }

    if (senha !== confirmarSenha) {
        msg.textContent = "As senhas não conferem.";
        msg.style.color = "red";
        return;
    }

    // Monta o objeto para enviar ao back-end
    const novoUsuario = {
        nome: nome,
        email: email,
        senha: senha
    };

    // Envia para o back-end Spring Boot
    fetch(API_URL + "/cadastrar", {  // ← URL completa: http://localhost:8080/api/usuarios/cadastrar
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(novoUsuario)
    })
        .then(response => {
            if (response.ok) {
                return response.json();
            } else {
                return response.text().then(text => { throw new Error(text) });
            }
        })
        .then(usuario => {
            msg.textContent = "Cadastro realizado com sucesso! Redirecionando...";
            msg.style.color = "green";

            // Limpa o formulário
            document.getElementById("nome").value = "";
            document.getElementById("email").value = "";
            document.getElementById("senha").value = "";
            document.getElementById("confirmarSenha").value = "";

            setTimeout(() => {
                window.location.href = "login.html";
            }, 1500);
        })
        .catch(erro => {
            console.error("Erro:", erro);
            if (erro.message.includes("Email já cadastrado")) {
                msg.textContent = "Este e-mail já está cadastrado.";
            } else {
                msg.textContent = "Erro ao cadastrar. Verifique se o servidor está rodando na porta 8080.";
            }
            msg.style.color = "red";
        });
}

function irLogin() {
    window.location.href = "login.html";
}

window.onload = () => {
    const savedTheme = localStorage.getItem("theme") || "light";
    document.body.setAttribute("data-theme", savedTheme);
};