package exercicio28;
import java.util.Scanner;
//import java.lang.*;  //biblioteca math
public class Atividade28 {

	private static Scanner teclado;

	public static void main(String[] args) {
		// 2.28
		
		teclado = new Scanner(System.in); 
		
		int raio;
		double circunferencia, area, diametro;
		
		System.out.print("Digite o raio da circunferencia: ");
		raio = teclado.nextInt();
		
		System.out.println();
		
		diametro = 2 * raio;
		circunferencia = 2 * Math.PI * raio;
		area = Math.PI * (raio * raio);
		
		System.out.printf("Diametro: %.2f\nCircunferencia: %.2f\n¡rea: %.2f\n",diametro,circunferencia,area);
	}
}


