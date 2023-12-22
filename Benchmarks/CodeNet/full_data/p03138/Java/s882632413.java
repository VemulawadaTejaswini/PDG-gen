import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];

		long answer = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			answer += a[i];
		}

		int d = 0;
		long x = 1;
		while (x <= k) {
			d++;
			x = x << 1;
		}

		int[] c = new int[d + 1];
		for (int i = 0; i <= d; i++) {
			long mask = 1 << i;
			for (int j = 0; j < a.length; j++) {
				if ((mask & a[j]) > 0) c[i]++;
			}
		}

		long[] delta = new long[d + 1];
		long remainingBenfits = 0;
		for (int i = 0; i <= d; i++) {
			delta[i] = (n - 2L * c[i]) << i;
		}
		for (int i = 0; i < d; i++) {
			if (delta[i] > 0) remainingBenfits += delta[i];
		}

		long[][] dp = new long[d + 1][2];
		dp[d][0] = 0L;
		dp[d][1] = answer;

		for (int i = d; i > 0; i--) {
			dp[i - 1][1] = dp[i][1];
			if (answer >= remainingBenfits + dp[i - 1][1]) break;

			if (delta[d - i] > 0) remainingBenfits -= delta[d - i];

			if (((k >> (i - 1)) & 1) == 1) {
				dp[i - 1][1] += delta[d - i];
				answer = Math.max(answer, dp[i][1] + remainingBenfits);
			}
		}

		System.out.println(answer);
	}
}
