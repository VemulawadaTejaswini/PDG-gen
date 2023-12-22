import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args)throws IOException{
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		System.out.println(getStationPair(S));
	}
	public static String getStationPair(String S){
		if(S.charAt(0)==S.charAt(1) && (S.charAt(1)==S.charAt(2))){
			return "No";
		}	
		return "YES";	
	}
}
