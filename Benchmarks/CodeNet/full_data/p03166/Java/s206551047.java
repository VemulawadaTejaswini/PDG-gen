import static java.lang.Math.max;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	final static int INF = Integer.MAX_VALUE;
	static boolean[] visited;
	static List<Integer>[] lst;
	static List<Integer> ordered;

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		solve(in, System.out);
		in.close();
	}

	protected static void solve(Scanner in, PrintStream out) {
		int n = in.nextInt();
		int m = in.nextInt();
		lst = new ArrayList[n + 1];
		ordered = new ArrayList<>();
		for (int i = 1; i <= n; i++)
			lst[i] = new ArrayList<>();
		for (int j = 0; j < m; j++)
			lst[in.nextInt()].add(in.nextInt());
		int ret = solveLine(n, m);
		out.printf(Locale.ENGLISH, "%s%n", ret);
	}

	private static int solveLine(int n, int m) {
		int ans = 0;
		visited = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) topoVisit(i);
		}
		int[] dp = new int[n + 1];
		for (int i = n - 1; i >= 0; i--) {
			int val = ordered.get(i);
			for (int a : lst[val]) {
				dp[a] = i == n - 1 ? 1 : max(dp[a], dp[val] + 1);
				ans = max(ans, dp[a]);
			}
		}
		return ans;
	}

	private static void topoVisit(int pos) {
		visited[pos] = true;
		for (int a : lst[pos]) {
			if (!visited[a]) {
				topoVisit(a);
			}
		}
		ordered.add(pos);
	}

}