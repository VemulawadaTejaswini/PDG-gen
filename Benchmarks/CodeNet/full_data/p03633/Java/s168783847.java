import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] T = new long[N];
		for (int i = 0; i < T.length; i++) {
			T[i] = in.nextLong();
		}
		long ans = T[0];
		for (int i = 1; i < T.length; i++) {
			ans = lcm(ans, T[i]);
		}
		System.out.println(ans);
		in.close();
	}

	static long gcd(long m, long n) {
		if (m < n) {
			long tmp = n;
			n = m;
			m = tmp;
		}
		if (n == 0) {
			return m;
		}
		long temp;
		while (m % n != 0) {
			temp = n;
			n = m % n;
			m = temp;
		}
		return n;
	}

	static long lcm(long m, long n) {
		BigInteger a = new BigInteger(String.valueOf(m)).multiply(new BigInteger(String.valueOf(n)))
				.divide(new BigInteger(String.valueOf(gcd(m, n))));
		return a.longValue();
	}
}