package addition;
import java.util.Scanner;
public class Addition {

	private static Scanner input;

	public static void main(String[] args) {
		// figura 2.7 - programa de adição - soma de 2 numeros

		input = new Scanner(System.in);  
		
		int number1; //primeiro numero a adicionar
		int number2;  //segundo numero a adicionar
		int sum;  //soma de number1 e number2
		
		System.out.print("Enter first integer: ");  //prompt
		number1 = input.nextInt(); //lê o primeiro numero forcenido pelo usuário
		
		System.out.print("Enter second integer: ");  //prompt
		number2 = input.nextInt(); //lê o segundo numero fornecido pelo usuario
		
		sum = number1 + number2; //soma os números, depois armazena o total em sum
		
		System.out.printf("Sum is = %d\n", sum);  //exibe a soma
		//System.out.printf("Sum is = %d\n", (number1+number2));  //exibe a soma
	}

}
