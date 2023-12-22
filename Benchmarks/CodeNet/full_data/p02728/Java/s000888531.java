import javax.management.loading.MLet;
import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
	static final int M = 1000000007;

	private static List<Integer>[] g;
	private static int n;
	private static long[] dp;
	private static long[] dp2;
	private static Combination c;
	private static int[] size;

	private static void dfs1(int v, int p) {
		dp[v] = 1;
		for (int next : g[v]) {
			if (next == p) continue;
			dfs1(next, v);
			size[v] += size[next];
			dp[v] = dp[v] * dp[next] % M * c.choose(size[v] - 1, size[next]) % M;
		}
	}

	private static void dfs2(int v, int p) {
		for (int next : g[v]) {
			if (next == p) continue;
			//long a = dp2[p] * pow(dp[next], M - 2, M) * M
			//		* pow(c.choose(n - 1, size[next]), M - 2, M) % M;
			dp2[next] = dp2[v] * pow(c.choose(n - 1, size[next]), M - 2, M) % M * c.choose(n - 1, size[next] - 1) % M;
			dfs2(next, v);
		}
	}

	private static long pow(long x, long n, long M) {
		long a = 1;
		while (n > 0) {
			if ((n & 1) == 1) a = (a * x) % M;
			x = (x * x) % M;
			n >>= 1;
		}
		return a;
	}

	public static void main(String[] args) {
		final FastScanner sc = new FastScanner(System.in);
		n = sc.nextInt();
		g = new List[n];
		c = new Combination(n + 1, M);

		dp = new long[n];
		dp2 = new long[n];
		size = new int[n];
		Arrays.fill(size, 1);

		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			g[a].add(b);
			g[b].add(a);
		}

		dfs1(0, -1);
		dp2[0] = dp[0];
		dfs2(0, -1);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(dp2[i]).append("\n");
		}

		System.out.print(sb);
	}

	private static class Combination {
		private final int M;
		private long[] fact;
		private long[] ifact;
		private long[] inv;

		public Combination(int n, int M) {
			this.M = M;
			fact = new long[n + 1];
			ifact = new long[n + 1];
			inv = new long[n + 1];

			fact[0] = fact[1] = 1;
			ifact[0] = ifact[1] = 1;
			inv[1] = 1;

			for (int i = 2; i <= n; i++) {
				fact[i] = fact[i - 1] * i % M;
				// p = (p / a * a) + (p % a)
				// 0 ≡ (p / a * a) + (p % a)          (mod p)
				// a^(-1) ≡ - (p % a)^(-1) * (p / a)  (mod p)
				inv[i] = M - inv[M % i] * (M / i) % M;
				ifact[i] = ifact[i - 1] * inv[i] % M;
			}
		}

		public long choose(int n, int k) {
			if (n < k) return 0;
			if (n < 0 || k < 0) return 0;
			return fact[n] * (ifact[k] * ifact[n - k] % M) % M;
		}

		public long inv(int a) {
			return inv[a];
		}

		public long fact(int a) {
			return fact[a];
		}
	}

	static class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		public FastScanner(InputStream source) {
			in = source;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
