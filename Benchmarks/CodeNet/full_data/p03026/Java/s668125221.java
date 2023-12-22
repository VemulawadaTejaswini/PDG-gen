import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	private static final int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N - 1];
		int[] b = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}
		int[] c = new int[N];
		sc.fill(c);

		Arrays.sort(c);

		// index, ノード数
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, List<Integer>> nodes = new HashMap<>();
		for (int i = 0; i < N - 1; i++) {
			map.compute(a[i], (k, v) -> v == null ? 1 : v + 1);
			map.compute(b[i], (k, v) -> v == null ? 1 : v + 1);

			List<Integer> setA = nodes.get(a[i]);
			if (setA == null) {
				setA = new ArrayList<>();
				nodes.put(a[i], setA);
			}
			setA.add(b[i]);

			List<Integer> setB = nodes.get(b[i]);
			if (setB == null) {
				setB = new ArrayList<>();
				nodes.put(b[i], setB);
			}
			setA.add(a[i]);
		}

		Pair[] pairs = new Pair[N];
		map.forEach((k, v) -> pairs[k] = new Pair(k, v));

		Arrays.sort(pairs,
				Comparator.comparingInt(Pair::getB).reversed()
						.thenComparingInt(p -> {
							int sum = 0;
							for (int n : nodes.get(p.a)) {
								sum += map.get(n);
							}
							return sum;
						}));
		debug(pairs);

		int[] scores = new int[N];
		for (int i = 0; i < pairs.length; i++) {
			scores[pairs[i].a] = c[N - i - 1];
		}
		debug(scores);

		long sum = 0;
		for (int i = 0; i < N - 1; i++) {
			sum += Math.min(scores[a[i]], scores[b[i]]);
		}

		StringBuilder sb = new StringBuilder();
		sb.append(sum);
		sb.append(System.lineSeparator());
		for (int s : scores) {
			sb.append(s);
			sb.append(" ");
		}

		System.out.println(sb.toString().trim());
	}

	private static class Pair {
		private int a;
		private int b;

		public Pair(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}

		public int getA() {
			return a;
		}

		public int getB() {
			return b;
		}

		@Override
		public String toString() {
			return "[a=" + a + ", b=" + b + "]";
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