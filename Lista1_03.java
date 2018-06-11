import java.util.Scanner;

class Lista1_03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota1, nota2, nota3;

		System.out.print("Nota 1: ");
		nota1 = entrada.nextInt();
		
		System.out.print("Nota 2: ");
		nota2 = entrada.nextInt();

		System.out.print("Nota 3: ");
		nota3 = entrada.nextInt();
		
		float media = ((nota1*2) + (nota2*3) + (nota3*5))/10;
		
		System.out.println("Media ponderada:" + media);

}
}
