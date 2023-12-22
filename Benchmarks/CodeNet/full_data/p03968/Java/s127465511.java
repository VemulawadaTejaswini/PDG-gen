
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/C2";

	FastScanner in;
	PrintWriter out;

	long XXX = 10000;
	long toKey(int[] c) {
		long key = Long.MAX_VALUE;
		for (int i = 0; i < 4; i++) {
			long curKey = 0;
			for (int j = 0; j < 4; j++) curKey = curKey * XXX + c[(i+j)%4];
			if (key > curKey) key = curKey;
		}
		return key;
	}
	
	HashMap<Long, Long> hash = new HashMap<>();
	void add(long key) {
		if (hash.containsKey(key))
			hash.put(key, hash.get(key) + 1);
		else
			hash.put(key, 1L);
	}
	
	int comb(long key) {
		long[] vals = new long[4];
		for (int i = 0; i < 4; i++) {
			vals[i] = key % XXX;
			key /= XXX;
		}
		if (vals[0] == vals[1] && vals[1] == vals[2] && vals[2] == vals[3])
			return 4;
		else if (vals[0] == vals[2] && vals[1] == vals[3])
			return 2;
		else
			return 1;
	}
	
	long get(long key) {
		if (!hash.containsKey(key)) return 0;
		return hash.get(key);
	}
	
	public void solve() {
		int N = in.nextInt();
		
		int[][] C = new int[N][4];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				C[i][j] = in.nextInt();
			}
			long key = toKey(C[i]);
			add(key);
		}
		
		long res = 0;
		for (int c1 = 0; c1 < N; c1++) {
			for (int c2 = c1 + 1; c2 < N; c2++) {
				int x1 = C[c1][0], x2 = C[c1][1], x3 = C[c1][2], x4 = C[c1][3];
				int y1 = C[c2][1], y2 = C[c2][0], y3 = C[c2][3], y4 = C[c2][2];
				long xkey = toKey(new int[]{x1, x2, x3, x4});
				long ykey = toKey(new int[]{y1, y2, y3, y4});
				for (int rotate = 0; rotate < 4; rotate++) {
					long upKey     = toKey(new int[]{y1, y2, x2, x1});
					long bottomKey = toKey(new int[]{y3, y4, x4, x3});
					long rightKey  = toKey(new int[]{x3, x2, y2, y3});
					long leftKey   = toKey(new int[]{x1, x4, y4, y1}); 
					
					long ucnt = get(upKey) * comb(upKey);
					long bcnt = get(bottomKey) * comb(bottomKey);
					long rcnt = get(rightKey) * comb(rightKey);
					long lcnt = get(leftKey) * comb(leftKey);
					
					long[] keys = {upKey, bottomKey, rightKey, leftKey};
					long[] cnts = {ucnt, bcnt, rcnt, lcnt};
					for (int i = 0; i < 4; i++) {
						if (xkey == keys[i]) cnts[i] -= comb(keys[i]);
						if (ykey == keys[i]) cnts[i] -= comb(keys[i]);
						for (int j = i + 1; j < 4; j++)
							if (keys[i] == keys[j]) cnts[i] -= comb(keys[i]);
					}

					long val = 1;
					for (long c : cnts) val *= c; 
					res += val;
					
					int ytmp = y1;
					y1 = y2;
					y2 = y3;
					y3 = y4;
					y4 = ytmp;
				}
			}
		}
		System.out.println(res/3);
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


