/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reposição;

public class Carnivoro extends Animal implements Alimentação {

    @Override
    public void comer() {
        System.out.println("Como carnes");
    }
    
    
}
