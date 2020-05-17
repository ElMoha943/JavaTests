
public class SheepCounter {

	public static void main(String[] args) {
		
		int caca=0;
		Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
		caca=countSheeps(array1);
		System.out.println(caca);
		
	}	
	
	  public static int countSheeps(Boolean[] arrayOfSheeps) {
		    int amount=0;
		    for(Boolean Sheep : arrayOfSheeps)
		    {
		      if(Sheep==true)
		      {
		        amount++;
		      }
		    }
		    return amount;
		  }

}