
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static long LINF = 1L << 55;
	static int MOD = 998244353;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {

		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int K = in.nextInt(), N = in.nextInt();

			for (int i = 2; i <= 2*K; i++) {
				long ans = 0;
				int n = 0;
				for (int a = 1; a <= K; a++) {
					if (a <= i - a && i - a <= K) n++;
				}
				if (i % 2 == 1) {
					for (int m = 0; m <= n; m++) {
						ans += (comb(n, m) * power(2, m, MOD)) % MOD * H(K-2*n+m, N-m);
						ans %= MOD;
					}
				} else {
					n--;
					for (int m = 0; m <= n; m++) {
						ans += (comb(n, m) * power(2, m, MOD)) % MOD * H(K-2*n+m-1, N-m-1);
						ans %= MOD;
						ans += (comb(n, m) * power(2, m, MOD)) % MOD * H(K-2*n+m-1, N-m);
						ans %= MOD;
					}
				}

				out.println(ans % MOD);
			}
		}
	}

	public  static long H(int n, int r) {
		return comb(n+r-1, r);
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

	static long power(long a, long e, long modP) {
		long ret = 1;
		for (; e > 0; e /= 2) {
			if (e % 2 != 0) {
				ret = (ret * a) % modP;
			}
			a = (a * a) % modP;
		}
		return ret;
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public int[] nextIntArrayDec(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt() - 1;
			}
			return res;
		}

		public int[] nextIntArray1Index(int n) {
			int[] res = new int[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public long[] nextLongArrayDec(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong() - 1;
			}
			return res;
		}

		public long[] nextLongArray1Index(int n) {
			long[] res = new long[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextLong();
			}
			return res;
		}

		public double[] nextDoubleArray(int n) {
			double[] res = new double[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextDouble();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}
	}

}
