
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
		int numA = nextInt();
		int numB = nextInt();

		if (numA % 3 == 0 || numB % 3 == 0 || (numA + numB) % 3 == 0) {
			out.println("Possible");
		} else {
			out.println("Impossible");
		}

	}

	private void solveB() {
		int numN = nextInt();
		int numK = nextInt();

		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		Arrays.sort(wk);

		int res = IntStream.range(0, numN).filter(i -> i >= numN - numK).reduce(0, (sum, i) -> {
			sum += wk[i];
			return sum;
		});

		out.println(res);
	}

	private void solveC() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		Arrays.sort(wk);

		if (wk.length == 2) {
			out.println(Math.abs(wk[0] - wk[1]));
		} else {
			out.println(saikiC(wk, 0, 0, 0, 0, 0));
		}
	}

	private int saikiC(int[] wk, int currentI, int sunuke, int raccoon, int sunukeCnt, int raccoonCnt) {
		if (currentI > wk.length - 1) {
			if (sunukeCnt == 0 || raccoonCnt == 0) {
				return Integer.MAX_VALUE;
			} else {
				return Math.abs(sunuke - raccoon);
			}
		}

		//今回のはすぬけ
		int val1 = saikiC(wk, currentI + 1, sunuke + wk[currentI], raccoon, sunukeCnt + 1, raccoonCnt);

		//今回のはあらいぐま
		int val2 = saikiC(wk, currentI + 1, sunuke, raccoon + wk[currentI], sunukeCnt, raccoonCnt + 1);

		return Math.min(val1, val2);
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