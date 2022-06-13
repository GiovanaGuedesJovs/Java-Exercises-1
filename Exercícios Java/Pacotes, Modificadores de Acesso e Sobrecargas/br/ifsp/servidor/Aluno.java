package br.ifsp.servidor;

public class Aluno {

    private final String prontuario;
    private String nome;
    private int serie;

    public Aluno(String prontuario, String nome, int serie) {
        this.prontuario = "BP-" + prontuario;
        this.nome = nome;
        this.serie = serie;
    }

    public Aluno(String prontuario, String nome) {
        this(prontuario, nome, 1);
    }

    public String getProntuario() {
        return prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }  
}