import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	int[] b, c;

	void submit() {
		int n = nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		Arrays.sort(a);

		b = new int[n];
		c = new int[n];

		int sz = 0;
		for (int i = 0; i < n; i++) {
			if (sz == 0 || a[i] != a[i - 1]) {
				b[sz++] = a[i];
				c[sz - 1] = 1;
			} else {
				c[sz - 1]++;
			}
		}

		b = Arrays.copyOf(b, sz);
		c = Arrays.copyOf(c, sz);

		int ret = 0;

		vis = new boolean[sz];

		for (int i = 0; i < sz; i++) {
			if (p2(b[i])) {
				int[] tmp = dfs(i, b[i]);
				ret += tmp[0] + tmp[1] / 2;
			}
		}
		
		for (int i = 0; i < sz; i++) {
			if (!vis[i]) {
				int[] tmp = dfs(i, b[i]);
				ret += tmp[0];
			}
		}
		
		out.println(ret);
	}

	boolean[] vis;

	int[] dfs(int idx, int valPar) {
		int ret = 0;
		int spare = 0;
		vis[idx] = true;
		for (int i = 1; i <= C; i++) {
			int seek = (1 << i) - b[idx];
			if (seek == valPar) {
				continue;
			}
			int idxU = Arrays.binarySearch(b, seek);
			if (idxU < 0) {
				continue;
			}
			int[] tmp = dfs(idxU, b[idx]);
			ret += tmp[0];
			spare += tmp[1];
		}

		int here = Math.min(spare, c[idx]);
		return new int[] { ret + here, c[idx] - here };
	}

	static final int C = 30;

	boolean p2(int x) {
		return Integer.bitCount(x) == 1;
	}

	void test() {

	}

	void stress() {
		for (int tst = 0;; tst++) {
			if (false) {
				throw new AssertionError();
			}
			System.err.println(tst);
		}
	}

	Main() throws IOException {
		is = System.in;
		out = new PrintWriter(System.out);
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	private InputStream is;
	PrintWriter out;

	private byte[] buf = new byte[1 << 14];
	private int bufSz = 0, bufPtr = 0;

	private int readByte() {
		if (bufSz == -1)
			throw new RuntimeException("Reading past EOF");
		if (bufPtr >= bufSz) {
			bufPtr = 0;
			try {
				bufSz = is.read(buf);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufSz <= 0)
				return -1;
		}
		return buf[bufPtr++];
	}

	private boolean isTrash(int c) {
		return c < 33 || c > 126;
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isTrash(b))
			;
		return b;
	}

	String nextToken() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	String nextString() {
		int b = readByte();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b) || b == ' ') {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}

	char nextChar() {
		return (char) skip();
	}

	int nextInt() {
		int ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}

	long nextLong() {
		long ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}
}
