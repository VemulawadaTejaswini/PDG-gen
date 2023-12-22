
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/D2";

	FastScanner in;
	PrintWriter out;
	
	class Pair implements Comparable<Pair> {
		int value;
		int cnt;

		Pair(int value, int cnt) {
			this.value = value;
			this.cnt = cnt;
		}

		public int compareTo(Pair s) {
			return -(cnt % 2);
		}

		public String toString() {
			return "(" + value + ", " + cnt + ")";
		}
	}
	
	int MAX = 100100;
	public void solve() {
		int N = in.nextInt();
		int M = in.nextInt();
		int[] X = in.nextIntArray(N);
		
		int[] cnt1 = new int[MAX+10];
		for (int i = 0; i < N; i++) {
			cnt1[X[i]]++;
		}
		
		PriorityQueue<Pair>[] pq = new PriorityQueue[M];
		for (int i = 0; i < M; i++) {
			pq[i] = new PriorityQueue<>();
		}
		for (int i = 0; i < MAX + 10; i++) {
			if (cnt1[i] != 0) {
				pq[i%M].add(new Pair(i, cnt1[i]));
			}
		}
		
		int res = 0;
		for (int i = 0; i < M; i++) {
			int opp = (M - i) % M;
			if (pq[i].isEmpty()) continue;
			Pair p1 = pq[i].poll();
			if (pq[opp].isEmpty()) {
				pq[i].add(p1);
				continue;
			}

			Pair p2 = pq[opp].poll();
			if (p1.cnt % 2 == 0 && p2.cnt % 2 == 0) continue;
			
			p1.cnt--;
			p2.cnt--;
			if (p1.cnt != 0) pq[i].add(p1);
			if (p2.cnt != 0) pq[opp].add(p2);
			
			res++;
		}
		
		int[] cnt2 = new int[M];
		for (int i = 0; i < M; i++) {
			while (!pq[i].isEmpty()) {
				Pair next = pq[i].poll();
				cnt2[i] += next.cnt;
			}
			res += cnt2[i] / 2;
		}
		System.out.println(res);
	}
	
	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		Thread t = new Thread(null, new Runnable() {
			
			@Override
			public void run() {
				solve();
			}
		}, "lul", 1 << 30);
		t.start();
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


