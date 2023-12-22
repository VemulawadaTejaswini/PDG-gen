import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		int x = sc.nextInt();
		int y = sc.nextInt();

		if ((x + y) % 3 != 0) {
			System.out.println(0);
			return;
		}

		int n = (2 * y - x) / 3;
		int m = y - 2 * n;

		if (n < 0 || m < 0) {
			System.out.println(0);
			return;
		}

		long[] fac = new long[n + m + 1];
		fac[0] = 1;
		for (int i = 1; i < fac.length; i++) {
			fac[i] = (fac[i - 1] * i) % mod;
		}

		long answer = fac[n + m];
		answer = (answer * modpow(fac[n], mod - 2, mod)) % mod;
		answer = (answer * modpow(fac[m], mod - 2, mod)) % mod;

		System.out.println(answer);
	}

	public static long modpow(long a, long n, long p) {
		long x = 1;
		while (n > 0) {
			if ((n & 1) == 1) x = (x * a) % p;
			n /= 2;
			a = (a * a) % p;
		}
		return x;
	}

}
