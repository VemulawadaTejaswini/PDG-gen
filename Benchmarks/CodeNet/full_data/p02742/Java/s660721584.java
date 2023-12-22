import java.math.BigInteger;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		long  a = in.nextLong();
		long  b = in.nextLong();
		if(a!=1&&b!=1) {
			BigInteger a1 = BigInteger.valueOf(a);
			BigInteger b1 = BigInteger.valueOf(b);
			BigInteger c = a1.multiply(b1);
			BigInteger two = BigInteger.valueOf(2);
			if(c.mod(two).equals(BigInteger.ZERO)) {
				System.out.println(c.divide(two));
			}
			else {
				System.out.println(c.divide(two).add(BigInteger.ONE));
			}
		}
		else {
			System.out.println(1);
		}

	}

}