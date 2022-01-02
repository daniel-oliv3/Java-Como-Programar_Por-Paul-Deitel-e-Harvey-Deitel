package exercicio24;
import java.util.Scanner;
public class Atividade24 {
	private static Scanner teclado;

	public static void main(String[] args) {
		/*2.24 – (Maior e menor inteiros). Escreva um aplicativo que lê cinco inteiros, e determine e imprime 
		 * o maior e o menor inteiro no grupo. Utilize somente as técnicas de programação que você aprendeu 
		 * neste capítulo.*/
		
		
		teclado = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5, maior=1, menor=1;
		
		System.out.print("Digite o 1º número inteiro: ");
		num1 = teclado.nextInt();
		System.out.print("Digite o 2º número inteiro: ");
		num2 = teclado.nextInt();
		System.out.print("Digite o 3º número inteiro: ");
		num3 = teclado.nextInt();
		System.out.print("Digite o 4º número inteiro: ");
		num4 = teclado.nextInt();
		System.out.print("Digite o 5º número inteiro: ");
		num5 = teclado.nextInt();
		
		if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
			maior=num1;
		}else{
			if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
				maior=num2;
			}else{
				if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
					maior=num3;
				}else{
					if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
						maior=num4;
					}else{
						if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
							maior=num5;
						}else{
							if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
								menor=num1;
							}else{
								if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
									menor=num2;
								}else{
									if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
										menor=num3;
									}else{
										if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
											menor=num4;
										}else{
											if(num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
												menor=num5;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("\n");
		System.out.printf("O maior número é %d\n",maior);
		System.out.printf("O menor número é %d\n",menor);
	}
}
