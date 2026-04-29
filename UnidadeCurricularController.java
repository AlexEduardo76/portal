package br.com.taskflow.controller;

import br.com.taskflow.dto.*;
import br.com.taskflow.service.FrequenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/frequencias")
@CrossOrigin("*")
public class FrequenciaController {

    @Autowired
    private FrequenciaService service;

    /**
     * Salvar uma nova aula com as frequências
     */
    @PostMapping("/salvar-aula")
    public ResponseEntity<?> salvarAula(@RequestBody AulaDTO aulaDTO) {
        try {
            service.salvarAula(aulaDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body("Aula salva com sucesso!");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    /**
     * Buscar relatório de frequências por turma e UC
     */
    @GetMapping("/relatorio")
    public ResponseEntity<?> buscarRelatorio(
            @RequestParam("turmaId") Long turmaId,
            @RequestParam("ucId") Long ucId) {
        try {
            RelatorioFrequenciaDTO relatorio = service.buscarFrequenciasPorTurmaEUc(turmaId, ucId);
            return ResponseEntity.ok(relatorio);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    /**
     * Buscar aulas salvas por turma e UC
     */
    @GetMapping("/aulas")
    public ResponseEntity<?> buscarAulas(
            @RequestParam("turmaId") Long turmaId,
            @RequestParam("ucId") Long ucId) {
        try {
            List<AulaResumoDTO> aulas = service.buscarAulasPorTurmaEUc(turmaId, ucId);
            return ResponseEntity.ok(aulas);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}