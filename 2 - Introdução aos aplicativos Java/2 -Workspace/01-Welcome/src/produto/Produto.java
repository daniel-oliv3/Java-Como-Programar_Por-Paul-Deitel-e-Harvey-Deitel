package produto;

import java.util.Scanner;

public class Produto {

	private static Scanner in;

	public static void main(String[] args) {
		// Programa que calcula o produto de 3 numeros inteiros.
		in = new Scanner(System.in);  //criando e instanciando um obj do tipo scanner de nome in
		int numero1, numero2, numero3, resultado;  //declarando 3 variaveis do tipo inteiro
		
		System.out.print("Digite o primeiro n�mero inteiro: ");  //prompt
		numero1 = in.nextInt(); //ler o que o usuario digitou e armazena em numero1
		
		System.out.print("Digite o segundo n�mero inteiro: ");
		numero2 = in.nextInt();
		
		System.out.print("Digite o terceiro n�mero inteiro: ");
		numero3 = in.nextInt();
		//calculo do produto
		resultado=(numero1*numero2*numero3);  //resultado recebe o calculo do produto 
		System.out.printf("O produto de %d X %d X %d = %d\n",numero1,numero2,numero3,resultado);  //imprime na tela.
		
		
	}
}
