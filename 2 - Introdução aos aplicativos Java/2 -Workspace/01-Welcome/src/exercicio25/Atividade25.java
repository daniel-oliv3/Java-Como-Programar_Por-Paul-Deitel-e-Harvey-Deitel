package exercicio25;
import java.util.Scanner;
public class Atividade25 {

	public static void main(String[] args) {
		/*2.25 � (�mpar ou par) Escreva um aplicativo que l� um inteiro, determina e imprime se ele e impar ou par. 
		 * [Dica: utilize o operador % modulo. Um numero par � um m�ltiplo de 2. Qualquer m�ltiplo de 2 deixa resto 0 
		 * quando dividido por 2.].*/
				
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�meo inteiro: ");
		numero = teclado.nextInt();
		
		if(numero %2==0){  //resto 0 e par
			System.out.printf("O n�mero %d � par!\n",numero);
		}else{
			if(numero %2==1){
				System.out.printf("O n�mero %d � �mpar!\n",numero);
			}
		}
	}
}
