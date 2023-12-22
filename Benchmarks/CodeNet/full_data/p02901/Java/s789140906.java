import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

	private final static int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Key[] keys = new Key[M];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[] c = new int[b];
			sc.fill(c);

			keys[i] = new Key(a, c);
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			map.put(i + 1, 0);
		}

		for (Key key : keys) {
			for (int box : key.box) {
				map.compute(box, (k, v) -> v + 1);
			}
		}

		for (int c : map.values()) {
			if (c == 0) {
				System.out.println("-1");
				return;
			}
		}

		long sum = 0;
		Arrays.sort(keys, Comparator.comparing(Key::getUnitPrice).thenComparing(Key::getUnit).reversed());
		OUTER: for (Key key : keys) {
			for (int c : key.box) {
				if (map.get(c) == 1) {
					sum += key.a;
					continue OUTER;
				}
			}

			for (int c : key.box) {
				map.compute(c, (k, v) -> v - 1);
			}
		}

		System.out.println(sum);
	}

	private static class Key {
		private int a;
		private int[] box;

		public Key(int a, int[] box) {
			this.a = a;
			this.box = box;
		}

		public int getA() {
			return a;
		}

		public int[] getBox() {
			return box;
		}

		public int getUnit() {
			return box.length;
		}

		public double getUnitPrice() {
			return (double) a / box.length;
		}

		@Override
		public String toString() {
			return "Key [a=" + a + ", box=" + Arrays.toString(box) + "]";
		}
	}

	public static class Pair {
		private Integer x;
		private Integer y;
		private int hashCode;

		public Pair(Integer x, Integer y) {
			this.x = x;
			this.y = y;
			this.hashCode = x << 16 + y;
		}

		@Override
		public int hashCode() {
			return hashCode;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (!x.equals(other.x))
				return false;
			if (!y.equals(other.y))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "[" + x + ", " + y + "]";
		}
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	private static int add(int a, int b) {
		return (a + b) % MOD;
	}

	private static int sub(int a, int b) {
		return (a - b % MOD) % MOD;
	}

	private static int mul(long a, long b) {
		return (int) (((a % MOD) * (b % MOD)) % MOD);
	}

	/**
	 * 最大公約数
	 */
	private static long gcd(long m, long n) {
		long temp;
		while (m % n != 0) {
			temp = n;
			n = m % n;
			m = temp;
		}
		return n;
	}

	/**
	 * 最小公倍数
	 */
	private static long lcm(long m, long n) {
		return m / gcd(m, n) * n;
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
