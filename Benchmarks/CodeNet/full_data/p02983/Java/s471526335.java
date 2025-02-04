import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static FastReader input = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {

		int l = input.nextInt();
		int r = input.nextInt();
		int min = Integer.MAX_VALUE;

		for (int x = 1; true; x++) {
			long y = x * 2019;
			if (y >= l && y <= r) {
				min = 0;
				break;
			}
			if (y >= Integer.MAX_VALUE)
				break;
		}

		if (min != 0) {
			for (int i = l; i < r; i++) {
				for (int j = i + 1; j <= r; j++) {
					min = Math.min(min, (i * j) % 2019);
				}
			}
		}

		out.println(min);

		out.flush();
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		String nextLine() throws IOException {
			String str = "";
			str = br.readLine();
			return str;
		}
	}

	static class con {
		static int IINF = (int) 1e9;
		static int _IINF = (int) -1e9;
		static long LINF = (long) 1e15;
		static long _LINF = (long) -1e15;
		static double EPS = 1e-9;
	}

	static class Triple implements Comparable<Triple> {
		int x;
		int y;
		int z;

		Triple(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		@Override
		public int compareTo(Triple o) {
			if (x == o.x && y == o.y)
				return z - o.z;
			if (x == o.x)
				return y - o.y;
			return x - o.x;
		}
	}

	static class Pair implements Comparable<Pair> {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;

		}

		@Override
		public int compareTo(Pair o) {
			if (x == o.x)
				return y - o.y;
			return x - o.x;
		}
	}

	static void shuffle(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int r = i + (int) (Math.random() * (a.length - i));
			int tmp = a[r];
			a[r] = a[i];
			a[i] = tmp;
		}
	}

}