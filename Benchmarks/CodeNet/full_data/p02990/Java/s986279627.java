
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			int n = nextInt();
			//			int k = nextInt();
			//			long res = combination((n - 1) + (k - 1), (k - 1), 1_000_000_007);
			//			out.println(res);
			//			solveA();
			//			solveB();
			//			solveC();
			solveD();
			//			solveE();
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
		String[] a = next().split("");

		Map<String, Long> memo = Arrays.stream(a).collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		for (long elm : memo.values()) {
			if (elm != 2) {
				out.println("No");
				return;
			}
		}
		out.println("Yes");
	}

	private void solveB() {
		int n = nextInt();
		int[] p = IntStream.range(0, n).map(i -> nextInt()).toArray();

		int res = 0;
		for (int i = 0; i < p.length - 2; i++) {
			if ((p[i] < p[i + 1] && p[i + 1] < p[i + 2]) || (p[i + 2] < p[i + 1] && p[i + 1] < p[i])) {
				res++;
			}
		}

		out.println(res);
	}

	private void solveC() {
		int n = nextInt();
		int[] d = IntStream.range(0, n).map(i -> nextInt()).sorted().toArray();

		out.println(d[n / 2] - d[n / 2 - 1]);
	}

	/**
	 * http://www.geisya.or.jp/~mwm48961/kou2/s1combi5.htm
	 * https://mathtrain.jp/tyohukuc
	 */
	private void solveD() {
		int n = nextInt();
		int k = nextInt();
		int blue = k;
		int red = n - k;

		final long CONST_MOD = (long) (Math.pow(10, 9) + 7);
		/*
		 * blue:k個をiグループに分ける(全グループ1以上)
		 *
		 * red:(n-k)個をいくつかのグループに分ける(全グループ1以上)
		 * グループの数は以下のパターン
		 * １：　　青　赤　青　　　->　青のグループ-1 (i-1)
		 * ２：赤　青　赤　青　　　->　青のグループと同数 (i)
		 * ３：　　青　赤　青　赤　->　青のグループと同数 (i)
		 * ４：赤　青　赤　青　赤　->　青のグループ+1 (i+1)
		 *
		 */

		// 4個:2仕切り
		for (int i = 1; i <= k; i++) {
			//blue-1 C i-1  => 青k個をi個のグループに分ける => 青k-1個の間に、i-1個の仕切りを入れる
			long blueG = 0;
			blueG = combination(blue - 1, i - 1, CONST_MOD);
			long redG = 0;
			redG += combination(red + 1, i, CONST_MOD);
			long res = blueG * redG;
			out.println(res);
		}

	}

	private void solveE() {
		int n = nextInt();
		int m = nextInt();
		List<List<Integer>> adj = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			int from = nextInt() - 1;
			int to = nextInt() - 1;
			adj.get(from).add(to);
		}

		int s = nextInt();
		int t = nextInt();

		// 入次数が0のものを判定するための配列
		int indegree[] = new int[n];
		// 入次数0を判定
		for (int i = 0; i < n; i++) {
			List<Integer> temp = adj.get(i);
			//iをfromとするnode達
			for (int node : temp) {
				//入次数の個数
				indegree[node]++;
			}
		}

		/*
		 * queueの作成
		 * 入次数0のものをqueueに詰める
		 * 入次数0から調査していく
		 */
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		//		for (int i = 0; i < n; i++) {
		//			if (indegree[i] == 0) {
		//				q.addLast(i);
		//			}
		//		}
		q.addLast(s);
		//訪問済み頂点数
		int cnt = 0;

		// トポロジカルソートの結果
		List<Integer> res = new ArrayList<Integer>();

		/*
		 * BFS
		 */
		while (!q.isEmpty()) {
			// 接続先の頂点を探索開始
			int u = q.removeFirst();
			//入次数0なのでリザルトにadd
			res.add(u);

			/*
			 * この頂点の次の接続先の入次数を-する
			 * その結果、入次数=0となる場合はソートリザルトに追加し、次の探索に利用する
			 */
			for (int node : adj.get(u)) {

				indegree[node]--;
				if (indegree[node] == 0) {
					q.addFirst(node);
				}
			}
			cnt++;
			if (cnt > n) {
				System.out.println("graph内に循環有");
				//				return;
			}
		}

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
		for (int i = FACTORIAL_NUM - 2; i >= 0; i--) {
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
	 * n = 3，r = 6なので，3H6
	 *
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