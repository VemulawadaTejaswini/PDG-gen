import java.io.IOException;
import java.util.ArrayDeque;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		FasterScanner sc = new FasterScanner();

		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextIntArray(m);
		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		for (int r = 0; r < n; r++)
			for (int c = 0; c < m; c++)
				if (a[r][c] % 2 == 1) {
					int p[] = bfs(r, c, a);
					if (p != null) {
						move(r, c, p, sb);
						a[p[0]][p[1]] = 0;
						cnt += p[0] - r + p[1] - c;
					}
				}
		System.out.println(cnt);
		System.out.println(sb);
	}

	private static void move(int r, int c, int[] p, StringBuffer sb) {
		for (; c < p[1]; c++)
			sb.append((r + 1) + " " + (c + 1) + " " + (r + 1) + " " + (c + 2)).append("\r\n");
		for (; r < p[0]; r++)
			sb.append((r + 1) + " " + (c + 1) + " " + (r + 2) + " " + (c + 1)).append("\r\n");
	}

	private static int[] bfs(int r, int c, int[][] a) {
		ArrayDeque<int[]> l = new ArrayDeque<int[]>();
		l.add(new int[] { r, c });
		while (!l.isEmpty()) {
			int[] p = l.poll();
			if (p[0] < a.length - 1)
				if (a[p[0] + 1][p[1]] % 2 == 1) {
					return new int[] { p[0] + 1, p[1] };
				} else
					l.add(new int[] { p[0] + 1, p[1] });
			if (p[1] < a[0].length - 1)
				if (a[p[0]][p[1] + 1] % 2 == 1)
					return new int[] { p[0], p[1] + 1 };
				else
					l.add(new int[] { p[0], p[1] + 1 });

		}
		return null;
	}

	public static class FasterScanner {
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = System.in.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public String nextString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		public int[] nextIntArray(int n, int offset) {
			int[] arr = new int[n + offset];
			for (int i = 0; i < n; i++) {
				arr[i + offset] = nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLong();
			}
			return arr;
		}

		public long[] nextLongArray(int n, int offset) {
			long[] arr = new long[n + offset];
			for (int i = 0; i < n; i++) {
				arr[i + offset] = nextLong();
			}
			return arr;
		}

		private boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}
	}
}