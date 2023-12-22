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
		String s = sc.next();
		int n = s.length();
		int[] h = new int[n];
		for (int i = 0; i < n; ++i) {
			if (i > 0) {
				h[i] = h[i - 1];
			}
			h[i] ^= 1 << (s.charAt(i) - 'a');
		}
		int[] f = new int[1 << 26];
		Arrays.fill(f, Integer.MAX_VALUE / 3);
		for (int i = 0; i < n; ++i) {
			int hash = h[i];
			if (Integer.bitCount(hash) <= 1) {
				f[hash] = 1;
			}
			for (int j = 0; j < 26; ++j) {
				f[hash] = Math.min(f[hash], f[hash ^ (1 << j)] + 1);
			}
		}
		System.out.println(f[h[n - 1]]);
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