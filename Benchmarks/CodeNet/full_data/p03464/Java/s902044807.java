
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

class Solver {

	public int[] solve(int[] a) {
		int[] r = new int[] { 2, 2 };
		for (int i = a.length - 1; i >= 0 && r[0] <= r[1]; i--)
			r = solve(a[i], r);
		return r;
	}

	public int[] solve(int a, int[] r) {
		return new int[] { (r[0] + a - 1) / a * a, (r[1]) / a * a + a - 1 };
	}
}

public class Main {

	InputStream is;
	PrintWriter out;
	String INPUT = "";

	void solve() {

		int t = 1;
		while (t-- > 0) {
			try {
				int[] ans = new Solver().solve(na(ni()));
				if (ans[0] > ans[1])
					out.println("-1");
				else
					out.println(ans[0] + " " + ans[1]);
			} catch (Exception e) {
				out.println(e.getMessage());
				throw e;
			}
		}

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
		for (int i = 0; i < n; i++) {
			a[i] = ni();
		}
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
