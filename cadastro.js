<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de Frequência Escolar</title>
</head>

<body>

<header>
    <h1>Sistema de Frequência Escolar</h1>
</header>

<main>
    <section id="secao-cabecalho">
        <fieldset>
            <legend><h2>Informações da Aula</h2></legend>

            <form id="form-aula">
                <p>
                    <label for="turma">Turma:</label><br>
                    <input id="turma" name="turma" type="text" readonly style="background-color: #f0f0f0;">
                </p>

                <p>
                    <label for="uc">Unidade Curricular:</label><br>
                    <select id="uc" name="uc" required>
                        <option value="">Selecione uma UC</option>
                    </select>
                </p>

                <p>
                    <label for="dataAula">Data da Aula:</label><br>
                    <input id="dataAula" name="dataAula" type="date" required>
                </p>

                <p>
                    <label for="numeroAula">Número da Aula (ordem sequencial):</label><br>
                    <input id="numeroAula" name="numeroAula" type="number" min="1" placeholder="Ex: 1, 2, 3..." required>
                </p>
            </form>
        </fieldset>
    </section>

    <hr>

    <section id="secao-alunos">
        <h2>Lista de Alunos</h2>

        <div id="info-turma">
            <strong>Turma:</strong> <span id="nomeTurma">-</span> |
            <strong>Total de Alunos:</strong> <span id="totalAlunos">0</span>
        </div>
        <br>

        <table border="1" width="100%" id="tabela-presenca">
            <caption>Lista de alunos - Marque a presença</caption>
            <thead>
            <tr>
                <th scope="col">Matrícula</th>
                <th scope="col">Nome</th>
                <th scope="col">Presença</th>
                <th scope="col">Status</th>
            </tr>
            </thead>
            <tbody id="listaAlunos">
            </tbody>
        </table>
    </section>

    <hr>

    <section id="secao-historico">
        <h2>Lista de Aulas Salvas</h2>

        <button id="btnNovaAula" type="button">Nova Aula</button>
        <br><br>

        <table border="1" width="100%">
            <thead>
            <tr>
                <th scope="col">Nº Aula</th>
                <th scope="col">Data</th>
                <th scope="col">UC</th>
                <th scope="col">Status</th>
            </tr>
            </thead>
            <tbody id="listaAulas">
            </tbody>
        </table>
    </section>

    <hr>

    <section id="container-alertas" aria-live="polite">
        <h2>Alertas de Frequência</h2>
        <div id="alertasFrequencia"></div>
    </section>

    <hr>

    <footer>
        <button id="btnSalvar" type="button" style="padding: 10px 20px;">
            <strong>SALVAR FREQUÊNCIA NO SISTEMA</strong>
        </button>
        <button id="btnLimpar" type="button" style="padding: 10px 20px;">
            <strong>LIMPAR AULA ATUAL</strong>
        </button>
        <a href="index.html">
            <button type="button">Voltar para Turma</button>
        </a>
    </footer>
</main>

<script src="js/frequencia.js"></script>
</body>

</html>