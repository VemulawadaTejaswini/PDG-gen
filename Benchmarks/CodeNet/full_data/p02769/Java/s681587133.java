import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int mod = 1000000007;
		if (n <= k + 1) {
			long ans = nCr(n + n - 1, n, mod);
			System.out.println(ans);
		} else {
			long[] p = new long[n + 1];
			long[] pi = new long[n + 1];
			p[0] = 1;
			pi[0] = 1;
			for (int i = 1; i < p.length; i++) {
				p[i] = p[i - 1] * i % mod;
				pi[i] = modinv(p[i], mod);
			}

			long ans = 0;
			for (int i = 0; i <= k; i++) {
				long val1 = nCr(n, i, mod, p, pi);
				long val2 = nCr(n - 1, i, mod, p, pi);
				ans += val1 * val2;
				ans %= mod;
			}
			System.out.println(ans);
		}
	}

	static long nCr(int n, int r, int m, long[] p, long[] pi) {
		return p[n] * pi[r] % m * pi[n - r] % m;
	}

	static long nCr(long n, long r, int m) {
		long val = 1;
		for (int i = 1; i <= r; i++) {
			val = val * (n - i + 1) % m;
			val = val * modinv(i, m) % m;
		}
		return val;
	}

	static long modinv(long a, int m) {
		long b = m;
		long u = 1;
		long v = 0;
		long tmp = 0;

		while (b > 0) {
			long t = a / b;
			a -= t * b;
			tmp = a;
			a = b;
			b = tmp;

			u -= t * v;
			tmp = u;
			u = v;
			v = tmp;
		}

		u %= m;
		if (u < 0) u += m;
		return u;
	}
}
