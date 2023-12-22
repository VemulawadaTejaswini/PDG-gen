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
		long ans = n;
		for (int m = 2; m <= 40; ++m) {
			long c = (long) Math.pow(n, 1.0 / m);
			for (long i = Math.max(c - 1000, 2); i <= c + 1000; ++i) {
				if (a * (m - 1) / a != m - 1)
					continue;
				long res = a * (m - 1);
				res += (m - 1) * i;
				if (res - (m - 1) * i != a * (m - 1))
					continue;
				if (res > ans)
					continue;
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
