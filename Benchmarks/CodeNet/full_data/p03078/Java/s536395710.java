import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
	private static final int MOD = 1000000007;

	private static void reverse(long[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			long temp = a[a.length - i - 1];
			a[a.length - i - 1] = a[i];
			a[i] = temp;
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[X];
		sc.fill(A);
		long[] B = new long[Y];
		sc.fill(B);
		long[] C = new long[Z];
		sc.fill(C);

		Arrays.sort(A);
		reverse(A);
		Arrays.sort(B);
		reverse(B);
		Arrays.sort(C);
		reverse(C);

		int limit = 30;
		long[] AA = Arrays.copyOf(A, Math.min(X, limit));
		long[] BB = Arrays.copyOf(B, Math.min(Y, limit));
		long[] CC = Arrays.copyOf(C, Math.min(Z, limit));
		long[] array = new long[Math.min(X, limit) * Math.min(Y, limit) * Math.min(Z, limit)];

		int current = 0;
		for (int i = 0; i < AA.length; i++) {
			for (int j = 0; j < BB.length; j++) {
				for (int k = 0; k < CC.length; k++) {
					array[current++] = AA[i] + BB[j] + CC[k];
				}
			}
		}

		Arrays.sort(array);
		reverse(array);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < K; i++) {
			sb.append(array[i]);
			sb.append(System.lineSeparator());
		}

		System.out.print(sb.toString());
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	private static class Tuple {
		boolean hasLeft;
		boolean hasRight;
	}

	public static class Scanner {
		private BufferedInputStream inputStream;

		public Scanner(InputStream in) {
			inputStream = new BufferedInputStream(in);
		}

		public char nextChar() throws IOException {
			return (char) skip();
		}

		public int nextInt() throws IOException {
			int num = 0;

			int read = skip();
			do {
				num = num * 10 + (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(int[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
			}
		}

		public void fill(int[] a, int[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
				b[i] = nextInt();
			}
		}

		public long nextLong() throws IOException {
			long num = 0;

			int read = skip();
			do {
				num = num * 10 + (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(long[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
			}
		}

		public void fill(long[] a, long[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
				b[i] = nextLong();
			}
		}

		public long[] nextLong(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLong();
			}

			return array;
		}

		public String next() throws IOException {
			StringBuilder builder = new StringBuilder();

			int read = skip();
			do {
				builder.append((char) read);
			} while ((read = inputStream.read()) > 0x20);

			return builder.toString();
		}

		private int skip() throws IOException {
			int read;
			while ((read = inputStream.read()) <= 0x20)
				;

			return read;
		}
	}
}