package exercicio26;
import java.util.Scanner;
public class Atividade26 {

	private static Scanner teclado;

	public static void main(String[] args) {
		/*2.26 � (M�ltiplos) Escreva um aplicativo que l� dois inteiros,
		 *  determina se o primeiro e um m�ltiplo do segundo 
		 * e imprimir o resultado. [Dica: utilize o operador % m�dulo].*/
		
		teclado = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.print("Digite o 1� n�mero: ");
		numero1 = teclado.nextInt();
		
		System.out.print("Digite o 2� n�mero: ");
		numero2 = teclado.nextInt();
		System.out.println("");
		if(numero1 %numero2==0){
			System.out.printf("O n�mero %d e m�ltiplo de %d\n",numero1,numero2);
		}else{
			System.out.printf("O n�mero %d n�o e m�ltiplo de %d\n",numero1,numero2);
		}
	}
}
