import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] matrix = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					matrix[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();

			matrix[a][b] = c;
			matrix[b][a] = c;
		}

		Map<Edge, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map.put(new Edge(i, j), 0);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					int cost = matrix[j][i] + matrix[i][k];
					boolean inf = matrix[j][k] == Integer.MAX_VALUE;
					if (cost < matrix[j][k]) {
						matrix[j][k] = cost;

						if (!inf) {
							Edge edge = new Edge(j, k);
							map.put(edge, map.get(edge) - 1);
						}

						for (Edge edge : new Edge[] { new Edge(j, i), new Edge(i, k) }) {
							map.put(edge, map.get(edge) + 1);
							map.put(edge, map.get(edge) + 1);
						}
					}
				}
			}
		}

		int count = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (map.get(new Edge(i, j)) > 0) {
					count++;
				}
			}
		}

		System.out.println(N - count);
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	public static class Edge {
		private final int from;
		private final int to;

		public Edge(int from, int to) {
			super();
			this.from = Math.min(from, to);
			this.to = Math.max(from, to);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + from;
			result = prime * result + to;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Edge other = (Edge) obj;
			if (from != other.from)
				return false;
			if (to != other.to)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "[" + from + "->" + to + "]";
		}
	}

	public static class Route {
		private int current;
		private int cost;

		public Route(int current, int cost) {
			super();
			this.current = current;
			this.cost = cost;
		}

		public int getCurrent() {
			return current;
		}

		public void setCurrent(int current) {
			this.current = current;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "{" + current + ", " + cost + "}";
		}
	}

	public static class Trace extends Route {
		private List<Edge> trace;

		public Trace(List<Edge> trace, int to, int cost) {
			super(to, cost);

			this.trace = new ArrayList<>(trace);
		}

		public Trace(List<Edge> trace, int from, int to, int cost) {
			super(to, cost);

			this.trace = new ArrayList<>(trace);
			this.trace.add(new Edge(from, to));
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

		public void fill(int[] a, int[] b, int[] c) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}
			if (a.length != c.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
				b[i] = nextInt();
				c[i] = nextInt();
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
