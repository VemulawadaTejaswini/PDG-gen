import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
    // template start ---8<-----------8<---
	FastScanner sc = new FastScanner(System.in);
	static PrintWriter out;

	public static void main(String[] args) throws IOException {
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}
	// template end ---8<-----------8<---

	void solve() {
		int X = sc.nextInt();
		boolean[] expo = new boolean[X+1];

		expo[1] = true;
		for (int b=2;b<=X;b++) {
			int v = b*b;
			while(v<=X) {
				expo[v] = true;
				v *= b;
			}
		}
		for (int i=X; i>=0;i--){
			if (expo[i]) {
				out.println(i);
				return;
			}
		}



	}

    // template start ---8<-----------8<---
	class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		FastScanner(InputStream in) {
			this.in = in;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	class Random {
		private long seed;
		private final long multiplier = 0x5DEECE66DL, addend = 0xBL, mask = (1L << 48) - 1;
		int bits, val;

		Random(long seed) {
			this.seed = seed;
		}

		int nextInt(int n) {
			do {
				bits = (int) ((seed = (seed * multiplier + addend) & mask) >>> 17);
				val = bits % n;
			} while (bits - val + (n - 1) < 0);
			return val;
		}

		double nextDouble() {
			return nextInt(10000000) / 10000000.0;
		}
	}

	final double TEMP = 10;
	static final long TL = 5850;
	static boolean submit = true;
    // template end ---8<-----------8<---

}

