import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static final long MOD = 1_000_000_007;

	public static void main(String[] args) {
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		long[][] dp = new long[N][N];
		dp[0][0] = 1;
		for (int i = 0; i < N - 1; i++) {
			long sum = 0;
			if (S[i] == '<') {
				for (int j = 0; j <= i; j++) {
					sum += dp[i][j];
					if (sum >= MOD) sum -= MOD;
					dp[i + 1][j + 1] = sum;
				}
			} else {
				for (int j = i; j >= 0; j--) {
					sum += dp[i][j];
					if (sum >= MOD) sum -= MOD;
					dp[i + 1][j] = sum;
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += dp[N - 1][i];
		}
		System.out.println(ans % MOD);
	}
}