package operadores;

import java.util.Scanner;  //programa utliza a classe scanner

public class Comparison {

	private static Scanner input;

	public static void main(String[] args) {
		// figura 2.15 - operadores relacionais e operadores de igualdade
		//compara inteiros utilizando instruções if
		
		input = new Scanner(System.in);

		int number1;  //primeiro numero a comparar
		int number2; //segundo numero a comparar
		
		System.out.print("Enter first integer: ");  //prompt
		number1 = input.nextInt();    //lê o primeiro numero fornecido pelo usuario
		
		System.out.print("Enter second integer: ");  //prompt
		number2 = input.nextInt();  //lê o segundo numero fornecido pelo usuario
		
		if(number1 == number2)  //imprime se for verdadeiro, caso contrario testa a proxima condição.
			System.out.printf("%d == %d\n", number1,number2);
		
		if(number1 != number2)
			System.out.printf("%d != %d\n", number1,number2);
		
		if(number1 < number2)
			System.out.printf("%d < %d\n", number1,number2);
		
		if(number1 > number2)
			System.out.printf("%d > %d\n", number1,number2);
		
		if(number1 <= number2)
			System.out.printf("%d <= %d\n", number1,number2);
		
		if(number1 >= number2)
			System.out.printf("%d >= %d\n", number1,number2);
	}

}
