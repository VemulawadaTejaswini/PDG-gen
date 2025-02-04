import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {

	private static final String NO = "No";
	private static final String YES = "Yes";
	InputStream is;
	PrintWriter out;
	String INPUT = "";

	private static final long MOD = 1000000007;
	private static final int MAXN = 1000000;

	void solve() {
		int T = 1;
		for (int i = 0; i < T; i++)
			solve(i);
	}

	void solve(int T) {
		int n = ni();
		long C = nl();
		long h[] = nl(n);
		CHT cht = new CHT(n, false, false);
		cht.add(-2 * h[0], h[0] * h[0] + C);
		long dp[] = new long[n];

		for (int i = 1; i < n; i++) {
			dp[i] = cht.query(h[i]) + h[i] * h[i];
			cht.add(-2 * h[i], dp[i] + h[i] * h[i] + C);
//			tr(i, dp[i]);
		}

		out.println(dp[n - 1]);
	}

	// a^b
	long power(long a, long b) {
		long x = 1, y = a;
		while (b > 0) {
			if (b % 2 != 0) {
				x = (x * y) % MOD;
			}
			y = (y * y) % MOD;
			b /= 2;
		}
		return x % MOD;
	}

	private long gcd(long a, long b) {
		while (a != 0) {
			long tmp = b % a;
			b = a;
			a = tmp;
		}
		return b;
	}

	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty())
			tr(System.currentTimeMillis() - s + "ms");
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
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

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n) {
			if (!(isSpaceChar(b)))
				buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private List<Integer> na2(int n) {
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			a.add(ni());
		return a;
	}

	private int[][] na(int n, int m) {
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = na(m);
		return a;
	}

	private int ni() {
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

	private long[] nl(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}

	private long[][] nl(int n, int m) {
		long[][] a = new long[n][];
		for (int i = 0; i < n; i++)
			a[i] = nl(m);
		return a;
	}

	private long nl() {
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
		System.out.println(Arrays.deepToString(o));
	}

	static class CHT {
		long M[], C[];
		int ptr, idx;
		boolean slopeInc, queryMax;

		CHT(int n, boolean isSlopeIncreasing, boolean isQueryMax) {
			M = new long[n + 1];
			C = new long[n + 1];
			slopeInc = isSlopeIncreasing;
			queryMax = isQueryMax;
			ptr = idx = 0;
		}

		boolean bad(int i, int j, int k) {
			if ((slopeInc && queryMax) || (!slopeInc && !queryMax)) {
				return (C[k] - C[i]) * (M[i] - M[j]) <= (C[j] - C[i]) * (M[i] - M[k]); /// (slope dec+query min),(slope
																						/// inc+query max)
			} else {
				return (C[k] - C[i]) * (M[i] - M[j]) >= (C[j] - C[i]) * (M[i] - M[k]); /// (slope dec+query max), (slope
																						/// inc+query min)
			}
		}

		void add(long m, long c) {
			M[idx] = m;
			C[idx] = c;
			++idx;
			while (idx >= 3 && bad(idx - 3, idx - 2, idx - 1)) {
				M[idx - 2] = M[idx - 1];
				C[idx - 2] = C[idx - 1];
				idx--;
			}
		}

		long getY(int i, long x) { // y = mx + c //
			return M[i] * x + C[i];
		}

		/// (slope dec+query min),(slope inc+query max) -> x increasing
		/// (slope dec+query max), (slope inc+query min) -> x decreasing
		long query(long x) {
			if (ptr >= idx) {
				ptr = idx - 1;
			}
			if (queryMax) { // for maximum
				while (ptr < idx - 1 && getY(ptr + 1, x) >= getY(ptr, x))
					ptr++;
				return M[ptr] * x + C[ptr];
			} else { // for minimum
				while (ptr < idx - 1 && getY(ptr + 1, x) <= getY(ptr, x))
					ptr++;
				return M[ptr] * x + C[ptr];
			}
		}

		/// works for random query x
		long query_random_x(long x) {
			return bs(0, idx - 1, x, idx);
		}

		long bs(int st, int ed, long x, int idx) {
			int mid = (st + ed) >> 1;

			if (queryMax) { /// for maximum
				if (mid + 1 < idx && getY(mid + 1, x) > getY(mid, x))
					return bs(mid + 1, ed, x, idx);
				if (mid - 1 >= 0 && getY(mid - 1, x) > getY(mid, x))
					return bs(st, mid - 1, x, idx);
				return getY(mid, x);
			} else { /// for minimum
				if (mid + 1 < idx && getY(mid + 1, x) < getY(mid, x))
					return bs(mid + 1, ed, x, idx);
				if (mid - 1 >= 0 && getY(mid - 1, x) < getY(mid, x))
					return bs(st, mid - 1, x, idx);
				return getY(mid, x);
			}
		}
	}
}