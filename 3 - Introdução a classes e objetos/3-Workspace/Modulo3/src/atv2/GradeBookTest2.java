package atv2;
import java.util.Scanner;
import atv1.GradeBook2;  //importando a classe atv1 Gradebook2
public class GradeBookTest2 {

	private static Scanner input;

	public static void main(String[] args) {
		// 3.5 - cria objeto gradebook2 e passa uma string para seu metodo displayMenssage
		
		input = new Scanner(System.in);
		
		//Cria um objeto GradeBook2 e o atribui a myGradeBook
		GradeBook2 myGradebook2 = new GradeBook2();
		
		//prompt para entrada do nome do curso
		System.out.println("Please enter the course name: ");
		String nameOfCourse = input.nextLine();  //lê uma linha de texto.
		System.out.println();  //gera a linha de uma saida em branco.
		
		//chama método displayMessage de myGradeBook2 e passa nomeOfCourse como argumento.
		myGradebook2.displayMessage(nameOfCourse);

	}  //fim de main
}  //fim da classe GradeBookTest2
