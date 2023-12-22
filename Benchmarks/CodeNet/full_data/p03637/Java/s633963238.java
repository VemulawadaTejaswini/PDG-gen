
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
		int numN = nextInt();
		int numM = nextInt();

		out.println((numN - 1) * (numM - 1));
	}

	private void solveB() {
		char[] wk = next().toCharArray();
		out.println("" + wk[0] + (wk.length - 2) + wk[wk.length - 1]);
	}

	private void solveC() {
		int numN = nextInt();

		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		int cnt4 = 0;
		int cnt2 = 0;
		for (int val : wk) {
			cnt4 += val % 4 == 0 ? 1 : 0;
			cnt2 += val == 2 ? 1 : 0;
		}

		if (cnt4 == 0 && (cnt2 % 2 != 0 || cnt2 == 0)) {
			out.println("No");
			return;
		}

		/*
		 * 組み合わせを考慮しなくてはいけない数
		 * 2-2の組は2*2=4となるので外す
		 *
		 * 1 2 2 4 1 4　の組を
		 * 2 2 1 4 1 4　とするために
		 *     1 4 1 4　で考える
		 *
		 * 1 2 2 4 1 4 2　の場合
		 * 2 1 4 1 4　として、4の倍数になるのか？と考える
		 */
		int targetCnt = numN - (cnt2 % 2 == 0 ? cnt2 : cnt2 - 1);

		if (targetCnt % 2 == 0) {
			out.println(cnt4 >= targetCnt / 2 ? "Yes" : "No");
		} else {
			out.println(cnt4 >= (targetCnt - 1) / 2 - 1 ? "Yes" : "No");
		}

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