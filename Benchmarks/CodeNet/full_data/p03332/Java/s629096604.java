import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	final long MOD = 998244353;
	long[] fac = new long[300001];
	long[] ifac = new long[300001];
	long[] inv = new long[300001];
	{
		fac[0] = fac[1] = ifac[0] = ifac[1] = 1;
		inv[0] = inv[1] = 1;
		for (int i = 2; i < fac.length; ++i) {
			fac[i] = fac[i - 1] * i % MOD;
		}
		for (int i = 2; i < inv.length; ++i) {
			inv[i] = MOD - (MOD / i) * inv[(int) (MOD % i)] % MOD;
		}
		for (int i = 2; i < inv.length; ++i) {
			ifac[i] = ifac[i - 1] * inv[i] % MOD;
		}
	}

	void run() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long K = sc.nextLong();
		if (K == 0) {
			System.out.println(1);
			return;
		}
		if (gcd(gcd(B, K), gcd(A, K)) != 1) {
			long g = gcd(gcd(B, K), gcd(A, K));
			A /= g;
			B /= g;
			K /= g;
		}
		if (gcd(A, B) != 1) {
			System.out.println(0);
			return;
		}
		if (gcd(K, B) != 1) {
			A ^= B;
			B ^= A;
			A ^= B;
		}
		solve(N, A, B, K);
	}

	void solve(int N, long A, long B, long K) {
		long ans = 0;
		int a = (int) ((K % B) * inv(A % B, B) % B);
		int b = (int) ((K - a * A) / B);
		for (; a <= N && b >= 0; a += B, b -= A) {
			if (b > N)
				continue;
			ans = (ans + comb(N, a) * comb(N, b) % MOD) % MOD;
		}
		System.out.println(ans);
	}

	long comb(int n, int k) {
		return fac[n] * ifac[k] % MOD * ifac[n - k] % MOD;
	}

	// long inv(long a, long mod) {
	// a = a % mod;
	// long u = 1;
	// // return pow(a, mod - 2, mod);
	// }
	public static long inv(long a, long mod) {
		long b = mod;
		long p = 1, q = 0;
		while (b > 0) {
			long c = a / b;
			long d;
			d = a;
			a = b;
			b = d % b;
			d = p;
			p = q;
			q = d - c * q;
		}
		return p < 0 ? p + mod : p;
	}

	long pow(long a, long n, long mod) {
		long ret = 1;
		for (; n > 0; n >>= 1, a = a * a % mod) {
			if (n % 2 == 1)
				ret = ret * a % mod;
		}
		return ret;
	}

	long gcd(long a, long b) {
		if (a > b) {
			a ^= b;
			b ^= a;
			a ^= b;
		}
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
