
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			solveA();
			//			 solveB();
			//			 solveC();
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

		long[][] rui = new long[2][n + 1];
		rui[0][0] = 1;

		int cnt = 1;
		for (char i = 0; i < wk.length; i++) {
			if (i != 0 && !wk[i - 1].equals(wk[i])) {
				cnt++;
			}
			rui[0][cnt] = Integer.parseInt(wk[i]);
			rui[1][cnt]++;
		}
		for (int i = 1; i <= cnt; i++) {
			rui[1][i] = rui[1][i] + rui[1][i - 1];
		}
		int left = 0;
		int right = 0;
		long res = 0;
		while (left < cnt) {
			int cntK = 0;
			while (right < cnt && cntK < k) {
				if (rui[0][right] == 0) {
					cntK++;
				}
				right++;
			}
			res = Long.max(res, rui[1][right] - rui[1][left]);
			cntK = 0;
			while (left < cnt && cntK < 1) {
				left++;
				if (rui[0][left] == 0) {
					cntK++;
				}
			}
			if (left == right) {
				right++;
			}
			k = 1;
		}

		out.println(res);
	}

	private void solveB() {
		int n = nextInt();

		out.println("");
	}

	private void solveC() {
		int n = nextInt();

		out.println("");
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