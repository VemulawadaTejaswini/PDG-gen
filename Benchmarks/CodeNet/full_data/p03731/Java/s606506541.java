
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
			solveC();
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
		String strA = next();
		String strB = next();
		String strC = next();

		out.println(strA.charAt(strA.length() - 1) == strB.charAt(0)
				&& strB.charAt(strB.length() - 1) == strC.charAt(0) ? "YES" : "NO");

		out.println("");
	}

	/**
	 *    3 5 0
	 * 1  3 5 3
	 * 2  6 5 1
	 * 3  9 5 4
	 * 4 12 5 2
	 * 5 15 5 0
	 * 6 18 5 3
	 * 7 21 5 1
	 * 8 24 5 4
	 * 9 27 5 2
	 *
	 * 余りには周期がある。
	 * 周期はBの数（割る数）分
	 * A*1 - A*B
	 * までmodを繰り返す。
	 */
	private void solveB() {
		int numA = nextInt();
		int numB = nextInt();
		int numC = nextInt();

		if (numA == 1) {
			out.println("YES");
			return;
		}
		boolean res = false;
		for (int i = 1; i <= numB; i++) {
			res = (i * numA) % numB == numC;
			if (res) {
				break;
			}
		}

		out.println(res ? "YES" : "NO");
	}

	private void solveC() {
		int numN = nextInt();
		int numT = nextInt();

		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();
		int[] dp = new int[numN];
		dp[0] = numT;
		for (int i = 1; i < wk.length; i++) {
			int j = wk[i];
			if (dp[i - 1] >= wk[i]) {
				dp[i] = wk[i] + numT;
			} else {
				dp[i] = dp[i - 1] + numT;
			}
		}

		out.println(dp[numN - 1]);
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