package br.ifsp.servidor;

public class Professor {

    private final String registro;
    private String nome;
    private String disciplina;

    public Professor(String nome, String disciplina) {
        this.registro = "PF-BP-" + nome.toUpperCase().charAt(0) + nome.toUpperCase().charAt(1);
        this.nome = nome;
        this.disciplina = disciplina;
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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    } 
}
