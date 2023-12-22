import java.util.*;

class Main {

	private static final int M = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();

		long[][] dp = new long[s.length + 1][4];
		dp[0][0] = 1;
		for (int i = 1; i <= s.length; i++) {
			for (int j = 0; j < 4; j++) {
				dp[i][j] = dp[i - 1][j];
				dp[i][j] %= M;
				if (s[i - 1] == '?') {
					dp[i][j] *= 3;
				}
			}
			if (s[i - 1] == '?') {
				for (int j = 1; j < 4; j++) {
					dp[i][j] += dp[i - 1][j - 1];
				}
			} else {
				dp[i][(s[i - 1] - 'A') + 1] += dp[i - 1][(s[i - 1] - 'A')];
			}
		}
		System.out.println(dp[s.length][3] % M);
	}
}
