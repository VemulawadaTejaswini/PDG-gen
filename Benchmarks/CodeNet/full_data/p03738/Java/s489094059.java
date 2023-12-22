import java.math.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		BigInteger a,b;
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			a = cin.nextBigInteger();
			b = cin.nextBigInteger();
			if(a.compareTo(b)>0)
				System.out.println("GREATER");
			else 
				System.out.println("LESS");
				
		}
		cin.close();
	}

}
