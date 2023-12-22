
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
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
			int N = sc.nextInt();
			int C = sc.nextInt();
			InfoInt[] stc = new InfoInt[N];
			int maxt = 0;
			for (int i = 0; i < N; i++) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				int c = sc.nextInt();
				InfoInt e = new InfoInt(s, t, c);
				stc[i] = e;
				maxt = Math.max(maxt, t);
			}

			Arrays.sort(stc, new Comp());
			//out.println(Arrays.toString(A));

			int[][] time = new int[C][2 * maxt + 1];
			boolean[] ci = new boolean[C];
			for (int i = 0; i < N; i++) {
				if (ci[stc[i].c - 1]) {
					time[stc[i].c - 1][stc[i].s * 2] += 1;
				} else {
					time[stc[i].c - 1][stc[i].s * 2 - 1] += 1;
					ci[stc[i].c - 1] = true;
				}
				time[stc[i].c - 1][stc[i].t * 2] -= 1;
			}

			for (int i = 1; i < 2 * maxt + 1; i++) {
				for (int j = 0; j < C; j++) {
					time[j][i] += time[j][i - 1];
				}
			}

			int ans = 0;
			for (int i = 0; i < 2 * maxt + 1; i++) {
				int count = 0;
				for (int j = 0; j < C; j++) {
					if (time[j][i] >= 1) {
						count++;
					}
				}
				ans = Math.max(ans, count);
			}

			out.println(ans);

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

	class InfoInt {
		public int s;
		public int t;
		public int c;

		public InfoInt(int s, int t, int c) {
			this.s = s;
			this.t = t;
			this.c = c;
		}

	}

	//Arrays.sort(Sample,new Comp());
	class Comp implements Comparator<InfoInt> {
		public int compare(InfoInt be, InfoInt af) {
			if (af.c == be.c) {
				if (af.s == be.s) {
					return Integer.compare(be.t, af.t);
				} else {
					return Integer.compare(be.s, af.s);
				}
			} else {
				return Integer.compare(be.c, af.c);
			}
		}
	}

	// 高速なScanner
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
