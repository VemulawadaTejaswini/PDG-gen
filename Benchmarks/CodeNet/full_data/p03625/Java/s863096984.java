
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
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
		int numX = nextInt();
		int numA = nextInt();
		int numB = nextInt();

		if (Math.abs(numX - numA) > Math.abs(numX - numB)) {
			out.println("B");
		} else {
			out.println("A");
		}

	}

	/*
	 * テストケースの値が大きすぎてchar[]への変換で失敗・・・
	 */
	private void solveB() {

		Set<Character> wk = IntStream.range('a', 'z' + 1).collect(() -> new TreeSet<Character>(),
				(t, i) -> t.add(new Character((char) i)),
				(t, u) -> t.addAll(t));

		char[] wkA = next().toCharArray();

		for (int j = 0; j < wkA.length; j++) {
			wk.remove(wkA[j]);
		}

		Character[] res = wk.stream().toArray(Character[]::new);

		if (res.length == 0) {
			out.println("None");
		} else {
			out.println(res[0]);
		}
	}

	private void solveC() {
		int numN = nextInt();

		Map<Integer, Integer> wk = IntStream.range(0, numN).map(i -> nextInt())
				.collect(() -> new HashMap<Integer, Integer>(), (t, i) -> {
					t.merge(i, 1, (oldV, newV) -> oldV + newV);
				}, (t, u) -> t.putAll(u));

		List<int[]> operatedWk = wk.entrySet().stream().filter(e -> e.getValue() > 1).collect(
				() -> new ArrayList<int[]>(),
				(t, i) -> {
					t.add(new int[] { i.getKey(), i.getValue() });
				},
				(t, u) -> {
					t.addAll(u);
				});

		Collections.sort(operatedWk, (x, y) -> Long.compare(x[0], y[0]));

		long radX = 0;
		long radY = 0;

		for (int j = operatedWk.size() - 1; j >= 0; j--) {
			for (int k = 0; k < 2; k++) {
				long radTmp = 0;
				if (operatedWk.get(j)[1] >= 2) {
					operatedWk.get(j)[1] = operatedWk.get(j)[1] - 2;
					radTmp = operatedWk.get(j)[0];
				}
				if (radX == 0) {
					radX = radTmp;
					radTmp = 0;
				}
				if (radY == 0) {
					radY = radTmp;
					radTmp = 0;
				}
			}

			if (radX > 0 && radY > 0) {
				break;
			}
		}

		out.println(radX * radY);
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