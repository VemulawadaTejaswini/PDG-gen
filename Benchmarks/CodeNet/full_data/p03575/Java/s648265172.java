import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int[] a;
	static int[] b;
	static boolean[][] graph;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		a = new int[m];
		b = new int[m];
		graph = new boolean[n][n];
		visited = new boolean[n];
		for (int i = 0; i < m; i++) {
			a[i] = in.nextInt() - 1;
			b[i] = in.nextInt() - 1;
			graph[a[i]][b[i]] = true;
			graph[b[i]][a[i]] = true;
		}
		int ans = 0;
		for (int i = 0; i < m; i++) {
			graph[a[i]][b[i]] = false;
			graph[b[i]][a[i]] = false;
			for (int j = 0; j < n; j++) {
				visited[j] = false;
			}
			dfs(0);
			boolean bridge = false;
			for (int j = 0; j < n; j++) {
				if (visited[j] == false) {
					bridge = true;
				}
			}
			if (bridge) {
				ans++;
			}
			graph[a[i]][b[i]] = graph[b[i]][a[i]] = true;

		}
		System.out.println(ans);
		in.close();
	}

	static void dfs(int v) {
		visited[v] = true;
		for (int i = 0; i < n; i++) {
			if (graph[v][i] == false) {
				continue;
			}
			if (visited[i] == true) {
				continue;
			}
			dfs(i);
		}
	}
}