package br.com.taskflow.dto;

import java.time.LocalDate;

public class AulaResumoDTO {

    private Integer numeroAula;
    private LocalDate data;
    private Long ucId;
    private String ucNome;
    private String status;

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

    public String getUcNome() {
        return ucNome;
    }

    public void setUcNome(String ucNome) {
        this.ucNome = ucNome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}