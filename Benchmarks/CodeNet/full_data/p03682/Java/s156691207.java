import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		int n = cin.nextInt();
		int[][] xys = new int[n][];
		for (int i = 0; i < n; i++)
			xys[i] = new int[] { cin.nextInt(), cin.nextInt(), i };

		long ans = solve(n, xys);
		cout.println(ans);
	}

	private static long solve(int n, int[][] xys) {
		// editorial後

		ArrayList<int[]> edges = new ArrayList<>();

		ArrayList<int[]> ordered = new ArrayList<>();
		ordered.addAll(Arrays.asList(xys));
		for (int j = 0; j < 2; j++) {
			int tmp = j;
			Collections.sort(ordered, Comparator.comparingInt((xy) -> xy[tmp]));
			for (int i = 1; i < n; i++) {
				int fr = ordered.get(i - 1)[2];
				int to = ordered.get(i)[2];
				int[] frxy = xys[fr];
				int[] toxy = xys[to];
				int w = Math.min(Math.abs(frxy[0] - toxy[0]), Math.abs(frxy[1] - toxy[1]));
				edges.add(new int[] { w, fr, to });
			}
		}

		// 最小全域木
		// https://ja.wikipedia.org/wiki/%E5%85%A8%E5%9F%9F%E6%9C%A8
		// クラスカル法
		// https://en.wikipedia.org/wiki/Kruskal%27s_algorithm
		long ans = 0;

		Group[] vis = new Group[n];
		int group = 0;
		Collections.sort(edges, Comparator.comparingInt((e) -> e[0]));
		for (int[] e : edges) {
			int w = e[0];
			int fr = e[1];
			int to = e[2];
			// unite
			Group g;
			if (vis[fr] == null && vis[to] == null) {
				group += 1;
				g = new Group(group);
			} else if (vis[fr] == null ^ vis[to] == null) {
				g = vis[to];
				if (g == null)
					g = vis[fr];
			} else if (vis[fr].no != vis[to].no) {
				// merge groups.
				vis[to].no = vis[fr].no;
				g = vis[to];
			} else {
				// if same
				continue;
			}
			vis[fr] = g;
			vis[to] = g;
			ans += w;
			// System.out.println(fr + " " + to);
			// System.out.println(Arrays.toString(vis));
		}
		return ans;
	};

	private static class Group {
		int no;

		public Group(int no) {
			super();
			this.no = no;
		}

		@Override
		public String toString() {
			return Integer.toString(no);
		}
	}

	/**
	 * How to read input in Java — tutorial <br />
	 * By Flatfoot<br />
	 * http://codeforces.com/blog/entry/7018
	 */
	static class FastScanner {
		private BufferedReader br;
		private StringTokenizer st;

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			return st.nextToken();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			return str;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
