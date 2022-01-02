package exercicios;
import java.util.Scanner;
public class Prog15 {

	private static Scanner teclado;

	public static void main(String[] args) {
		/*2.15 – (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, 
		 * obtém do usuário esses números e imprime sua soma, produto, diferença e quociente 
		 * (divisão). Utilize as técnicas mostrada na figura 2.7.*/
		
		teclado = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite o 1º número: ");
		num1 = teclado.nextInt();
		System.out.print("Digite o 2º número: ");
		num2 = teclado.nextInt();
		
		System.out.printf("\n%d + %d = %d\n", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		
	}
}
