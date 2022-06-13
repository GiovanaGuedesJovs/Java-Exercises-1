import br.ifsp.servidor.*;
import br.ifsp.rede.*;
import br.ifsp.compartilhado.*;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("\nServidores:");

        Aluno aluno = new Aluno("30902100G", "Alinne Gomes", 3);
        Professor professor = new Professor("Giovana Guedes", "Física");
        Tecnico tecnico = new Tecnico("Alessandra Maia", "Pedagogia");

        ImpressorDeServidor.imprimeServidor(aluno);
        ImpressorDeServidor.imprimeServidor(professor);
        ImpressorDeServidor.imprimeServidor(tecnico);

        System.out.println("\nAcessos: \n");

        Computador.acessoPeloServidor(aluno);
        Computador.acessoPeloServidor(professor);
        Computador.acessoPeloServidor(tecnico);
        Computador.acessoPeloServidor(aluno);

        Computador.imprimirAcessos();
    }
}
