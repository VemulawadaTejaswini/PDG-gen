
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.LongStream;
import java.util.stream.Stream;

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
		int a1 = nextInt();
		int a2 = nextInt();
		int a3 = nextInt();

		out.println((a1 + a2 + a3) > 21 ? "bust" : "win");
	}

	private void solveB() {
		char[] wk = next().toCharArray();
		int len = wk.length;
		int cnt = 0;
		for (int i = 0; i < len / 2; i++) {
			if (wk[i] != wk[len - 1 - i])
				cnt++;
		}

		out.println(cnt);
	}

	private void solveC() {
		int n = nextInt();
		Map<Integer, int[][]> inputMap = new HashMap<Integer, int[][]>();
		for (int i = 0; i < n; i++) {
			int a = nextInt();
			int[][] val = Stream.generate(() -> new int[] { nextInt() - 1, nextInt() }).limit(a).toArray(int[][]::new);
			inputMap.put(i, val);
		}

		long res = 0;

		for (int i = 1; i < (1 << n); i++) {

			int bit = i;
			int[] person = new int[n];
			Arrays.fill(person, 0);
			int honest = 0;
			int curr = 0;
			while (bit > 0) {
				if ((bit & 1) == 1) {
					person[curr] = 1;
					honest++;
				}
				curr++;
				bit >>= 1;
			}
			boolean isCorrect = true;

			bit = i;
			curr = 0;
			while (bit > 0) {
				if ((bit & 1) == 1) {
					int[][] wkPerson = inputMap.get(curr);
					//					if (wkPerson == null)
					//						out.println("curr / " + (curr + 1));
					for (int[] js : wkPerson) {
						int js1 = js[0];
						int js2 = js[1];
						if (person[js1] != js2) {
							isCorrect = false;
							break;
						}
					}
				}
				curr++;
				bit >>= 1;

				if (!isCorrect)
					break;
			}
			if (isCorrect)
				res = Math.max(res, honest);
		}

		out.println(res);
	}

	/*
	 * A0	3					0	0	0	1	1
	 * A1	1					0	0	0	0	1
	 * A2	4					0	0	1	0	0
	 * A3	1					0	0	0	0	1
	 * A4	5					0	0	1	0	1
	 * A5	9					0	1	0	0	1
	 * A6	2					0	0	0	1	0
	 * A7	6					0	0	1	1	0
	 * A8	5					0	0	1	0	1
	 * A9	3					0	0	0	1	1
	 *
	 * 各桁ごとの1の個数			0	1	4	4	7
	 * 各桁ごとの0の個数			0	9	6	6	3
	 *
	 * 累乗						4	3	2	1	0
	 *
	 * 1の個数×0の個数×2^累乗	0	72	96	48	21
	 *
	 * 合計										237
	 */
	private void solveD() {
		int n = nextInt();
		long[] a = LongStream.range(0, n).map(i -> nextLong()).toArray();
		long res = 0;
		final long CONST_MOD = (long) (Math.pow(10, 9) + 7);
		for (int i = 0; i < 60; i++) {

			long one = 0;
			long zero = 0;
			for (long l : a) {
				if (((l >> i) & 1) == 1)
					one++;
				else
					zero++;
			}
			long count = one * zero % CONST_MOD;
			res += (count * Math.pow(2, i) % CONST_MOD);
			res %= CONST_MOD;
		}

		out.println(res);
	}

	private void solveDTLE() {
		int n = nextInt();
		long[] a = LongStream.range(0, n).map(i -> nextLong()).toArray();
		long res = 0;
		final long CONST = (long) (Math.pow(10, 9) + 7);
		for (int i = 0; i < (n - 1); i++) {
			for (int j = i + 1; j < n; j++) {
				res += (a[i] ^ a[j]);
				res %= CONST;
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

	/*
	 * 階乗計算の最大値
	 * もっと大きいのが必要ならここを修正
	 */
	private final int FACTORIAL_NUM = 111111;
	/*
	 * 階乗の事前計算（mod 済）
	 */
	private long[] factorial = new long[FACTORIAL_NUM];
	/*
	 * 逆数の事前計算（mod 済）
	 */
	private long[] reverseFactorial = new long[FACTORIAL_NUM];
	private boolean isInitFactorial = false;

	/**
	 * 階乗計算の事前累積和
	 * [1, 1, 2, 3, 4, 5, … FACTORIAL_NUM]
	 * mod済
	 */
	private void initFactorial(long mod) {
		factorial[0] = 1;
		for (int i = 1; i < FACTORIAL_NUM; i++) {
			factorial[i] = (factorial[i - 1] * i) % mod;
		}
	}

	/**
	 * 逆数の事前計算
	 * もっと速い方法があったので修正
	 */
	private void initReverseFactorial(long mod) {

		reverseFactorial[FACTORIAL_NUM - 1] = modInverse(factorial[FACTORIAL_NUM - 1], mod);
		for (int i = FACTORIAL_NUM - 2; i >= 0; i++) {
			/*
			 * 以下を利用する。
			 * これにより毎回modInverseしなくてよくなる
			 * (N!)^(-1) * N -> ((N - 1)!)^(-1)
			 * (N-1!)^(-1) * N -> ((N - 2)!)^(-1)
			 */
			reverseFactorial[i] = (reverseFactorial[i + 1] * (i + 1)) % mod;
		}
		//		reverseFactorial[0] = 1;
		//		for (int i = 0; i < FACTORIAL_NUM; i++) {
		//			reverseFactorial[i] = modInverse(factorial[i], mod);
		//		}
	}

	/**
	 * フェルマーの小定理を用いて逆元を求める。
	 * ある数xのmod p（pは素数）の逆数x'はx' = x^(p-2)
	 * 繰り返し二乗法を用いて計算する。
	 * http://satanic0258.hatenablog.com/entry/2016/04/29/004730
	 * {@link BigInteger#modInverse(BigInteger)}とどちらが速いか？
	 * @param x
	 * @return
	 */
	private long modInverse(long x, long mod) {
		long res = 1L;
		long k = mod - 2L;
		long y = x;
		while (k != 0) {
			if (k % 2 != 0) {
				res = (res * y) % mod;
			}
			y = (y * y) % mod;
			k /= 2;
		}
		return res;
	}

	private void initFactorialCalc(long mod) {
		if (isInitFactorial) {
			//初期化済みならreturn
			return;
		}
		//階乗の事前計算
		initFactorial(mod);
		//逆数の計算もしておく
		initReverseFactorial(mod);
		isInitFactorial = true;
	}

	/**
	 * 組み合わせ
	 * nCk -> n! / k!・(n-k)!
	 * @param n
	 * @param k
	 * @param mod
	 * @return
	 */
	private long combination(int n, int k, long mod) {
		initFactorialCalc(mod);
		if (k < 0 || n < k) {
			return 0;
		}

		//分子の計算
		long calResN = factorial[n];

		//分母の計算
		long calResNK = reverseFactorial[n - k];
		long calcResK = reverseFactorial[k];
		long denominator = (calResNK * calcResK) % mod;

		return (calResN * denominator) % mod;

	}

	/**
	 * 順列
	 * nPk -> n! / (n-k)!
	 * @param n
	 * @param k
	 * @return
	 */
	private long permutation(int n, int k, long mod) {
		initFactorialCalc(mod);
		if (k < 0 || n < k) {
			return 0;
		}
		long calResN = factorial[n];
		long calResNK = reverseFactorial[n - k];
		return (calResN * calResNK) % mod;
	}

	/**
	 * 多項係数
	 * 文字aをp個,bをq個,cをr個, dをs個 あわせてn個を1列に並べるときの並べ方
	 * n! / p!・q!・r!・s!
	 * @param n
	 * @param strNum
	 * @param mod
	 * @return
	 */
	private long multinominalCoefficient(int n, List<Integer> strNum, int mod) {
		initFactorialCalc(mod);

		long calResN = factorial[n];
		long calResDenomi = 1;
		for (Integer num : strNum) {
			calResDenomi *= reverseFactorial[num];
		}
		return (calResN * calResDenomi) % mod;
	}

	/**
	 * 重複組合せ nHr （同次積）
	 * nHr = (n+r-1)Cr
	 * 異なるn個のものから重複を許してr個取る組合せの総数
	 * 例：
	 * リンゴ，ミカン，牛肉の3種類の果物があります．これらの中から6個の食材を買って帰ります．
	 * このとき，何通りの買い方がありますか？ただし，含まれない食材があってもよいものとします
	 * @param n
	 * @param r
	 * @param mod
	 * @return
	 */
	private long homogeneousProduct(int n, int r, long mod) {
		if (n == 0 && r == 0) {
			return 1;
		}
		return combination(n + r - 1, r, mod);
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