import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {

	static final long MOD = (long)(1e9 + 7);
	long[][] dp;
	long[][] dp2;
	void solve() {
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		if (N > 300) {
			return;
		}
		calc2(N);
		dp = new long[N+1][N+1];
		dp[0][0] = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= s.length; j++) {
				long cur = dp[i][j];
				if (cur == 0) continue;
				
				if (j < s.length) {
					dp[i+1][j+1] += cur;
					dp[i+1][j+1] %= MOD;
				}
				if (j == 0) {
					dp[i+1][j] += cur;
					dp[i+1][j] %= MOD;
				} else {
					dp[i+1][j-1] += cur;
					dp[i+1][j-1] %= MOD;
				}
				
				for (int k = 0; i+2*k+2 <= N; k++) {
					long p = (dp2[2*k][0]) % MOD;
					if (j >= s.length) p = (p * 2) % MOD;
					dp[i+2*k+2][j] += cur * p;
					dp[i+2*k+2][j] %= MOD;
				}
			}
		}
		long ans = dp[N][s.length];
		out.println(ans);
	}
	
	void calc2(int N) {
		dp2 = new long[2*N+1][2*N+2];
		dp2[0][0] = 1;
		for (int i = 0; i < 2 * N; i++) {
			for (int j = 0; j <= 2*N; j++) {
				long cur = dp2[i][j];
				dp2[i+1][j+1] += 2 * cur;
				dp2[i+1][j+1] %= MOD;
				if (j > 0) {
					dp2[i+1][j-1] += cur;
					dp2[i+1][j-1] %= MOD;
				}
			}
		}
	}
	
	
	long cat(int n) {
		return C(2 * n, n) * inv[n+1];
	}
	
	static final long[] two = new long[10000 + 10];
	static final long[] fact = new long[10000 + 10];
	static final long[] fact_inv = new long[10000 + 10];
	static final long[] inv = new long[10000 + 10];
	static {
	    inv[1] = fact[0] = fact_inv[0] = 1;
	    for (int i = 2; i < inv.length; i++) inv[i] = inv[(int)(MOD % i)] * (MOD - MOD / i) % MOD;
	    for (int i = 1; i < fact.length; i++) fact[i] = (fact[i-1] * i) % MOD;
	    for (int i = 1; i < fact_inv.length; i++) fact_inv[i] = (fact_inv[i-1] * inv[i]) % MOD;
	    two[0] = 1;
	    for (int i = 1; i < two.length; i++) two[i] = two[i-1] * 2 % MOD;
	}
	long C(long n, long k) {
	    if ( n < 0 || k < 0 || n < k) return 0;
	    return fact[(int)n] * fact_inv[(int)(n - k)] % MOD * fact_inv[(int)k] % MOD;
	}
	
	static void tr(Object... os) { System.err.println(deepToString(os)); }
	static void tr(long[][] as) { for (long[] a : as) tr(a); }

	void print(int[] a) {
		out.print(a[0]);
		for (int i = 1; i < a.length; i++) out.print(" " + a[i]);
		out.println();
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}