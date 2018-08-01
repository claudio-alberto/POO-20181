package ControleDeBanco;

import java.util.ArrayList;

public class Sistema {
    public void static main(String[] args){
    
    ArrayList<Object> lista = new ArrayList<Object>();
    
    public void adicioAnimal(String animal){
        lista.add(animal);
    }
    public int removeAnimal(String animal){
        int pos = lista.indexOf(animal);
        lista.remove(animal);
        return pos;
    }
    public String atualizaAnimal(String animal){
        String frase = "Animal Atualizado!";
        int posicao = lista.indexOf(animal);
        lista.add(posicao, animal);
        return frase;
    }
    public void listaArmazenados(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
}
