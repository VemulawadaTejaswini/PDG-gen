import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] a = new long[N];
		for (int i = 0; i < N; ++i) {
			a[i] = sc.nextLong();
		}
		long[] b = new long[N * (N + 1) / 2];
		int p = 0;
		for (int i = 0; i < N; ++i) {
			long sum = 0;
			for (int j = i; j < N; ++j) {
				sum += a[j];
				b[p] = sum;
				++p;
			}
		}
		long ans = 0;
		Arrays.sort(b);

		for (int t = 0; t < 42; ++t) {
			int[] cnt = new int[42];
			for (int i = 0; i < b.length; ++i) {
				if ((ans & b[i]) != ans)
					continue;
				for (int shift = 0; shift <= 41; ++shift) {
					if (((1L << shift) & b[i]) > 0 && ((1L << shift) & ans) == 0)
						++cnt[shift];
				}
			}
			for (int shift = 41; shift >= 0; --shift) {
				if (cnt[shift] >= K) {
					ans |= 1L << shift;
					break;
				}
			}
		}
		pw.println(ans);
		pw.close();
	}

	static class Scanner {
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

		public int nextInt() {
			return (int) nextLong();
		}
	}

	public static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
