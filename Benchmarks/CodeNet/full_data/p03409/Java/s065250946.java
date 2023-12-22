import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

public class Main {
	private static final long M = 1000000007L;
	private static final int N = 100000;
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	static class MaxBipartite {
		// M is number of applicants and N is number of jobs
		static int M;
		static int N;

		// A DFS based recursive function that returns true if a
		// matching for vertex u is possible
		boolean bpm(boolean bpGraph[][], int u, boolean seen[], int matchR[]) {
			// Try every job one by one
			for (int v = 0; v < N; v++) {
				// If applicant u is interested in job v and v
				// is not visited
				if (bpGraph[u][v] && !seen[v]) {
					seen[v] = true; // Mark v as visited

					// If job 'v' is not assigned to an applicant OR
					// previously assigned applicant for job v (which
					// is matchR[v]) has an alternate job available.
					// Since v is marked as visited in the above line,
					// matchR[v] in the following recursive call will
					// not get job 'v' again
					if (matchR[v] < 0 || bpm(bpGraph, matchR[v], seen, matchR)) {
						matchR[v] = u;
						return true;
					}
				}
			}
			return false;
		}

		// Returns maximum number of matching from M to N
		int maxBPM(boolean bpGraph[][]) {
			N = M = bpGraph.length;
			// An array to keep track of the applicants assigned to
			// jobs. The value of matchR[i] is the applicant number
			// assigned to job i, the value -1 indicates nobody is
			// assigned.
			int matchR[] = new int[N];

			// Initially all jobs are available
			for (int i = 0; i < N; ++i)
				matchR[i] = -1;

			int result = 0; // Count of jobs assigned to applicants
			for (int u = 0; u < M; u++) {
				// Mark all jobs as not seen for next applicant.
				boolean seen[] = new boolean[N];
				for (int i = 0; i < N; ++i)
					seen[i] = false;

				// Find if the applicant 'u' can get a job
				if (bpm(bpGraph, u, seen, matchR))
					result++;
			}
			return result;
		}
	}

	static void solve() {
		int n = ni();
		int[][] a = na(n, 2);
		int[][] b = na(n, 2);
		MaxBipartite m = new MaxBipartite();

		boolean[][] bpGraph = new boolean[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				bpGraph[i][j] = true;
		int ans = m.maxBPM(bpGraph);

		out.println(ans);
	}

	public static void main(String[] args) throws Exception {
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		// int t = ni();
		// while (t-- > 0)
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		tr(G - S + "ms");
	}

	private static boolean eof() {
		if (lenbuf == -1)
			return true;
		int lptr = ptrbuf;
		while (lptr < lenbuf)
			if (!isSpaceChar(inbuf[lptr++]))
				return false;

		try {
			is.mark(1000);
			while (true) {
				int b = is.read();
				if (b == -1) {
					is.reset();
					return true;
				} else if (!isSpaceChar(b)) {
					is.reset();
					return false;
				}
			}
		} catch (IOException e) {
			return true;
		}
	}

	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;

	private static int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private static double nd() {
		return Double.parseDouble(ns());
	}

	private static char nc() {
		return (char) skip();
	}

	private static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private static char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private static int[][] na(int n, int m) {
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				a[i][j] = ni();
		return a;
	}

	private static int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) {
		if (INPUT.length() != 0)
			System.out.println(Arrays.deepToString(o));
	}
}
