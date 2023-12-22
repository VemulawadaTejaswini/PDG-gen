import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[][] input = new int[N][2];
		for (int i = 0; i < N; i++) {
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
		}
		long[][] dp = new long[N + 1][H + 10];
		for (int j = 0; j < dp[0].length; j++) {
			dp[0][j] = Integer.MAX_VALUE;
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				if (j <= input[i - 1][0]) {
					dp[i][j] = Math.min(dp[i - 1][j], input[i - 1][1]);
				} else {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - input[i - 1][0]] + input[i - 1][1]);
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - input[i - 1][0]] + input[i - 1][1]);
				}
			}
		}
		System.out.print(dp[N][H]);
	}
}