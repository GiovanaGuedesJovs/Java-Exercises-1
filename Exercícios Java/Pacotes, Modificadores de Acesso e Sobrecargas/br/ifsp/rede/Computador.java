package br.ifsp.rede;

import br.ifsp.servidor.*;

public class Computador {
    
    private static int contadorDeAcessos;

    public static void acessoPeloServidor(Professor professor) {
        System.out.println("Acessado por " + professor.getNome()+".");
        contadorDeAcessos++;
    }

    public static void acessoPeloServidor(Tecnico tecnico) {
        System.out.println("Acessado por " + tecnico.getNome()+".");
        contadorDeAcessos++;
    }

    public static void acessoPeloServidor(Aluno aluno) {
        System.out.println("Acessado por " + aluno.getNome()+".");
        contadorDeAcessos++;
    }

    public static void imprimirAcessos() {
        System.out.println("\nEste computador foi acessado " + contadorDeAcessos + " vezes.");
    }
}
