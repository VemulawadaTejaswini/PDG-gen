
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	/**
	 * @throws IOException
	 */
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
		int numA = nextInt();
		int numB = nextInt();
		int numC = nextInt();

		if (numA + numB == numC || numB + numC == numA || numA + numC == numB) {
			out.println("Yes");
		} else {
			out.println("No");
		}
	}

	private void solveB() {
		int numW = nextInt();
		int numH = nextInt();
		int numN = nextInt();

		int[][] wk = Stream.generate(() -> new int[] { nextInt(), nextInt(), nextInt() }).limit(numN)
				.toArray(int[][]::new);
		//		int[][] wk = IntStream.range(0, numN).collect(() -> new int[numN][3],
		//				(t, i) -> {
		//					t[i][0] = nextInt();
		//					t[i][1] = nextInt();
		//					t[i][2] = nextInt();
		//				},
		//				(t, u) -> {
		//					Stream.concat(Arrays.stream(t), Arrays.stream(u));
		//				});

		final int[][] area = new int[][] { { 0, 0 }, { numW, numH } };

		for (int[] js : wk) {
			switch (js[2]) {
			case 1:
				if (area[0][0] < js[0]) {
					area[0][0] = js[0];
				}
				break;
			case 2:
				if (area[1][0] > js[0]) {
					area[1][0] = js[0];
				}
				break;
			case 3:
				if (area[0][1] < js[1]) {
					area[0][1] = js[1];
				}
				break;
			case 4:
				if (area[1][1] > js[1]) {
					area[1][1] = js[1];
				}
				break;

			default:
				break;
			}

		}

		/*
		 * 計算していった結果、(起点x,起点y),(終点x,終点y)の位置が逆転しているときがある
		 * 入力値例：
		 * 5 4 2
		 * 3 1 1
		 * 2 1 3
		 */
		int x = area[1][0] - area[0][0] > 0 ? area[1][0] - area[0][0] : 0;
		int y = area[1][1] - area[0][1] > 0 ? area[1][1] - area[0][1] : 0;
		int res = x * y;
		out.println(res);
	}

	private void solveC() {
		char[] board = next().toCharArray();

		long count = 0;
		/*
		 * WとBのギャップ区間のみ数えればよい
		 */
		for (int i = 1; i < board.length; i++) {
			if (board[i] != board[i - 1]) {
				count++;
			}
		}

		out.println(count);
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