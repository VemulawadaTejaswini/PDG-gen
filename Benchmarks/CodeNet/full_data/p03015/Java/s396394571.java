import java.util.Scanner;

public class Main {

	static long MOD = 100000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] l = sc.next().toCharArray();
		sc.close();
		long[][] dp = new long[l.length + 1][2];
		dp[0][0] = 1;
		dp[0][1] = 0;
		for (int i = 1; i <= l.length; i++) {
			if (l[i - 1] == '0') {
				dp[i][0] = dp[i - 1][0];
				dp[i][1] = (dp[i - 1][1] * 3) % MOD;
			} else {
				dp[i][0] = (dp[i - 1][0] * 2) % MOD;
				dp[i][1] = (dp[i - 1][0] + dp[i - 1][1] * 3) % MOD;
			}
		}
		System.out.println((dp[l.length][0] + dp[l.length][1]) % MOD);

	}

}