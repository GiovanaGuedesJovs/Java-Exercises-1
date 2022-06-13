package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MainCalendario {
    public static void main(String[] args) {
        
        HashMap<String, String> agenda = new HashMap<>();

        //Adicionar um elemento

        agenda.put("Giovana Guedes","(11) 9999-9999");
        agenda.put("Alinne Gomes", "(11) 9999-8888");

        //Buscar elemento pela key

        agenda.get("Giovana Guedes");

        //Remover elemento pela key

        agenda.remove("Alinne Gomes");

        //Substituir um value de uma key

        agenda.replace("Giovana Guedes", "(11) 9999-9999", "(11) 9889-8888"); //Sintaxe: agenda.replace(key, oldValue, newValue);

        //Imprimir value pela key 

        System.out.println(agenda.get("Giovana Guedes")+"\n"); // Saída -> "(11) 9889-8888"

        Iterator it = agenda.entrySet().iterator();

        while(it.hasNext()){
            //Entry é a classe que representa <key, value> no HashMap
            Entry parKeyValue = (Entry)it.next();
            System.out.println(parKeyValue.getKey()); // Imprime a key de uma entrada
            System.out.println(parKeyValue.getValue()); // Imprime o value de uma entrada
        }
            
    }
}
