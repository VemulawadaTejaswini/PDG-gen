
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

class Solver {

	public int solve(char[][] a) {
		int total = a.length * a[0].length;
		for (char[] r : a)
			for (char c : r)
				if (c == '#')
					total--;
		int d = minDist(a);
		if (d > 0)
			return total - 1 - d;
		return d;
	}

	public int minDist(char[][] a) {
		LinkedList<int[]> l = new LinkedList<int[]>();
		l.add(new int[] { 0, 0 });
		int level = 0;
		while (!l.isEmpty()) {
			int size = l.size();
			while (size > 0) {
				int[] p = l.poll();
				size--;
				if (p[0] == a.length - 1 && p[1] == a[0].length - 1)
					return level;
				List<int[]> n = getNext(a, p);
				for (int[] q : n) {
					if (a[q[0]][q[1]] == '.') {
						a[q[0]][q[1]] = 'x';
						l.offer(q);
					}
				}
			}
			level++;
		}
		return -1;
	}

	private List<int[]> getNext(char[][] a, int[] p) {
		List<int[]> ret = new ArrayList<int[]>();
		if (p[0] > 0)
			ret.add(new int[] { p[0] - 1, p[1] });
		if (p[0] < a.length - 1)
			ret.add(new int[] { p[0] + 1, p[1] });
		if (p[1] > 0)
			ret.add(new int[] { p[0], p[1] - 1 });
		if (p[1] < a[0].length - 1)
			ret.add(new int[] { p[0], p[1] + 1 });
		return ret;
	}
}

public class Main {

	InputStream is;
	PrintWriter out;
	String INPUT = "";
	long M = 1003;// 1000000007;

	void solve() {

		int t = 1;
		while (t-- > 0) {
			try {
				int ans = new Solver().solve(nm(ni(), ni()));
				System.out.println(ans);
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
