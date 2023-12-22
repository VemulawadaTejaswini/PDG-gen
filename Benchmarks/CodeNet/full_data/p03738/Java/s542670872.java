import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		BigInteger bi = sc.nextBigInteger(0);
		BigInteger bi2 = sc.nextBigInteger(0);
		int a = bi.compareTo(bi2);
		System.out.println(a == 0 ? "EQUAL" : a > 0 ?"GREATER" : "LESS");
	}
}