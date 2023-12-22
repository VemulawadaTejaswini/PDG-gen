
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
			//			solveD();
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
		int numN = nextInt();
		int numK = nextInt();

		long res = 0;

		for (int i = 1; i <= numN - numK + 1; i++) {
			long k = numK - 1;
			long n = i + numK - 1;
			long up = 1;
			for (long j = n; j > n - k; j--) {
				up *= i;
			}
			long down = 1;
			for (long j = k; j > 0; j--) {
				down *= i;
			}
			if (down == 0) {
				down = 1;
			}
			res += up / down;
		}

		out.println(res);
	}

	private void solveB() {
		int r = nextInt();
		int g = nextInt();
		int b = nextInt();
		int n = nextInt();

		long res = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				int wk = i * r + j * g;
				if ((n - wk) == 0 || ((n - wk) >= b && (n - wk) % b == 0)) {
					res++;
				}
			}
		}

		out.println(res);
	}

	private void solveC() {
		int numN = nextInt();
		String[] wk = new String[numN];
		long res = 0;
		int patternA = 0;
		int patternB = 0;
		int patternC = 0;
		for (int i = 0; i < wk.length; i++) {
			wk[i] = next();
			if (wk[i].charAt(0) == 'B' && wk[i].charAt(wk[i].length() - 1) == 'A') {
				patternA++;
			} else if (wk[i].charAt(0) == 'B' && wk[i].charAt(wk[i].length() - 1) != 'A') {
				patternB++;
			} else if (wk[i].charAt(0) != 'B' && wk[i].charAt(wk[i].length() - 1) == 'A') {
				patternC++;
			}
			String[] resA = wk[i].split("AB");
			res += resA.length - 1;
		}

		int max = Integer.max(Integer.max(patternA, patternB), patternC) + 1;
		long[][][] memo = new long[max][max][max];
		res += saikiC(patternA, patternB, patternC, memo);
		out.println(res);
	}

	private long saikiC(int a, int b, int c, long[][][] memo) {

		if (a <= 0 && (b <= 0 || c <= 0)) {
			return 0;
		} else if (b <= 0 && a <= 0 && c <= 0) {
			return 0;
		}
		if (memo[a][b][c] != 0) {
			return memo[a][b][c];
		}
		long val1 = 0;
		long val3 = 0;
		if (a > 0) {
			val1 = saikiC(a - 1, b, c, memo) + 1;
		}
		if (b > 0 && c > 0) {
			val3 = saikiC(a, b - 1, c - 1, memo) + 1;
		}

		return memo[a][b][c] = Long.max(val1, val3);
	}

	private void solveD() {
		String numN = next();
		long res = 0;

		List<Long> primeList = new ArrayList<Long>();
		primeList.add(2L);
		for (long i = 2; i <= Long.parseLong(numN); i += 2) {
			boolean flg = true;
			for (long j = 2; j < i; j++) {
				if (i % j == 0) {
					flg = false;
					break;
				}
			}
			if (flg) {
				primeList.add(i);
			}
		}

		BigInteger big = new BigInteger(numN);
		for (Long long1 : primeList) {
			System.out.println(big.modInverse(new BigInteger(Long.toString(long1))));
		}
		//		for (int i = 1; i < numN; i++) {
		//			if (numN / i == numN % i) {
		//				res += i;
		//			}
		//		}

		out.println(res);
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