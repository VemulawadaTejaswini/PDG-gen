import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		List<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < n - 1 + m; i++) {
			g[sc.nextInt() - 1].add(sc.nextInt() - 1);
		}

		TopologicalSort ts = new TopologicalSort(g);

		int[] parents = new int[n];
		Iterable<Integer> order = ts.order();
		for (int i : order) {
			//System.out.print("S:  ");
			//System.out.println(i);
			for (int j = 0; j < g[i].size(); j++) {
				parents[g[i].get(j)] = i + 1;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(parents[i]);
		}
	}

	private static class TopologicalSort {
		List<Integer>[] g;
		Queue<Integer> q = new LinkedList<>();
		boolean visited[];

		public TopologicalSort(List<Integer>[] g) {
			this.g = g;
			visited = new boolean[g.length];

			for (int v = 0; v < g.length; v++) {
				if (!visited[v]) dfs(v);
			}
		}

		public Iterable<Integer> order() {
			Stack<Integer> reverse = new Stack<>();
			for (int i : q) {
				reverse.push(i);
			}
			List<Integer> a = new ArrayList();
			while (!reverse.isEmpty())
				a.add(reverse.pop());
			return a;
		}

		private void dfs(int v) {
			if (visited[v]) return;
			visited[v] = true;
			for (Integer i : g[v]) {
				dfs(i);
			}
			q.offer(v);
		}
	}
}
