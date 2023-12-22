import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
	private static final int MOD = 1_000_000_007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();

		int right = 1;
		int left = 0;
		int center = -1;
		int[] ans = new int[S.length];
		for (int i = 1; i < S.length; i++) {
			if (S[i - 1] == 'L' && S[i] == 'R') {
				int sum = right + left;
				int mod = sum % 2;
				ans[center - 1] = sum / 2 + ((right % 2 == 1) ? mod : 0);
				ans[center] = sum / 2 + ((left % 2 == 1) ? mod : 0);
				right = 0;
				left = 0;
			}

			if (S[i] == 'R') {
				right++;
			} else if (S[i] == 'L') {
				left++;
			}

			if (S[i - 1] == 'R' && S[i] == 'L') {
				center = i;
			}
		}

		int sum = right + left;
		int mod = sum % 2;
		ans[center - 1] = sum / 2 + ((left > right) ? mod : 0);
		ans[center] = sum / 2 + ((right > left) ? mod : 0);

		StringBuilder sb = new StringBuilder();
		for (int a : ans) {
			sb.append(a).append(" ");
		}

		System.out.println(sb.toString().trim());

	}

	public static class Pair {
		private int index;
		private int value;

		public Pair(int index, int value) {
			super();
			this.index = index;
			this.value = value;
		}

		public int getIndex() {
			return index;
		}

		public int getValue() {
			return value;
		}

		@Override
		public String toString() {
			return "[" + index + ":" + value + "]";
		}
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	private static long gcd(long m, long n) {
		long temp;
		while (m % n != 0) {
			temp = n;
			n = m % n;
			m = temp;
		}
		return n;
	}

	private static long lcm(long m, long n) {
		return m / gcd(m, n) * n;
	}

	private static int add(int a, int b) {
		return (a + b) % MOD;
	}

	private static int sub(int a, int b) {
		return (a - b % MOD) % MOD;
	}

	private static int mul(int a, int b) {
		return ((a % MOD) * (b % MOD)) % MOD;
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