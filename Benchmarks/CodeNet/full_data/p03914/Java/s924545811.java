import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	static final int P = 1_000_000_007;

	void solve() throws IOException {
		int n = nextInt();
		int m = nextInt();

		int[][] dp = new int[n + 1][n + 1];
		dp[1][0] = 1;

		for (int it = 0; it < m; it++) {
			int[][] nxt = new int[n + 1][n + 1];

			for (int s1 = 0; s1 <= n; s1++) {
				for (int s2 = 0; s1 + s2 <= n; s2++) {
					if (dp[s1][s2] == 0) {
						continue;
					}

					long val = dp[s1][s2];

					// if (s2 == 0) {
					//
					// nxt[s1][s2] += (int)(val * s1 % P);
					// if (nxt[s1][s2] >= P) {
					// nxt[s1][s2] -= P;
					// }
					//
					// nxt[s1][1] += (int)(val * (n - s1) % P);
					// if (nxt[s1][1] >= P) {
					// nxt[s1][1] -= P;
					// }
					//
					// } else {

					nxt[s1 + s2][0] += (int) (val * s1 % P);
					if (nxt[s1 + s2][0] >= P) {
						nxt[s1 + s2][0] -= P;
					}

					nxt[s1][s2] += (int) (val * s2 % P);
					if (nxt[s1][s2] >= P) {
						nxt[s1][s2] -= P;
					}

					nxt[s1][s2 + 1] += (int) (val * (n - s1 - s2) % P);
					if (nxt[s1][s2 + 1] >= P) {
						nxt[s1][s2 + 1] -= P;
					}

					// }

				}
			}
			dp = nxt;
		}
		
		out.println(dp[n][0]);

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}