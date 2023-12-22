import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	final long MODULO = 1_000_000_000 + 7;

	long solve(int n, long k, long[] a, long[] b) {
		long ans = 0;
		for (int unused = -1; unused == -1 || (1L << unused) <= k; ++unused) {
			long sum = 0;
			boolean[] used = new boolean[n];
			out: for (int i = 0; i < n; ++i) {
				if (unused != -1 && ((1L << unused) & a[i]) > 0)
					continue out;
				for (int j = unused + 1; j <= 30; ++j) {
					if (((1L << j) & k) == 0 && ((1L << j) & a[i]) > 0)
						continue out;
				}
				sum += b[i];
			}
			ans = Math.max(ans, sum);
		}
		return ans;
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}
		System.out.println(solve(n, k, a, b));
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
