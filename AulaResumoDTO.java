package br.com.taskflow.dto;

public class AlertaFrequenciaDTO {

    private Long alunoId;
    private String alunoNome;
    private String alunoMatricula;
    private Boolean faltasConsecutivas;
    private Double percentualPresenca;
    private String mensagem;

    // Getters e Setters
    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public String getAlunoNome() {
        return alunoNome;
    }

    public void setAlunoNome(String alunoNome) {
        this.alunoNome = alunoNome;
    }

    public String getAlunoMatricula() {
        return alunoMatricula;
    }

    public void setAlunoMatricula(String alunoMatricula) {
        this.alunoMatricula = alunoMatricula;
    }

    public Boolean getFaltasConsecutivas() {
        return faltasConsecutivas;
    }

    public void setFaltasConsecutivas(Boolean faltasConsecutivas) {
        this.faltasConsecutivas = faltasConsecutivas;
    }

    public Double getPercentualPresenca() {
        return percentualPresenca;
    }

    public void setPercentualPresenca(Double percentualPresenca) {
        this.percentualPresenca = percentualPresenca;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}