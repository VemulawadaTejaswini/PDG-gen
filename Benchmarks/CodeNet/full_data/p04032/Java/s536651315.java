import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final FastIn in = new FastIn();
	private static final PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		Solver sol = new Solver();
		sol.solve();
		out.close();
	}
	private static final class Solver {
		public void solve() {
			char[] s = in.next().toCharArray();
			int n = s.length;
			for (int i = 0; i < n - 1; ++i) {
				if (s[i] == s[i + 1]) {
					out.println((i + 1) + " " + (i + 2));
					return;
				}
			}
			for (int i = 0; i < n - 2; ++i) {
				if (s[i] == s[i + 2]) {
					out.println((i + 1) + " " + (i + 3));
					return;
				}
			}
			out.println("-1 -1");
		}
	}
	private static final class FastIn {
		private BufferedReader br;
		private StringTokenizer st;
		public FastIn() {
			br = new BufferedReader(new InputStreamReader(System.in), 1 << 20);
			st = null;
		}
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
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
