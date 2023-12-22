import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[][] dp = new int[n][k + 1];
		for (int i = 0; i < k; i++) {
			dp[0][i] = 1;
		}
		dp[0][k] = k;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < k; j++) {
				dp[i][j] = dp[i - 1][k] - dp[i - 1][j];
				dp[i][k] += dp[i][j];
			}
		}

		pr.println(dp[n - 1][k]);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
