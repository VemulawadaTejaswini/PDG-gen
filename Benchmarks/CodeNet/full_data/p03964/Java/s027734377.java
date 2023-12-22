
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

		Map<Integer, Integer> wk = IntStream.range(0, 3).collect(() -> new HashMap<Integer, Integer>(),
				(t, i) -> {
					t.merge(nextInt(), 1, (oldV, newV) -> oldV + newV);
				},
				(t, u) -> {
					t.putAll(u);
				});

		out.println(wk.size());
	}

	/*
	 * 10個 8色
	 *  8 7(8-1：隣の色を抜く) 7(8-1：隣の色を抜く)  7(8-1：隣の色を抜く) 7(8-1：隣の色を抜く) 7(8-1：隣の色を抜く) ・・・・
	 */
	private void solveB() {
		long numN = nextLong();
		long numK = nextLong();

		long res = (long) numK * (long) Math.pow(numK - 1, numN - 1);

		out.println(res);
	}

	/*
	 * 床関数 x 以下の最大整数を表す
	 * 天井関数
	 */
	private void solveC() {
		int numN = nextInt();

		long[][] wk = IntStream.range(0, numN).collect(() -> new long[numN][2],
				(t, i) -> {
					t[i][0] = nextLong();
					t[i][1] = nextLong();
				}, (t, u) -> {
					Stream.concat(Arrays.stream(t), Arrays.stream(u));
				});

		/*
		 * 得票数を保持する配列
		 */
		long[][] memo = new long[numN][2];
		/*
		 * 最初の値はそのまま得票数
		 */
		memo[0][0] = wk[0][0];
		memo[0][1] = wk[0][1];
		chkC(wk, memo, 1);

		out.println(memo[numN - 1][0] + memo[numN - 1][1]);
	}

	private void chkC(long[][] wk, long[][] memo, int currentI) {

		if (currentI >= wk.length) {
			return;
		}

		/*
		 * 今回の比率
		 */
		long x = wk[currentI][0];
		long y = wk[currentI][1];

		/*
		 * 前回の得票数
		 */
		long a = memo[currentI - 1][0];
		long b = memo[currentI - 1][1];

		/*
		 * 前回の得票数A <= n * 今回の比率A
		 * 前回の得票数B <= n * 今回の比率B
		 * 上記を満たす最小のn（ただし整数）を求める
		 *
		 * 式としては下記
		 * 前回の得票数A / 今回の比率A <= n
		 * 前回の得票数B / 今回の比率B <= n
		 * 普通に割ると小数が出てしまうのでBigDecimalでRoundUpしている
		 */
		long p13 = new BigDecimal(a).divide(new BigDecimal(x), RoundingMode.UP).longValue();
		long p24 = new BigDecimal(b).divide(new BigDecimal(y), RoundingMode.UP).longValue();

		/*
		 * nを求める
		 * 小さい方のnだと片側の条件を満たさないため、大きい方
		 */
		long base = Math.max(p13, p24);

		/*
		 * nを求めたので今回の投票数が決まる
		 */
		memo[currentI][0] = base * x;
		memo[currentI][1] = base * y;

		chkC(wk, memo, currentI + 1);
	}

	private long maxKoubai(long v1, long v2) {
		return (v1 * v2) / minKouyaku(v1, v2);
	}

	private long minKouyaku(long v1, long v2) {
		long w1 = Math.min(v1, v2);
		long w2 = Math.max(v1, v2);

		long amari = w2 % w1;
		while (w1 != 0) {
			if (amari == 0) {
				break;
			}
			w2 = w1;
			w1 = amari;
			amari = w2 % w1;
		}
		return w1;
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