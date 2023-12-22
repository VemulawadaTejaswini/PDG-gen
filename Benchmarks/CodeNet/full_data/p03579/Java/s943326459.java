

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main{

	static class pair {
		int x, y;

		public pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static class graph {
		int n;
		Deque<Integer> adj[];
		Set<Integer> sec[];

		@SuppressWarnings("unchecked")
		public graph(int n) {
			this.n = n;
			adj = new ConcurrentLinkedDeque[n + 1];
			sec = new HashSet[n + 1];
			visited = new boolean[n + 1];
			for (int i = 0; i <= n; i++) {
				adj[i] = new ConcurrentLinkedDeque<>();
				sec[i] = new HashSet<>();
			}

		}

		public void addEdge(int u, int v) {
			adj[u].add(v);
			adj[v].add(u);
		}

		Stack<Integer> st = new Stack<>();
		boolean visited[];

		public void topoSort(int u) {
			visited[u] = true;
			Iterator<Integer> itr = adj[u].iterator();
			while (itr.hasNext()) {
				int v = itr.next();
				if (!visited[v]) {

					topoSort(v);
				}
			}
			st.push(u);
		}

		public int MaxEdge() {
			int max = 0;
			Set<pair> set = new HashSet<>();
			while (!st.isEmpty()) {
				int x = st.pop();
				Iterator<Integer> itr1 = adj[x].iterator();
				while (itr1.hasNext()) {
					int y = itr1.next();
					if (x == y) {
						continue;
					}
					Iterator<Integer> itr2 = adj[y].iterator();
					// System.out.println("l1 "+x+" --- "+y);
					while (itr2.hasNext()) {
						int z = itr2.next();
						if (z == x || z == y) {
							// System.out.println("continued at "+z+" "+y);
							continue;
						}
						Iterator<Integer> itr3 = adj[z].iterator();
						// System.out.println("l2 "+x+" --- "+y+" --- "+z);
						while (itr3.hasNext()) {
							int w = itr3.next();
							if (z == x || z == y || z == w || x == w || y == w) {
								continue;
							}
							// System.out.println("l3");
							//System.out.println(x + " --- " + y + " --- " + z + " ---- " + w + " ");
							if (!adj[x].contains(w)) {
								 adj[x].add(w);
								adj[w].add(x);
								pair p = new pair(Math.min(x, w), Math.max(x, w));
								//System.out.println("added bw " + Math.min(x, w) + "---" + Math.max(x, w));
								sec[Math.min(x, w)].add(Math.max(x, w));

							}
						}
					}
				}

			}
			for (int i = 0; i < adj.length; i++) {
				if (sec[i].size() > 0) {
					max += sec[i].size();
				}
			}
			return max;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		graph g = new graph(n);
		for (int i = 0; i < m; i++) {
			g.addEdge(sc.nextInt(), sc.nextInt());
		}
		g.topoSort(1);
		System.out.println(g.MaxEdge());
	}

}
