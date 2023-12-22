
import java.awt.Point;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main implements Runnable { // クラス名はMain1

	PrintWriter out = new PrintWriter(System.out);
	InputReader sc = new InputReader(System.in);

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {

		try {
			//String S = sc.next().trim();
			int H = sc.nextInt();
			int W = sc.nextInt();
			int[][] A = new int[H][W];
			for (int i = 0; i < H; i++) {
				A[i] = sc.nextIntArray(W);
			}

			int sum = 0;
			int odd = 0;
			int even = 0;
			ArrayDeque<Point> deq = new ArrayDeque<>();
			boolean[][] odds = new boolean[H][W];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					sum += A[i][j];
					if (A[i][j] % 2 != 0) {
						odd++;
						odds[i][j] = true;
						deq.add(new Point(i, j));
					} else {
						even++;
					}
				}
			}

			long count = 0;
			ArrayList<Ans> ans = new ArrayList<Ans>();
			while (deq.size() >= 2) {
				Point now = deq.pollFirst();
				Point goal = deq.pollFirst();
				while (now.x != goal.x || now.y != goal.y) {
					if (now.x != goal.x) {
						if (now.x > goal.x) {
							Ans a = new Ans(now.y, now.x, now.y, now.x - 1);
							ans.add(a);
							now.x -= 1;
						} else if (now.x < goal.x) {
							Ans a = new Ans(now.y, now.x, now.y, now.x + 1);
							ans.add(a);
							now.x += 1;
						}
					}

					if (now.y != goal.y) {
						if (now.y > goal.y) {
							Ans a = new Ans(now.y, now.x, now.y - 1, now.x);
							ans.add(a);
							now.y -= 1;
						} else if (now.y < goal.y) {
							Ans a = new Ans(now.y, now.x, now.y + 1, now.x);
							ans.add(a);
							now.y += 1;
						}
					}
				}
			}

			out.println(ans.size());
			for (int i = 0; i < ans.size(); i++) {
				out.println((ans.get(i).x1 + 1) + " " + (ans.get(i).y1 + 1) + " " + (ans.get(i).x2 + 1) + " "
						+ (ans.get(i).y2 + 1));
			}

		} catch (ArithmeticException ae) {
			//ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			//e.printStackTrace();
			throw new RuntimeException();
		} finally {
			out.flush();
			out.close();
		}
	}

	class Ans {
		public int y1;
		public int x1;
		public int y2;
		public int x2;

		public Ans(int y1, int x1, int y2, int x2) {
			this.y1 = y1;
			this.x1 = x1;
			this.y2 = y2;
			this.x2 = x2;
		}
	}

	///////////////////////////////////////////////////////////
	//Ignore
	///////////////////////////////////////////////////////////
	static class InputReader {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
