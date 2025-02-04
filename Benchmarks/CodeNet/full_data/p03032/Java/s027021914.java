
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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

		out.println((nextInt() * 3 + nextInt()) / 2);
	}

	private void solveB() {
		int n = nextInt();
		String[][] s = new String[n][3];

		for (int i = 0; i < n; i++) {
			s[i][0] = next();
			s[i][1] = next();
			s[i][2] = Integer.toString(i + 1);
		}
		Arrays.sort(s,
				(x, y) -> {
					if (x[0].compareTo(y[0]) < 0) {
						return -1;
					} else if (x[0].compareTo(y[0]) > 0) {
						return 1;
					} else {
						return -Integer.compare(Integer.parseInt(x[1]), Integer.parseInt(y[1]));
					}
				});

		for (int i = 0; i < s.length; i++) {
			out.println(s[i][2]);
		}
	}

	private void solveC() {
		int n = nextInt();
		int m = nextInt();
		int[] k = new int[m];

		List<List<Integer>> s = new ArrayList<List<Integer>>();
		for (int i = 0; i < k.length; i++) {
			k[i] = nextInt();
			List<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < k[i]; j++) {
				temp.add(nextInt());
			}
			s.add(temp);
		}
		int[] p = IntStream.range(0, m).map(i -> nextInt()).toArray();

		long res = 0;
		for (int i = 0; i < 1 << n; i++) {
			boolean isResult = true;
			for (int j = 0; j < m; j++) {
				List<Integer> sList = s.get(j);
				int compareBase = p[j];
				int compare = 0;
				for (Integer buttonNum : sList) {
					if ((i & (1 << (buttonNum - 1))) >= 1) {
						compare++;
					}
				}
				if (compareBase != compare % 2) {
					isResult = false;
					break;
				}
			}
			if (isResult) {
				res++;
			}

		}

		out.println(res);
	}

	private void solveD() {
		int n = nextInt();
		int k = nextInt();
		int[] wk = new int[n];
		for (int i = 0; i < n; i++) {
			wk[i] = nextInt();
		}
		long res = 0;
		for (int l = 0; l < k; l++) {
			for (int r = 0; r < k - l; r++) {
				if (l + r > k) {
					continue;
				}

				int d = k - l - r;
				int now = 0;
				List<Integer> s = new ArrayList<Integer>();
				for (int i = 0; i < l; i++) {
					now += wk[i];
					s.add(wk[i]);
				}
				for (int i = n - r; i < n; i++) {
					now += wk[i];
					s.add(wk[i]);
				}
				Collections.sort(s);
				for (int i = 0; i < d; i++) {
					if (i >= s.size()) {
						break;
					}
					if (s.get(i) > 0) {
						break;
					}
					now -= s.get(i);
				}
				res = Long.max(res, now);
			}
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