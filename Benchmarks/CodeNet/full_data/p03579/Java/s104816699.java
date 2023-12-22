import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
	private static final int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] tmp = sc.next().toCharArray();
		boolean[] s = new boolean[N];
		for (int i = 0; i < N; i++) {
			s[i] = tmp[i] == '1';
		}

		long count = 0;
		while (true) {
			int prevIndex = -1;
			int max = -1;
			int maxIndex = -1;
			boolean toRight = false;
			while (true) {
				int index = -1;
				for (int i = prevIndex + 1; i < s.length - 2; i++) {
					if (s[i] && !s[i + 1] && s[i + 2]) {
						index = i;
						break;
					}
				}
				if (index == -1) {
					break;
				}
				prevIndex = index;

				int right = 0;
				for (int i = index + 3; i < s.length; i++) {
					if (!s[i]) {
						break;
					}
					right++;
				}
				int left = 0;
				for (int i = index - 1; i >= 0; i--) {
					if (!s[i]) {
						break;
					}
					left++;
				}
				if (max < right) {
					max = right;
					maxIndex = index;
					toRight = true;
				}
				if (max < left) {
					max = left;
					maxIndex = index;
					toRight = false;
				}
			}

			if (max == -1) {
				System.out.println(count);
				return;
			}

			if (toRight) {
				for (int i = 0; i <= max; i++) {
					count++;
					s[maxIndex + i + 0] = false;
					s[maxIndex + i + 1] = true;
					s[maxIndex + i + 2] = false;
				}
			} else {
				for (int i = 0; i <= max; i++) {
					count++;
					s[maxIndex - i + 0] = false;
					s[maxIndex - i + 1] = true;
					s[maxIndex - i + 2] = false;
				}
			}
		}
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	public static class Position {
		private final int y;
		private final int x;
		private final int priority;

		public Position(int y, int x, int priority) {
			super();
			this.y = y;
			this.x = x;
			this.priority = priority;
		}

		public int getY() {
			return y;
		}

		public int getX() {
			return x;
		}

		public int getPriority() {
			return priority;
		}

		@Override
		public String toString() {
			return y + "," + x + "," + priority;
		}
	}

	public static class Scanner {
		private BufferedInputStream inputStream;

		public Scanner(InputStream in) {
			inputStream = new BufferedInputStream(in);
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