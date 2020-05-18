import java.util.ArrayList;
public class Metro {

	public static void main(String[] args) {
		
		 ArrayList<int[]> list = new ArrayList<int[]>();
		    list.add(new int[] {10,0});
		    list.add(new int[] {3,5});
		    list.add(new int[] {2,5});
		    System.out.println(countPassengers(list));
	}
	
	public static int countPassengers(ArrayList<int[]> stops) {
		//Gracias PejeDev por tu ayuda.
		int pasajeros = 0;
	    for (int[] x : stops) {
	        pasajeros += x[0] - x[1];
	    }
	    
	    return pasajeros;
	}

}
