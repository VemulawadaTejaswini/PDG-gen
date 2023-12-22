import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {
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

		int[] B = shrink(A);
		int ok = 0;
		int ng = Integer.MAX_VALUE / 3;
		while (ng - ok > 1) {
			int m = (ok + ng) / 2;
			if (check(N, B, m))
				ok = m;
			else
				ng = m;
		}
		Arrays.sort(A);
		for (int i = 0, j = 0; i < N; ++i) {
			if (i > 0 && A[i] != A[i - 1])
				++j;
			if (j == ok) {
				System.out.println(A[i]);
				return;
			}
		}
		throw new AssertionError();
	}

	int[] shrink(long[] A) {
		int N = A.length;
		long[][] B = new long[N][2];
		for (int i = 0; i < N; ++i) {
			B[i][0] = A[i];
			B[i][1] = i;
		}
		Arrays.sort(B, new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				return Long.compare(o1[0], o2[0]);
			}
		});
		int[] ret = new int[N];
		int p = 0;
		for (int i = 0; i < N; ++i) {
			if (i > 0 && B[i][0] != B[i - 1][0]) {
				++p;
			}
			ret[(int) B[i][1]] = p;
		}
		return ret;
	}

	boolean check(int N, int[] A, long m) {
		int[] B = new int[N];
		for (int i = 0; i < N; ++i) {
			if (A[i] >= m)
				B[i] = 1;
			else
				B[i] = -1;
		}
		long sum = 0;
		int sum2 = N;
		BIT bit = new BIT(2 * N + 1);
		bit.add(N, 1);
		for (int i = 0; i < N; ++i) {
			sum2 += B[i];
			sum += bit.sum(0, sum2 + 1);
			bit.add(sum2, 1);
		}
		long n = (long) N * (N - 1) / 2 + N;
		return sum >= (n - n / 2);
	}

	class BIT {
		int n;
		int[] a;

		public BIT(int n_) {
			n = n_;
			a = new int[n + 1];
		}

		void add(int k, int val) {
			++k;
			while (k <= n) {
				a[k] += val;
				k += k & -k;
			}
		}

		int sum(int k) {
			++k;
			int ret = 0;
			while (k > 0) {
				ret += a[k];
				k -= k & -k;
			}
			return ret;
		}

		int sum(int a, int b) {
			return sum(b - 1) - sum(a - 1);
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
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
}
