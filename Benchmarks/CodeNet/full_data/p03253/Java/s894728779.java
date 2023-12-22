import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	final long MOD = (long) (1e9 + 7);
	long[] fac = new long[200000];
	long[] ifac = new long[200000];
	long[] inv = new long[200000];
	{
		fac[0] = ifac[0] = inv[0] = fac[1] = ifac[1] = inv[1] = 1;
		for (int i = 2; i < fac.length; ++i) {
			fac[i] = fac[i - 1] * i % MOD;
		}
		for (int i = 2; i < inv.length; ++i) {
			inv[i] = MOD - (MOD / i) * inv[(int) (MOD % i)] % MOD;
		}
		for (int i = 2; i < ifac.length; ++i) {
			ifac[i] = ifac[i - 1] * inv[i] % MOD;
		}
	}

	long comb(int n, int k) {
		return fac[n] * ifac[k] % MOD * ifac[n - k] % MOD;
	}

	public void run() throws Exception {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		long ans = 1;
		for (int i = 2; i * i <= M; ++i) {
			if (M % i == 0) {
				int cnt = 0;
				while (M % i == 0) {
					++cnt;
					M /= i;
				}
				ans = ans * comb(cnt + N - 1, cnt) % MOD;
			}
		}
		if (M > 1)
			ans = ans * N % MOD;
		System.out.println(ans);
	}

	class Scanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

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
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
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

		int nextInt() {
			return (int) nextLong();
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}