

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static class Pair implements Comparable<Pair> {
		long a, b;

		Pair(long a, long b) {
			this.a = a;
			this.b = b;
		}

		public int compareTo(Pair p) {
			if (a > p.a)
				return 1;
			else if (a < p.a)
				return -1;
			else
				return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		Pair[] pair = new Pair[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			pair[i] = new Pair(a[i], i);
		}

		Arrays.sort(pair, Collections.reverseOrder());

		long[][] dp = new long[n + 1][n + 1];

		dp[0][0] = 0;

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j <= n - i; j++) {
				if (i == 0 && j == 0)
					continue;

				Pair p = pair[i + j - 1];
				long left = 0;
				long right = 0;

				if (i > 0) {
					left = dp[i - 1][j] + p.a * (Math.abs(p.b - i + 1));
				}
				if (j > 0) {
					right = dp[i][j - 1] + p.a * (Math.abs(n - j - p.b));
				}
				dp[i][j] = Math.max(left, right);
			}
		}
		long max = 0;
		for (int i = 0; i <= n; i++) {
			max = Math.max(max, dp[i][n - i]);
		}
		System.out.println(max);

	}

}
