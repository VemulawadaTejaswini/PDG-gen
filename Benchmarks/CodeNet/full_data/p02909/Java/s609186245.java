import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner pw = new Scanner(System.in);
		String S = pw.next();
		String S1 = "Sunny";
		String S2 = "Cloudy";
		String S3 = "Rainy";
		if(S.equals(S1)){System.out.println(S2);}
		else if(S.equals(S2)){System.out.println(S3);}
		else if(S.equals(S3)){System.out.println(S1);}
		
		
	}
	

}