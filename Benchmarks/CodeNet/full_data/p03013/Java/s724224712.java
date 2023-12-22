

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];

		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}

		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			dp[i] = -1;
		}
		for (int i = 0; i < m; i++) {
			dp[a[i]] = 0;
		}

		dp[0] = 1;

		if (a[0] == 1) {
			dp[1] = 0;
		} else {
			dp[1] = 1;
		}

		for (int i = 2; i < n; i++) {
			if (dp[i] == -1)
				dp[i] = (dp[i - 1] + dp[i - 2])% 1000000007;
		}

		System.out.println(dp[n - 1] );
	}

}
