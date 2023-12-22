import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
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
				int v = 0;
				if (m.containsKey(x)) {
					v = m.get(x);
				}
				m.put(x, v + 1);
			}
			int ans = 0;
			for (int x : a) {
				if ((x & (x - 1)) == 0) {
					continue;
				}
				if (!m.containsKey(x)) {
					continue;
				}
				int y = -1;
				for (int bit = 0; bit < 31; bit++) {
					int z = x - (1 << bit);
					if (m.containsKey(z)) {
						y = z;
						break;
					}
				}
				if (y >= 0) {
					removeOne(m, x);
					removeOne(m, y);
					++ans;
				}
			}
			int[] p2 = new int[32];
			for (Map.Entry<Integer, Integer> e : m.entrySet()) {
				int k = e.getKey();
				int v = e.getValue();
				if ((k & (k - 1)) == 0) {
					p2[Integer.numberOfTrailingZeros(k)] += v;
				}
			}
			for (int i = 0; i < p2.length; i++) {
				ans += p2[i] / 2;
				if (i + 1 < p2.length) {
					p2[i + 1] += p2[i] % 2;
				}
			}
			out.println(ans);
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

