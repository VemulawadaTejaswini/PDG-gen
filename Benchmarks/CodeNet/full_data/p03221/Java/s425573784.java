import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

	private final static long MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Pair[] PY = new Pair[M];
		for (int i = 0; i < PY.length; i++) {
			PY[i] = new Pair(i, sc.nextInt(), sc.nextInt());
		}

		Arrays.sort(PY, Comparator.comparing(Pair::getValue));

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			map.put(i + 1, 0);
		}

		String[] str = new String[M];
		for (Pair py : PY) {
			String upper = String.format("%06d", py.getKey());
			String lower = String.format("%06d", map.compute(py.getKey(), (k, v) -> v + 1));

			str[py.getIndex()] = upper + lower;
		}

		StringBuilder sb = new StringBuilder();
		for (String s : str) {
			sb.append(s);
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

	public static class Pair {
		private int index;
		private int key;
		private int value;

		public Pair(int index, int key, int value) {
			super();
			this.index = index;
			this.key = key;
			this.value = value;
		}

		public int getIndex() {
			return index;
		}

		public int getKey() {
			return key;
		}

		public int getValue() {
			return value;
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
