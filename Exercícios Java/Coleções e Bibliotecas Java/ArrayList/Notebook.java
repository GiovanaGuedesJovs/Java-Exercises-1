package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Notebook {
    
    private ArrayList<String> notes = new ArrayList<>();

    public Notebook(){
        notes = new ArrayList();
    }

    public void adicionarNota(String note){
        notes.add(note);
    }

    public int retornarNumeroNotas(){
        return notes.size();
    }

    public void imprimirNota(int numeroNotas){
        
        if(numeroNotas < 0) {
            System.out.println("Inválido!");
        } else if(numeroNotas < retornarNumeroNotas()) {
            System.out.println(notes.get(numeroNotas));
        }
        else {
            System.out.println("Inválido!");
        }   
    }

    public void removerNota(int index){
        if(!notes.isEmpty() && index < notes.size() - 1){
            notes.remove(index);
        }
    }

    public void listarNotas(){
        Iterator it = notes.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public ArrayList<String> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<String> notes) {
        this.notes = notes;
    } 
}