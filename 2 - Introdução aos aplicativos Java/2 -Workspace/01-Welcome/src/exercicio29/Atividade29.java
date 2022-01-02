package exercicio29;
public class Atividade29 {

	public static void main(String[] args) {
		// 2.29 - Exiba os equivalentes inteiros do seguinte: A B C a b c 0 1 2 $ * +/
		//e o caráter em branco. 
		
		System.out.println("Equivalentes Inteiros de:");
		
		System.out.printf("%c == %d\n",'0' ,((int)'0'));
		System.out.printf("%c == %d\n",'1' ,((int)'1'));
		System.out.printf("%c == %d\n",'2' ,((int)'2'));
		
		System.out.printf("%c == %d\n",'$' ,((int)'$'));
		System.out.printf("%c == %d\n",'*' ,((int)'*'));
		System.out.printf("%c == %d\n",'+' ,((int)'+'));
		
		System.out.printf("%c == %d\n",' ' ,((int)' '));
		System.out.printf("%c == %d\n",'%' ,((int)'%'));  //extra
		System.out.printf("%c == %d\n",'@' ,((int)'@'));  //extra
		
		System.out.printf("%c == %d\n",'A' ,((int)'A'));
		System.out.printf("%c == %d\n",'B' ,((int)'B'));
		System.out.printf("%c == %d\n",'C' ,((int)'C'));
		
		System.out.printf("%c == %d\n",'a' ,((int)'a'));
		System.out.printf("%c == %d\n",'b' ,((int)'b'));
		System.out.printf("%c == %d\n",'c' ,((int)'c'));

	}
}
