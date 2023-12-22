import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	private static final int MOD = 1000000007;

	private static void reverse(long[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			long temp = a[a.length - i - 1];
			a[a.length - i - 1] = a[i];
			a[i] = temp;
		}
	}

	private static class Pair {
		int a;
		long b;

		public Pair(int a, long b) {
			super();
			this.a = a;
			this.b = b;
		}

		public int getA() {
			return a;
		}

		public long getB() {
			return b;
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

		List<Pair> p = new ArrayList<>();
		for (long a : A) {
			p.add(new Pair(1, a));
		}
		for (long b : B) {
			p.add(new Pair(2, b));
		}
		for (long c : C) {
			p.add(new Pair(3, c));
		}

		Collections.sort(p, Comparator.comparingLong(Pair::getB));
		Collections.reverse(p);

		int limit = 30;
		int llimit = Math.min(limit * limit * limit, p.size());
		List<Long> aa = new ArrayList<>();
		List<Long> bb = new ArrayList<>();
		List<Long> cc = new ArrayList<>();
		for (int i = 0; i < llimit || aa.isEmpty() || bb.isEmpty() || cc.isEmpty(); i++) {
			Pair pp = p.get(i);
			if (pp.a == 1) {
				aa.add(pp.b);
			} else if (pp.a == 2) {
				bb.add(pp.b);
			} else if (pp.a == 3) {
				cc.add(pp.b);
			}
		}

		int current = 0;
		long[] array = new long[1000 * 1000 * 1];
		for (Long a : aa) {
			for (Long b : bb) {
				for (Long c : cc) {
					array[current++] = a + b + c;
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