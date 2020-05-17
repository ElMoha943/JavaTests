public class Dubstep {
	
	public static void main(String[] args) {
		String txt1, txt2;
	      txt1=SongDecoder("WUBWUBABCWUB");
	      txt2=SongDecoder("RWUBWUBWUBLWUB");
	      System.out.println(txt1 + " - " + txt2);

	}

	 public static String SongDecoder (String song){
		 	String NewSong = song;
		 	NewSong=NewSong.replaceAll("WUB", "");
		 	//NewSong=NewSong.trim().replaceAll(" +", "" );
		    return NewSong;
	}
}

