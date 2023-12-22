

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) throws FileNotFoundException {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	ArrayList<Integer>[] g;

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		g = new ArrayList[n];
		for (int i = 0; i < n; ++i) {
			g[i] = new ArrayList<>();
		}
		int[] a = new int[n - 1];
		int[] b = new int[n - 1];
		HLDecomposition hld = new HLDecomposition(n);
		for (int i = 0; i < n - 1; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			--a[i];
			--b[i];
			g[a[i]].add(b[i]);
			g[b[i]].add(a[i]);
			hld.ae(a[i], b[i]);
		}
		hld.pre();
		// parent = new int[n];
		// depth = new int[n];
		// sz = new int[n];
		// sz2 = new int[n];
		// Arrays.fill(parent, -1);
		// dfs(0, -1);
		// int cur = n - 1;
		// boolean[] f = new boolean[n];
		// int cnt = 0;
		// while (parent[cur] != 0) {
		// cur = parent[cur];
		// f[cur] = true;
		// ++cnt;
		// }
		// int F = 0;
		// int S = n - 1;
		// int[] col = new int[n];
		// Arrays.fill(col, -1);
		// col[F] = 0;
		// col[S] = 1;
		// while (cnt > 0) {
		// for (int dst : g[F]) {
		// if (f[dst]) {
		// col[dst] = 0;
		// F = dst;
		// break;
		// }
		// }
		// --cnt;
		// if (cnt == 0)
		// break;
		// col[parent[S]] = 1;
		// S = parent[S];
		// --cnt;
		// if (cnt == 0)
		// break;
		// }
		// for (int i = 0; i < n; ++i) {
		// if (col[i] == -1)
		// continue;
		// sz2[i] = 1;
		// for (int dst : g[i]) {
		// if (col[dst] == -1) {
		// sz2[i] += sz[dst];
		// }
		// }
		// }
		//
		// int[] h = new int[2];
		// for (int i = 0; i < n; ++i) {
		// if (col[i] != -1) {
		// h[col[i]] += sz2[i];
		// }
		// }
		int[] h = new int[2];
		h[0] = 1;
		h[1] = 1;
		for (int i = 1; i < n - 1; ++i) {
			int d0 = -2 * hld.depth[hld.lca(0, i)] + hld.depth[0] + hld.depth[i];
			int d1 = -2 * hld.depth[hld.lca(n - 1, i)] + hld.depth[n - 1] + hld.depth[i];
			if (d0 <= d1) {
				++h[0];
			} else {
				++h[1];
			}
		}
		if (h[0] + h[1] != n) {
			throw new AssertionError();
		}
		if (h[0] <= h[1]) {
			System.out.println("Snuke");
		} else {
			System.out.println("Fennec");
		}
	}

	int[] parent;
	int[] depth;
	int[] sz;
	int[] sz2;

	void dfs(int cur, int par) {
		parent[cur] = par;
		sz[cur] = 1;
		for (int dst : g[cur]) {
			if (dst == par)
				continue;
			depth[dst] = depth[cur] + 1;
			dfs(dst, cur);
			sz[cur] += sz[dst];
		}
	}

	class HLDecomposition {
		int n;
		int[] depth;
		int[] head;
		int[] heavy;
		int[] parent;
		int[] sz;
		ArrayList<Integer>[] g;
		int[] id;

		@SuppressWarnings("unchecked")
		public HLDecomposition(int n) {
			this.n = n;
			depth = new int[n];
			head = new int[n];
			heavy = new int[n];
			parent = new int[n];
			id = new int[n];
			sz = new int[n];
			g = new ArrayList[n];
			for (int i = 0; i < n; ++i) {
				g[i] = new ArrayList<>();
			}
			Arrays.fill(head, -1);
			Arrays.fill(id, -1);
			Arrays.fill(parent, -1);
		}

		void ae(int a, int b) {
			g[a].add(b);
			g[b].add(a);
		}

		void pre() {
			dfs(0, -1);
			bfs();
		}

		void bfs() {
			ArrayDeque<Integer> pend = new ArrayDeque<>();
			int gen = 0;
			pend.add(0);
			while (!pend.isEmpty()) {
				int v = pend.pollFirst();
				int top = v;
				for (; v != -1; v = heavy[v]) {
					id[v] = gen++;
					head[v] = top;
					for (int d : g[v]) {
						if (d == parent[v] || d == heavy[v]) {
							continue;
						}
						pend.add(d);
					}
				}
			}
		}

		int lca(int u, int v) {
			if (head[u] != head[v]) {
				if (depth[head[u]] < depth[head[v]]) {
					int tmp = u;
					u = v;
					v = tmp;
				}
				return lca(parent[head[u]], v);
			} else {
				if (depth[u] > depth[v]) {
					int tmp = u;
					u = v;
					v = tmp;
				}
				return u;
			}
		}

		int dfs(int c, int p) {
			parent[c] = p;
			int s = 1;
			int to = -1;
			for (int d : g[c]) {
				if (d == p)
					continue;
				depth[d] = depth[c] + 1;
				s += dfs(d, c);
				if (to == -1 || sz[d] > sz[to]) {
					to = d;
				}
			}
			sz[c] = s;
			heavy[c] = to;
			return s;
		}

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
