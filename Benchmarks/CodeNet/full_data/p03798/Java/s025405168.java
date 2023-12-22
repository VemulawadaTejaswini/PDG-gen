import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();

		Deque<char[]> queue = new ArrayDeque<>();
		queue.push(new char[] { 'S', 'S', 'S' });
		queue.push(new char[] { 'S', 'S', 'W' });
		queue.push(new char[] { 'S', 'W', 'S' });
		queue.push(new char[] { 'S', 'W', 'W' });
		queue.push(new char[] { 'W', 'S', 'S' });
		queue.push(new char[] { 'W', 'S', 'W' });
		queue.push(new char[] { 'W', 'W', 'S' });
		queue.push(new char[] { 'W', 'W', 'W' });

		while (!queue.isEmpty()) {
			char[] e = queue.pop();
			char left = e[e.length - 3];
			char center = e[e.length - 2];
			char right = e[e.length - 1];
			int position = (e.length - 2) % s.length;

			boolean ok = false;
			if (left == right) {
				if (center == 'S' && s[position] == 'o') {
					ok = true;
				} else if (center == 'W' && s[position] == 'x') {
					ok = true;
				}
			} else {
				if (center == 'S' && s[position] == 'x') {
					ok = true;
				} else if (center == 'W' && s[position] == 'o') {
					ok = true;
				}
			}

			if (ok) {
				if (e.length == s.length) {
					queue.clear();

					char[] copy = Arrays.copyOf(e, e.length + 1);
					copy[copy.length - 1] = copy[0];
					queue.push(copy);
				} else if (e.length == s.length + 1) {
					queue.clear();

					char[] copy = Arrays.copyOf(e, e.length + 1);
					copy[copy.length - 1] = copy[1];
					queue.push(copy);
				} else if (e.length > s.length) {
					for (int i = 0; i < e.length - 2; i++) {
						System.out.print(e[i]);
					}
					System.out.println();
					return;
				} else {
					queue.clear();

					char[] c1 = Arrays.copyOf(e, e.length + 1);
					c1[c1.length - 1] = 'S';
					queue.push(c1);

					char[] c2 = Arrays.copyOf(e, e.length + 1);
					c2[c2.length - 1] = 'W';
					queue.push(c2);
				}
			}
		}

		System.out.println("-1");
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