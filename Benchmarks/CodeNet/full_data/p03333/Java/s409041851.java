import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void sortBy(int a[], long v[]) {
		int n = a.length;
		if (n == 0) {
			return;
		}
		for (int i = 1; i < n; i++) {
			int j = i;
			int ca = a[i];
			long cv = v[ca];
			do {
				int nj = (j - 1) >> 1;
				int na = a[nj];
				if (cv <= v[na]) {
					break;
				}
				a[j] = na;
				j = nj;
			} while (j != 0);
			a[j] = ca;
		}
		int ca = a[0];
		for (int i = n - 1; i > 0; i--) {
			int j = 0;
			while ((j << 1) + 2 + Integer.MIN_VALUE < i + Integer.MIN_VALUE) {
				j <<= 1;
				j += (v[a[j + 2]] > v[a[j + 1]]) ? 2 : 1;
			}
			if ((j << 1) + 2 == i) {
				j = (j << 1) + 1;
			}
			int na = a[i];
			a[i] = ca;
			ca = na;
			long cv = v[ca];
			while (j != 0 && v[a[j]] < cv) {
				j = (j - 1) >> 1;
			}
			while (j != 0) {
				na = a[j];
				a[j] = ca;
				ca = na;
				j = (j - 1) >> 1;
			}
		}
		a[0] = ca;
	}

	static void solve() throws Exception {
		int n = scanInt();
		long l[] = new long[n + 1];
		long r[] = new long[n + 1];
		for (int i = 0; i < n; i++) {
			l[i] = scanLong();
			r[i] = scanLong();
		}
		int idxL[] = new int[n + 1];
		int idxR[] = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			idxL[i] = idxR[i] = i;
		}
		sortBy(idxL, l);
		sortBy(idxR, r);
		boolean taken[] = new boolean[n + 1];
		long ans = 0;
		int pL = n + 1, pR = 0;
		while (true) {
			while (pL > 0 && taken[idxL[pL - 1]]) {
				--pL;
			}
			while (pR < n + 1 && taken[idxR[pR]]) {
				++pR;
			}
			if (pL == 0 || pR == n + 1 || l[idxL[pL - 1]] <= r[idxR[pR]]) {
				break;
			}
			ans += l[idxL[pL - 1]] - r[idxR[pR]];
			taken[idxL[pL - 1]] = taken[idxR[pR]] = true;
			--pL;
			++pR;
		}
		out.print(2 * ans);
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