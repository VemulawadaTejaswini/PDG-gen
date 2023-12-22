
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main implements Runnable { // クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	/**
	 * for (int i = 0; i < N; i++) {} System.out.println(); HashMap<Integer, Integer> hm = new
	 * HashMap<>(); int[] s = new int[M]; ArrayDeque<Integer> deq = new ArrayDeque<>();
	 *
	 * 文字列のSort String sorted = S.chars() .sorted() .collect(StringBuilder::new,
	 * StringBuilder::appendCodePoint, StringBuilder::append) .toString(); for (char i = 'a'; i <=
	 * 'z'; i++) {}
	 */
	public void run() {
		FastScannerMainC sc = new FastScannerMainC(System.in);

		try {
			// String S = sc.nextLine().trim();
			int N = sc.nextInt();
			Integer[] n = new Integer[N];

			int[] x = new int[N];
			int[] y = new int[N];
			// long l = sc.nextLong();
			// ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i < N; i++) {
				n[i] = i + 1;
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			ArrayList<BigDecimal> ans = new ArrayList<BigDecimal>();

			Permutation<Integer> p = new Permutation<>(n);
			do {
				// System.out.println(Arrays.toString(p.getObjes()));

				Integer[] per = p.getObjes();
				BigDecimal eachans;
				BigDecimal[] re = new BigDecimal[N - 1];
				for (int i = 1; i < per.length; i++) {
					int xi = per[i] - 1;
					int xj = per[i - 1] - 1;
					int yi = per[i] - 1;
					int yj = per[i - 1] - 1;

					eachans = BigDecimalLibrary.pow((x[xi] - x[xj]), 2)
							.add(BigDecimalLibrary.pow((y[yi] - y[yj]), 2));
					eachans = BigDecimalLibrary.sqrt(eachans, 50);
					re[i - 1] = eachans;
					// System.out.println(eachans);
				}

				BigDecimal anse = BigDecimal.valueOf(0);
				for (int i = 0; i < N - 1; i++) {
					anse = anse.add(re[i]);
				}
				// System.out.println(anse);
				ans.add(anse);


			} while (p.next());


			BigDecimal answersall = BigDecimal.valueOf(0);
			for (int i = 0; i < ans.size(); i++) {
				// System.out.println(ans.get(i));
				answersall = answersall.add(ans.get(i));

			}
			// System.out.println(answersall);
			BigDecimal divide = BigDecimal.valueOf(ans.size());
			// System.out.println("---");
			System.out.println(answersall.divide(divide, 50, BigDecimal.ROUND_HALF_UP));

		} catch (

		ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 下記はオーバーフローでExceptionをキャッチするよう
	private long multiple(long a, long b) {
		long ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private int multiple(int a, int b) {
		int ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private long add(long a, long b) {
		long ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	private int add(int a, int b) {
		int ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}
}


class BigDecimalLibrary {

	/**
	 *
	 * @param a
	 * @param b
	 * @return a^b (aのb乗) Notes：bは999999999までなので気をつけること。
	 */
	public static BigDecimal pow(long a, int b) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		return big_a.pow(b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a^b (aのb乗) Notes：bは999999999までなので気をつけること。
	 */
	public static BigDecimal pow(BigDecimal a, int b) {
		return a.pow(b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public static BigDecimal add(long a, long b) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		BigDecimal big_b = BigDecimal.valueOf(b);
		return big_a.add(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a-b
	 */
	public static BigDecimal subtract(long a, long b) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		BigDecimal big_b = BigDecimal.valueOf(b);
		return big_a.subtract(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a*b
	 */
	public static BigDecimal multiply(long a, long b) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		BigDecimal big_b = BigDecimal.valueOf(b);
		return big_a.multiply(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a/b
	 */
	public static BigDecimal divide(long a, long b) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		BigDecimal big_b = BigDecimal.valueOf(b);
		return big_a.divide(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a%b
	 */
	public static BigDecimal remainder(long a, long b) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		BigDecimal big_b = BigDecimal.valueOf(b);
		BigDecimal result = big_a.remainder(big_b);
		return result;
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public static BigDecimal add(BigDecimal a, long b) {
		BigDecimal big_b = BigDecimal.valueOf(b);
		return a.add(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a-b
	 */
	public static BigDecimal subtract(BigDecimal a, long b) {
		BigDecimal big_b = BigDecimal.valueOf(b);
		return a.subtract(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a*b
	 */
	public static BigDecimal multiply(BigDecimal a, long b) {
		BigDecimal big_b = BigDecimal.valueOf(b);
		return a.multiply(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a/b
	 */
	public static BigDecimal divide(BigDecimal a, long b) {
		BigDecimal big_b = BigDecimal.valueOf(b);
		return a.divide(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a%b
	 */
	public static BigDecimal remainder(BigDecimal a, long b) {
		BigDecimal big_b = BigDecimal.valueOf(b);
		BigDecimal result = a.remainder(big_b);
		return result;
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public static BigDecimal add(double a, double b) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		BigDecimal big_b = BigDecimal.valueOf(b);
		return big_a.add(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a-b
	 */
	public static BigDecimal subtract(double a, double b) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		BigDecimal big_b = BigDecimal.valueOf(b);
		return big_a.subtract(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a*b
	 */
	public static BigDecimal multiply(double a, double b) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		BigDecimal big_b = BigDecimal.valueOf(b);
		return big_a.multiply(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a/b
	 */
	public static BigDecimal divide(double a, double b) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		BigDecimal big_b = BigDecimal.valueOf(b);
		return big_a.divide(big_b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a%b
	 */
	public static BigDecimal remainder(BigDecimal a, BigDecimal b) {
		BigDecimal result = a.remainder(b);
		return result;
	}

	/**
	 *
	 * @param a
	 * @param scale
	 * @return aの平方根を求める(scaleは切り捨てる桁) 50と記載したら50桁までもとまる ex :
	 *         1.41421356237309504880168872420969807856967187537695
	 */
	public static BigDecimal sqrt(BigDecimal a, int scale) {
		// とりあえずdoubleのsqrtを求める
		BigDecimal x = new BigDecimal(Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
		if (scale < 17)
			return x;

		BigDecimal b2 = new BigDecimal(2);
		for (int tempScale = 16; tempScale < scale; tempScale *= 2) {
			// x = x - (x * x - a) / (2 * x);
			x = x.subtract(x.multiply(x).subtract(a).divide(x.multiply(b2), scale,
					BigDecimal.ROUND_HALF_EVEN));
		}
		return x;
	}

	/**
	 * 繰り返し２乗法を使ったべき乗計算(mod)
	 */
	public static BigDecimal modpow(long x, long n, long mod) { // x^n 計算量O(log n)
		BigDecimal ans = BigDecimal.valueOf(1);
		while (n > 0) {
			if ((n & 1) == 1) {
				ans = multiply(ans, x);
				ans = remainder(ans, mod);
			}
			x = x * x % mod; // 一周する度にx, x^2, x^4, x^8となる.
			n >>= 1; // 桁をずらす n = n >> 1
		}
		return ans;
	}

	/**
	 * 繰り返し２乗法を使ったべき乗計算(mod)
	 */
	public static long modpowlong(long x, long n, long mod) { // x^n 計算量O(logn)
		long ans = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				ans = ans * x % mod;
			}
			x = x * x % mod; // 一周する度にx, x^2, x^4, x^8となる.
			n >>= 1; // 桁をずらす n = n >> 1
		}
		return ans;
	}

	/**
	 *
	 * @param n
	 * @param m
	 * @return Combinationの数を返す
	 */
	static BigDecimal nCalong(long n, long a, long mod) {
		long comba = 1L;
		for (long ac = n - a + 1; ac <= n; ac++) {
			comba *= ac;
			comba %= mod;
		}
		for (long ac = 1; ac <= a; ac++) {
			comba *= inv(ac, mod);
			comba %= mod;
		}
		return BigDecimal.valueOf(comba);
	}

	/*
	 * 逆元を求める(a^{-1} mod を計算する) (refer to https://qiita.com/drken/items/3b4fdf0a78e7a138cd9a) ex :
	 * 2^−1≡72−1≡7 (2×7=14≡1(mod13)2×7=14≡1(mod13)のため) 2/3 (mod 13) = 2 * 3^-1 (mod 13) ※ 3^-1は3の逆元
	 */
	public static long inv(long a, long mod) {
		return modpowlong(a, mod - 2, mod);
	}

}


/**
 *
 * How to call Permutation<String> p = new Permutation<>(new String[] { "a", "b", "c" }); do {
 * System.out.println(Arrays.toString(p.getObjes())); } while (p.next());
 * 
 * PermutationWarshallFloyd<Integer> p = new PermutationWarshallFloyd<>(travels); do {
 * //System.out.println(Arrays.toString(p.getObjes())); Integer[] per = p.getObjes(); long eachans =
 * 0; for (int i = 0; i < per.length; i++) { if (i > 0) { eachans += wf.distance(per[i - 1] - 1,
 * per[i] - 1); } } } while (p.next());
 *
 *
 *
 * @author daichi.miyajima
 *
 * @param <T>
 */
class Permutation<T extends Serializable> {

	private int baseIndex;
	private int index;
	private T[] objs;

	private Permutation<T> subPermutation;

	public Permutation(T[] objs) {
		this(0, 0, objs.clone());
	}

	private Permutation(int baseIndex, int index, T[] objs) {
		if (objs == null || objs.length == 0) {
			throw new IllegalArgumentException();
		}

		this.baseIndex = baseIndex;
		this.index = index;
		this.objs = objs;

		if (this.index < this.objs.length - 1) {
			this.subPermutation = new Permutation<T>(this.baseIndex + 1, this.index + 1, this.objs);
		}
	}

	public T[] getTarget() {
		return this.objs;
	}

	public boolean next() {
		if (this.subPermutation == null) {
			return false;
		}

		boolean result = this.subPermutation.next();
		if (result == true) {
			return true;
		}

		this.swap(this.baseIndex, this.index);

		++this.index;
		if (this.objs.length <= this.index) {
			this.index = this.baseIndex;
			return false;
		}

		this.swap(this.index, this.baseIndex);
		return true;
	}

	public T[] getObjes() {
		return this.objs;
	}

	private void swap(int index1, int index2) {
		T tmp = this.objs[index1];
		this.objs[index1] = this.objs[index2];
		this.objs[index2] = tmp;
	}
}


// 高速なScanner
class FastScannerMainC {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainC(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
