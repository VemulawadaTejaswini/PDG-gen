import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
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
		A_KenkenRace solver = new A_KenkenRace();
		solver.solve(1, in, out);
		out.close();
	}

	static class A_KenkenRace {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			int c = in.nextInt() - 1;
			int d = in.nextInt() - 1;
			char[] s = in.next().toCharArray();
			boolean[] canA = calcReachability(s, c);
			boolean[] canB = calcReachability(s, d);
			if (!canA[a] || !canB[b]) {
				out.println("No");
				return;
			}
			if (c < d) {
				out.println("Yes");
				return;
			}
			for (int i = b; i < n; i++) {
				if (i > 0 && s[i - 1] != '#' && s[i] != '#' && i + 1 < n && s[i + 1] != '#') {
					boolean[] fa = calcReachability(s, i - 1);
					boolean[] fb = calcReachability(s, i);
					if (fa[a] && fb[b] && canA[i + 1] && canB[i]) {
						out.println("Yes");
						return;
					}
					break;
				}
			}
			out.println("No");
		}

		private boolean[] calcReachability(char[] s, int dst) {
			int n = s.length;
			boolean[] can = new boolean[n];
			can[dst] = s[dst] != '#';
			for (int i = n - 1; i >= 0; i--) {
				for (int j = 1; j <= 2; j++) {
					if (s[i] != '#' && i + j < n && can[i + j]) {
						can[i] = true;
					}
				}
			}
			return can;
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
					st = new StringTokenizer(in.readLine());
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

