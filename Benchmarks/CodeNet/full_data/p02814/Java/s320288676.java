import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	long[] a;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long N = sc.nextLong();
		long M = sc.nextLong();

		a = nextLongArray(sc, (int) N);

		sc.close();

		long[] b = new long[(int) N];
		for (int i = 0; i < N; i++) {
			b[i] = a[i] / 2;
		}
		// 最小公倍数
		long lcm = lcm(b);
		System.err.println("--");

		long ans = (M / lcm + 1) / 2;

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
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

	private static long lcm(long[] a) {
		long ans = a[0];
		for (int i = 1; i < a.length; i++) {
			ans = lcm(ans, a[i]);
		}
		return ans;
	}

	@SuppressWarnings("unused")
	private long[] nextLongArray(Scanner sc, int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextLong();
		}
		return result;
	}
}
