import java.util.Scanner;

public class ScanPrint {

	public static void main(String[] args) {
		
		//CREO EL "SCANF" Y LO LLAMO "CACA"
		Scanner caca = new Scanner(System.in); 
		
		System.out.println("Ingrese un numero");
		
		//CREO LA VARIABLE "NUMERO" Y LO IGUALO AL RETURN DE LA FUNCION "CACA"
		int numero=caca.nextInt(); //LA FUNCION CACA.NEXTINT DEVULEVE EL SIGUIENTE DATO INGRESADO DE TIPO INT
		
		System.out.println("Tu numero es: " + numero);
		caca.close();
	}
	
}
