import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	final long MOD = (long) (1e9 + 7);
	long[] fac = new long[100001];
	long[] fac_sum1 = new long[100001];
	long[] fac_sum2 = new long[100001];
	long[] ifac = new long[100001];
	long[] inv = new long[100001];
	{
		fac[0] = fac[1] = ifac[0] = ifac[1] = inv[0] = inv[1] = 1;
		for (int i = 2; i < fac.length; ++i) {
			fac[i] = i * fac[i - 1] % MOD;
		}
		for (int i = 2; i < inv.length; ++i) {
			inv[i] = MOD - inv[(int) MOD % i] * (MOD / i) % MOD;
		}
		for (int i = 2; i < ifac.length; ++i) {
			ifac[i] = inv[i] * ifac[i - 1] % MOD;
		}
		for (int i = 1; i < fac_sum1.length; ++i) {
			// fac_sum[i] = ((i - 1 >= 0 ? fac_sum[i - 1] : 1) * i % MOD + (i == 0 ? 1 : i))
			// % MOD;
			fac_sum1[i] = ((i - 1 >= 0 ? fac_sum1[i - 1] : 1) * i % MOD + i) % MOD;
		}
		for (int i = 2; i < fac_sum2.length; ++i) {
			// fac_sum[i] = ((i - 1 >= 0 ? fac_sum[i - 1] : 1) * i % MOD + (i == 0 ? 1 : i))
			// % MOD;
			fac_sum2[i] = ((i - 1 >= 0 ? fac_sum2[i - 1] : 1) * i % MOD + i) % MOD;
		}

	}

	void run() {
		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
		}

		long[] dp0 = new long[N + 1];
		long[] dp1 = new long[N + 1];
		long[] dp2 = new long[N + 1];
		for (int i = 1; i <= N - 2; ++i) {
			// 重みiの場合 (i=1,...,N)
			if (N - i >= 2) {
				dp2[i] = (MOD + fac_sum2[N - i] - 2 * fac_sum2[N - i - 1] % MOD + fac_sum2[N - i - 2]) % MOD;
			}
			// N-i==0のとき
			// N-i==1のとき
			// N-i==2のときはdp0[i], dp1[i]で処理する。
		}

		for (int i = 1; i <= N - 1; ++i) {

			if (N - i >= 1) {
				dp1[i] = (MOD + fac_sum1[N - i] - fac_sum1[N - i - 1] % MOD) % MOD;
			}

		}


		dp0[N] = 1;
		for (int i = 1; i <= N; ++i) {
			dp0[i] = fac[i] * dp0[i] % MOD;
			dp1[i] = fac[i] * dp1[i] % MOD;
			dp2[i] = fac[i] * dp2[i] % MOD;
		}

		long ans = 0;

		long[] sumA = new long[N];
		for (int i = 1; i <= N - 2; ++i) {
			sumA[i] = (sumA[i - 1] + A[i]) % MOD;
		}
		long[] coe = new long[N + 1];
		for (int i = 1; i <= N - 2; ++i) {
			coe[i] = (coe[i - 1] + sumA[N - i - 1]) % MOD;
		}

		for (int i = 1; i <= N; ++i) {
			if ((N - 2) - i >= 0) {
				 ans = (ans + dp2[i] % MOD * coe[i] % MOD) % MOD;
			}
		}
		long totW = 0;
		for (int i = 1; i <= N - 1; ++i) {
			totW = (totW + A[i - 1]) % MOD;
			ans = (ans + dp1[i] * totW % MOD) % MOD;
		}
		totW = 0;
		for (int i = 1; i <= N - 1; ++i) {
			totW = (totW + A[N - i]) % MOD;
			ans = (ans + dp1[i] * totW % MOD) % MOD;
		}

		totW = 0;
		for (int i = 0; i < N; ++i)
			totW = (totW + A[i]) % MOD;
		ans = (ans + dp0[N] * totW % MOD) % MOD;

		System.out.println(ans);
//		rec((1 << 3) - 1, 0);
//		System.out.println(cnt);
		pw.close();
	}

	int cnt = 0;

	void rec(int s, int cur) {
		if (s == 0) {
			cnt += cur;
			return;
		}
		for (int i = 0; i < 4; ++i) {
			if (((1 << i) & s) == 0)
				continue;
			int w = 0;
			for (int j = i + 1; j < 4; ++j) {
				if (((1 << j) & s) == 0)
					break;
				++w;
			}
			for (int j = i - 1; j >= 0; --j) {
				if (((1 << j) & s) == 0)
					break;
				++w;
			}
			rec(s ^ (1 << i), cur + w + 1);
		}
	}

	long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	long gcd(long a, long b) {
		if (a > b) {
			return gcd(b, a);
		}
		if (a == 0)
			return b;
		return gcd(a, b % a);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	class FastScanner {
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

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
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
