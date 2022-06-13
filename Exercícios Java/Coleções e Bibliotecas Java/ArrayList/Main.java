package ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Notebook notes = new Notebook();

        // Adicionar notas

        notes.adicionarNota("Fazer item 1.");
        notes.adicionarNota("Fazer item 2.");
        notes.adicionarNota("Fazer item 3.");

        // Imprimir notas

        notes.imprimirNota(0);
        notes.imprimirNota(2);
        notes.imprimirNota(1);

        // Imprimir o número de notas

        System.out.println("\nA quantidade de notas é "+notes.retornarNumeroNotas()+".\n");

        // Remover notas

        notes.removerNota(1);
        
        // Listar notas com Iterator

        notes.listarNotas();

                // Imprimir o número de notas

                System.out.println("\nA quantidade de notas é "+notes.retornarNumeroNotas()+".\n");
    }
}