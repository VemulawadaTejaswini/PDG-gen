import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	private static final long M = 1000000007;
	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	void solve() throws IOException {

		char[] a = ns().toCharArray();
		long dp[] = new long[5];
		dp[1] = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'C')
				dp[4] += dp[3];
			else if (a[i] == 'B')
				dp[3] += dp[2];
			if (a[i] == 'A')
				dp[2] += dp[1];
			else if (a[i] == '?') {
				for (int j = 4; j >= 1; j--)
					dp[j] = dp[j] * 3 + dp[j - 1];
			}
			for (int j = 4; j >= 1; j--)
				dp[j] %= M;
//			Helper.tr(dp);
		}

		out.println(dp[4]);
	}

	String ns() throws IOException {
		while (!tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine(), " ");
		}
		return tok.nextToken();
	}

	int ni() throws IOException {
		return Integer.parseInt(ns());
	}

	long nl() throws IOException {
		return Long.parseLong(ns());
	}

	double nd() throws IOException {
		return Double.parseDouble(ns());
	}

	String[] nsa(int n) throws IOException {
		String[] res = new String[n];
		for (int i = 0; i < n; i++) {
			res[i] = ns();
		}
		return res;
	}

	int[] nia(int n) throws IOException {
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = ni();
		}
		return res;
	}

	int[][] nia(int n, int m) throws IOException {
		int[][] res = new int[n][];
		for (int i = 0; i < n; i++) {
			res[i] = nia(m);
		}
		return res;
	}

	long[] nla(int n) throws IOException {
		long[] res = new long[n];
		for (int i = 0; i < n; i++) {
			res[i] = nl();
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		tok = new StringTokenizer("");
		Main main = new Main();
		main.solve();
		out.close();
	}
}