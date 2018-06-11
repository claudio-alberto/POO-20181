import java.util.Scanner;

public class Lista1_02 {
        public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        int ANO_ATUAL = 2018;
        int idade = Ler.nextInt();
        idade = ANO_ATUAL-idade;
        System.out.println("Sua idade e: " + idade);
        
}
}
