
import java.io.*;
import java.math.BigInteger;
import java.util.*;

 class Main {

	static long sx = 0, sy = 0, mod = (long) (1e9 + 7);

	static ArrayList<Integer>[] a;
	static long[][][] dp;
	static long[] fa;
	static long[] farr;
	public static PrintWriter out;
	static ArrayList<pair> pa = new ArrayList<>();
	static long[] fact = new long[(int) 1e6];
	static boolean b = false;
	static StringBuilder sb = new StringBuilder();
	static boolean cycle = false;
	// static long m = 998244353;
	static long[] no, col;
	static String s;
	static int k = 0, n = 0, m = 0;
	static int[] c;
	static long ans = 0;
	static HashMap<Integer, Integer> hm;
	// static ArrayList<Integer> p = new ArrayList<>();
	static long[] arr;;
	static long[] p;

	public static void main(String[] args) throws IOException {

		// Scanner scn = new Scanner(new BufferedReader(new
		// InputStreamReader(System.in)));

		out = new PrintWriter(System.out);
		Reader scn = new Reader();

		n = scn.nextInt();
		dp = new long[n + 1][5][5];

		long[] a = scn.nextLongArray(n);

		long ans = 0;

		if (n % 2 == 0) {

			fill(dp);

			ans = f(a, 0, 0, 1);

			fill(dp);

			ans = Math.max(ans, f(a, 1, 0, 0));
		}

		else {

			fill(dp);
			ans = f(a, 0, 0, 2);
			fill(dp);
			ans = Math.max(ans, f(a, 1, 0, 1));
			fill(dp);
			ans = Math.max(ans, f(a, 2, 0, 0));
		}

		System.out.println(ans);
	}

	private static long f(long[] a, int i, int mar, int p2j) {

		if (p2j == 0) {

			if (i > n - 1)
				return 0;
		}

		else if (p2j == 1) {

			if (mar == 1) {

				if (i > n - 1)
					return 0;
			}

			else {

				if (i > n - 2)
					return 0;
			}
		}

		else {

			if (mar == 2) {

				if (i > n - 1)
					return 0;
			}

			else if (mar == 1) {

				if (i > n - 2)
					return 0;
			}

			else {

				if (i > n - 3)
					return 0;
			}
		}

		long ans = 0;
		
		if(dp[i][mar][p2j]!=Long.MAX_VALUE)
			 return dp[i][mar][p2j];

		ans = f(a, i + 2, mar, p2j) + a[i];

		if (mar < p2j)
			ans = Math.max(ans, f(a, i + 3, mar + 1, p2j) + a[i]);

		return dp[i][mar][p2j] = ans;
	}

	public static void fill(long[][][] dp) {

		for (int i = 0; i < dp.length; i++)
			for (int j = 0; j < 5; j++)
				Arrays.fill(dp[i][j], Long.MAX_VALUE);
	}

	// _________________________TEMPLATE_____________________________________________________________

	// public static long lcm(long x, long y) {
	//
	// return (x * y) / gcd(x, y);
	// }
	//
	// private static long gcd(long x, long y) {
	// if (x == 0)
	// return y;
	//
	// return gcd(y % x, x);
	// }
	//
	// static class comp implements Comparator<pair> {
	//
	// @Override
	// public int compare(pair p1, pair p2) {
	// return p1.i - p2.i;
	// }
	//
	// }
	//
	// public static long pow(long a, long b) {
	//
	// if (b < 0)
	// return 0;
	// if (b == 0 || b == 1)
	// return (long) Math.pow(a, b);
	//
	// if (b % 2 == 0) {
	//
	// long ret = pow(a, b / 2);
	// ret = (ret % mod * ret % mod) % mod;
	// return ret;
	// }
	//
	// else {
	// return ((pow(a, b - 1) % mod) * a % mod) % mod;
	// }
	// }

	private static class pair implements Comparable<pair> {

		long no;
		long s, e;

		pair(long n, long c, long d) {
			no = n;
			s = c;
			e = d;

		}

		@Override
		public int compareTo(pair o) {

			return 1;

		}

		// @Override
		//
		// public int hashCode() {
		// return i;
		// }
		//
		// @Override
		//
		// public boolean equals(Object o) {
		//
		// pair p = (pair) o;
		// return this.i == p.i;
		// }

	}

	private static String reverse(String s) {

		return new StringBuilder(s).reverse().toString();
	}

	public static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[1000000 + 1]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n) throws IOException {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLong();
			}
			return arr;
		}

		public int[][] nextInt2DArray(int m, int n) throws IOException {
			int[][] arr = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++)
					arr[i][j] = nextInt();
			}
			return arr;
		}

		public long[][] nextInt2DArrayL(int m, int n) throws IOException {
			long[][] arr = new long[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++)
					arr[i][j] = nextInt();
			}
			return arr;
		}
		// kickstart - Solution
		// atcoder - Main
	}

}