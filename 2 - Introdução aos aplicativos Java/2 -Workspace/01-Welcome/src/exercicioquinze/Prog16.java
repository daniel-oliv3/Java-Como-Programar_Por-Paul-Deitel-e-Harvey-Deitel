package exercicioquinze;
import java.util.Scanner;
public class Prog16 {
	private static Scanner teclado;

	public static void main(String[] args){
		/*2.16 � (Comparando inteiros) Escreva um aplicativo que solicite ao usu�rio a inserir dois inteiros, obt�m do usu�rio 
		 * esses n�meros e exibe o n�mero maior seguido pelas palavras �is larger�. Se os n�meros forem iguais, imprimir a 
		 * mensagem �the number are equal�. Utilize as t�cnicas mostrada na figura 2.15.*/
		
		teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite o 1� n�mero inteiro: ");
		num1 = teclado.nextInt();
		
		System.out.print("Digite o 2� n�mero inteiro: ");
		num2 = teclado.nextInt();
		
		System.out.println("");
		if(num1>num2){
			System.out.printf("O maior n�mero � %d\n",num1);
		}else{
			if(num1<num2){
				System.out.printf("O n�mero n�mero � %d\n",num2);
			}else{
				if(num1 == num2){
					System.out.println("Os n�mero s�o iguais\n");
				}
			}
		}
	}
}

