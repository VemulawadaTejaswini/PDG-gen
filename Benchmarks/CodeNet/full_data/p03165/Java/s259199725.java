import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		int N = S.length;
		int M = T.length;
		int[][] dp = new int[N + 1][M + 1];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= M; j++) {
				if (i < N && j < M && S[i] == T[j]) {
					dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + 1);
				}
				if (i < N) dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
				if (j < M) dp[i][j + 1] = Math.max(dp[i][j + 1], dp[i][j]);
			}
		}
		StringBuilder sb = new StringBuilder();
		int i = N;
		int j = M;
		while (i > 0 && j > 0) {
			if (S[i - 1] == T[j - 1]) {
				sb.append(S[i - 1]);
				--i;
				--j;
				continue;
			}
			if (dp[i - 1][j] == dp[i][j]) {
				--i;
				continue;
			}
			if (dp[i][j - 1] == dp[i][j]) {
				--j;
				continue;
			}
		}
		System.out.println(sb.reverse());
	}

}