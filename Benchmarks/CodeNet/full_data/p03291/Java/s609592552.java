import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		final long MOD = 1000000007L;
		long[][] dp = new long[n + 1][4];
		dp[0][0] = 1;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'A' || s.charAt(i) == '?') {
				for(int j = 0; j < 4; j++) {
					dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % MOD;
					if(j == 0) dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j]) % MOD;
				}
			}
			if(s.charAt(i) == 'B' || s.charAt(i) == '?') {
				for(int j = 0; j < 4; j++) {
					dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % MOD;
					if(j == 1) dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j]) % MOD;
				}
			}
			if(s.charAt(i) == 'C' || s.charAt(i) == '?') {
				for(int j = 0; j < 4; j++) {
					dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % MOD;
					if(j == 2) dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j]) % MOD;
				}
			}
		}
		System.out.println(dp[n][3]);
	}
}
