package exercicio26;
import java.util.Scanner;
public class Atividade26 {

	private static Scanner teclado;

	public static void main(String[] args) {
		/*2.26 – (Múltiplos) Escreva um aplicativo que lê dois inteiros,
		 *  determina se o primeiro e um múltiplo do segundo 
		 * e imprimir o resultado. [Dica: utilize o operador % módulo].*/
		
		teclado = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.print("Digite o 1º número: ");
		numero1 = teclado.nextInt();
		
		System.out.print("Digite o 2º número: ");
		numero2 = teclado.nextInt();
		System.out.println("");
		if(numero1 %numero2==0){
			System.out.printf("O número %d e múltiplo de %d\n",numero1,numero2);
		}else{
			System.out.printf("O número %d não e múltiplo de %d\n",numero1,numero2);
		}
	}
}
