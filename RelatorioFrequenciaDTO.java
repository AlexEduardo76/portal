package br.com.taskflow.dto;

import java.time.LocalDate;
import java.util.List;

public class AulaDTO {

    private Integer numeroAula;
    private LocalDate data;
    private Long ucId;
    private List<PresencaDTO> presencas;

    // Getters e Setters
    public Integer getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(Integer numeroAula) {
        this.numeroAula = numeroAula;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getUcId() {
        return ucId;
    }

    public void setUcId(Long ucId) {
        this.ucId = ucId;
    }

    public List<PresencaDTO> getPresencas() {
        return presencas;
    }

    public void setPresencas(List<PresencaDTO> presencas) {
        this.presencas = presencas;
    }
}