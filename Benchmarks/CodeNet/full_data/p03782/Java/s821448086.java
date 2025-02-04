
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/B3";

	FastScanner in;
	PrintWriter out;
	
	public void solve() {
		int N = in.nextInt();
		int K = in.nextInt();
		int[] a = in.nextIntArray(N);
		
		Arrays.sort(a);
		
		int n = N;
		int moreK = 0;
		while (n > 0 && a[n-1] >= K) {
			moreK++;
			n--;
		}
		if (n == 0) {
			System.out.println(0);
			return;
		}
		/*
		long sum = 0;
		for (int x : a) sum += x;
		if (sum < K) {
			System.out.println(moreK + n);
			return;
		}
		*/
		
		a = Arrays.copyOf(a, n);
		
		// from left
		boolean[] dpL = new boolean[K+1];
		int[][] listL = new int[K+1][];
		dpL[0] = true;
		for (int i = 0; i < n; i++) {
			int size = 0;
			for (int j = K; j >= 0; j--) {
				if (dpL[j]) size++;
			}
			listL[i] = new int[size];
			for (int ptr = 0, j = K; j >= 0; j--) {
				if (!dpL[j]) continue;
				
				listL[i][ptr++] = j;
				if (j + a[i] <= K)
					dpL[j+a[i]] = true;
			}
		}
		
		// from right
		boolean[] dpR = new boolean[K+1];
		int[][] listR = new int[K+1][];
		dpR[0] = true;
		for (int i = n - 1; i >= 0; i--) {
			int size = 0;
			for (int j = K; j >= 0; j--) {
				if (dpR[j]) size++;
			}
			
			listR[i] = new int[size];
			for (int ptr = 0, j = K; j >= 0; j--) {
				if (!dpR[j]) continue;
				listR[i][ptr++] = j;
				if (j + a[i] <= K)
					dpR[j+a[i]] = true;
			}
		}
		
		// search
		int res = 0;
		for (int i = 0; i < n; i++) {
			res++;
			// listL[i], listR[i]
			for (int next : listL[i]) {
				int d = K - next;
				
				int lo = -1, hi = listR[i].length- 1;
				while (hi - lo > 1) {
					int mid = (lo + hi) / 2;
					if (listR[i][mid] >= d)
						lo = mid;
					else
						hi = mid;
				}
				int s = next + listR[i][hi];
				if (s + a[i] >= K) {
					// System.out.println("need :" + a[i] + ", " + s + " " + next + " " + listR[i].get(hi));
					res--;
					break;
				}
			}
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

