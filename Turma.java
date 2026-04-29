package br.com.taskflow.dto;

import java.util.List;

public class RelatorioFrequenciaDTO {

    private Long turmaId;
    private String turmaNome;
    private Long ucId;
    private String ucNome;
    private Integer totalAulas;
    private List<AlunoFrequenciaDTO> alunos;
    private List<AlertaFrequenciaDTO> alertas;

    // Getters e Setters
    public Long getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Long turmaId) {
        this.turmaId = turmaId;
    }

    public String getTurmaNome() {
        return turmaNome;
    }

    public void setTurmaNome(String turmaNome) {
        this.turmaNome = turmaNome;
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

    public Integer getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(Integer totalAulas) {
        this.totalAulas = totalAulas;
    }

    public List<AlunoFrequenciaDTO> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<AlunoFrequenciaDTO> alunos) {
        this.alunos = alunos;
    }

    public List<AlertaFrequenciaDTO> getAlertas() {
        return alertas;
    }

    public void setAlertas(List<AlertaFrequenciaDTO> alertas) {
        this.alertas = alertas;
    }
}