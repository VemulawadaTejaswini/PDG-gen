import java.util.Arrays;
import java.util.Scanner;

public final class Main {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		long M = sc.nextInt();
		long[][][] dp = new long[3][N + 1][N + 1]; // dp[# of 1][# of 3][# of 2]
		dp[0][0][0] = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j + i <= N; j++) {
				long rest = 3 * N - 3 * i - 2 * j;
				{
					// no 1
					// 0 -> 3
					dp[0][i + 1][j] += dp[0][i][j] * (rest - 1) % M * (rest - 2);
					dp[0][i + 1][j] %= M;
					if (j < N) {
						// 0 -> 2
						dp[0][i][j + 1] += dp[0][i][j] * (rest - 1);
						dp[0][i][j + 1] %= M;
					}
					if (j == 0) {
						// 0 -> 1
						dp[1][i][j] += dp[0][i][j];
						dp[1][i][j] %= M;
					} else {
						// 2 -> 3
						dp[0][i + 1][j - 1] += dp[0][i][j];
						dp[0][i + 1][j - 1] %= M;
					}
				}
				{
					// has one 1
					if (i + j + 1 < N) {
						// 0 -> 3
						dp[1][i + 1][j] += dp[1][i][j] * (rest - 2) % M * (rest - 3);
						dp[1][i + 1][j] %= M;
						if (j == 0) {
							// 0 -> 1
							dp[2][i][j] += dp[1][i][j];
							dp[2][i][j] %= M;
						}
					}
					// 1 -> 3
					dp[0][i + 1][j] += dp[1][i][j] * (rest - 2);
					dp[0][i + 1][j] %= M;
					if (j == 0) {
						// 1 -> 2
						dp[0][i][j + 1] += dp[1][i][j];
						dp[0][i][j + 1] %= M;
					} else {
						// 2 -> 3
//						dp[1][i + 1][j - 1] += dp[1][i][j];
//						dp[1][i + 1][j - 1] %= M;
					}
				}
				{
					// has two 1
					if (i + j + 2 < N) {
						// 0 -> 3
						dp[2][i + 1][j] += dp[2][i][j] * (rest - 3) % M * (rest - 4);
						dp[2][i + 1][j] %= M;
					}
					// 1 -> 3
					dp[1][i + 1][j] += dp[2][i][j] * (rest - 3);
					dp[1][i + 1][j] %= M;
					if (j == 0) {
						// 1 -> 2
//						dp[1][i][j + 1] += dp[2][i][j];
//						dp[1][i][j + 1] %= M;
					} else {
						// 2 -> 3
//						dp[2][i + 1][j - 1] += dp[2][i][j];
//						dp[2][i + 1][j - 1] %= M;
					}
				}
			}
		}
		System.out.println(dp[0][N][0]);
	}
}
