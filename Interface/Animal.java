
package reposição;

public class Animal {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    private String nome;
    private int idade;
    
    public int getIdade(){
        return this.idade;
    }
}
