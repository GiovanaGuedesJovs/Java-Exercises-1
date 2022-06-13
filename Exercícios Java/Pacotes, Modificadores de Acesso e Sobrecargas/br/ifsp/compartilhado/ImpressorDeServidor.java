package br.ifsp.compartilhado;

import br.ifsp.servidor.*;

public class ImpressorDeServidor {
    
    public static void imprimeServidor(Professor professor){
        System.out.println("\nProfessor " + professor.getRegistro()+" -----------");
        System.out.println("Nome: "+professor.getNome());
        System.out.println("Disciplina: "+professor.getDisciplina());
    }

    public static void imprimeServidor(Tecnico tecnico){
        System.out.println("\nTecnico " + tecnico.getRegistro()+" -----------");
        System.out.println("Nome: "+tecnico.getNome());
        System.out.println("Departamento: "+tecnico.getDepartamento());
    }

    public static void imprimeServidor(Aluno aluno){
        System.out.println("\nAluno " + aluno.getProntuario()+" -----------");
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Série: "+aluno.getSerie());
    }
}
