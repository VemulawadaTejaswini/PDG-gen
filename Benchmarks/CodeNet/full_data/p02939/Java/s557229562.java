import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.max;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		String s = scanString();
		int n = s.length();
		int dyn[][] = new int[2][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2; j++) {
				if (i == j) {
					dyn[j - 1][i] = 1;
					continue;
				}
				for (int k = 1; k <= 2; k++) {
					if (j + k > i) {
						continue;
					}
					if (s.substring(i - j, i).equals(s.subSequence(i - j - k, i - j))) {
						continue;
					}
					dyn[j - 1][i] = max(dyn[j - 1][i], dyn[k - 1][i - j] + 1);
				}
			}
		}
		out.print(max(dyn[0][n], dyn[1][n]));
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}