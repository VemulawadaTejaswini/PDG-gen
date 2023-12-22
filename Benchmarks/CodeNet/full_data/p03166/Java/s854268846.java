import static java.lang.Math.max;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	final static int INF = Integer.MAX_VALUE;
	static List<Integer>[] a;

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		solve(in, System.out);
		in.close();
	}

	protected static void solve(Scanner in, PrintStream out) {
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++)
			Arrays.fill(dp[i], -10);
		for (int j = 0; j < m; j++)
			dp[in.nextInt()][in.nextInt()] = 1;
		int ret = solveLine(n, m, dp);
		out.printf(Locale.ENGLISH, "%s%n", ret);
	}

	private static int solveLine(int n, int m, int[][] dp) {
		int ans = 0;
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == j || i == k || j == k) continue;
					dp[i][j] = max(dp[i][j], dp[i][k] + dp[k][j]);
					ans = max(ans, dp[i][j]);
				}
			}
		}
		return ans;
	}

}