import java.util.Scanner;

/**
 * https://atcoder.jp/contests/dp/tasks/dp_b
 * Frog 2
 */
public class Main {
	public static void main(String...args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] h = new int[n];
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
			}

			int[] dp = new int[n];
			for (int i = 0; i < n; i++) {
				if (i == 0) dp[i] = 0;
				else dp[i] = Integer.MAX_VALUE;
				for (int j = 1; j <= k; j++) {
					if (i >= j)	dp[i] = mindp(dp[i], dp[i-j] + Math.abs(h[i]-h[i-j]));
				}
			}

			System.out.println(dp[n-1]);
		}
	}

	public static int mindp(int a, int b) {
		if (a > b) {
			a = b;
		}
		return a;
	}
}
