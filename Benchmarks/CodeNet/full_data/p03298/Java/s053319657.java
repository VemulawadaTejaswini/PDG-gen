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
		ProblemC solver = new ProblemC();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			char[] s = in.next().toCharArray();
			char[] t = new char[n];
			Map<String, Integer>[] m1 = new Map[n + 1];
			Map<String, Integer>[] m2 = new Map[n + 1];
			for (int i = 0; i < m1.length; i++) {
				m1[i] = new HashMap<>();
				m2[i] = new HashMap<>();
			}
			for (int mask = 0; mask < 1 << n; mask++) {
				int l = 0;
				int r = n - 1;
				for (int i = 0; i < n; i++) {
					if ((mask & (1 << i)) == 0) {
						t[l++] = s[i];
					} else {
						t[r--] = s[i];
					}
				}
				add(m1[Integer.bitCount(mask)], new String(t));
			}
			for (int mask = 0; mask < 1 << n; mask++) {
				int l = 0;
				int r = n - 1;
				for (int i = n - 1; i >= 0; i--) {
					if ((mask & (1 << i)) != 0) {
						t[l++] = s[n + i];
					} else {
						t[r--] = s[n + i];
					}
				}
				add(m2[Integer.bitCount(mask)], new String(t));
			}
			long ans = 0;
			for (int i = 0; i <= n; i++) {
				for (Map.Entry<String, Integer> e : m1[i].entrySet()) {
					Integer v = m2[n - i].get(e.getKey());
					if (v != null) {
						ans += (long) e.getValue() * v;
					}
				}
			}
			out.println(ans);
		}

		private void add(Map<String, Integer> m, String k) {
			Integer v = m.get(k);
			if (v == null) {
				v = 0;
			}
			m.put(k, v + 1);
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

