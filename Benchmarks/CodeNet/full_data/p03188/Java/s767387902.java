import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	static final int D = 500;
	
	void submit() {
		int k = nextInt();
		if (k < D) {
			out.println(k);
			for (int i = 1; i <= k; i++) {
				for (int j = 0; j < k; j++) {
					out.print(i + " ");
				}
				out.println();
			}
		} else {
			int[] ord = new int[D];
			for (int i = 0; i < D / 2; i++) {
				ord[i] = 2 * i;
				ord[i + D / 2] = 2 * i + 1;
			}
			
			int[][] ans = new int[D][D];
			
			int dbl = k - D;
			int ptr = 1;
			for (int i = 0; i < D; i++) {
				int j0 = ord[i];
				for (int j = 0; j < D; j++) {
					int realJ = (j + j0) % D;
					if (i < dbl) {
						ans[j][realJ] = ptr + j % 2;
					} else {
						ans[j][realJ] = ptr;
					}
				}
				if (i < dbl) {
					ptr += 2;
				} else {
					ptr++;
				}
			}
			
			out.println(D);
			for (int[] row : ans) {
				for (int x : row) {
					out.print(x + " ");
				}
				out.println();
			}
				
		}
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
