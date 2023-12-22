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
		while (1 << d <= k) d++;
		//d--;
		int[] c = new int[d + 1];
		for (int i = 0; i <= d; i++) {
			long mask = 1 << i;
			for (int j = 0; j < a.length; j++) {
				if ((mask & a[j]) > 0) c[i]++;
			}
		}

		int[] delta = new int[d + 1];
		for (int i = 0; i <= d; i++) {
			delta[i] = (n - 2 * c[i]) << i;
		}

		long[][] dp = new long[d + 1][2];
		dp[d][0] = answer;
		dp[d][1] = answer;

		for (int i = d; i > 0; i--) {
			dp[i - 1][0] = Math.max(dp[i][0], dp[i][1]);
			dp[i - 1][0] = Math.max(dp[i - 1][0], dp[i - 1][0] + delta[d - i]);
			dp[i - 1][1] = dp[i][1];
			if (((k >> (i - 1)) & 1) == 1) dp[i - 1][1] += delta[d - i];
		}

		System.out.println(Math.max(dp[0][0], dp[0][1]));
	}
}
