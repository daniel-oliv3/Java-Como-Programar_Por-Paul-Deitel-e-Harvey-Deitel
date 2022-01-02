package exemplo7;
//Figura 3.7 - Classe GradeBook que contem uma variavel de instancia
//courseName e m�todos para configurar e obter valores

public class GradeBook3 {  //OBJETO - GradeBook3
	//ATRIBUTOS
	private String courseName;  //nome do curso para esse GradeBook (atributo)
	
	
	//M�TODOS GETTERS e SETTERS
	//M�todo para configurar o nome do curso
	public void setCourseName(String name){
		courseName = name; //armazena o nome do curso
	}
	
	//M�todo para recuperar o nome do curso
	public String getCourseName(){
		return courseName;
	}
	
	//M�TODOS PERSONALIZADOS.
	//Exibe uma mensagem de boas-vindas para o usuario GradeBook
	public void displayMessage(){  
		
		System.out.printf("Welcome to the GradeBook for\n%s\n",getCourseName());
	}  //fim do metodo displayMenssage
	
}  //fim da classe GradeBook
