import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner();
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] S = new char[H][W];
		for (int i = 0; i < H; ++i) {
			S[i] = sc.next().toCharArray();
		}
		DJSet ds = new DJSet(H * W);
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (i + 1 < H && S[i][j] != S[i + 1][j]) {
					ds.setUnion(W * i + j, W * (i + 1) + j);
				}
				if (j + 1 < W && S[i][j] != S[i][j + 1]) {
					ds.setUnion(W * i + j, W * i + j + 1);
				}
			}
		}
		int[] b = new int[H * W];
		int[] w = new int[H * W];
		long ans = 0;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				int r = ds.root(i * W + j);
				if (S[i][j] == '.')
					++b[r];
				else
					++w[r];
			}
		}
		for (int i = 0; i < H * W; ++i) {
			ans += b[i] * w[i];
		}
		System.out.println(ans);
	}

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

}

class DJSet {

	int n;
	int[] p;
	int[] b;
	int[] w;

	public DJSet(int n_) {
		n = n_;
		p = new int[n];
		Arrays.fill(p, -1);
	}

	int root(int x) {
		return p[x] < 0 ? x : (p[x] = root(p[x]));
	}

	boolean equiv(int x, int y) {
		return root(x) == root(y);
	}

	void setUnion(int x, int y) {
		x = root(x);
		y = root(y);
		if (x == y)
			return;
		if (p[x] < p[y]) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		p[y] += p[x];
		p[x] = y;
	}

	int sz(int x) {
		return -p[root(x)];
	}

}

class Scanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		return (int) nextLong();
	}
}
