import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int M = 1_000_000_007;
		
		long[][][] dp = new long[N+2][K+2][2];
		dp[0][0][0] = 1;
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= K; j++) {
				dp[i + 1][j + 1][1] = (dp[i + 1][j + 1][1] + dp[i][j][0]) % M; //r -> b
				dp[i + 1][j][0] = (dp[i + 1][j][0] + dp[i][j][0]) % M; // r -> r
				dp[i + 1][j][0] = (dp[i + 1][j][0] + dp[i][j][1]) % M; // b -> r
			}
		}
		long[][] bb = new long[K+1][K+1];
		bb[0][0] = 1;
		for (int i = 1; i <= K; i++) {
			for (int j = 0; j <= K; j++) {
				for (int k = 0; k <= j; k++) {
					bb[i][j] = (bb[i][j] + bb[i - 1][j - k]) % M;
				}
			}
		}
		for (int i = 1; i <= K; i++) {
			System.out.println((dp[N + 1 - (K - i)][i][0] * bb[i][K - i]) % M);
		}
	}
}