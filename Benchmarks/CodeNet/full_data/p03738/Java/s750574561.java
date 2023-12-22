import java.math.BigInteger;
import java.util.Scanner;
 
public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		BigInteger a=s.nextBigInteger(),b=s.nextBigInteger();
		int v=a.compareTo(b);
		
		System.out.println(v>0?"GREATER":v<0?"LESS":"EQUAl");
	}
}