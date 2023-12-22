import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static int[][][] undirectedGraph(int n, int[] v1, int[] v2, int[] cost) {
		int[] cnt = new int[n];
		for (int i : v1) cnt[i]++;
		for (int i : v2) cnt[i]++;

		int[][][] g = new int[n][][];
		for (int i=0; i<n; i++) g[i] = new int[cnt[i]][2];
		for (int i=0; i<v1.length; i++) {
			int s = v1[i];
			int t = v2[i];

			g[s][--cnt[s]][0] = t;
			g[s][cnt[s]][1] = cost[i];

			g[t][--cnt[t]][0] = s;
			g[t][cnt[t]][1] = cost[i];
		}

		return g;
	}

	static int[][][] g;
	static int[] depth, ans;

	static final int MAX = Integer.MAX_VALUE;
	static final int MIN = -Integer.MAX_VALUE;

	static boolean rec(int cur, int prev, int x, int d) {
		depth[cur] = d;

		if (ans[cur] != -1) {
			if (x != -1 && (ans[cur] > ans[x] + (depth[cur] - depth[x])  || ans[cur] < ans[x] - (depth[cur] - depth[x])) ) return false;
			if (x != -1 && Math.abs(ans[cur] - ans[x])%2 != Math.abs(depth[cur] - depth[x])%2) return false;
			x = cur;
		}

		int min = MAX, max = MIN;

		for (int[] to : g[cur]) {
			int next = to[0];
			if (next == prev) continue;
			if (!rec(next, cur, x, d+1)) return false;
			min = Math.min(min, ans[next]);
			max = Math.max(max, ans[next]);
		}

		if (ans[cur] != -1) {
			return true;
		}

		if (min == MAX && max == MIN) {
			ans[cur] = ans[x] + depth[cur] - depth[x];
		} else if (min == max) {
			if (ans[x] > min)
				ans[cur] = min + 1;
			else
				ans[cur] = max - 1;
		} else if (min != MAX && max != MIN) {
			ans[cur] = max - 1;
		}

		return true;
	}

	static void solve() {
		int n = in.nextInt();
		int[] s = new int[n-1];
		int[] t = new int[n-1];
		int[] c = new int[n-1];
		for (int i=0; i<n-1; i++) {
			s[i] = in.nextInt() - 1;
			t[i] = in.nextInt() - 1;
			c[i] = 1;
		}

		g = undirectedGraph(n, s, t, c);

		int k = in.nextInt();
		ans = new int[n];
		Arrays.fill(ans, -1);

		int root = -1;

		for (int i=0; i<k; i++) {
			int v = in.nextInt() - 1;
			int p = in.nextInt();
			ans[v] = p;
			root = v;
		}

		depth = new int[n];
		Arrays.fill(depth, -1);
		if (rec(root, -1, -1, 0)) {
			out.println("Yes");
			for (int i=0; i<n; i++) {
				out.println(ans[i]);
			}
		} else {
			out.println("No");
		}
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}