import java.util.*;

public class SomeLogic {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		
		int num = scanf.nextInt();
		
		if(num==5) {
			
			System.out.println("Tu numero es 5");
			
		}
		else if(num<=5) {
			
			System.out.println("Tu numero es menor a 5");
		}
		else {
			
			System.out.println("Tu numero es mayor a 5");
		}
		scanf.close();
	}

}
