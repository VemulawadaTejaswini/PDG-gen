import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int W = Integer.parseInt(line[1]);

		int[] w = new int[N + 1];
		int[] v = new int[N + 1];
		for (int i = 0; i < N; i++) {
			line = sc.nextLine().split(" ");
			w[i] = Integer.parseInt(line[0]);
			v[i] = Integer.parseInt(line[1]);
		}

		long[][] dp = new long[N + 1][W + 1];
		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j <= W; j++) {
				if (j < w[i]) dp[i][j] = dp[i + 1][j];
				else dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j - w[i]] + v[i]);
			}
		}
		System.out.println(dp[0][W]);
	}
}