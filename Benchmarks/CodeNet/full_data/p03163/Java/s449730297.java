import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int W = sc.nextInt();

		int[] w = new int[N + 10];
		int[] v = new int[N + 10];
		long[][] dp = new long[N + 10][W + 10];

		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int sum_w = 0; sum_w <= W; sum_w++) {

				if (sum_w - w[i] >= 0) {
					dp[i + 1][sum_w] = Math.max(dp[i + 1][sum_w], dp[i][sum_w - w[i]] + v[i]);
				}

				dp[i + 1][sum_w] = Math.max(dp[i + 1][sum_w], dp[i][sum_w]);

			}
		}

		System.out.println(dp[N][W]);

		sc.close();
	}
}