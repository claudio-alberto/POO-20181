/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeBanco;

/**
 *
 * @author Fix Tecnologia
 */
public class ControleDeBonus {
    private double totaldebonus;
    public void registra(Funcionario funcionario){
        System.out.println("Adicionando bonificacao!");
        this.totaldebonus += funcionario.getBonus();
        }
    public double getTotaldeBonus(){
        return this.totaldebonus;
    }
    
}
