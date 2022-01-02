package exercicioquinze;
import java.util.Scanner;
public class Prog16 {
	private static Scanner teclado;

	public static void main(String[] args){
		/*2.16 – (Comparando inteiros) Escreva um aplicativo que solicite ao usuário a inserir dois inteiros, obtém do usuário 
		 * esses números e exibe o número maior seguido pelas palavras “is larger”. Se os números forem iguais, imprimir a 
		 * mensagem “the number are equal”. Utilize as técnicas mostrada na figura 2.15.*/
		
		teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite o 1º número inteiro: ");
		num1 = teclado.nextInt();
		
		System.out.print("Digite o 2º número inteiro: ");
		num2 = teclado.nextInt();
		
		System.out.println("");
		if(num1>num2){
			System.out.printf("O maior número é %d\n",num1);
		}else{
			if(num1<num2){
				System.out.printf("O número número é %d\n",num2);
			}else{
				if(num1 == num2){
					System.out.println("Os número são iguais\n");
				}
			}
		}
	}
}

