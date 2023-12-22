
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main implements Runnable { // クラス名はMain1

	static int MOD = 1000000000 + 7; //10^9+7

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMain1 sc = new FastScannerMain1(System.in);

		try {
			/**
			 * 表示系
			 *   System.out.println();
			 *   System.out.println("i:" + i + " ,j:" + j);
			 *   System.out.println(Arrays.toString(A));
			 *
			 * Sort (Arrays)
			 *  Integer[] A = new Integer[N];
			 *    Desc : Arrays.sort(A , Collections.reverseOrder());
			 *    Asc  : Arrays.sort(A);
			 *
			 * 定義系
			 *   int[] s = new int[M];
			 *   ArrayDeque<Integer> deq= new ArrayDeque<>();//先頭と末尾への要素の追加・先頭と末尾の要素の取り出しと削除が定数時間
			 *   ArrayList<Integer> arr = new ArrayList<Integer>();//定数時間
			 *   HashMap<Integer,Integer> hm = new HashMap<>(); //定数時間
			 *
			 *   //要素の追加と、最小の要素の取り出しと削除が対数時間
			 *   PriorityQueue<Integer> pq = new PriorityQueue<>();//昇順
			 *   PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //逆順。降順
			 *
			 *   TreeSet<Integer> ts = new TreeSet<>();//対数時間(重複はできない)
			 *
			 * 文字系
			 *   String S = sc.nextLine().trim();
			 *   for (char i = 'a'; i <= 'z'; i++) {}
			 *   S.substring(1,2);//あいうえお → い
			 *   S.substring(0,1); // 1文字目をとりたいとき
			 *   文字列のSort
			 *    String sorted = S.chars().sorted().collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append) .toString();
			 */
			// long l = sc.nextLong();
			int N = sc.nextInt();
			int K = sc.nextInt();
			long[] memo = new long[N];
			boolean[] memobool = new boolean[N];

			int red = N - K;

			for (int i = 1; i <= K; i++) {
				long ans = 1;
				ans = nCalong(red + 1, i, MOD);
				ans %= MOD;
				ans *= nCalong(K - 1, i - 1, MOD);
				ans %= MOD;
				if (ans < 0) {
					ans += MOD;
				}
				System.out.println(ans);
			}

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a^b (aのb乗)
	 * Notes：bは999999999までなので気をつけること。
	 */
	public static BigDecimal pow(long a, int b) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		return big_a.pow(b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return a^b (aのb乗)
	 * Notes：bは999999999までなので気をつけること。
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
	public static BigDecimal add1(long a, long b) {
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
	 * @return aの平方根を求める(scaleは切り捨てる桁) 50と記載したら50桁までもとまる
	 * 		   ex : 1.41421356237309504880168872420969807856967187537695
	 */
	public static double sqrt(BigDecimal a, int scale) {
		// とりあえずdoubleのsqrtを求める
		BigDecimal x = new BigDecimal(Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
		if (scale < 17)
			return x.doubleValue();

		BigDecimal b2 = new BigDecimal(2);
		for (int tempScale = 16; tempScale < scale; tempScale *= 2) {
			// x = x - (x * x - a) / (2 * x);
			x = x.subtract(x.multiply(x).subtract(a).divide(x.multiply(b2), scale,
					BigDecimal.ROUND_HALF_EVEN));
		}
		return x.doubleValue();
	}

	/**
	 *
	 * @param a
	 * @param scale
	 * @return aの平方根を求める(scaleは切り捨てる桁) 50と記載したら50桁までもとまる ex :
	 *         1.41421356237309504880168872420969807856967187537695
	 */
	public static double sqrt(long a, int scale) {
		BigDecimal big_a = BigDecimal.valueOf(a);
		// とりあえずdoubleのsqrtを求める
		BigDecimal x = new BigDecimal(Math.sqrt(big_a.doubleValue()), MathContext.DECIMAL64);
		if (scale < 17)
			return x.doubleValue();

		BigDecimal b2 = new BigDecimal(2);
		for (int tempScale = 16; tempScale < scale; tempScale *= 2) {
			// x = x - (x * x - a) / (2 * x);
			x = x.subtract(x.multiply(x).subtract(big_a).divide(x.multiply(b2), scale,
					BigDecimal.ROUND_HALF_EVEN));
		}
		return x.doubleValue();
	}

	/**
	 * 繰り返し２乗法を使ったべき乗計算(mod)
	 */
	public static long modpow(long x, long n, long mod) { // x^n 計算量O(log n)
		BigDecimal ans = BigDecimal.valueOf(1);
		while (n > 0) {
			if ((n & 1) == 1) {
				ans = multiply(ans, x);
				ans = remainder(ans, mod);
			}
			x = x * x % mod; // 一周する度にx, x^2, x^4, x^8となる.
			n >>= 1; // 桁をずらす n = n >> 1
		}
		return ans.longValue();
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
	static long nCalong(long n, long a, long mod) {
		long comba = 1L;
		for (long ac = n - a + 1; ac <= n; ac++) {
			comba *= ac;
			comba %= mod;
		}
		for (long ac = 1; ac <= a; ac++) {
			comba *= inv(ac, mod);
			comba %= mod;
		}
		return BigDecimal.valueOf(comba).longValue();
	}

	/*
	 * 逆元を求める(a^{-1} mod を計算する)
	 * (refer to https://qiita.com/drken/items/3b4fdf0a78e7a138cd9a) ex :
	 * 2^−1≡72−1≡7 (2×7=14≡1(mod13)2×7=14≡1(mod13)のため)
	 * 2/3 (mod 13) = 2 * 3^-1 (mod 13) ※ 3^-1は3の逆元
	 */
	public static long inv(long a, long mod) {
		return modpowlong(a, mod - 2, mod);
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

	/*
	 * HashmapのSort
	 * hmはhashmap
	 * keyvalは"key" or "val"を指定して
	 * ascdescは"asc" or "desc"を指定して
	 */
	private List<Entry<Integer, Integer>> sortHashMapValue(HashMap<Integer, Integer> hm, String keyval,
			String ascdesc) {
		// 1.Map.Entryのリストを作成する
		List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(hm.entrySet());

		// 2.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
		Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				if (keyval.equals("val")) {
					if (ascdesc.equals("asc")) {
						// 昇順(value)
						return obj1.getValue().compareTo(obj2.getValue());
					} else {
						// 降順(value)
						return obj2.getValue().compareTo(obj1.getValue());
					}
				} else {
					if (ascdesc.equals("asc")) {
						// 昇順(value)
						return obj1.getKey().compareTo(obj2.getKey());
					} else {
						// 降順(value)
						return obj2.getKey().compareTo(obj1.getKey());
					}
				}
			}
		});
		/*
		// 3. ループで要素順に値を取得する
		for (Entry<Integer, Integer> entry : list_entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		*/
		return list_entries;
	}
}

class Exm implements Comparable<Exm> {

	public int a;
	public int b;

	@Override
	public int compareTo(Exm o) {

		//return this.a - o.a;//昇順
		// return o.a - this.a;//降順

		//複数項目で並び替え。aの降順、aが同じならbの降順
		if (this.a == o.a) {
			return o.b - this.b;
		} else {
			return o.a - this.a;
		}
	}

}

// 高速なScanner
class FastScannerMain1 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain1(InputStream in) {
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
