import java.io.*;
import java.util.*;

class Main {

	static final int M = 1000000007;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		long[][] dp = new long[n][n];
		Arrays.fill(dp[0], 1);
		for (int i = 1; i < n; i++) {
			if (s[i - 1] == '>') {
				long p = dp[i - 1][n - i];
				for (int j = n - i - 1; j >= 0; j--) {
					dp[i][j] = (dp[i][j] + p) % M;
					p = (p + dp[i - 1][j]) % M;
				}
			} else {
				long p = dp[i - 1][0];
				for (int j = 0; j < n - i; j++) {
					dp[i][j] = (dp[i][j] + p) % M;
					p = (p + dp[i - 1][j + 1]) % M;
				}
			}
		}

		long a = 0;
		for (int i = 0; i < n; i++) a = (a + dp[n - 1][i]) % M;
		System.out.println(a);
	}
}
