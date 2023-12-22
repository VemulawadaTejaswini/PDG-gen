import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.awt.Point;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		public void solve(int testNumber, Scanner sc, PrintWriter out) {

			int h = sc.nextInt();
			int w = sc.nextInt();
			int d = sc.nextInt();
			Point[] map = new Point[h * w + 1];
			for (int y = 0; y < h; y++) {
				for (int x = 0; x < w; x++) {
					int a = sc.nextInt();
					map[a] = new Point(x, y);
				}
			}

			long[] mps = new long[h * w];
			for (int i = 0; i < d; i++) {
				long tmp = 0;
				for (int j = h * w - d - i; j > 0; j -= d) {
					tmp += mp(map[j], map[j + d]);
					mps[j] = tmp;
				}
			}

			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				long mp = 0;
				int l = sc.nextInt();
				int r = sc.nextInt();
				out.println(mps[l] - mps[r]);
			}

		}

		long mp(Point p1, Point p2) {
			return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
		}

	}

	static class Scanner {
		private final InputStream in;
		private final byte[] buffer;
		private int ptr;
		private int buflen;

		public Scanner(InputStream in) {
			this.in = in;
			this.buffer = new byte[1024];
			this.ptr = 0;
			this.buflen = 0;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) return true;
			else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) return false;
			}
			return true;
		}

		private byte readByte() {
			if (hasNextByte()) return buffer[ptr++];
			return -1;
		}

		private boolean isPrintableChar(byte c) {
			return '!' <= c && c <= '~';
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
				ptr++;
			}
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public int nextInt() {
			if (!hasNext()) throw new NoSuchElementException();
			int n = 0;
			boolean minus = false;
			byte b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) throw new NumberFormatException();
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

	}
}

