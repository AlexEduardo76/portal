package br.com.taskflow.dto;

import java.util.List;

public class AlunoFrequenciaDTO {

    private Long id;
    private String nome;
    private String matricula;
    private List<Boolean> faltas;
    private Integer totalPresencas;
    private Integer totalFaltas;
    private Double percentualPresenca;
    private Boolean temDuasFaltasConsecutivas;
    private Boolean alertaPercentual;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Boolean> getFaltas() {
        return faltas;
    }

    public void setFaltas(List<Boolean> faltas) {
        this.faltas = faltas;
    }

    public Integer getTotalPresencas() {
        return totalPresencas;
    }

    public void setTotalPresencas(Integer totalPresencas) {
        this.totalPresencas = totalPresencas;
    }

    public Integer getTotalFaltas() {
        return totalFaltas;
    }

    public void setTotalFaltas(Integer totalFaltas) {
        this.totalFaltas = totalFaltas;
    }

    public Double getPercentualPresenca() {
        return percentualPresenca;
    }

    public void setPercentualPresenca(Double percentualPresenca) {
        this.percentualPresenca = percentualPresenca;
    }

    public Boolean getTemDuasFaltasConsecutivas() {
        return temDuasFaltasConsecutivas;
    }

    public void setTemDuasFaltasConsecutivas(Boolean temDuasFaltasConsecutivas) {
        this.temDuasFaltasConsecutivas = temDuasFaltasConsecutivas;
    }

    public Boolean getAlertaPercentual() {
        return alertaPercentual;
    }

    public void setAlertaPercentual(Boolean alertaPercentual) {
        this.alertaPercentual = alertaPercentual;
    }
}