import java.util.Scanner;

public class SomeMaths {
	
	public static void main(String[] args) {
		
		Scanner caca = new Scanner(System.in); 
		
		System.out.println("Ingrese un numero");
		
		int n1=caca.nextInt();
		
		System.out.println("Ingrese otro numero");
		
		int n2=caca.nextInt();
		
		System.out.println("La suma de los numeros es " + (n1+n2));
		caca.close();
	}
	
}
