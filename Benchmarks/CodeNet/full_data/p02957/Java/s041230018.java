import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		long A=scn.nextLong();
		long B=scn.nextLong();
			
		if((A+B)%2==0) {
			long s=(A+B)/2;
			long sA=Math.abs(Math.subtractExact(A,s));
			long sB=Math.abs(Math.subtractExact(B,s));
			
			System.out.println(s);
			System.out.println("|"+A+" - "+s+"| "+"= "+sA+" And "+"|"+B+" - "+s+"| "+"= "+sB+",so satisfies the condition." );
			
		}
		else {
			System.out.println("IMPOSSIBLE"+"\nNo integer satisfies the condition.");
		}
			
		scn.close();	
	}
	
}