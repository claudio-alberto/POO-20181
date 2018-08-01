
package Exception;

import java.util.Scanner;

public class Utils{
        public static void main(String[] args) throws FahrenheitException {
        double temp;
        double fahr;
        double celsius;
        Scanner ler = new Scanner(System.in);
        
        fahr = ler.nextDouble();

        celsius = ((5*(fahr-32))/9);
        toCelsius(celsius);

}
    
   public static void toCelsius( double celsius){
       if(celsius < -459.67){
           System.out.println("Exessao Lancada!");
           FahrenheitException exception = new FahrenheitException();
       }else{
           System.out.println(celsius);
       }
       
   }

}
