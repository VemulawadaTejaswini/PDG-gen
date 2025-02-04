
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			solveB2();
			//			solveC();
			// solveD();
			// solveE();
			// solveF();
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
		StringBuilder builder = new StringBuilder();
		IntStream.range(0, 3).forEach(i -> builder.append(next().charAt(0)));
		out.println(builder.toString().toUpperCase());
	}

	private void solveB() {
		BigDecimal v1 = new BigDecimal(next());
		BigDecimal v2 = new BigDecimal(next());

		switch (v1.compareTo(v2)) {
		case -1:
			out.println("LESS");
			break;
		case 0:
			out.println("EQUAL");
			break;
		case 1:
			out.println("GREATER");
			break;
		}

	}

	private void solveB2() {
		String v1 = next();
		String v2 = next();

		int res = -9;
		if (v1.length() > v2.length()) {
			res = 1;
		} else if (v1.length() < v2.length()) {
			res = -1;
		} else {
			for (int i = 0; i < v1.length(); i++) {
				if (v1.charAt(i) > v2.charAt(i)) {
					res = 1;
					break;
				} else if (v1.charAt(i) < v2.charAt(i)) {
					res = -1;
					break;
				}
			}
		}

		if (res == -9) {
			res = -1;
		}

		switch (res) {
		case -1:
			out.println("LESS");
			break;
		case 0:
			out.println("EQUAL");
			break;
		case 1:
			out.println("GREATER");
			break;
		}
	}

	private void solveC() {
		int numN = nextInt();

		out.println("");
	}

	private void solveD() {
		int numN = nextInt();

		out.println("");
	}

	private void solveE() {
		int numN = nextInt();

		out.println("");
	}

	private void solveF() {
		int numN = nextInt();

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