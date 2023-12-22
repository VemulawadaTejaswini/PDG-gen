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
		var sol = new Solver();
		sol.solve();
		out.close();
	}

	private static final class Solver {
		public void solve() {
			var n = in.nextInt(), a = in.nextInt();
			int[] x = new int[n];
			for (int i = 0; i < n; ++i) x[i] = in.nextInt();
			int[][][] dp = new int[n + 1][n + 1][5000];
			dp[0][0][0] = 1;
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					for (int k = 0; k < 5000; ++k) {
						if (dp[i][j][k] == 0) continue;
						dp[i + 1][j + 1][k + x[i]] += dp[i][j][k];
						dp[i + 1][j][k] += dp[i][j][k];
					}
				}
			}
			long ans = 0;
			for (int i = 1; i <= n; ++i) ans += dp[n][i][a * i];
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
