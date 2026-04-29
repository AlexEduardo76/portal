package br.com.taskflow.controller;

import br.com.taskflow.model.Turma;
import br.com.taskflow.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/turmas")
@CrossOrigin("*")
public class TurmaController {

    @Autowired
    private TurmaService service;

    @GetMapping
    public List<Turma> listar() {
        return service.listarTodas();
    }

    @GetMapping("/instrutor/{instrutorId}")
    public List<Turma> listarPorInstrutor(@PathVariable Long instrutorId) {
        return service.listarPorInstrutor(instrutorId);
    }

    @PostMapping
    public Turma criar(@RequestBody Turma turma) {
        return service.salvar(turma);
    }

    @GetMapping("/{id}")
    public Turma buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Turma atualizar(@PathVariable Long id, @RequestBody Turma turma) {
        return service.atualizar(id, turma);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
    // Em Turma.java

}