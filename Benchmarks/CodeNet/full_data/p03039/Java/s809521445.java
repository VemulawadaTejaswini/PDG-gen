import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		long n = Integer.parseInt(sa[0]);
		long m = Integer.parseInt(sa[1]);
		long k = Integer.parseInt(sa[2]);
		br.close();

		int mod = 1000000007;
		long x = 0;
		for (long i = 1; i < n; i++) {
			x += i * (n - i);
		}
		x %= mod;
		x *= m;
		x %= mod;
		x *= m;
		x %= mod;

		long y = 0;
		for (long i = 1; i < m; i++) {
			y += i * (m - i);
		}
		y %= mod;
		y *= n;
		y %= mod;
		y *= n;
		y %= mod;

		long ans = x + y;
		ans *= nCr(n * m - 2, k - 2, mod);
		ans %= mod;
		System.out.println(ans);
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
