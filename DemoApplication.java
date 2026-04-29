package br.com.taskflow.controller;

import br.com.taskflow.model.UnidadeCurricular;
import br.com.taskflow.service.UnidadeCurricularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ucs")
@CrossOrigin("*")
public class UnidadeCurricularController {

    @Autowired
    private UnidadeCurricularService service;

    @GetMapping("/turma/{turmaId}")
    public List<UnidadeCurricular> listarPorTurma(@PathVariable Long turmaId) {
        return service.listarPorTurma(turmaId);
    }

    @PostMapping("/turma/{turmaId}")
    public UnidadeCurricular criar(@PathVariable Long turmaId, @RequestBody UnidadeCurricular uc) {
        return service.salvar(uc, turmaId);
    }

    @GetMapping("/{id}")
    public UnidadeCurricular buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public UnidadeCurricular atualizar(@PathVariable Long id, @RequestBody UnidadeCurricular uc) {
        return service.atualizar(id, uc);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}