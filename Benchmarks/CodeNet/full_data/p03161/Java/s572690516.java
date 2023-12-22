import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			dp[i] = Integer.MAX_VALUE;
		}

		dp[0] = 0;

		for (int i = 1; i < n; i++) {
			dp[i] = Math.min(dp[i], dp[i - 1] + (Math.abs(h[i] - h[i - 1])));
			for (int j = 2; j <= k; j++) {
				if (i - j >= 0) {
					dp[i] = Math.min(dp[i], dp[i - j] + (Math.abs(h[i] - h[i - j])));
				}
			}
		}
		System.out.println(dp[n - 1]);
		sc.close();

	}
}
