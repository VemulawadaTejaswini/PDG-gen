import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyInput in = new MyInput(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static long LINF = 1L << 55;
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {

		public void solve(int testNumber, MyInput in, PrintWriter out) {

			int h = in.nextInt(), w = in.nextInt(), n = in.nextInt();
			P[] p = new P[n+1];
			for (int i = 0; i < n; i++) {
				p[i] = new P(in.nextInt()-1, in.nextInt()-1);
			}
			p[n] = new P(h-1, w-1);
			Arrays.sort(p);

			long[] dp = new long[n+1];
			dp[0] = f(p[0].h, p[0].w);
			for (int i = 1; i < n+1; i++) {
				dp[i] = f(p[i].h, p[i].w);
				for (int j = 0; j < i; j++) {
					 dp[i] = MOD + dp[i] - (dp[j] * (f(p[i].h - p[j].h, p[i].w - p[j].w))) % MOD;
					 dp[i] %= MOD;
				}
			}

			out.println(dp[n]);

		}

		long f(int h, int w) {
			return comb(h + w, h);
		}
	}

	public static long comb(int n, int r) {
		if (r < 0 || r > n)
			return 0L;
		return fact[n] % MOD * factInv[r] % MOD * factInv[n - r] % MOD;
	}

	public static int MAXN = 200000;

	static long[] fact = factorialArray(MAXN, MOD);
	static long[] factInv = factorialInverseArray(MAXN, MOD,
			inverseArray(MAXN, MOD));

	public static long[] factorialArray(int maxN, long mod) {
		long[] fact = new long[maxN + 1];
		fact[0] = 1 % mod;
		for (int i = 1; i <= maxN; i++) {
			fact[i] = fact[i - 1] * i % mod;
		}
		return fact;
	}

	public static long[] inverseArray(int maxN, long modP) {
		long[] inv = new long[maxN + 1];
		inv[1] = 1;
		for (int i = 2; i <= maxN; i++) {
			inv[i] = modP - (modP / i) * inv[(int) (modP % i)] % modP;
		}
		return inv;
	}

	public static long[] factorialInverseArray(int maxN, long modP,
			long[] inverseArray) {
		long[] factInv = new long[maxN + 1];
		factInv[0] = 1;
		for (int i = 1; i <= maxN; i++) {
			factInv[i] = factInv[i - 1] * inverseArray[i] % modP;
		}
		return factInv;
	}

	static class P implements Comparable<P> {
		int h, w;

		public P(int h, int w) {
			super();
			this.h = h;
			this.w = w;
		}

		@Override
		public int compareTo(P o) {
			return Integer.compare(this.h + this.w, o.h + o.w);
		}

		@Override
		public String toString() {
			return "P [h=" + h + ", w=" + w + "]";
		}

	}

	static class MyInput {
		private final BufferedReader in;
		private static int pos;
		private static int readLen;
		private static final char[] buffer = new char[1024 * 8];
		private static char[] str = new char[500 * 8 * 2];
		private static boolean[] isDigit = new boolean[256];
		private static boolean[] isSpace = new boolean[256];
		private static boolean[] isLineSep = new boolean[256];

		static {
			for (int i = 0; i < 10; i++) {
				isDigit['0' + i] = true;
			}
			isDigit['-'] = true;
			isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
			isLineSep['\r'] = isLineSep['\n'] = true;
		}

		public MyInput(InputStream is) {
			in = new BufferedReader(new InputStreamReader(is));
		}

		public int read() {
			if (pos >= readLen) {
				pos = 0;
				try {
					readLen = in.read(buffer);
				} catch (IOException e) {
					throw new RuntimeException();
				}
				if (readLen <= 0) {
					throw new MyInput.EndOfFileRuntimeException();
				}
			}
			return buffer[pos++];
		}

		public int nextInt() {
			int len = 0;
			str[len++] = nextChar();
			len = reads(len, isSpace);
			int i = 0;
			int ret = 0;
			if (str[0] == '-') {
				i = 1;
			}
			for (; i < len; i++)
				ret = ret * 10 + str[i] - '0';
			if (str[0] == '-') {
				ret = -ret;
			}
			return ret;
		}

		public long nextLong() {
			int len = 0;
			str[len++] = nextChar();
			len = reads(len, isSpace);
			int i = 0;
			long ret = 0;
			if (str[0] == '-') {
				i = 1;
			}
			for (; i < len; i++)
				ret = ret * 10 + str[i] - '0';
			if (str[0] == '-') {
				ret = -ret;
			}
			return ret;
		}

		public char nextChar() {
			while (true) {
				final int c = read();
				if (!isSpace[c]) {
					return (char) c;
				}
			}
		}

		public String nextString() {
			return new String(nextChars());
		}

		public char[] nextChars() {
			int len = 0;
			str[len++] = nextChar();
			len = reads(len, isSpace);
			return Arrays.copyOf(str, len);
		}

		int reads(int len, boolean[] accept) {
			try {
				while (true) {
					final int c = read();
					if (accept[c]) {
						break;
					}
					if (str.length == len) {
						char[] rep = new char[str.length * 3 / 2];
						System.arraycopy(str, 0, rep, 0, str.length);
						str = rep;
					}
					str[len++] = (char) c;
				}
			} catch (MyInput.EndOfFileRuntimeException e) {
			}
			return len;
		}

		public int[] nextIntArray(final int n) {
			final int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public int[] nextIntArray1Index(final int n) {
			final int[] res = new int[n + 1];
			for (int i = 1; i < n + 1; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public int[] nextIntArrayDec(final int n) {
			final int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt() - 1;
			}
			return res;
		}

		public long[] nextLongArray(final int n) {
			final long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public long[] nextLongArray1Index(final int n) {
			final long[] res = new long[n + 1];
			for (int i = 1; i < n + 1; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public long[] nextLongArrayDec(final int n) {
			final long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong() - 1;
			}
			return res;
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public double[] nextDoubleArray(int n) {
			double[] res = new double[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextDouble();
			}
			return res;
		}

		static class EndOfFileRuntimeException extends RuntimeException {
		}

	}

}
