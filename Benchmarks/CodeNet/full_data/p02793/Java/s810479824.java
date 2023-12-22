import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	static int MOD = 1000000007;
	static BigInteger MOD2 = BigInteger.valueOf(MOD);

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc, N);

		sc.close();

		long[] lcm = factor(A[0]);
		for (int i = 1; i < N; i++) {
			lcm2(lcm, factor(A[i]));
		}

		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += tol(div(lcm, factor(A[i])), MOD);
			ans %= MOD;
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	long tol(long[] a, long mod) {
		long result = 1;
		for (int i = 0; i < a.length; i++) {
			result *= Math.pow(primes.get(i), a[i]);
			result %= mod;
		}
		return result;
	}

	long[] div(long[] a, long[] b) {
		long[] result = new long[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i] - b[i];
		}
		return result;
	}

	long[] lcm(long[] a, long[] b) {
		long[] result = new long[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = Math.max(a[i], b[i]);
		}
		return result;
	}

	void lcm2(long[] a, long[] b) {
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.max(a[i], b[i]);
		}
	}

	long[] factor(long n) {
		long[] result = new long[primes.size()];
		for (int i = 0; i < primes.size(); i++) {
			while (n % primes.get(i) == 0) {
				result[i]++;
				n /= primes.get(i);
			}
		}
		return result;
	}

	static List<Integer> primes = new ArrayList<>();
	static {
		boolean[] e = new boolean[1000000];
		Arrays.fill(e, true);
		e[0] = false;
		e[1] = false;
		for (int i = 2; i < Math.sqrt(e.length); i++) {
			if (!e[i]) {
				continue;
			}
			for (int j = i * i; j < e.length; j += i) {
				e[j] = false;
			}
		}
		for (int i = 2; i < e.length; i++) {
			if (e[i]) {
				primes.add(i);
			}
		}
	}

	// 最大公約数
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	// 最小公倍数
	private static long lcm(long a, long b) {
		return (a / gcd(a, b)) * b; // a*bがオーバーフローしないように
	}

	private static BigInteger lcm(BigInteger a, BigInteger b) {
		return (a.divide(a.gcd(b)).multiply(b));
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
