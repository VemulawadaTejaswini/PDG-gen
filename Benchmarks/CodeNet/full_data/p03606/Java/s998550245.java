
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			solveB();
			//			solveC();
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

		while (numN != 0) {
			int wk = numN % 10;
			if (wk == 9) {
				out.println("Yes");
				return;
			}
			numN /= 10;
		}

		out.println("No");
	}

	/*
	 * Streamですべてを組み立てたみた
	 */
	private void solveB() {
		int numN = nextInt();

		int[][] wk = Stream.generate(() -> new int[] { nextInt(), nextInt() }).limit(numN).toArray(int[][]::new);
		//		int[][] wk = IntStream.range(0, numN).collect(() -> new int[numN][2], (t, i) -> {
		//			t[i][0] = nextInt();
		//			t[i][1] = nextInt();
		//		}, (t, u) -> {
		//			Stream.concat(Arrays.stream(t), Arrays.stream(u)).toArray(int[][]::new);
		//		});

		int res = Arrays.stream(wk).mapToInt(i -> (i[1] - i[0]) + 1).sum();

		out.println(res);
	}

	private void solveC() {
		int numN = nextInt();

		Set<Long> wkSet = new HashSet<Long>();
		for (int i = 0; i < numN; i++) {
			long key = nextLong();
			if (wkSet.contains(key)) {
				wkSet.remove(key);
			} else {
				wkSet.add(key);
			}
		}

		out.println(wkSet.size());
	}

	private void solveC2() {
		int numN = nextInt();
		long[] wk = LongStream.range(0, numN).map(i -> nextLong()).toArray();

		Set<Long> wkSet = new HashSet<Long>();
		for (long l : wk) {
			if (wkSet.contains(l)) {
				wkSet.remove(l);
			} else {
				wkSet.add(l);
			}
		}

		out.println(wkSet.size());
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