import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;
import static java.util.Arrays.fill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static class HopcroftKarp {

		static int n, m;
		static boolean edges[][];
		static int matchingL[], matchingR[];
		static int hkDist[], hkQueue[];

		static void init() {
			edges = new boolean[n][m];
			matchingL = new int[n];
			matchingR = new int[m];
			hkDist = new int[m];
			hkQueue = new int[2 * n];
		}

		static int hopcroftKarp() {
			fill(matchingL, -1);
			fill(matchingR, -1);
			int size = 0;
			while (true) {
				fill(hkDist, -1);
				int queueHead = 0, queueTail = 0;
				for (int i = 0; i < n; i++) {
					if (matchingL[i] < 0) {
						hkQueue[queueTail++] = i;
						hkQueue[queueTail++] = 0;
					}
				}
				int resDist = -1;
				while (queueHead < queueTail) {
					int cur = hkQueue[queueHead++];
					int cdist = hkQueue[queueHead++];
					if ((cdist + Integer.MIN_VALUE) > (resDist + Integer.MIN_VALUE)) {
						break;
					}
					for (int next = 0; next < m; next++) {
						if (!edges[cur][next] || hkDist[next] >= 0) {
							continue;
						}
						hkDist[next] = cdist;
						int next2 = matchingR[next];
						if (next2 < 0) {
							resDist = cdist;
						} else {
							hkQueue[queueTail++] = next2;
							hkQueue[queueTail++] = cdist + 1;
						}
					}
				}
				if (resDist < 0) {
					return size;
				}
				for (int cur = 0; cur < n; cur++) {
					if (matchingL[cur] < 0 && hopcroftKarpDfs(cur, 0)) {
						++size;
					}
				}
			}
		}

		static boolean hopcroftKarpDfs(int cur, int cdist) {
			for (int next = 0; next < m; next++) {
				if (!edges[cur][next] || hkDist[next] != cdist) {
					continue;
				}
				hkDist[next] = -1;
				int next2 = matchingR[next];
				if (next2 < 0 || hopcroftKarpDfs(next2, cdist + 1)) {
					matchingR[next] = cur;
					matchingL[cur] = next;
					return true;
				}
			}
			return false;
		}
	}

	static void solve() throws Exception {
		int n = scanInt(), m = scanInt();
		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scanInt() - 1;
			}
		}
		HopcroftKarp.n = HopcroftKarp.m = n;
		HopcroftKarp.init();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				fill(HopcroftKarp.edges[j], false);
				for (int k = i; k < m; k++) {
					HopcroftKarp.edges[j][a[j][k] / m] = true;
				}
			}
			if (HopcroftKarp.hopcroftKarp() != n) {
				throw new AssertionError();
			}
			for (int j = 0; j < n; j++) {
				for (int k = i;; k++) {
					if (a[j][k] / m == HopcroftKarp.matchingL[j]) {
						int t = a[j][i];
						a[j][i] = a[j][k];
						a[j][k] = t;
						break;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				out.print(a[i][j] + 1 + " ");
			}
			out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0;; k++) {
					if (a[k][j] / m == i) {
						out.print(a[k][j] + 1 + " ");
						break;
					}
				}
			}
			out.println();
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