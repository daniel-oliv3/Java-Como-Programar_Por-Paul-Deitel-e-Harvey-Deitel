package exercicios;
import java.util.Scanner;
public class Prog15 {

	private static Scanner teclado;

	public static void main(String[] args) {
		/*2.15 � (Aritm�tica) Escreva um aplicativo que solicite ao usu�rio inserir dois inteiros, 
		 * obt�m do usu�rio esses n�meros e imprime sua soma, produto, diferen�a e quociente 
		 * (divis�o). Utilize as t�cnicas mostrada na figura 2.7.*/
		
		teclado = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite o 1� n�mero: ");
		num1 = teclado.nextInt();
		System.out.print("Digite o 2� n�mero: ");
		num2 = teclado.nextInt();
		
		System.out.printf("\n%d + %d = %d\n", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		
	}
}
