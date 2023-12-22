
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;


public class Main {

	private static long mod = 1000000000 + 7;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		if (K == 1) {
			System.out.println(1);
			return;
		} else {
			long[] comb = new long[N * K + 1];
			comb[K - 2] = 1;
			for (int i = K - 1; i <= N * K; i ++) {
				comb[i] = (long)i * inverse(i - (K - 2), mod) % mod * comb[i - 1] % mod;
				comb[i] %= mod;
			}
			
			long[][] dp = new long[N + 1][N + 1];
			dp[0][0] = 1L;
			for (int i = 0; i <= N; i ++) {
				for (int j = i; j <= N; j ++) {
					if (i > 0)
						dp[i][j] += dp[i - 1][j];
					if (j > 0)
						dp[i][j] += comb[i + (K - 1) * j - 1] * dp[i][j - 1];
					dp[i][j] %= mod;
				}
			}
			
			long ans = dp[N][N];
			
			for(long i = 1; i <= N; i ++) {
				ans = (ans * i) % mod;
			}
			System.out.println(ans);
		}

	}

	public static long[] extgcd(long a, long b) {
		long u = 1;
		long v = 0;
		long x = 0;
		long y = 1;

		while (a > 0) {
			long q = b / a;
			x -= q * u;
			y -= q * v;
			b -= q * a;

			long tmp;
			tmp = x;
			x = u;
			u = tmp;
			tmp = y;
			y = v;
			v = tmp;
			tmp = b;
			b = a;
			a = tmp;
		}

		return new long[] { b, x, y };
	}

	public static long inverse(long n, long mod) {
		long[] gcd = extgcd(n, mod);
		if (gcd[0] == 1) {
			return (gcd[1] + mod) % mod;
		} else {
			return 0;
		}
	}
}



class FastScanner {
	public static String debug = null;

	private final InputStream in = System.in;
	private int ptr = 0;
	private int buflen = 0;
	private byte[] buffer = new byte[1024];
	private boolean eos = false;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				if (debug != null) {
					buflen = debug.length();
					buffer = debug.getBytes();
					debug = "";
					eos = true;
				} else {
					buflen = in.read(buffer);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen < 0) {
				eos = true;
				return false;
			} else if (buflen == 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean isEOS() {
		return this.eos;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		return (int) nextLong();
	}

	public long[] nextLongList(int n) {
		return nextLongTable(1, n)[0];
	}

	public int[] nextIntList(int n) {
		return nextIntTable(1, n)[0];
	}

	public long[][] nextLongTable(int n, int m) {
		long[][] ret = new long[n][m];
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ret[i][j] = nextLong();
			}
		}
		return ret;
	}

	public int[][] nextIntTable(int n, int m) {
		int[][] ret = new int[n][m];
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ret[i][j] = nextInt();
			}
		}
		return ret;
	}
}