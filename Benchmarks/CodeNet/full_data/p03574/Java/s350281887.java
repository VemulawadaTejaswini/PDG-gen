import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {

	void solve() {

		H = in.nextInt();
		W = in.nextInt();
		char[][] map = new char[H][W];
		int[][] ans = new int[H][W];
		for (int i = 0; i < H; i++) {
			map[i] = in.next().toCharArray();
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (map[i][j] == '#') {
					ans[i][j] = -1;
					continue;
				}
				int count = 0;
				for (int d = 0; d < 8; d++) {
					int nw = j + dw[d];
					int nh = i + dh[d];
					if (inField(nw, nh)) {
						if (map[nh][nw] == '#') {
							count++;
						}
					}
				}
				ans[i][j] = count;
			}
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (ans[i][j] == -1) {
					out.print('#');
					continue;
				}
				out.print(ans[i][j]);
			}
			out.println();
		}

		out.flush();
	}

	// only call
	public static void main(String[] args) {
		new Main().solve();
	}

	// predefined
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int n, a, b, c, d, e, f;
	ArrayList<Integer> list = new ArrayList<>();
	ArrayDeque<Integer> q = new ArrayDeque<>();

	// 2D-map
	int H, W;
	final int[] dw = new int[] { 0, 1, 0, -1, 1, 1, -1, -1 };
	final int[] dh = new int[] { 1, 0, -1, 0, 1, -1, 1, -1 };

	boolean inField(int nw, int nh) {
		if (nw < 0 || nw >= W || nh < 0 || nh >= H) {
			return false;
		}
		return true;
	}

	// library
	class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		FastScanner(InputStream in) {
			this.in = in;
		}

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

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
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
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}