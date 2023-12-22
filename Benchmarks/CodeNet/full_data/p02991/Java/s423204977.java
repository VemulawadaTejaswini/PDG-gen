import java.util.*;

public class Main {

	private static List<Integer>[] g;
	private static boolean[] visited;
	private static Set<Integer>[] ng;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		g = new ArrayList[n];
		visited = new boolean[n];
		ng = new HashSet[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
			ng[i] = new HashSet<>();
		}

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			g[u].add(v);
			//g[v].add(u);
		}

		int s = sc.nextInt() - 1;
		int t = sc.nextInt() - 1;

		dfs(s, s, 0);

		if (!visited[t]) {
			System.out.println(-1);
			return;
		}

		//for (int i = 0; i < ng.length; i++) {
		//	System.out.print(i);
		//	System.out.print(": ");
		//	for (Integer v : ng[i]) {
		//		System.out.print(v);
		//		System.out.print(" ");
		//	}
		//	System.out.println();
		//}

		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[]{s, 0});
		while (!q.isEmpty()) {
			int[] v = q.poll();
			if (v[0] == t) {
				System.out.println(v[1]);
				return;
			}
			for (Integer i : ng[v[0]]) {
				q.offer(new int[]{i, v[1] + 1});
			}
		}
	}

	private static void dfs(int v, int p, int c) {
		if (c == 3) {
			ng[p].add(v);
			//ng[v].add(p);
			c = 0;
		}
		if (c == 0) {
			if (visited[v]) return;
			visited[v] = true;
		}

		for (int i = 0; i < g[v].size(); i++) {
			dfs(g[v].get(i), (c == 0) ? v : p, c + 1);
		}
	}
}
