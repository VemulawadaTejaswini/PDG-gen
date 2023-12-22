import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();

		int[] rs = new int[r];
		for (int i = 0; i < r; i++) {
			rs[i] = sc.nextInt() - 1;
		}

		long[][] d = new long[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(d[i], Long.MAX_VALUE);
		}
		for (int i = 0; i < n; i++) {
			d[i][i] = 0;
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();
			d[a][b] = c;
			d[b][a] = c;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (d[i][k] == Long.MAX_VALUE || d[k][j] == Long.MAX_VALUE) continue;
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}

		long[][] dp = new long[1 << r][r];
		for (int i = 0; i < 1 << r; i++) {
			Arrays.fill(dp[i], Long.MAX_VALUE);
		}

		for (int i = 0; i < r; i++) {
			dp[(1 << i)][i] = 0;
		}

		for (int i = 0; i < 1 << r; i++) {
			for (int j = 0; j < r; j++) {
				if (dp[i][j] == Long.MAX_VALUE) continue;
				for (int k = 0; k < r; k++) {
					if (j == k) continue;
					if (((1 << k) & i) > 0) continue;

					int next = (1 << k) | i;
					dp[next][k] = Math.min(dp[next][k], dp[i][j] + d[rs[j]][rs[k]]);
				}
			}
		}

		long answer = Long.MAX_VALUE;
		for (int i = 0; i < r; i++) {
			answer = Math.min(answer, dp[(1 << r) - 1][i]);
		}

		System.out.println(answer);
	}
}
