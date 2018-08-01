package reposição;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) throws IOException{
        
        Herbivaro girafa =  new Herbivaro();
        Carnivoro homem = new Carnivoro();
        Alimentação homem1 = homem;
        Alimentação girafa1 = girafa;
        
        ArrayList<Object> lista = new ArrayList<Object>();
        
        girafa.setIdade(40);
        girafa.setNome("Juju");

        homem.setIdade(50);
        homem.setNome("Claudio");
        
        adicionaAnimal(lista, girafa);
        adicionaAnimal(lista, homem);
        


        
        FileWriter arq = new FileWriter("e:\\tabuada123.txt");

        InputStream arquivo = new FileInputStream("e:\\tabuada123.txt");
        InputStreamReader isr = new InputStreamReader(arquivo, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        
        String linha;

        
        OutputStream os = new FileOutputStream("e:\\tabuada123.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        FileOutputStream saveFile = new FileOutputStream("e:\\tabuada123.txt");
        ObjectOutputStream stream = new ObjectOutputStream(saveFile);
        

        for(int i = 0; i < lista.size(); i++){
            Animal animal = (Animal) lista.get(i);
            bw.write(animal.getNome());
            bw.newLine();
            String idade = String.valueOf(animal.getIdade());
            bw.write(idade);
            bw.newLine();
            bw.write(lista.get(i).toString());
            bw.newLine();
        }
        stream.close();
        bw.close();
        osw.close();
        os.close();
        
        while((linha = br.readLine()) != null){
            System.out.println(linha);
        }
        isr.close();
        arquivo.close();
        br.close(); 
        
    }   
    
    static void adicionaAnimal(ArrayList<Object> lista, Object animal){
        lista.add(animal);
        System.out.println(lista);
    }
    static void removeAnimal(ArrayList<Object> lista, Object animal){
        lista.remove(animal);
    }
    static void mostrarLista(ArrayList<Object> lista){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
     
}
    
