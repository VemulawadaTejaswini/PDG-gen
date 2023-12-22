import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int[] type = new int[Q];
		int[] a = new int[Q];
		int[] b = new int[Q];
		for (int i = 0; i < Q; i++) {
			type[i] = sc.nextInt();
			if (type[i] == 1) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
		}

		StringBuilder sb = new StringBuilder();
		int amin = Integer.MAX_VALUE;
		long bsum = 0;
		for (int i = 0; i < Q; i++) {
			if (type[i] == 1) {
				amin = Math.min(amin, a[i]);
				bsum += b[i];
				debug(i, amin, bsum);
			} else {
				long sum = 0;
				for (int j = 0; j < i; j++) {
					if (type[j] == 1) {
						sum += Math.abs(amin - a[j]);
					}
				}

				sb.append(amin);
				sb.append(" ");
				sb.append(sum + bsum);
				sb.append(System.lineSeparator());
				debug(sb);
			}
		}

		System.out.print(sb.toString());
	}

	private static class Operation implements Comparable<Operation> {
		private int B;
		private int C;

		public Operation(int b, int c) {
			super();
			B = b;
			C = c;
		}

		public int getB() {
			return B;
		}

		public int getC() {
			return C;
		}

		@Override
		public int compareTo(Operation o) {
			if (this.C != o.C) {
				return o.C - this.C;
			} else {
				return o.B - this.B;
			}
		}

		@Override
		public String toString() {
			return "[B=" + B + ", C=" + C + "]";
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
