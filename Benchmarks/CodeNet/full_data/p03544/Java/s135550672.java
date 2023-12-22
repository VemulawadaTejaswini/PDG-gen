import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		BigInteger a = BigInteger.ZERO, b = BigInteger.ZERO, c = BigInteger.ZERO;

		a = BigInteger.valueOf(2);
		b = BigInteger.ONE;
		c = BigInteger.ONE;

		for (int i = 1; i < N; i++) {
			c = a.add(b);
			a = b;
			b = c;
		}

		System.out.println(c);

		sc.close();
	}
}