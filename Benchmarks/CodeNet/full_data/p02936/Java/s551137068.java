
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
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
		int a = nextInt();
		String s = next();
		if (a >= 3200)
			out.println(s);
		else
			out.println("red");
	}

	private void solveB() {
		int n = nextInt();
		int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();
		double tmp = 1;
		for (int i : wk) {
			tmp = getLcm((int) tmp, i);
		}
		double sum = 0;
		for (int i : wk) {
			sum += (tmp / i);
		}

		out.println(tmp / sum);
	}

	private int getLcm(int a, int b) {
		return a * b / getGcd(a, b);
	}

	private int getGcd(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int d = max % min;
		while (d != 0) {
			max = min;
			min = d;
			d = max % min;
		}
		return min;
	}

	private void solveC() {
		int n = nextInt();
		int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();
		Arrays.sort(wk);
		double total = (wk[0] + wk[1]) / 2d;
		for (int i = 2; i < wk.length; i++) {
			total = ((double) (wk[i] + total)) / 2d;
		}
		out.println(total);

	}

	private void solveD() {
		int n = nextInt();
		int q = nextInt();

		int[][] ab = Stream.generate(() -> new int[] { nextInt(), nextInt() }).limit(n - 1).toArray(int[][]::new);
		Tree[] res = new Tree[n + 1];

		for (int[] tree : ab) {
			if (res[tree[0]] == null)
				res[tree[0]] = new Tree(tree[0]);
			if (res[tree[1]] == null)
				res[tree[1]] = new Tree(tree[1]);

			res[tree[0]].addR(tree[1]);
			res[tree[1]].addR(tree[0]);
		}

		int[][] px = Stream.generate(() -> new int[] { nextInt(), nextInt() }).limit(q).toArray(int[][]::new);

		/*
		 * まず全て埋める
		 */
		for (int[] i : px) {
			res[i[0]].val += i[1];
		}

		Set<Integer> exist = new HashSet<Integer>();
		exist.add(0);
		exist.add(1);
		/*
		 * Index=1が根なので、そこからBFSを行っていく
		 */
		Deque<Tree> nodes = new ArrayDeque<Tree>();
		nodes.add(res[1]);
		while (nodes.size() > 0) {
			Tree node = nodes.pop();
			List<Integer> wk = node.relationList;
			for (Integer rVal : wk) {
				if (exist.contains(rVal)) {
					continue;
				}
				res[rVal].parent = node.index;
				node.addC(rVal);
				exist.add(rVal);
				nodes.add(res[rVal]);
				/*
				 * parentMapの中で、根としての番号が一番小さいものから処理
				 * 累積和をしていく
				 */
				res[rVal].val += node.val;
			}

		}

		StringBuilder builder = new StringBuilder();
		for (Tree node : res) {
			if (node == null)
				continue;
			builder.append(node.val).append(" ");
		}
		out.println(builder.toString());

	}

	private static class Tree {

		int index = -1;
		int val = 0;

		public Tree(int index) {
			this.index = index;
		}

		int parent = -1;
		List<Integer> relationList = new LinkedList<Integer>();
		List<Integer> childList = new LinkedList<Integer>();

		public void addR(int relationVal) {
			relationList.add(relationVal);
		}

		public void addC(int childVal) {
			childList.add(childVal);
		}
	}

	private void solveDPartial() {
		int n = nextInt();
		int q = nextInt();

		/*
		 * 根の親のリストを作る（累積和のため）
		 */
		Map<Integer, List<Integer>> parentMap = new TreeMap<Integer, List<Integer>>();
		for (int i = 0; i < n - 1; i++) {
			int wkP = nextInt() - 1;
			int wkC = nextInt() - 1;
			int p = Math.min(wkP, wkC);
			int c = Math.max(wkP, wkC);
			List<Integer> wk = parentMap.getOrDefault(c, new ArrayList<Integer>());
			wk.add(p);
			parentMap.put(c, wk);
		}
		int[][] px = Stream.generate(() -> new int[] { nextInt(), nextInt() }).limit(q).toArray(int[][]::new);
		int[] res = new int[n];

		/*
		 * 全て埋める
		 */
		for (int[] i : px) {
			res[i[0] - 1] += i[1];
		}

		/*
		 * parentMapの中で、根としての番号が一番小さいものから処理
		 * 累積和をしていく
		 */
		for (int i = 0; i < n; i++) {
			if (parentMap.containsKey(i)) {
				/*
				 * 自分の親の値を全て自分に足しこんでいく
				 */
				for (int j : parentMap.get(i)) {
					res[i] += res[j];
				}
			}
		}

		StringBuilder builder = new StringBuilder();
		for (int i : res) {
			builder.append(i).append(" ");
		}
		out.println(builder.toString());
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
