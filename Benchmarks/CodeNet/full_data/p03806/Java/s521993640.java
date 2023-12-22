import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Ma = sc.nextInt();
		int Mb = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		// Guarantee: Ma < Mb
		if (Mb < Ma) {
			int t = Ma;
			Ma = Mb;
			Mb = t;
		}

		int[][][] dp = new int[N + 1][401][401];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				Arrays.fill(dp[i][j], Integer.MAX_VALUE);
			}
		}
		dp[0][0][0] = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				for (int k = 0; k < dp[i][j].length; k++) {
					dp[i][j][k] = dp[i - 1][j][k];
					if (a[i - 1] <= j && b[i - 1] <= k) {
						if (dp[i - 1][j - a[i - 1]][k - b[i - 1]] == Integer.MAX_VALUE)
							continue;
						dp[i][j][k] = Math.min(
								dp[i][j][k], dp[i - 1][j - a[i - 1]][k - b[i - 1]] + c[i - 1]
						);
					}
				}
			}
		}

		int answer = Integer.MAX_VALUE;
		for (int i = 1; i < 1000; i++) {
			if (Mb * i > 400) break;
			answer = Math.min(answer, dp[N][i * Ma][i * Mb]);
		}

		if (answer == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(answer);
		}
	}
}
