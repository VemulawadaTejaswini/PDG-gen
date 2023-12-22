import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {

	private static final String NO = "NO";
	private static final String YES = "YES";
	InputStream is;
	PrintWriter out;
	String INPUT = "";

	private static final long MOD = 1000000007;
	private static final int INF = Integer.MAX_VALUE;

	void solve() {
		int T = 1;
		for (int i = 0; i < T; i++)
			solve(i);
	}

	int n;
	private vec[] a;
	private double[] c;
	private int K;

	class vec {
		double x, y;

		vec(double x, double y) {
			this.x = x;
			this.y = y;
		}

		double len() {
			return Math.sqrt(x * x + y * y);
		}

		public vec minus(vec c2) {
			return new vec(x - c2.x, y - c2.y);
		}

		public vec add(vec c2) {
			return new vec(x + c2.x, y + c2.y);
		}
	};

	void solve(int T) {
		n = ni();
		K = ni();
		a = new vec[n];
		c = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = new vec(nd(), nd());
			c[i] = nd();
		}
		double l = 0, r = 200000;
		for (int i = 1; i <= 40; i++) {
			double m = (l + r) / 2;
			if (judge(m))
				r = m;
			else
				l = m;
		}

		out.println((l + r) / 2);
	}

	static double eps = 1e-8;

	private boolean judge(double T) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (!intersect(a[i], a[j], T / c[i], T / c[j]))
					continue;
				int x = 0, y = 0;
				for (int k = 0; k < n; k++) {
					if (c[k] * (s1.minus(a[k])).len() <= T + eps)
						x++;
					if (c[k] * (s2.minus(a[k])).len() <= T + eps)
						y++;
				}
				if (x >= K || y >= K)
					return true;
			}
			int x = 0;
			for (int j = 0; j < n; j++)
				if (c[j] * (a[i].minus(a[j])).len() <= T + eps)
					x++;
			if (x >= K)
				return true;
		}
		return false;
	}

	vec s1, s2;

	vec polar(double a, double r) {
		return new vec(Math.cos(r) * a, Math.sin(r) * a);
	}

	private boolean intersect(vec c1, vec c2, double r1, double r2) {
		double d = (c1.minus(c2)).len();
		if (d > r1 + r2 || d <= r1 || d <= r2) {
			return false;
		}
		double a = Math.acos((r1 * r1 + d * d - r2 * r2) / (2 * r1 * d));
		double t = Math.atan2(c2.y - c1.y, c2.x - c1.x);
		s1 = c1.add(polar(r1, t - a));
		s2 = c1.add(polar(r1, t + a));
		return true;
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
	private boolean vis[];

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
}