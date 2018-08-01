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
public class Diretor extends Funcionario{

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     * @return the gerentesGerenciaods
     */
    public int getGerentesGerenciaods() {
        return gerentesGerenciaods;
    }

    /**
     * @param gerentesGerenciaods the gerentesGerenciaods to set
     */
    public void setGerentesGerenciaods(int gerentesGerenciaods) {
        this.gerentesGerenciaods = gerentesGerenciaods;
    }
    private int senha;
    private int gerentesGerenciaods;
}
