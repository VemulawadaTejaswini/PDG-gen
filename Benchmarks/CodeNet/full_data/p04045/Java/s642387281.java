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
			int n = in.nextInt(), k = in.nextInt();
			boolean[] availDigits = new boolean[10];
			for (int i = 0; i < k; ++i) availDigits[in.next().charAt(0) - '0'] = true;
			outer: for (int i = n; i < 10000;  ++i) {
				String change = Integer.toString(i);
				for (int j = 0; j < change.length(); ++j) {
					if (availDigits[change.charAt(j) - '0'] == true)
						continue outer;
				}
				out.println(i);
				break;
			}
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
