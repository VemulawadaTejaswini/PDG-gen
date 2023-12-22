import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.min;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		int n = scanInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanInt();
		}
		long trees[][] = new long[n - 1][];
		for (int i = 0; i < n - 1; i++) {
			trees[i] = new long[(1 << i) + 1];
			trees[i][0] = trees[i][1 << i] = 1;
			for (int j = 2; j < 1 << i; j += 2) {
				trees[i][j] = trees[i - 1][j >> 1];
			}
			for (int j = 1; j < 1 << i; j += 2) {
				trees[i][j] = trees[i][j - 1] + trees[i][j + 1];
			}
		}
		long tt[] = new long[1 << (n - 2)];
		for (int i = 1; i < 1 << (n - 2); i++) {
			int l = 31 - Integer.numberOfLeadingZeros(i);
			tt[i] = trees[l + 1][((i ^ (1 << l)) << 1) + 1];
		}
		long dyn[][][] = new long[n][n][1 << (n - 1)];
		for (int i = n - 1; i > 0; i--) {
			for (int j = i + 1; j < n; j++) {
				for (int k = 1; k < 1 << (n - 1 - (j - i)); k++) {
					long v = Long.MAX_VALUE;
					for (int l = i; l < j; l++) {
						v = min(v, dyn[i][l][k << 1] + a[l] * tt[k] + dyn[l + 1][j][(k << 1) + 1]);
					}
					dyn[i][j][k] = v;
				}
			}
		}
		out.print(a[0] + dyn[1][n - 1][1] + a[n - 1]);
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