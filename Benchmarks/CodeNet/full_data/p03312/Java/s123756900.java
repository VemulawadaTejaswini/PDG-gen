import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;

class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
		}
		long[] sum = new long[N];
		for (int i = 0; i < N; ++i) {
			sum[i] = (i > 0 ? sum[i - 1] : 0) + A[i];
		}
		long ans = Long.MAX_VALUE / 3;
		for (int i = 0; i < N; ++i) {
			int m1 = f(0, i + 1, sum);
			int m2 = f(i + 1, N, sum);
			for (int dm1 = -1; dm1 <= 1; ++dm1) {
				if (m1 + dm1 - 1 < 0 || m1 + dm1 - 1 >= i)
					continue;
				long v1 = sum[m1 + dm1 - 1];
				long v2 = sum[i] - sum[m1 + dm1 - 1];
				for (int dm2 = -1; dm2 <= 1; ++dm2) {
					if (m2 + dm2 - 1 <= i || m2 + dm2 - 1 >= N - 1)
						continue;
					long v3 = sum[m2 + dm2 - 1] - sum[i];
					long v4 = sum[N - 1] - sum[m2 + dm2 - 1];
					ans = Math.min(ans, max(v1, v2, v3, v4) - min(v1, v2, v3, v4));
				}
			}
		}
		System.out.println(ans);
	}

	long max(long... o) {
		long ret = -Long.MAX_VALUE / 3;
		for (long v : o) {
			ret = Math.max(ret, v);
		}
		return ret;
	}

	long min(long... o) {
		long ret = Long.MAX_VALUE / 3;
		for (long v : o) {
			ret = Math.min(ret, v);
		}
		return ret;
	}

	int f(int s, int t, long[] sum) {
		int ok = t;
		int ng = s;
		// [s,m),[m,t)
		// sum[s,m) >= sum[m,t)となるようにとる
		while (ok - ng > 1) {
			int m = (ok + ng) / 2;
			if (sum[m - 1] - (s == 0 ? 0 : sum[s - 1]) >= sum[t - 1] - sum[m - 1]) {
				ok = m;
			} else {
				ng = m;
			}
		}
		return ok;
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