package br.com.portal.controller;

import br.com.taskflow.model.Aluno;
import br.com.taskflow.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")
@CrossOrigin("*")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping("/turma/{turmaId}")
    public List<Aluno> listarPorTurma(@PathVariable Long turmaId) {
        return service.listarPorTurma(turmaId);
    }

    @PostMapping("/turma/{turmaId}")
    public Aluno criar(@PathVariable Long turmaId, @RequestBody Aluno aluno) {
        return service.salvar(aluno, turmaId);
    }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno aluno) {
        return service.atualizar(id, aluno);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
    // Em Turma.java

}