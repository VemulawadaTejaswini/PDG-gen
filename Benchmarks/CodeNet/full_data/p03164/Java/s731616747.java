import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long w = sc.nextLong();

		long[] ws = new long[n + 1];
		int[] vs = new int[n + 1];

		for (int i = 1; i < n + 1; i++) {
			ws[i] = sc.nextLong();
			vs[i] = sc.nextInt();
		}
		long[][] dp = new long[n + 1][1001];
		Arrays.fill(dp[0], 1_000_000_005);
		dp[0][0] = 0;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < 1001; j++) {
				if (j < vs[i]) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.min(
							dp[i - 1][j - vs[i]] + ws[i],
							dp[i - 1][j]);
				}
			}
		}

		//for (int i = 0; i < n + 1; i++) {
		//	for (int j = 0; j < 100; j++) {
		//		System.out.println(dp[i][j]);
		//		System.out.println(" ");
		//	}
		//	System.out.println();
		//}

		long answer = 0;
		for (int i = 0; i < 1001; i++) {
			if (dp[n][i] <= w) answer = i;
		}

		System.out.println(answer);
	}
}
