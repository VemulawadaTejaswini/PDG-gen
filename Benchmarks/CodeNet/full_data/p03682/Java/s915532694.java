import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
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
			xys[i] = new int[] { cin.nextInt(), cin.nextInt() };

		long ans = solve(n, xys);
		cout.println(ans);
	}

	private static long solve(int n, int[][] xys) {
		long ans = 0;
		// ダイクストラ法
		int[] vis = new int[n];
		PriorityQueue<long[]> ctfs = new PriorityQueue<>((cxy1, cxy2) -> {
			int cmp = Long.compare(cxy1[0], cxy2[0]);
			// TODO 途中経路で同一コストの時に何を優先するか？仮に通過ノード数にしているが、妥当か不明
			if (cmp == 0)
				cmp = Long.compare(cxy2[3], cxy1[3]);
			return cmp;
		});

		ctfs.add(new long[] { 0, 0, 0, 1 });
		while (!ctfs.isEmpty()) {
			long[] ctf = ctfs.remove();
			long c = ctf[0];
			int to = (int) ctf[1];
			int fr = (int) ctf[2];
			int passed = (int) ctf[3];
			// popした時点で、そのノードに到達する最短コストは確定
			if (vis[to] == 1)
				continue;
			vis[to] = 1;
			ans += dist(xys[to][0], xys[to][1], xys[fr][0], xys[fr][1]);

			for (int i = 0; i < n; i++) {
				if (vis[i] == 1)
					continue;
				long nc = c + dist(xys[to][0], xys[to][1], xys[i][0], xys[i][1]);
				ctfs.add(new long[] { nc, i, to, passed + 1 });
			}
		}
		return ans;
	}

	private static long dist(long frx, long fry, long tox, long toy) {
		return Math.min(Math.abs(tox - frx), Math.abs(toy - fry));
	};

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
