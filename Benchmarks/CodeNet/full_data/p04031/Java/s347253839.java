import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
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
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; ++i)
				a[i] = in.nextInt();
			int ans = Integer.MAX_VALUE;
			for (int i = -100; i <= 100; ++i) {
				int res = 0;
				for (int val : a) {
					int calc = val - i;
					res += calc * calc;
				}
				ans = Math.min(ans, res);
			}
			out.println(ans);
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
