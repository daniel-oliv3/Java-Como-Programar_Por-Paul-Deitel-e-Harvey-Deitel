package exemplo7;
//Figura 3.7 - Classe GradeBook que contem uma variavel de instancia
//courseName e métodos para configurar e obter valores

public class GradeBook3 {  //OBJETO - GradeBook3
	//ATRIBUTOS
	private String courseName;  //nome do curso para esse GradeBook (atributo)
	
	
	//MÉTODOS GETTERS e SETTERS
	//Método para configurar o nome do curso
	public void setCourseName(String name){
		courseName = name; //armazena o nome do curso
	}
	
	//Método para recuperar o nome do curso
	public String getCourseName(){
		return courseName;
	}
	
	//MÉTODOS PERSONALIZADOS.
	//Exibe uma mensagem de boas-vindas para o usuario GradeBook
	public void displayMessage(){  
		
		System.out.printf("Welcome to the GradeBook for\n%s\n",getCourseName());
	}  //fim do metodo displayMenssage
	
}  //fim da classe GradeBook
