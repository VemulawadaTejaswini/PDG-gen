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
			long res = a * (m - 1);
			long c = (long) Math.pow(n, 1.0 / m);
			res += (m - 1) * c;
			res += (n + Math.pow(c, m - 1) - 1) / Math.pow(c, m - 1);
			ans = Math.min(ans, res);
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
