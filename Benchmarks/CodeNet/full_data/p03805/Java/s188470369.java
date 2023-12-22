import java.util.Scanner;
public class Main {
	static boolean g[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		g = new boolean[n][n];
		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(sc.next()) - 1;
			int b = Integer.parseInt(sc.next()) - 1;
			g[a][b] = g[b][a] = true;
		}
		boolean[] visited = new boolean[n];
		visited[0] = true;
		System.out.println(dfs(0,n,visited));
	}
	public static int dfs(int v, int n, boolean[] visited) {
		boolean visitedAll = true;
		for (int i = 0; i < n; i++)
			if (!visited[i])
				visitedAll = false;
		if (visitedAll)
			return 1;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (g[v][i] == false) continue;
			if (visited[i]) continue;
			visited[i] = true;
			ans += dfs(i, n, visited);
			visited[i] = false;
		}
		return ans;
	}
}