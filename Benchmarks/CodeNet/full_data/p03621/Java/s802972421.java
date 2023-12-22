import java.io.*;
import java.util.*;

public class Main {

	static final int P = 998244353;

	// static final int P = 1_000_000_007;

	int go(int same, int diff) {
		// System.err.println(same + " " + diff);
		int[][] dp = new int[same + 1][diff + 1];
		dp[same][diff] = 1;

		for (int i = same; i >= 0; i--) {
			for (int j = diff; j >= 0; j--) {

				if (i > 0) {
					// swapping same doesn't matter, pick anything
					dp[i - 1][j] += (int) ((long) dp[i][j] * (i + j) % P);
					if (dp[i - 1][j] >= P) {
						dp[i - 1][j] -= P;
					}
				}

				if (j > 0) {
					dp[i][j - 1] += (int) ((long) dp[i][j] * j % P);
					if (dp[i][j - 1] >= P) {
						dp[i][j - 1] -= P;
					}
				}

			}
		}

		int ret = dp[0][0];
		for (int x = 1; x <= same; x++) {
			ret = (int) ((long) ret * x % P);
		}

		for (int x = 1; x <= diff; x++) {
			ret = (int) ((long) ret * x % P);
		}

		return ret;
	}

	void submit() {
		char[] a = nextToken().toCharArray();
		char[] b = nextToken().toCharArray();

		int ones = 0;
		int diff = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == '1') {
				ones++;
			}
			if (a[i] != b[i]) {
				diff++;
			}
		}

		diff /= 2;

		int same = ones - diff;

		out.println(go(same, diff));
	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
