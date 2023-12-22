import java.util.*;

public class Main {

	private static List<Integer>[] g;

	private static boolean[] inStack;

	private static boolean[] visited;

	private static long[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] a = new int[n][n - 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				a[i][j] = sc.nextInt() - 1;
			}
		}
		Map<Integer, Integer>[] m = new HashMap[n];
		for (int i = 0; i < n; i++) {
			m[i] = new HashMap<>();
		}

		int nodes = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[i][j] < i) {
					a[i][j] = m[a[i][j]].get(i);
				} else {
					m[i].put(a[i][j], nodes);
					a[i][j] = nodes++;
				}
			}
		}

		//for (int i = 0; i < a.length; i++) {
		//	for (int j = 0; j < a[i].length; j++) {
		//		System.out.print(a[i][j]);
		//		System.out.print(" ");
		//	}
		//	System.out.println();
		//}

		g = new ArrayList[n * (n - 1) / 2];
		for (int i = 0; i < g.length; i++) {
			g[i] = new ArrayList<>();
		}

		int[] ds = new int[n * (n - 1) / 2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j++) {
				g[a[i][j - 1]].add(a[i][j]);
				ds[a[i][j]]++;
			}
		}

		if (hasCycle()) {
			System.out.println(-1);
			return;
		}

		long answer = 0;
		Arrays.fill(visited, false);
		memo = new long[visited.length];

		for (int i = 0; i < ds.length; i++) {
			if (ds[i] > 0 || visited[i]) continue;
			answer = Math.max(answer, dfs2(i));
		}

		System.out.println(answer);
	}

	private static boolean hasCycle() {
		inStack = new boolean[g.length];
		visited = new boolean[g.length];
		Arrays.fill(inStack, false);
		Arrays.fill(visited, false);
		for (int i = 0; i < g.length; i++) {
			if (visited[i]) continue;
			boolean hasCycle = dfs(i);
			if (hasCycle) return true;
		}

		return false;
	}

	private static boolean dfs(int x) {
		if (inStack[x]) return true;
		if (visited[x]) return false;
		visited[x] = true;
		inStack[x] = true;
		for (int i = 0; i < g[x].size(); i++) {
			boolean a = dfs(g[x].get(i));
			if (a) return true;
		}

		inStack[x] = false;
		return false;

	}

	private static long dfs2(int x) {
		if (visited[x]) return memo[x];
		visited[x] = true;
		memo[x] = 1;
		if (g[x].size() == 0) return memo[x];


		long a = 0;
		for (int i = 0; i < g[x].size(); i++) {
			a = Math.max(a, dfs2(g[x].get(i)));
		}
		memo[x] = a + 1;
		return memo[x];
	}
}
