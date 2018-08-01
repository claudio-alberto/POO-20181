
package ControleDeBanco;

public class Funcionario {

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    private String nome;
    private String idade;
    private double salario;
    
    public double getBonus(){
        return this.getSalario() * 0.1;
    }
    
}
