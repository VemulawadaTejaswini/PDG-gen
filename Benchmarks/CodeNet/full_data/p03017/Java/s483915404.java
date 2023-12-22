import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		scanInt();
		int a = scanInt() - 1, b = scanInt() - 1, c = scanInt() - 1, d = scanInt() - 1;
		String s = scanString();
		for (int i = a + 1; i < c - 1; i++) {
			if (s.charAt(i) == '#' && s.charAt(i + 1) == '#') {
				out.print("No");
				return;
			}
		}
		for (int i = b + 1; i < d - 1; i++) {
			if (s.charAt(i) == '#' && s.charAt(i + 1) == '#') {
				out.print("No");
				return;
			}
		}
		if (c < d) {
			out.print("Yes");
			return;
		}
		for (int i = b; i <= d; i++) {
			if (s.charAt(i - 1) == '.' && s.charAt(i) == '.' && s.charAt(i + 1) == '.') {
				out.print("Yes");
				return;
			}
		}
		out.print("No");
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