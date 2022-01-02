package exemplo8;

import java.util.Scanner;

import exemplo7.GradeBook3;

// Figura 3.8 Criando e manipulando um objeto GradeBook
//...

public class GradeBookTest8 {
	private static Scanner input;

	//MÉTODO main inicia a execução de programa
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		//cria um objeto GradeBook e o atribui a myGradeBook
		GradeBook3 myGradeBook = new GradeBook3();
		
		//Exibe valor inicial de courseName
		System.out.printf("Initial course name is: %s\n\n",myGradeBook.getCourseName());
		
		//Solicita e lê o nome do curso.
		System.out.println("Please enter the course name: ");
		String theName = input.nextLine(); //lê uma linha de texto
		
		myGradeBook.setCourseName(theName);  //configura o nome do curso
		System.out.println();
		
		//Exibe a mensagem de boas-vindas depois de especificar o nome do curso
		myGradeBook.displayMessage();
	}

}
