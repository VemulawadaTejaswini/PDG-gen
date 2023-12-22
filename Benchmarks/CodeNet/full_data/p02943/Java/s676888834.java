import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.min;
import static java.lang.System.arraycopy;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		int n = scanInt(), k = scanInt();
		String s = scanString();
		char c[] = new char[2 * n];
		s.getChars(0, n, c, 0);
		for (int i = 0; i < n; i++) {
			c[2 * n - i - 1] = c[i];
		}
		int ss = 0;
		for (int i = 0, j = 1; j < 2 * n && ss + j - i <= n;) {
			char ci = c[i], cj = c[j];
			if (ci == cj) {
				++i;
				++j;
			} else if (ci < cj) {
				i = ss;
				++j;
			} else {
				while (ss + j - i <= n && ss <= i) {
					ss += j - i;
				}
				i = ss;
				j = ss + 1;
			}
		}
		arraycopy(c, ss, c, n, n);
		int cnt = 1;
		for (int i = 1; i < n && c[n + i] == c[n]; i++) {
			++cnt;
		}
		int ocnt = cnt;
		for (int i = 1; i < k && cnt < n; i++) {
			cnt = min(2 * cnt, n);
		}
		for (int i = 0; i < cnt - ocnt; i++) {
			c[n - i - 1] = c[n];
		}
		out.print(new String(c, n - (cnt - ocnt), n));
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