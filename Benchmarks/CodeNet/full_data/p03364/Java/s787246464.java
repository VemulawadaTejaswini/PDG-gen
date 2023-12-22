import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	void submit() {
		int n = nextInt();
		char[][] f = new char[2 * n - 1][2 * n - 1];
		for (int i = 0; i < n; i++) {
			String tmp = nextToken();
			for (int j = 0; j < n; j++) {
				f[i][j] = tmp.charAt(j);
			}
		}

		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f.length; j++) {
				f[i][j] = f[i % n][j % n];
			}
		}

		boolean[] bad = new boolean[4 * n];

		int ans = 0;

		for (int diff = -(n - 1); diff <= n - 1; diff++) {

			Arrays.fill(bad, false);

			for (int x = 0; x < 2 * n - 1; x++) {
				for (int y = 0; y < 2 * n - 1; y++) {
					int dist = x - y - diff;
					if (dist < 0 || dist >= n) {
						continue;
					}

					int s = x + y;
					int d = 2 * diff - (x - y);

					int cx = (s + d) / 2;
					int cy = (s - d) / 2;

					if (cx < 0 || cx >= 2 * n - 1 || cy < 0 || cy >= 2 * n - 1) {
						continue;
					}

					if (f[x][y] != f[cx][cy]) {
						bad[x + y] = true;
					}
				}
			}

			int streak = 0;

			int toKek = 2 * n - 1 - Math.abs(diff);

			for (int i = Math.abs(diff), kek = 0; kek < 2 * toKek - 1; i++, kek++) {
				if (!bad[i]) {
					streak++;
				} else {
					streak = 0;
				}
				if (i % 2 == (diff & 1) && streak >= 2 * n - 1) {
					ans++;
				}
			}

		}

		out.println(ans);
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
	static final int C = 5;

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
