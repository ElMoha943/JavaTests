
public class ExesAndOhs {
	public static void main(String[] args) {
		
		System.out.println(getXO("xxxooo"));
		System.out.println(getXO("xxxXooOo"));
		System.out.println(getXO("xxx23424esdsfvxXXOOooo"));
		System.out.println(getXO("xXxxoewrcoOoo"));
		System.out.println(getXO("XxxxooO"));
		System.out.println(getXO("zssddd"));
		System.out.println(getXO("Xxxxertr34"));
		
	}	
	
	public static boolean getXO (String str) {
		
	    int i=0, Os=0, Xs=0;
	    Boolean state=false;
	    for(i=0;i<(str.length());i++){
	    	
	    	if(str.charAt(i)=='o'||str.charAt(i)=='O'){
	    		
	    			Os++;
	    	}
	    	if(str.charAt(i)=='x'||str.charAt(i)=='X'){
	    		
    				Xs++;
	    	}
	    }
	    if(Xs==Os) {
    		state=true;
    	}
    	else {
    		state=false;
    	}
	    return state;
	  }
}
