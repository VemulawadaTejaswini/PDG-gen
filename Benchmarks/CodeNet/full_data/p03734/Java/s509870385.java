import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		long ans;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int W = in.nextInt();
			int[] w = new int[n];
			int[] v = new int[n];
			for (int i = 0; i < n; i++) {
				w[i] = in.nextInt();
				v[i] = in.nextInt();
			}
			List<Integer>[] vs = new List[4];
			for (int i = 0; i < vs.length; i++) {
				vs[i] = new ArrayList<>();
			}
			for (int i = 0; i < n; i++) {
				vs[w[i] - w[0]].add(v[i]);
			}
			for (int i = 0; i < vs.length; i++) {
				Collections.sort(vs[i]);
				Collections.reverse(vs[i]);
			}
			ans = 0;
			rec(w[0], 0, 0, 0L, W, vs);
			out.println(ans);
		}

		private void rec(int w0, int curList, int curPos, long curSum, int w, List<Integer>[] vs) {
			ans = Math.max(ans, curSum);
			if (curList == vs.length) {
				return;
			}
			rec(w0, curList + 1, 0, curSum, w, vs);
			if (curPos < vs[curList].size()) {
				int nw = w - (w0 + curList);
				if (nw >= 0) {
					rec(w0, curList, curPos + 1, curSum + vs[curList].get(curPos), nw, vs);
				}
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

