
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			//			solveB2();
			//			solveC();
			//			solveD();
			solveD2();
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
		int p = nextInt();
		int q = nextInt();
		int r = nextInt();

		out.println(Math.min(q + r, Math.min(p + q, p + r)));
	}

	private void solveB() {
		int n = nextInt();
		int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();
		//		int[] wk = IntStream.range(0, n).map(i -> nextInt()).sorted().toArray();

		int[] rui = new int[n];
		rui[0] = wk[0];
		for (int i = 1; i < rui.length; i++) {
			rui[i] = rui[i - 1] + wk[i];
		}
		long res = Integer.MAX_VALUE / 10;
		for (int i = 0; i < Math.min(100, n - 1); i++) {
			res = Math.min(res, Math.abs((rui[n - 1] - rui[i]) - rui[i]));
		}

		out.println(res);
	}

	private void solveB2() {
		int n = nextInt();
		int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();

		long res = Integer.MAX_VALUE / 10;
		for (int i = 1; i < n - 1; i++) {
			int sum1 = 0;
			int sum2 = 0;
			for (int j = 0; j < n; j++) {
				if (j <= i) {
					sum1 += wk[j];
				} else {
					sum2 += wk[j];
				}
			}
			res = Math.min(res, Math.abs(sum1 - sum2));
		}

		out.println(res);
	}

	private void solveC() {
		int n = nextInt();
		int m = nextInt();
		Set<Integer> key = new HashSet<Integer>();
		for (int i = 0; i < m; i++) {
			key.add(nextInt());
		}

		long[] dp = new long[n + 1];
		dp[0] = 1;
		long CONST_MOD = (long) (Math.pow(10, 9) + 7);
		for (int i = 0; i <= n; i++) {
			if (key.contains(i)) {
				continue;
			}
			if (i + 2 <= n) {
				dp[i + 2] = dp[i + 2] % CONST_MOD + dp[i] % CONST_MOD;
			}
			if (i + 1 <= n) {
				dp[i + 1] = dp[i + 1] % CONST_MOD + dp[i] % CONST_MOD;
			}
		}

		out.println(dp[n] % CONST_MOD);
	}

	private void solveD2() {
		int h = nextInt();
		int w = nextInt();
		char[][] wk = new char[h][w];
		for (int i = 0; i < wk.length; i++) {
			wk[i] = next().toCharArray();
		}
		int[][] rui1 = new int[h][w];
		for (int i = 0; i < h; i++) {
			int cnt = 0;
			for (int j = 0; j < w; j++) {
				if (wk[i][j] == '.') {
					cnt++;
				} else {
					cnt = 0;
				}
				rui1[i][j] = cnt;
			}
			for (int j = w - 1; j > 0; j--) {
				if (rui1[i][j - 1] != 0 && rui1[i][j] != 0) {
					rui1[i][j - 1] = rui1[i][j];
				}
			}
		}
		//		for (int i = h - 1; i >= 0; i--) {
		//			for (int j = w - 1; j > 0; j--) {
		//				if (rui1[i][j - 1] != 0 && rui1[i][j] != 0) {
		//					rui1[i][j - 1] = rui1[i][j];
		//				}
		//			}
		//		}
		int[][] rui2 = new int[h][w];
		for (int j = 0; j < w; j++) {
			int cnt = 0;
			for (int i = 0; i < h; i++) {
				if (wk[i][j] == '.') {
					cnt++;
				} else {
					cnt = 0;
				}
				rui2[i][j] = cnt;
			}
			for (int i = h - 1; i > 0; i--) {
				if (rui2[i - 1][j] != 0 && rui2[i][j] != 0) {
					rui2[i - 1][j] = rui2[i][j];
				}
			}
		}
		//		for (int j = w - 1; j >= 0; j--) {
		//			for (int i = h - 1; i > 0; i--) {
		//				if (rui2[i - 1][j] != 0 && rui2[i][j] != 0) {
		//					rui2[i - 1][j] = rui2[i][j];
		//				}
		//			}
		//		}
		long res = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				long cnt = rui1[i][j] + rui2[i][j] - 1;
				res = Math.max(res, cnt);
			}
		}

		out.println(res);
	}

	private void solveD() {
		int h = nextInt();
		int w = nextInt();
		char[][] wk = new char[h][w];
		for (int i = 0; i < wk.length; i++) {
			wk[i] = next().toCharArray();
		}
		int[][] rui1 = new int[h][w];
		for (int i = 0; i < h; i++) {
			int cnt = 0;
			for (int j = 0; j < w; j++) {
				if (wk[i][j] == '.') {
					cnt++;
				} else {
					cnt = 0;
				}
				rui1[i][j] = cnt;
			}
		}
		for (int i = h - 1; i >= 0; i--) {
			for (int j = w - 1; j > 0; j--) {
				if (rui1[i][j - 1] != 0 && rui1[i][j] != 0) {
					rui1[i][j - 1] = rui1[i][j];
				}
			}
		}
		int[][] rui2 = new int[h][w];
		for (int j = 0; j < w; j++) {
			int cnt = 0;
			for (int i = 0; i < h; i++) {
				if (wk[i][j] == '.') {
					cnt++;
				} else {
					cnt = 0;
				}
				rui2[i][j] = cnt;
			}
		}
		for (int j = w - 1; j >= 0; j--) {
			for (int i = h - 1; i > 0; i--) {
				if (rui2[i - 1][j] != 0 && rui2[i][j] != 0) {
					rui2[i - 1][j] = rui2[i][j];
				}
			}
		}
		long res = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				long cnt = rui1[i][j] + rui2[i][j] - 1;
				res = Math.max(res, cnt);
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