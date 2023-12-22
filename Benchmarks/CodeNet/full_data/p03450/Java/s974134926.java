import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<int[]>[] g;
	private static int[] vs;
	private static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		visited = new boolean[n];
		vs = new int[n];
		g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			int d = sc.nextInt();
			g[l].add(new int[]{r, d});
			g[r].add(new int[]{l, -d});
		}

		for (int i = 0; i < n; i++) {
			if (visited[i]) continue;
			if (!dfs(i, 0)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	private static boolean dfs(int v, int x) {
		if (visited[v]) {
			return vs[v] == x;
		}
		visited[v] = true;
		vs[v] = x;
		for (int i = 0; i < g[v].size(); i++) {
			int[] a = g[v].get(i);
			if (!dfs(a[0], vs[v] + a[1])) {
				return false;
			}
		}
		return true;
	}
}
