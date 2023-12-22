import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// long t = System.currentTimeMillis();
		new Main().run();
		// System.err.println(System.currentTimeMillis() - t);
	}

	public void run() {
		solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long ans = Long.MAX_VALUE / 3;
		for (int m = 1; m <= 40; ++m) {
			long c = (long) Math.pow(n, 1.0 / m);
			for (long i = Math.max(c - 1000, 1); i <= c + 1000; ++i) {
				long res = a * (m - 1);
				res += (m - 1) * i;
				res += (n + Math.pow(i, m - 1) - 1) / Math.pow(i, m - 1);
				ans = Math.min(ans, res);
			}
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
