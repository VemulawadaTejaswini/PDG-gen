import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner(System.in);
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		assert solve(5, 1, 5, 2, 4);
		assert !solve(4, 7, 6, 4, 5);
		assert !solve(48792, 105960835, 681218449, 90629745, 90632170);
		assert solve(491995, 412925347, 825318103, 59999126, 59999339);

		int n = cin.nextInt();
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		int d = cin.nextInt();

		boolean ans = solve(n, a, b, c, d);
		if (ans)
			cout.println("YES");
		else
			cout.println("NO");
	}

	private static boolean solve(int n, int ia, int ib, int ic, int id) {
		long a = ia;
		long b = ib;
		long c = ic;
		long d = id;

		long dif = Math.abs(b - a);
		long rng = d - c;
		int moves = n - 1;
		int turns = moves / 2;
		for (int i = 0; i <= turns; i++) {
			long min = -rng * (turns - i) + c * i * 2;
			long max = +rng * (turns - i) + d * i * 2;
			if (moves % 2 == 1) {
				min += c;
				max += d;
			}
			if (min <= dif && dif <= max)
				return true;
		}
		return false;
	}

	static class FastScanner {
		private final InputStream in;
		private final byte[] buf = new byte[1 << 14];
		private int bufs = 0;
		private final long[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		private int ptr = 0;

		public FastScanner(InputStream in) {
			super();
			this.in = in;
		}

		boolean hasNext() {
			while (hasNextByte() && !isMeaningful(buf[ptr]))
				ptr++;
			return hasNextByte();
		}

		private boolean hasNextByte() {
			if (ptr < bufs)
				return true;
			ptr = 0;
			try {
				bufs = in.read(buf);
			} catch (IOException e) {
				throw new IllegalArgumentException(e);
			}
			if (bufs <= 0)
				return false;
			return true;
		}

		private static boolean isMeaningful(int b) {
			return 33 <= b && b <= 126;
			// return b != -1 && !Character.isWhitespace(b);
		}

		String next() {
			if (!hasNext())
				throw new IllegalArgumentException();
			StringBuilder sb = new StringBuilder();
			int b = read();
			while (isMeaningful(b)) {
				sb.appendCodePoint(b);
				b = read();
			}
			return sb.toString();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			long nl = nextLong();
			int ni = (int) nl;
			if (ni != nl)
				throw new IllegalArgumentException();
			return ni;
		}

		long nextLong() {
			if (!hasNext())
				throw new IllegalArgumentException();
			long n = 0;
			int plus = 1;
			int b = read();
			if (b == '-') {
				plus = -1;
				b = read();
			}
			if ('0' > b || b > '9')
				throw new java.lang.IllegalArgumentException();
			while (true) {
				if (!isMeaningful(b))
					return plus * n;
				n *= 10;
				n += num[b - '0'];
				b = read();
			}
		}

		private int read() {
			if (hasNextByte())
				return buf[ptr++];
			else
				return -1;
		}

	}
}
