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
		int n = scanInt();
		int a[] = new int[n], b[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = scanInt();
		}
		boolean inStack[] = new boolean[n];
		int stack[] = new int[n];
		int stackSize = 0;
		for (int i = 0; i < n; i++) {
			if (b[i] > b[(i + 1) % n] && b[i] > b[(i - 1 + n) % n]) {
				inStack[i] = true;
				stack[stackSize++] = i;
			}
		}
		long ans = 0;
		while (stackSize > 0) {
			int i = stack[--stackSize];
			inStack[i] = false;
			int i1 = (i + 1) % n, i2 = (i - 1 + n) % n;
			int val = b[i], diff = b[i1] + b[i2], dest = a[i];
			if (val - diff >= dest) {
				int cnt = (val - dest) / diff;
				ans += cnt;
				b[i] = val - diff * cnt;
				if (!inStack[i1] && b[i1] > b[i] && b[i1] > b[(i1 + 1) % n]) {
					inStack[i1] = true;
					stack[stackSize++] = i1;
				}
				if (!inStack[i2] && b[i2] > b[i] && b[i2] > b[(i2 - 1 + n) % n]) {
					inStack[i2] = true;
					stack[stackSize++] = i2;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (a[i] != b[i]) {
				out.print(-1);
				return;
			}
		}
		out.print(ans);
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