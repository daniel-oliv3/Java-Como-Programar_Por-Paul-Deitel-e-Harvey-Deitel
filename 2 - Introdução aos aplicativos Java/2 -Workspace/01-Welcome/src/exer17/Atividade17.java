package exer17;
import java.util.Scanner;
public class Atividade17 {
	private static Scanner teclado;

	public static void main(String[] args) {
		/*2.17 � (Aritm�tica, menor e maior) Escreva um aplicativo que insere tr�s inteiros digitados pelo usu�rio
		 *  e exibe a soma, m�dia, produto e os n�meros menores e maiores, utilize as t�cnicas mostradas na figura 
		 *  2.15 [nota: o c�lculo da m�dia neste exerc�cio deve resultar em uma representa��o de inteiros da media, 
		 *  assim, se a soma dos valores for 7, a m�dia dever� ser 2, n�o 2,3333;*/ 
		
		teclado = new Scanner(System.in);
		
		int num1, num2, num3, soma, maior=0, menor=0, produtoInt, mediaInt;
		
		System.out.print("Digite o 1� n�mero inteiro: ");
		num1 = teclado.nextInt();
		
		System.out.print("Digite o 2� n�mero inteiro: ");
		num2 = teclado.nextInt();
		
		System.out.print("Digite o 3� n�mero inteiro: ");
		num3 = teclado.nextInt();
		
		System.out.println("");
		maior=1;
		menor=1;
		if(num1 > num2 && num1 > num3){
			maior=num1;
		}else{
			if(num2 > num1 && num2 > num3){
				maior=num2;
			}else{
				if(num3 > num1 && num3 > num2){
					maior=num3;
				}else{
					if(num1 < num2 && num1 < num3){
						menor=num1;
					}else{
						if(num2 < num1 && num2 < num3){
							menor=num2;
						}else{
							if(num3 < num1 && num3 < num2){
								menor=num3;
							}
						}
					}
				}
			}
		}
		System.out.println("");
		mediaInt=(num1+num2+num3)/3;
		produtoInt=(num1*num2*num3);
		soma=(num1+num2+num3);
		System.out.printf("A soma de %d + %d + %d = %d\n",num1,num2,num3,soma);
		System.out.printf("A m�dia (int) � %d\n",mediaInt);
		System.out.printf("O produto de %d x %d x %d = %d\n",num1,num2,num3,produtoInt);
		System.out.printf("O maior n�mero � %d\n",maior);
		System.out.printf("O menor n�mero � %d\n",menor);
	}
}
