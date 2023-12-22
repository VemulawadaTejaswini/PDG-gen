import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main implements Runnable {
	FastReader scn;
	PrintWriter out;
	String INPUT = "";

	void solve() {
		int n = scn.nextInt();
		char[] s = scn.next().toCharArray();
		RollingHashFactory rhf = new RollingHashFactory(2, n, new Random());
		RollingHash rh = new RollingHash(n, rhf);
		
		for(char c : s) {
			rh.add(c);
		}
		
		int l = 0, r = n / 2, ans = 0;
		outer: while(l <= r) {
			int m = (l + r) >> 1;
			HashMap<Long, Integer> map = new HashMap<>();
			
			for(int i = 0; i + m <= n; i++) {
				long hash = rh.queryTwin(i, i + m);
				if(map.containsKey(hash) && map.get(hash) <= i) {
					ans = m;
					l = m + 1;
					continue outer;
				}
				if(!map.containsKey(hash)) {
					map.put(hash, i + m);
				}
			}
			
			r = m - 1;
		}
		
		out.println(ans);
	}
	

	public class RollingHash {
		public RollingHashFactory rhf;
		public long[][] buf;
		public int p;

		public RollingHash(int bufsize, RollingHashFactory rhf) {
			buf = new long[rhf.deg][bufsize + 1];
			this.rhf = rhf;
			this.p = 1;
		}

		public void add(int c) {
			for (int i = 0; i < rhf.deg; i++)
				buf[i][p] = (buf[i][p - 1] * rhf.muls[i] + c) % rhf.mods[i];
			p++;
		}

		public void addr(int c) {
			for (int i = 0; i < rhf.deg; i++)
				buf[i][p] = (buf[i][p - 1] + rhf.powers[i][p - 1] * c) % rhf.mods[i];
			p++;
		}

		public long queryTwin(int r) {
			return buf[0][r] << 32 | buf[1][r];
		}

		public long queryTwin(int l, int r) {
			assert l <= r;
			assert rhf.deg == 2;
			long h = 0;
			for (int i = 0; i < rhf.deg; i++) {
				long v = (buf[i][r] - buf[i][l] * rhf.powers[i][r - l]) % rhf.mods[i];
				if (v < 0)
					v += rhf.mods[i];
				h = h << 32 | v;
			}
			return h;
		}

		public long[] query(int l, int r) {
			assert l <= r;
			long[] h = new long[rhf.deg];
			for (int i = 0; i < rhf.deg; i++) {
				h[i] = (buf[i][r] - buf[i][l] * rhf.powers[i][r - l]) % rhf.mods[i];
				if (h[i] < 0)
					h[i] += rhf.mods[i];
			}
			return h;
		}

		public  long add(long a, long b, int w, RollingHashFactory rhf) {
			assert rhf.deg == 2;
			long high = ((a >>> 32) * rhf.powers[0][w] + (b >>> 32)) % rhf.mods[0];
			long low = ((long) (int) a * rhf.powers[1][w] + (int) b) % rhf.mods[1];
			return high << 32 | low;
		}
	}

	public  class RollingHashFactory {
		public int[] mods;
		public int[] muls;
		public long[][] powers;
		public int deg;

		public RollingHashFactory(int deg, int n, Random gen) {
			this.deg = deg;
			mods = new int[deg];
			muls = new int[deg];
			for (int i = 0; i < deg; i++) {
				mods[i] = BigInteger.probablePrime(30, gen).intValue();
				muls[i] = BigInteger.probablePrime(30, gen).intValue();
			}
			powers = new long[deg][n + 1];
			for (int i = 0; i < deg; i++) {
				powers[i][0] = 1;
				for (int j = 1; j <= n; j++) {
					powers[i][j] = powers[i][j - 1] * muls[i] % mods[i];
				}
			}
		}
	}


	public void run() {
		long time = System.currentTimeMillis();
		boolean oj = true;
		out = new PrintWriter(System.out);
		scn = new FastReader(oj);
		solve();
		out.flush();
		if (!oj) {
			System.out.println(Arrays.deepToString(new Object[] { System.currentTimeMillis() - time + " ms" }));
		}
	}

	public static void main(String[] args) {
		new Thread(null, new Main(), "Main", 1 << 26).start();
	}

	class FastReader {
		InputStream is;

		public FastReader(boolean onlineJudge) {
			is = onlineJudge ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		}

		public FastReader() {
			is = System.in;
		}

		byte[] inbuf = new byte[1024];
		public int lenbuf = 0, ptrbuf = 0;

		int readByte() {
			if (lenbuf == -1)
				throw new InputMismatchException();
			if (ptrbuf >= lenbuf) {
				ptrbuf = 0;
				try {
					lenbuf = is.read(inbuf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return -1;
			}
			return inbuf[ptrbuf++];
		}

		boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b))
				;
			return b;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		char nextChar() {
			return (char) skip();
		}

		String next() {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		String nextLine() {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			while ((!isSpaceChar(b) || b == ' ')) { // when nextLine, (isSpaceChar(b) && b != ' ')
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		char[] next(int n) {
			char[] buf = new char[n];
			int b = skip(), p = 0;
			while (p < n && !(isSpaceChar(b))) {
				buf[p++] = (char) b;
				b = readByte();
			}
			return n == p ? buf : Arrays.copyOf(buf, p);
		}

		int nextInt() {
			int num = 0, b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}

			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
				b = readByte();
			}
		}

		long nextLong() {
			long num = 0;
			int b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}

			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
				b = readByte();
			}
		}

		char[][] nextMatrix(int n, int m) {
			char[][] map = new char[n][];
			for (int i = 0; i < n; i++)
				map[i] = next(m);
			return map;
		}

		int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		int[][] IndIntArray(int n) {
			int[][] a = new int[n][];
			for (int i = 0; i < n; i++)
				a[i] = new int[] { nextInt(), i };
			return a;
		}

		long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		int[][] next2DInt(int n, int m) {
			int[][] arr = new int[n][];
			for (int i = 0; i < n; i++) {
				arr[i] = nextIntArray(m);
			}
			return arr;
		}

		long[][] next2DLong(int n, int m) {
			long[][] arr = new long[n][];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLongArray(m);
			}
			return arr;
		}

		int[] shuffle(int[] arr) {
			Random r = new Random();
			for (int i = 1, j; i < arr.length; i++) {
				j = r.nextInt(i);
				int c = arr[i];
				arr[i] = arr[j];
				arr[j] = c;
			}
			return arr;
		}

		long[] shuffle(long[] arr) {
			Random r = new Random();
			for (int i = 1, j; i < arr.length; i++) {
				j = r.nextInt(i);
				long c = arr[i];
				arr[i] = arr[j];
				arr[j] = c;
			}
			return arr;
		}

		int[] uniq(int[] arr) {
			arr = scn.shuffle(arr);
			Arrays.sort(arr);
			int[] rv = new int[arr.length];
			int pos = 0;
			rv[pos++] = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] != arr[i - 1]) {
					rv[pos++] = arr[i];
				}
			}
			return Arrays.copyOf(rv, pos);
		}

		long[] uniq(long[] arr) {
			arr = scn.shuffle(arr);
			Arrays.sort(arr);
			long[] rv = new long[arr.length];
			int pos = 0;
			rv[pos++] = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] != arr[i - 1]) {
					rv[pos++] = arr[i];
				}
			}
			return Arrays.copyOf(rv, pos);
		}

		int[] reverse(int[] arr) {
			int l = 0, r = arr.length - 1;
			while (l < r) {
				arr[l] = arr[l] ^ arr[r];
				arr[r] = arr[l] ^ arr[r];
				arr[l] = arr[l] ^ arr[r];
				l++;
				r--;
			}
			return arr;
		}

		long[] reverse(long[] arr) {
			int l = 0, r = arr.length - 1;
			while (l < r) {
				arr[l] = arr[l] ^ arr[r];
				arr[r] = arr[l] ^ arr[r];
				arr[l] = arr[l] ^ arr[r];
				l++;
				r--;
			}
			return arr;
		}

		int[] compress(int[] arr) {
			int n = arr.length;
			int[] rv = Arrays.copyOf(arr, n);
			rv = uniq(rv);
			for (int i = 0; i < n; i++) {
				arr[i] = Arrays.binarySearch(rv, arr[i]);
			}
			return arr;
		}

		long[] compress(long[] arr) {
			int n = arr.length;
			long[] rv = Arrays.copyOf(arr, n);
			rv = uniq(rv);
			for (int i = 0; i < n; i++) {
				arr[i] = Arrays.binarySearch(rv, arr[i]);
			}
			return arr;
		}
	}
}