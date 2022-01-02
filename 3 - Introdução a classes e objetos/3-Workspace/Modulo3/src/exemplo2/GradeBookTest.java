package exemplo2;

import exemplo1.GradeBook;  //classe do exemplo 1

public class GradeBookTest {  //classe driver

	public static void main(String[] args) {
		// 3.2 - Criando um objeto GradeBook e chamando seu método displayMessage.
		
		//Criando um objeto Gradebook e o atribui a myGradeBook
		GradeBook myGradeBook = new GradeBook();
		
		//chama método displayMessage de myGradeBook
		myGradeBook.displayMessage();

	}
}
