import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long C = sc.nextLong();
		long[] x = new long[N];
		long[] v = new long[N];
		sc.fill(x, v);

		long prevX = C;
		long current = 0;
		long peek = 0;
		long max = Integer.MIN_VALUE;
		long[] value0 = new long[N];
		long[] value1 = new long[N];
		for (int i = 0; i < N; i++) {
			long cx = x[N - i - 1];
			long cv = v[N - i - 1];

			current -= prevX - cx;
			current += cv;
			if (max < current) {
				max = current;
				peek = C - cx;
			}

			value0[i] = max;
			value1[i] = max - peek;
			prevX = cx;
		}
		debug(value0);
		debug(value1);

		prevX = 0;
		current = 0;
		max = value0[N - 1];
		for (int i = 0; i < N; i++) {
			long cx = x[i];
			long cv = v[i];

			current -= cx - prevX;
			current += cv;
			if (max < current) {
				max = current;
			}
			// debug("X", i, max, current);

			if (i < N - 1) {
				long temp0 = current - cx + value0[N - i - 2];
				if (max < temp0) {
					max = temp0;
				}

				long temp1 = value1[N - i - 2] + current;
				if (max < temp1) {
					max = temp1;
				}

				// debug("X", i, max, temp0, temp1);
			}

			prevX = cx;
		}

		System.out.println(Math.max(0, max));
	}

	public static class Pair implements Comparable<Pair> {
		private double key;
		private int value;

		public Pair(double key, int value) {
			super();
			this.key = key;
			this.value = value;
		}

		public double getKey() {
			return key;
		}

		public int getValue() {
			return value;
		}

		@Override
		public String toString() {
			return "{" + key + ", " + value + "}";
		}

		@Override
		public int compareTo(Pair other) {
			double t = this.value / this.key;
			double o = other.value / other.key;
			if (t < o) {
				return -1;
			} else if (t > o) {
				return 1;
			} else {
				return 0;
			}
		}
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