
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			solveC();
			//			 solveD();
			//			 solveE();
			//			 solveF();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}

	private void solveA() {
		int n = nextInt();
		int k = nextInt();
		String[] wk = next().split("");
		wk[k - 1] = wk[k - 1].toLowerCase();

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < wk.length; i++) {
			builder.append(wk[i]);
		}

		out.println(builder.toString());
	}

	private void solveB() {
		int wk = nextInt();

		int front = wk / 100;
		int back = wk % 100;

		if ((0 < front && front <= 12) && (back <= 0 || back > 12)) {
			out.println("MMYY");
		} else if ((0 < back && back <= 12) && (front <= 0 || front > 12)) {
			out.println("YYMM");
		} else if ((0 < front && front <= 12) && (0 < back && back <= 12)) {
			out.println("AMBIGUOUS");
		} else {
			out.println("NA");
		}

	}

	private void solveC() {
		int n = nextInt();
		int k = nextInt();

		BigDecimal res = new BigDecimal("0");
		for (int i = 1; i <= n; i++) {
			int pow = recursiveC(i, k);
			BigDecimal powB = new BigDecimal("0.5").pow(pow);
			res = res.add(powB);
		}

		out.println(res.divide(new BigDecimal(n), 11, RoundingMode.HALF_UP));
	}

	private int recursiveC(int i, int n) {
		if (i >= n) {
			return 0;
		}
		return recursiveC(i * 2, n) + 1;
	}

	private void solveD() {
		int n = nextInt();

		out.println("");
	}

	private void solveE() {
		int n = nextInt();

		out.println("");
	}

	private void solveF() {
		int n = nextInt();

		out.println("");
	}

	private final PrintWriter out = new PrintWriter(System.out);
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

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

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		return Integer.parseInt(next());
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
}