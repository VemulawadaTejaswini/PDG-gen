import java.util.Scanner;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		if(A.compareTo(B) == 0) System.out.println("EQUAL");
		else if(A.compareTo(B) > 0) System.out.println("GREATER");
		else if(A.compareTo(B) < 0) System.out.println("LESS");
	}

}