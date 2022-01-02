package exercicio25;
import java.util.Scanner;
public class Atividade25 {

	public static void main(String[] args) {
		/*2.25 – (ímpar ou par) Escreva um aplicativo que lê um inteiro, determina e imprime se ele e impar ou par. 
		 * [Dica: utilize o operador % modulo. Um numero par é um múltiplo de 2. Qualquer múltiplo de 2 deixa resto 0 
		 * quando dividido por 2.].*/
				
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um númeo inteiro: ");
		numero = teclado.nextInt();
		
		if(numero %2==0){  //resto 0 e par
			System.out.printf("O número %d é par!\n",numero);
		}else{
			if(numero %2==1){
				System.out.printf("O número %d é ímpar!\n",numero);
			}
		}
	}
}
