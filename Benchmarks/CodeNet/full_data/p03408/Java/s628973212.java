
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			//			solveC();
			solveD();
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
		long count = Arrays.stream(next().split("")).filter(i -> i.equals("o")).count();
		out.println(700 + count * 100);
	}

	private void solveB() {
		String wk = "";
		for (int i = 0; i < 3; i++) {
			String tmp = next();
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					wk += tmp.charAt(j);
				}
			}
		}

		out.println(wk);
	}

	private void solveC() {
		int n = nextInt();
		int m = nextInt();
		int x = nextInt();
		int[] wk = IntStream.range(0, m).map(i -> nextInt()).toArray();
		int[] rui = new int[n + 1];
		for (int i : wk) {
			rui[i] = 1;
		}
		for (int i = 1; i < rui.length; i++) {
			rui[i] = rui[i] + rui[i - 1];
		}

		out.println(Integer.min(rui[x] - rui[0], rui[n] - rui[x]));
	}

	private void solveD() {
		int n = nextInt();
		String[] s = IntStream.range(0, n).mapToObj(i -> next()).toArray(String[]::new);
		Map<String, Long> sM = Arrays.stream(s).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		int m = nextInt();
		String[] t = IntStream.range(0, m).mapToObj(i -> next()).toArray(String[]::new);
		Map<String, Long> tM = Arrays.stream(t).collect(Collectors.groupingBy(i -> i, Collectors.counting()));

		long res = 0;
		for (Entry<String, Long> entry : sM.entrySet()) {
			res = Long.max(res, entry.getValue() - tM.getOrDefault(entry.getKey(), 0L));
		}

		out.println(res);
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