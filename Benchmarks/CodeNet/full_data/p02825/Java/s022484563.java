import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static char X[][] = {{'w', 'w', 'x'}, {'z', '.', 'x'}, {'z', 'y', 'y'}};

	static void solve() throws Exception {
		int n = scanInt();
		if (n == 2) {
			out.print(-1);
		} else if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int ii = i / 2, jj = j / 2, nn = n / 2;
					out.print(ii == jj ? (i % 2 == 0 ? 'a' : 'b') : (ii - jj + nn) % nn == 1 ? (j % 2 == 0 ? 'c' : 'd') : '.');
				}
				out.println();
			}
		} else if (n % 3 == 0) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					out.print(i / 3 == j / 3 && (i % 3 == 0) != (j % 3 == 0) ? 'a' : '.');
				}
				out.println();
			}
		} else if (n % 3 == 2) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					out.print(i < 3 && j < 3 ? X[i][j] : i < 3 && j < 5 ? (char) ('a' + i) : i < 5 && j < 3 ? (char) ('a' + j) :
						i < 5 || j < 5 ? '.' : (i - 5) / 3 == (j - 5) / 3 ? X[(i - 5) % 3][(j - 5) % 3] :
						(i - 5) / 6 == (j - 5) / 6 && ((i - 5) % 3 == 0) != ((j - 5) % 3 == 0) ? 'q' : '.');
				}
				out.println();
			}
		} else /*(n % 3 == 1)*/ {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					out.print(i < 7 && j < 7 && (i == 0) != (j == 0) ? (char) ('a' + (i + j + 1) / 2) :
						i >= 7 && j >= 7 && (i - 7) / 3 == (j - 7) / 3 ? X[(i - 7) % 3][(j - 7) % 3] :
						i >= 1 && j >= 1 && (i - 1) / 6 == (j - 1) / 6 && ((i - 1) % 3 == 0) != ((j - 1) % 3 == 0) ? 'q' : '.');
				}
				out.println();
			}
		}
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