import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		task.solve();
	}

	public static class Task {
		static final long MOD = (long) 1e9 + 7;

		public void solve() {
			Scan sc = new Scan();
			int n = (int) sc.scanLong();
			int m = (int) sc.scanLong();
			char[][] res = new char[m][12];
			Integer[] ids = new Integer[m];
			Pair[] pairs = new Pair[m];
			for (int i = 0; i < m; ++i) {
				Arrays.fill(res[i], '0');
				ids[i] = i;
				pairs[i] = new Pair((int) sc.scanLong(), (int) sc.scanLong());
			}
			Arrays.sort(ids, new Comparator<Integer>() {
				@Override
				public int compare(Integer a, Integer b) {
					return pairs[a].compareTo(pairs[b]);
				}
			});
			int prev = -1;
			int pos = -1;
			for (int i = 0; i < m; ++i) {
				Pair curr = pairs[ids[i]];
				if (curr.a != prev) {
					pos = 1;
				} else
					++pos;
				int cpy = pos;
				for (int j = 11; j >= 6; --j) {
					res[ids[i]][j] = Character.forDigit(cpy % 10, 10);
					cpy /= 10;
				}
				cpy = curr.a;
				for (int j = 5; j >= 0; --j) {
					res[ids[i]][j] = Character.forDigit(cpy % 10, 10);
					cpy /= 10;
				}
				prev = curr.a;
			}
			for (int i = 0; i < m; ++i) {
				System.out.println(res[i]);
			}
		}

		public class Pair implements Comparable<Pair> {
			int a, b;

			public Pair(int a, int b) {
				this.a = a;
				this.b = b;
			}

			public String toString() {
				return a + " " + b;
			}

			@Override
			public int compareTo(Pair o) {
				if (this.a < o.a)
					return -1;
				if (this.a > o.a)
					return 1;
				if (this.b < o.b)
					return -1;
				if (this.b > o.b)
					return 1;
				return 0;
			}
		}
	}

	public static class Scan {
		private byte[] buf = new byte[1024];
		private int index;
		private InputStream in;
		private int total;

		public Scan() {
			in = System.in;
		}

		public int scan() {
			if (total < 0)
				throw new InputMismatchException();
			if (index >= total) {
				index = 0;
				try {
					total = in.read(buf);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				if (total <= 0)
					return -1;
			}
			return buf[index++];
		}

		public long scanLong() {
			long integer = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)) {
				if (n >= '0' && n <= '9') {
					integer *= 10;
					integer += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			return neg * integer;
		}

		public double scanDouble() throws IOException {
			double doub = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n) && n != '.') {
				if (n >= '0' && n <= '9') {
					doub *= 10;
					doub += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			if (n == '.') {
				n = scan();
				double temp = 1;
				while (!isWhiteSpace(n)) {
					if (n >= '0' && n <= '9') {
						temp /= 10;
						doub += (n - '0') * temp;
						n = scan();
					} else
						throw new InputMismatchException();
				}
			}
			return doub * neg;
		}

		public String scanString() {
			StringBuilder sb = new StringBuilder();
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			while (!isWhiteSpace(n)) {
				sb.append((char) n);
				n = scan();
			}
			return sb.toString();
		}

		public char scanChar() {
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			return (char) n;
		}

		private boolean isWhiteSpace(int n) {
			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
				return true;
			return false;
		}
	}
}
