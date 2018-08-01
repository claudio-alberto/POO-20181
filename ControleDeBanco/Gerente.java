
package ControleDeBanco;

public class Gerente extends Funcionario implements Auntenticavel{


    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getFuncionariosGerenciados() {
        return funcionariosGerenciados;
    }

    public void setFuncionariosGerenciados(int funcionariosGerenciados) {
        this.funcionariosGerenciados = funcionariosGerenciados;
    }
    private int senha;
    private int funcionariosGerenciados;
    

    public boolean autentica(int senha){
        if(this.senha != senha){
            return false;
        }
        return true;
    }
    @Override
    public double getBonus(){
        return this.getSalario()*0.15;
    }
    
    
}
