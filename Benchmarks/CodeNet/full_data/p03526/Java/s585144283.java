import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

class Main {
	public static void main(String[] args) {
		// long time = System.currentTimeMillis();
		new Main().run();
		// System.err.println(System.currentTimeMillis() - time);
	}

	void run() {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		long[][] a = new long[n][2];
		for (int i = 0; i < n; ++i) {
			a[i][0] = sc.nextLong();
			a[i][1] = sc.nextLong();
		}
		Arrays.sort(a, new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				return Long.compare(o1[0] + o1[1], o2[0] + o2[1]);
			}
		});
		long INF = Long.MAX_VALUE / 3;
		long[] f = new long[n + 1];
		Arrays.fill(f, INF);
		f[0] = 0;

		for (int i = 0; i < n; ++i) {
			for (int j = n - 1; j >= 0; --j) {
				if (f[j] == INF || f[j] > a[i][0])
					continue;
				f[j + 1] = Math.min(f[j + 1], f[j] + a[i][1]);
			}
		}

		int ans = 0;
		for (int i = 1; i <= n; ++i) {
			if (f[i] == INF)
				break;
			ans = i;
		}
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

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}