import static java.lang.Math.max;
import static java.lang.Math.min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	final static int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		solve(in, System.out);
		in.close();
	}

	protected static void solve(Scanner in, PrintStream out) {
		int n = in.nextInt();
		int w = in.nextInt();
		int[] a = new int[n];
		int[] wt = new int[n];
		for (int j = 0; j < n; j++) {
			wt[j] = in.nextInt();
			a[j] = in.nextInt();
		}
		long ret = solveLine(n, w, a, wt);
		out.printf(Locale.ENGLISH, "%s%n", ret);
	}

	private static long solveLine(int n, int w, int[] v, int[] wt) {
		int maxval = n * 1000 + 1;
		long[][] dp = new long[n + 1][maxval + 1];
		for (int i = 1; i <= maxval; i++) {
			dp[0][i] = i <= v[0] ? wt[0] : INF;
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= maxval; j++) {
				dp[i][j] = j < v[i] ? dp[i - 1][j] : min(dp[i - 1][j], dp[i - 1][j - v[i]] + wt[i]);
			}
		}
		long ans = INF;
		for (int i = 0; i <= maxval; i++) if (dp[n - 1][i] <= w) ans = i;
 		return ans;
	}

}