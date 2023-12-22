import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int xx = sc.nextInt();

		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		long gcd = Math.abs(x[0] - xx);
		for (int i = 1; i < n; i++) {
			gcd = gcd(gcd, Math.abs(x[i] - xx));
		}
		
		pr.println(gcd);
	}

	static long lcm(long n, long m) {
		return n / gcd(n, m) * m;
	}

	static long gcd(long n, long m) {
		if (m == 0) {
			return n;
		} else {
			return gcd(m, n % m);
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
