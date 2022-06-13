package br.ifsp.servidor;

public class Tecnico {

    private final String registro;
    private String nome;
    private String departamento;

    public Tecnico( String nome, String departamento) {
        this.registro = "PF_BP_" + nome.toUpperCase().charAt(0) + nome.toUpperCase().charAt(1);
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
