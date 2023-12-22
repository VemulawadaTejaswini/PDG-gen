import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
		B_PowersOfTwo solver = new B_PowersOfTwo();
		solver.solve(1, in, out);
		out.close();
	}

	static class B_PowersOfTwo {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Map<Integer, Integer> m = new HashMap<>();
			for (int x : a) {
				addOne(m, x);
			}
			int ans = 0;
			for (int bit = 30; bit >= 0; bit--) {
				for (int x : a) {
					if (!m.containsKey(x)) {
						continue;
					}
					int y = x - (1 << bit);
					if (!m.containsKey(y)) {
						continue;
					}
					removeOne(m, x);
					removeOne(m, y);
					++ans;
				}
			}
			out.println(ans);
		}

		private void addOne(Map<Integer, Integer> m, int x) {
			int v = 0;
			if (m.containsKey(x)) {
				v = m.get(x);
			}
			m.put(x, v + 1);
		}

		private void removeOne(Map<Integer, Integer> m, int x) {
			int v = m.get(x);
			if (v == 1) {
				m.remove(x);
			} else {
				m.put(x, v - 1);
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

