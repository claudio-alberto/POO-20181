/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Fix Tecnologia
 */
public class FahrenheitException extends TemperatureException {
    FahrenheitException(){
        TemperatureException exception = new TemperatureException();
    }
}
