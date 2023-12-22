import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		long[] t = new long[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextLong();
		}

		long ans = 1;
		for (int i = 0; i < n; i++) {
			long gcd = gcd(ans, t[i]);

			ans *= t[i] / gcd;
		}

		pr.println(ans);
	}

	private static long gcd(long n, long m) {
		if (m == 0) {
			return n;
		} else {
			return gcd(m, n % m);
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
