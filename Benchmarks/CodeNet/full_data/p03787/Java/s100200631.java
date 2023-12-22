import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] u = new int[M];
		int[] v = new int[M];
		ArrayList<Integer>[] g = new ArrayList[N];
		for (int i = 0; i < N; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; ++i) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			--u[i];
			--v[i];
			g[u[i]].add(v[i]);
			g[v[i]].add(u[i]);
		}
		solver(N, M, u, v, g);

	}

	void solver(int N, int M, int[] u, int[] v, ArrayList<Integer>[] g) {
		DJSet ds = new DJSet(N);
		for (int i = 0; i < M; ++i) {
			ds.setUniont(u[i], v[i]);
		}
		boolean[] vis = new boolean[N];
		long[] cnt = new long[3];
		long sz = 0;
		for (int i = 0; i < N; ++i) {
			if (vis[ds.root(i)])
				continue;
			int t = type(ds.root(i), g);
			vis[ds.root(i)] = true;
			++cnt[t];
			if (t != 0)
				sz += ds.size(i);
		}
		long ans = 0;
		ans += cnt[0] * sz;
		ans += sz * cnt[0];
		ans += cnt[0] * cnt[0];
		ans += cnt[1] * cnt[1] * 2;
		ans += cnt[2] * cnt[2];
		ans += cnt[1] * cnt[2];
		ans += cnt[2] * cnt[1];
		System.out.println(ans);

	}

	// 0:頂点一つ
	// 1:二部グラフ
	// 2:非二部グラフ
	int type(int rep, ArrayList<Integer>[] g) {
		if (g[rep].size() == 0)
			return 0;
		int[] color = new int[g.length];
		Arrays.fill(color, -1);
		if (isBipartite(rep, color, 0, g)) {
			return 1;
		} else
			return 2;
	}

	boolean isBipartite(int cur, int[] color, int curColor, ArrayList<Integer>[] g) {
		color[cur] = curColor;
		for (int dst : g[cur]) {
			if (color[dst] != -1) {
				if (color[dst] == curColor)
					return false;
				continue;
			}
			if (!isBipartite(dst, color, curColor ^ 1, g)) {
				return false;
			}
		}
		return true;
	}

	class DJSet {
		int n;
		int[] upper;

		public DJSet(int n) {
			this.n = n;
			upper = new int[n];
			Arrays.fill(upper, -1);
		}

		int root(int x) {
			return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
		}

		boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		void setUniont(int x, int y) {
			x = root(x);
			y = root(y);

			if (x != y) {
				if (upper[x] < upper[y]) {
					int d = x;
					x = y;
					y = d;
				}
				upper[y] += upper[x];
				upper[x] = y;
			}
		}

		int size(int x) {
			return -upper[root(x)];
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
