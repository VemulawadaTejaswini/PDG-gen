import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Integer>[] es;
	static int[] dp;

	private static void dfs(int v) {
		if (es[v].size() == 0) return;
		int a = 0;
		for (Integer e : es[v]) {
			if (dp[e] == 0) {
				dfs(e);
			}
			a = Math.max(a, dp[e]);
		}
		dp[v] = a + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		dp = new int[n];
		es = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			es[i] = new ArrayList<>();
		}
		boolean[] hasIn = new boolean[n];
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			es[x].add(y);
			hasIn[y] = true;
		}

		for (int i = 0; i < n; i++) {
			if (!hasIn[i]) dfs(i);
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			answer = Math.max(answer, dp[i]);
		}

		System.out.println(answer);
	}
}
