
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Queue;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/C1";

	FastScanner in;
	PrintWriter out;
	
	class Ball implements Comparable<Ball> {
		int w;
		int id;

		Ball(int w, int id) {
			this.w = w;
			this.id = id;
		}

		public int compareTo(Ball s) {
			return w - s.w;
		}

		public String toString() {
			return "(" + w + ", " + id + ")";
		}
	}
	
	public void solve() {
		int N = in.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		
		int max = 0, min = 1000000100;
		for (int i = 0; i < N; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			max = Math.max(max, x[i]);
			max = Math.max(max, y[i]);
			min = Math.min(min, x[i]);
			min = Math.min(min, y[i]);
		}
		
		long res = Long.MAX_VALUE;
		{
			long rmax = max, rmin = min;
			Ball[] bs = new Ball[N*2];
			for (int i = 0; i < N; i++) {
				bs[2*i] = new Ball(x[i], i);
				bs[2*i+1] = new Ball(y[i], i);
			}
			Arrays.sort(bs);
			
			long bmax = 0, bmin = max;
			int[] cnt = new int[N];
			for (int i = 0; i < bs.length; i++) {
				if (cnt[bs[i].id] == 1) {
					bmin = bs[i].w;
					break;
				} else {
					cnt[bs[i].id]++;
				}
			}
			for (int i = bs.length - 1; i >= 0; i--) {
				if (cnt[bs[i].id] == 1) {
					bmax = bs[i].w;
					break;
				} else {
					cnt[bs[i].id]++;
				}
			}
			res = Math.min(res, (rmax - rmin) * (bmax - bmin));
		}
		
		{
			long rmax = max, bmin = min;
			long rmin = max, bmax = min;
			for (int i = 0; i < N; i++) {
				if (rmax == x[i] && bmin == y[i]) continue;
				if (rmax == y[i] && bmin == x[i]) continue;
				
				if (rmax == x[i]) {
					bmax = Math.max(bmax, y[i]);
				} else if (rmax == y[i]) {
					bmax = Math.max(bmax, x[i]);
				} else if (bmin == x[i]) {
					rmin = Math.min(rmin, y[i]);
				} else if (bmin == y[i]) {
					rmin = Math.min(rmin, x[i]);
				} else {
					bmax = Math.max(bmax, Math.min(x[i], y[i]));
					rmin = Math.min(rmin, Math.max(x[i], y[i]));
				}
			}
			res = Math.min(res, (rmax - rmin) * (bmax - bmin));
		}
		System.out.println(res);
	}
	
	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		solve();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();

			return array;
		}

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();

			return array;
		}

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
		}

		String next() {
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

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}

