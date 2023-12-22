
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {

	class Solver {

		int b[][][];

		public int solve(int a[][], int k) {
			b = new int[k + 1][k + 1][2];
			for (int[] en : a) {
				int x = en[0];
				int y = en[1];
				int n = x / k + y / k;
				b[x % k + 1][y % k + 1][(en[2] + n) % 2]++;
			}

			for (int r = 1; r <= k; r++)
				for (int c = 1; c <= k; c++)
					for (int i = 0; i < 2; i++)
						b[r][c][i] = b[r - 1][c][i] + b[r][c - 1][i] - b[r - 1][c - 1][i] + b[r][c][i];

			int ans = 0;
			for (int r = 1; r <= k; r++)
				for (int c = 1; c <= k; c++) {
					ans = Math.max(ans,
							get(0, 0, r, c, 0) + get(r, c, k, k, 0) + get(r, 0, k, c, 1) + get(0, c, r, k, 1));
					ans = Math.max(ans,
							get(0, 0, r, c, 1) + get(r, c, k, k, 1) + get(r, 0, k, c, 0) + get(0, c, r, k, 0));
				}
			return ans;
		}

		private int get(int r0, int c0, int r1, int c1, int i) {
			return b[r1][c1][i] - b[r1][c0][i] - b[r0][c1][i] + b[r0][c0][i];
		}
	}

	InputStream is;
	PrintWriter out;
	String INPUT = "";

	void solve() {

		int t = 1;// ni();
		while (t-- > 0) {
			try {
				int n = ni();
				int k = ni();
				int[][] a = new int[n][3];
				for (int i = 0; i < n; i++) {
					a[i][0] = ni();
					a[i][1] = ni();
					a[i][2] = nc() == 'B' ? 0 : 1;
				}
				int ans = new Solver().solve(a, k);
				out.println(ans);

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
