import java.util.Scanner;

    class transformaKm{
        private float velocidade;
        
        public void setVelocidade(float velo){
            velocidade = velo;
        }
        public float getVelocidade(){
            return(velocidade);
        }
        public double convert_metros(double velo){
            double conversao = velo*3.6;
            return(conversao);
        }
    }
public class Lista1_01 {
        public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite a velocidade em M/s: ");
        float velocidade = Ler.nextFloat();
        transformaKm t1;
        t1 = new transformaKm();
        t1.setVelocidade(velocidade);
        t1.convert_metros(velocidade);
     
}
}
