import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		sc.fill(x);

		int left = toLeft(N, K, x);
		int right = toRight(N, K, x);

		System.out.println(Math.min(left, right));
	}

	private static int toLeft(int N, int K, int[] x) {
		Integer[] xx = new Integer[N];
		for (int i = 0; i < N; i++) {
			if (x[i] < 0) {
				xx[i] = x[i] * 2;
			} else {
				xx[i] = x[i];
			}
		}
		Arrays.sort(xx, (o1, o2) -> Math.abs(o1) - Math.abs(o2));

		int left = 0;
		int right = 0;
		for (int i = 0; i < K; i++) {
			if (xx[i] < 0) {
				left = xx[i];
			} else {
				right = xx[i];
			}
		}

		return Math.abs(left) + right;
	}

	private static int toRight(int N, int K, int[] x) {
		Integer[] xx = new Integer[N];
		for (int i = 0; i < N; i++) {
			if (x[i] > 0) {
				xx[i] = x[i] * 2;
			} else {
				xx[i] = x[i];
			}
		}
		Arrays.sort(xx, (o1, o2) -> Math.abs(o1) - Math.abs(o2));

		int left = 0;
		int right = 0;
		for (int i = 0; i < K; i++) {
			if (xx[i] > 0) {
				right = xx[i];
			} else {
				left = xx[i];
			}
		}
		return Math.abs(left) + right;
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	public static class Scanner {
		private BufferedInputStream inputStream;
		private StringBuilder buffer = new StringBuilder();

		public Scanner(InputStream in) {
			inputStream = new BufferedInputStream(in);
		}

		public int nextInt() throws IOException {
			int num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
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
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
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
			int read = skip();
			do {
				buffer.append((char) read);
			} while ((read = inputStream.read()) > 0x20);

			String text = buffer.toString();
			buffer.delete(0, buffer.length());

			return text;
		}

		private int skip() throws IOException {
			int read;
			while ((read = inputStream.read()) <= 0x20)
				;

			return read;
		}
	}
}
