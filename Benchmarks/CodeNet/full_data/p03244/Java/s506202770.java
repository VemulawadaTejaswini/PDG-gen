
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			 solveB();
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

		out.println("");
	}

	private void solveB() {
		int numN = nextInt();

		out.println("");
	}

	private void solveC() {

		int num = 0;

		num = nextInt();

		final Map<Integer, Integer> wk = IntStream.range(0, num).map(i -> nextInt()).collect(HashMap::new,
				(t, i) -> {
					t.merge(i, 1, (oldV, newV) -> oldV + newV);
				}, (t, u) -> t.putAll(t));

		int cnt = 0;
		int[][] resA = new int[wk.size()][2];
		for (Entry<Integer, Integer> entry : wk.entrySet()) {
			resA[cnt][0] = entry.getKey();
			resA[cnt][1] = entry.getValue();
			cnt++;
		}

		Arrays.sort(resA, (x, y) -> {
			if (x[0] < y[0]) {
				return -1;
			} else if (x[0] > y[0]) {
				return 1;
			} else {
				if (x[1] < y[1]) {
					return -1;
				} else if (x[1] > y[1]) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		int sum = 0;
		if (resA.length == 1) {
			sum += resA[0][1] / 2;
		} else {
			for (int j = 0; j < resA.length - 2; j++) {
				sum += resA[j][1];
			}
		}
		System.out.println(sum);
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