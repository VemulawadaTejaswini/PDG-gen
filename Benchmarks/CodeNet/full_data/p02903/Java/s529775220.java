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
		int h = scanInt(), w = scanInt(), a = scanInt(), b = scanInt();
		int cnts[] = new int[8];
		for (int ca = 0; ca <= h; ca++) {
			if (2 * a == w && ca != 0) {
				continue;
			}
			int cnt = ca * a + (h - ca) * (w - a);
			if (cnt < b * w || cnt > (h - b) * w) {
				continue;
			}
			int cb;
			if (2 * b == h) {
				cb = 0;
			} else if ((w * (h - b) - cnt) % (h - 2 * b) != 0) {
				continue;
			} else {
				cb = (w * (h - b) - cnt) / (h - 2 * b);
			}
			int sLeft = b * cb, /*sRight = (h - b) * (w - cb),*/
				sTop = a * ca, sBottom = (w - a) * (h - ca);
			cnts[0] = 0;
			cnts[1] = ca * cb;
			cnts[2] = sTop;
			cnts[3] = sTop - ca * (w - cb);
			cnts[4] = sLeft;
			cnts[5] = sLeft - (h - ca) * cb;
			cnts[6] = sLeft - sBottom;
			cnts[7] = (h - ca) * (w - cb) + sLeft - sBottom;
			for (int ci = 0; ci < 8; ci++) {
				int cTL = cnts[ci], cTR = sTop - cTL, cBL = sLeft - cTL, cBR = sBottom - cBL;
				if (cTL < 0 || cTL > ca * cb || cTR < 0 || cTR > ca * (w - cb) ||
					cBL < 0 || cBL > (h - ca) * cb || cBR < 0 || cBR > (h - ca) * (w - cb)) {
					continue;
				}
				boolean ans[][] = new boolean[h][w];
				if (ca != 0 && cb != 0) {
					makeMatrix(ans, 0, ca, 0, cb, 0, 0, cTL);
				}
				if (ca != 0 && cb != w) {
					makeMatrix(ans, 0, ca, cb, w - cb, cTL % ca, 0, cTR);
				}
				if (ca != h && cb != 0) {
					makeMatrix(ans, ca, h - ca, 0, cb, 0, cTL % cb, cBL);
				}
				if (ca != h && cb != w) {
					makeMatrix(ans, ca, h - ca, cb, w - cb, cBL % (h - ca), cTR % (w - cb), cBR);
				}
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						out.print(ans[i][j] ? '1' : '0');
					}
					out.println();
				}
				return;
			}
		}
		out.print("-1");
	}

	static void makeMatrix(boolean out[][], int si, int li, int sj, int lj, int pi, int pj, int cnt) {
		boolean tmp[][] = new boolean[li][lj];
		int cntI[] = new int[li], cntJ[] = new int[lj], maxCntI = 0, maxCntJ = 0;
		i: for (int i = 0; i < li; i++) {
			for (int j = 0; j < lj; j++) {
				if (tmp[i][j]) {
					continue;
				}
				for (int ci = i, cj = j; !tmp[ci][cj]; i = (i + 1) % li, j = (j + 1) % lj) {
					if (cnt == 0) {
						break i;
					}
					--cnt;
					tmp[ci][cj] = true;
					maxCntI = ++cntI[ci];
					maxCntJ = ++cntJ[cj];
				}
			}
		}
		for (int i = 0; i < li; i++) {
			if (cntI[i] != maxCntI) {
				continue;
			}
			for (int j = 0; j < lj; j++) {
				if (cntJ[j] != maxCntJ) {
					continue;
				}
				out[si + pi][sj + pj] = tmp[i][j];
				pj = (pj + 1) % lj;
			}
			for (int j = 0; j < lj; j++) {
				if (cntJ[j] == maxCntJ) {
					continue;
				}
				out[si + pi][sj + pj] = tmp[i][j];
				pj = (pj + 1) % lj;
			}
			pi = (pi + 1) % li;
		}
		for (int i = 0; i < li; i++) {
			if (cntI[i] == maxCntI) {
				continue;
			}
			for (int j = 0; j < lj; j++) {
				if (cntJ[j] != maxCntJ) {
					continue;
				}
				out[si + pi][sj + pj] = tmp[i][j];
				pj = (pj + 1) % lj;
			}
			for (int j = 0; j < lj; j++) {
				if (cntJ[j] == maxCntJ) {
					continue;
				}
				out[si + pi][sj + pj] = tmp[i][j];
				pj = (pj + 1) % lj;
			}
			pi = (pi + 1) % li;
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