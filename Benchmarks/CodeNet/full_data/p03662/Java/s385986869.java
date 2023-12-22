
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	ArrayList<Integer>[] g;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		g = new ArrayList[n];
		for (int i = 0; i < n; ++i) {
			g[i] = new ArrayList<>();
		}
		int[] a = new int[n - 1];
		int[] b = new int[n - 1];
		for (int i = 0; i < n - 1; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			--a[i];
			--b[i];
			g[a[i]].add(b[i]);
			g[b[i]].add(a[i]);
		}
		parent = new int[n];
		depth = new int[n];
		sz = new int[n];
		sz2 = new int[n];
		Arrays.fill(parent, -1);
		dfs(0, -1);
		int cur = n - 1;
		boolean[] f = new boolean[n];
		int cnt = 0;
		while (cur != 0) {
			cur = parent[cur];
			f[cur] = true;
			++cnt;
		}
		int F = 0;
		int S = n - 1;
		int[] col = new int[n];
		Arrays.fill(col, -1);
		col[F] = 0;
		col[S] = 1;
		while (true) {
			for (int dst : g[F]) {
				if (f[dst]) {
					col[dst] = 0;
					F = dst;
					break;
				}
			}
			--cnt;
			if (cnt == 0)
				break;
			col[parent[S]] = 1;
			S = parent[S];
			--cnt;
			if (cnt == 0)
				break;
		}

		for (int i = 0; i < n; ++i) {
			sz2[i] = 1;
			for (int dst : g[i]) {
				if (col[dst] == -1) {
					sz2[i] += sz[dst];
				}
			}
		}

		int[] h = new int[2];
		for (int i = 0; i < n; ++i) {
			if (col[i] != -1) {
				h[col[i]] += sz2[i];
			}
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

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
