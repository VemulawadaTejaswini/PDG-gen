import java.util.*;

public class Main {
	private static List<Integer>[] g;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			g[a].add(b);
			g[b].add(a);
		}

		System.out.println(dfs(0, new HashSet<>()));
	}

	private static int dfs(int v, Set<Integer> visited) {
		if (visited.contains(v)) {
			return 0;
		}

		if (visited.size() == g.length - 1) {
			return 1;
		}

		visited.add(v);

		int a = 0;
		for (int i = 0; i < g[v].size(); i++) {
			int next = g[v].get(i);
			if (!visited.contains(next)) {
				a += dfs(next, visited);
			}
		}

		visited.remove(v);
		return a;
	}
}
