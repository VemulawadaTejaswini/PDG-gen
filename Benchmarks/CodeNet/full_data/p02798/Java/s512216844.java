import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] a = new int[n][2];
		for (int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			a[i][1] = sc.nextInt();
		}

		int dp[][] = new int[1 << n][51];
		for (int i = 0; i < 1 << n; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE / 3);
		}

		int[][] swap = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				swap[i][j] = (i % 2) == (j % 2) ? a[j][0] : a[j][1];
			}
		}

		dp[0][0] = 0;
		for (int mask = 0; mask < (1 << n); mask++) {
			int x = Integer.bitCount(mask);

			for (int val = 0; val < 51; val++) {
				if (dp[mask][val] == Integer.MAX_VALUE / 3) continue;

				int cost = 0;
				for (int i = 0; i < n; i++) {
					if ((mask & (1 << i)) > 0) continue;
					if (swap[x][i] >= val) {
						dp[mask | (1 << i)][swap[x][i]] = Math.min(
								dp[mask | (1 << i)][swap[x][i]],
								dp[mask][val] + cost);
					}
					cost++;
				}
			}
		}

		int answer = Integer.MAX_VALUE;
		for (int i = 0; i < 51; i++) {
			answer = Math.min(answer, dp[(1 << n) - 1][i]);
		}

		if (answer == Integer.MAX_VALUE / 3) {
			System.out.println(-1);
		} else {
			System.out.println(answer);
		}
	}
}
