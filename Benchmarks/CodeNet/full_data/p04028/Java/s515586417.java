
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/F2";

	FastScanner in;
	PrintWriter out;

	/* MOD_CALCULATION */
	int MOD = 1_000_000_007;
	long ADD(long a, long b) { 
		return (a % MOD + b % MOD) % MOD;
	}
	
	long SUB(long a, long b) { 
		return (a % MOD - b % MOD + MOD) % MOD;
	}	

	long MULT(long a, long b) {
		return (a * b) % MOD;
	}

	long POW(long a, long x) {
		long res = 1;
		for ( ; x > 0; x >>= 1) {
			if (x % 2 == 1) res = MULT(res, a);
			a = MULT(a, a);
		}
		
		return res;
	}
	
	long DIV(long a, long b) {
		return MULT(a, POW(b, MOD - 2));
	}
	/* end */
	
	int MAX = 310;
	long[][] memo;
	long[][] comb2, comb3;
	
	long dfs(int at, int slen, int rest) {
		if (at == slen + 1) {
			return rest == 0 ? 1 : 0; 
		}
		if (memo[at][rest] != Long.MAX_VALUE) return memo[at][rest];
		
		int odd = rest % 2 != 0 ? 1 : 0;
		long res = 0;
		for (int k = odd; k <= rest; k += 2) 
			res = ADD(res, MULT(dfs(at + 1, slen, rest - k), at == 0 ? comb3[k][0] : comb2[k][0]));
		return memo[at][rest] = res;
	}
	
	public void solve() {
		int N = in.nextInt();
		String s = in.next();
		
		comb2 = new long[MAX][MAX];
		comb3 = new long[MAX][MAX];
		comb2[0][0] = comb3[0][0] = 1;
		
		for (int i = 0; i < MAX - 1; i++) {
			for (int j = 0; j <= i; j++) {
				comb2[i+1][j+1] = ADD(comb2[i+1][j+1], MULT(comb2[i][j], 2));
				comb3[i+1][j+1] = ADD(comb3[i+1][j+1], MULT(comb3[i][j], 2));
				
				if (j != 0) {
					comb2[i+1][j-1] = ADD(comb2[i+1][j-1], comb2[i][j]);
				}
				comb3[i+1][Math.max(0, j - 1)] = ADD(comb3[i+1][Math.max(0, j - 1)], comb3[i][j]);			
			}
		}
		int slen = s.length();
		int rest = N - slen;
		
		memo = new long[MAX][MAX];
		for (int i = 0; i < MAX; i++) {
			Arrays.fill(memo[i], Long.MAX_VALUE);
		}
		System.out.println(dfs(0, slen, rest));
		/*
		long[][] dp = new long[MAX][MAX];
		dp[0][rest] = 1;
		for (int i = 0; i <= slen; i++) {
			int odd = (i == 0 && rest % 2 != 0) ? 1 : 0;
			for (int j = odd; j <= rest; j += 2) {
				if (dp[i][j] == 0) continue;
				for (int k = odd; k <= j; k += 2) {
					if (i == 0)
						dp[i+1][j-k] = ADD(dp[i+1][j-k], MULT(dp[i][j], comb3[k][0]));
					else
						dp[i+1][j-k] = ADD(dp[i+1][j-k], MULT(dp[i][j], comb2[k][0]));
				}
			}
		}
		System.out.println(dp[slen+1][0]);
		*/
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
		}, "lul", 1 << 27);
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

