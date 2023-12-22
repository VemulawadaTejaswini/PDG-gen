import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	void solve() {
		char[] s = in.next().toCharArray();
		int n = s.length;
		int[][] dp = new int[27][n];
		final int MAX = 20;
		int[][] go = new int[MAX][n];
		for (int i = n - 1; i >= 0; i--) {
			int cur = s[i] - 'a';
			dp[cur][i] = 1;
			for (int need = cur + 1; need < 27; need++) {
				int posAsk = i + dp[need - 1][i];
				if (posAsk >= n) {
					dp[need][i] = Integer.MAX_VALUE / 2;
				} else {
					int askLen = dp[need - 1][posAsk];
					if (askLen >= Integer.MAX_VALUE / 2) {
						dp[need][i] = Integer.MAX_VALUE / 2;
					} else {
						dp[need][i] = dp[need - 1][i] + askLen;
					}
				}
			}
			int posAsk = i + dp[26][i];
			go[0][i] = dp[26][i];
			for (int j = 1; j < MAX; j++) {
				int len = go[j - 1][i];
				if (i + len >= n) {
					go[j][i] = Integer.MAX_VALUE / 2;
				} else {
					go[j][i] = go[j - 1][i] + go[j - 1][i + len];
				}
			}
			for (int j = 0; j < cur; j++) {
				if (posAsk >= n) {
					dp[j][i] = Integer.MAX_VALUE / 2;
				} else {
					dp[j][i] = dp[26][i] + dp[j][posAsk];
				}
			}
		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int fr = in.nextInt() - 1;
			int to = in.nextInt() - 1;
			int needLen = to - fr + 1;
			for (int j = MAX - 1; j >= 0; j--) {
				if (needLen > 0 && go[j][fr] <= needLen) {
					needLen -= go[j][fr];
					fr += go[j][fr];
				}
			}
			out.println(needLen == 0 ? "Yes" : "No");
		}
	}

	void run() {
		try {
			in = new FastScanner(new File("object.in"));
			out = new PrintWriter(new File("object.out"));

			solve();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void runIO() {

		in = new FastScanner(System.in);
		out = new PrintWriter(System.out);

		solve();

		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return null;
				st = new StringTokenizer(s);
			}
			return st.nextToken();
		}

		boolean hasMoreTokens() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return false;
				st = new StringTokenizer(s);
			}
			return true;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	public static void main(String[] args) {
		new Main().runIO();
	}
}