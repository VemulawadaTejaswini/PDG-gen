import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskB {
		int step;
		int leaf1;
		int leaf2;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int m = in.nextInt();
			List<Integer>[] adj = new List[n];
			for (int i = 0; i < n; i++) {
				adj[i] = new ArrayList<>();
			}
			for (int i = 0; i < m; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				adj[a].add(b);
				adj[b].add(a);
			}
			boolean[] was = new boolean[n];
			int[] p = new int[n];
			Arrays.fill(p, -1);
			leaf1 = -1;
			step = 0;
			dfs(0, adj, was, p);
			Arrays.fill(was, false);
			List<Integer> path1 = new ArrayList<>();
			for (int i = leaf1; i >= 0; i = p[i]) {
				path1.add(i);
				was[i] = true;
			}

			Arrays.fill(p, -1);
			was[0] = false;
			step = 1;
			dfs(0, adj, was, p);

			List<Integer> path2 = new ArrayList<>();
			for (int i = leaf2; i >= 0; i = p[i]) {
				path2.add(i);
			}
			if (!path2.isEmpty()) {
				path2.remove(path2.size() - 1);
			}
			Collections.reverse(path2);
			path1.addAll(path2);
			out.println(path1.size());
			for (int i = 0; i < path1.size(); i++) {
				if (i > 0) {
					out.print(" ");
				}
				out.print(path1.get(i) + 1);
			}
			out.println();
		}

		private void dfs(int i, List<Integer>[] adj, boolean[] was, int[] p) {
			was[i] = true;
			boolean any = false;
			for (int j : adj[i]) {
				if (was[j]) {
					continue;
				}
				any = true;
				p[j] = i;
				dfs(j, adj, was, p);
			}
			if (any) {
				return;
			}
			if (step == 0) {
				leaf1 = i;
			} else {
				leaf2 = i;
			}
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

