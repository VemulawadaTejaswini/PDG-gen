import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

public class Main {
	FastScanner in;
	PrintWriter out;
	boolean systemIO = true;

	public long pow(long a, int b) {
		long ans = 1;
		for (int i = 0; i < b; i++) {
			ans *= a;
		}
		return ans;
	}

	public void solve() {
		String s = in.next();
		int n = s.length();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.charAt(i) - 'a';
		}
		int[][] dp = new int[n + 1][3];
		for (int i = 0; i < a.length; i++) {
			if (i + 1 <= n) {
				dp[i + 1][0] = Math.max(dp[i + 1][0], dp[i][1] + 1);
				dp[i + 1][0] = Math.max(dp[i + 1][0], dp[i][2] + 1);
			}
			if (i + 2 <= n) {
				dp[i + 2][1] = Math.max(dp[i + 2][1], dp[i][0] + 1);
				dp[i + 2][1] = Math.max(dp[i + 2][1], dp[i][2] + 1);
			}
			if (i + 3 <= n) {
				dp[i + 3][2] = Math.max(dp[i + 3][2], dp[i][0] + 1);
				dp[i + 3][2] = Math.max(dp[i + 3][2], dp[i][1] + 1);
			}
			if (i + 1 <= n && i > 0 && s.charAt(i) != s.charAt(i - 1)) {
				dp[i + 1][0] = Math.max(dp[i + 1][0], dp[i][0] + 1);
			}
			if (i + 2 <= n && i > 1 && (s.charAt(i) != s.charAt(i - 2) || s.charAt(i + 1) != s.charAt(i - 1))) {
				dp[i + 2][1] = Math.max(dp[i + 2][1], dp[i][1] + 1);
			}
			if (i + 3 <= n && i > 2 && (s.charAt(i) != s.charAt(i - 3) || s.charAt(i + 1) != s.charAt(i - 2)
					|| s.charAt(i + 2) != s.charAt(i - 1))) {
				dp[i + 3][2] = Math.max(dp[i + 3][2], dp[i][2] + 1);
			}
		}
		int ans = 0;
		for (int i = 0; i < dp[0].length; i++) {
			ans = Math.max(ans, dp[n][i]);
		}
		out.println(ans);
	}

	public void run() {
		try {
			if (systemIO) {
				in = new FastScanner(System.in);
				out = new PrintWriter(System.out);
			} else {
				in = new FastScanner(new File("segments.in"));
				out = new PrintWriter(new File("segments.out"));
			}
			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
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

	// AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	public static void main(String[] arg) {
		new Main().run();
	}
}