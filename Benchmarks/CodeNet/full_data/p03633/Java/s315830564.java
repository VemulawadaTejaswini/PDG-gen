import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		BigInteger[] T = new BigInteger[N];

		for (int i = 0; i < N; i++) {
			T[i] = new BigInteger(Long.toString(sc.nextLong()));
		}

		long gcd = euc(T[0].longValue(), T[1].longValue());
		BigInteger mul = T[0].multiply(T[1]);
		long lcm = (mul.divide(new BigInteger(Long.toString(gcd)))).longValue();

		for (int i = 2; i < N; i++) {
			gcd = euc(lcm, T[i].longValue());
			mul = T[i].multiply(new BigInteger(Long.toString(lcm)));
			lcm = (mul.divide(new BigInteger(Long.toString(gcd)))).longValue();
		}

		System.out.println(lcm);
	}

	public static long euc(long m, long n) {
		if (n == 0) return m;
		if (m < n) {
			long temp = n;
			n = m;
			m = temp;
		}

		return euc(n, m % n);
	}
}
