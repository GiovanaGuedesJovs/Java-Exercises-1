package Tokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainContadorDePalavras{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Floreio para ser impresso durante leitura da frase
        System.out.print(">"); 
       
        String novaLinha = scanner.nextLine(); // Lê uma nova linha

        //StringTokenizer recebe uma String em seu construtor
        StringTokenizer tokenizer = new StringTokenizer(novaLinha);

        String palavra; //Recebe cada novo token

        //Percorrer os tokens é como utilizar um iterador
        //hasMoreTokens() é usada para verificar se ainda existem tokens
        
        while(tokenizer.hasMoreTokens()){
            //nextToken() retorna o próximo token (palavra)
            palavra = tokenizer.nextToken();
            System.out.println(palavra);
            //O equals() compara o conteúdo de uma string com o de outra
            if("IFSP".equals(palavra)){
                System.out.println("A palavra IFSP foi digitada.");
            }
        }
    }
}