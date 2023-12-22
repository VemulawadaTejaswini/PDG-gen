import static java.lang.Math.max;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	final static int INF = Integer.MAX_VALUE;
	static boolean[][] conn;
	static int[] memo;
	static int n;

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		solve(in, System.out);
		in.close();
	}

	protected static void solve(Scanner in, PrintStream out) {
		n = in.nextInt();
		int m = in.nextInt();
		conn = new boolean[n + 1][n + 1];
		for (int j = 0; j < m; j++)
			conn[in.nextInt()][in.nextInt()] = true;
		int ret = solveLine();
		out.printf(Locale.ENGLISH, "%s%n", ret);
	}

	private static int solveLine() {
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			memo = new int[n + 1];
			Arrays.fill(memo, -1);
			ans = max(ans, lp(i));
		}
		return ans;
	}

	private static int lp(int pos) {
		if (memo[pos] >= 0) return memo[pos];
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			if (conn[pos][i]) {
				ans = max(ans, 1 + lp(i));
			}
		}
		return memo[pos] = ans;
	}

}