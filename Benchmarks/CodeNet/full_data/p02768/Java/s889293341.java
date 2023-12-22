
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

/**
 * BigDecimalは遅いからダメでしたー
 * @author daichi.miyajima
 *
 */

//System.out.println();
public class Main implements Runnable { //クラス名はMain

	static final long MOD = 1000000007;

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		try {
			FastScannerMainDSol2 sc = new FastScannerMainDSol2(System.in);

			int n = sc.nextInt();
			long a = sc.nextLong();
			long b = sc.nextLong();

			//Σ nCk = 2^n ( refer to https://mathtrain.jp/nikoubekijo )
			BigDecimal sum2 = BigDecimal.valueOf(0);

			sum2 = BigDecimalLibrary.modpow((long) 2, (long) n, MOD);
			sum2 = BigDecimalLibrary.subtract(sum2, 1);

			//System.out.println("sum2:" + sum2);

			BigDecimal nca = BigDecimal.valueOf(0);
			BigDecimal ncb = BigDecimal.valueOf(0);

			nca = BigDecimalLibrary.nCa(n, a, MOD);
			ncb = BigDecimalLibrary.nCa(n, b, MOD);
			//System.out.println("nca:" + nca);
			//System.out.println("ncb:" + ncb);

			sum2 = BigDecimalLibrary.remainder(sum2.subtract(nca), MOD);

			sum2 = BigDecimalLibrary.remainder(sum2.subtract(ncb), MOD);

			sum2 = BigDecimalLibrary.remainder(sum2, MOD);

			//System.out.println("sum2:" + sum2);

			if (sum2.compareTo(BigDecimal.valueOf(0)) == -1) {
				sum2 = BigDecimalLibrary.add(sum2, MOD);
			}
			System.out.println(sum2);

			/*
			long sum = 0;
			sum = modpow(2, n, MOD);
			
			sum -= 1;
			
			System.out.println("sum:" + sum);
			
			//nCa=n*(n-1)*…*(n-a+1)/a!
			long comba = 1L;
			for (long ac = n - a + 1; ac <= n; ac++) {
				comba *= ac;
				comba %= MOD;
			}
			for (long ac = 1; ac <= a; ac++) {
				comba *= inv(ac, MOD);
				comba %= MOD;
			}
			
			long combb = 1L;
			for (long bc = n - b + 1; bc <= n; bc++) {
				combb *= bc;
				combb %= MOD;
			}
			for (long bc = 1; bc <= b; bc++) {
				combb *= inv(bc, MOD);
				combb %= MOD;
			}
			
			System.out.println("comba:" + comba);
			System.out.println("combb:" + combb);
			
			sum -= (comba + combb);
			sum %= MOD;
			if (sum < 0) {
				sum += MOD;
			}
			System.out.println("sum:" + sum);
			*/

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 繰り返し２乗法を使ったべき乗計算(mod)
	 */
	public static long modpow(long x, long n, long mod) { //x^n 計算量O(logn)
		long ans = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				ans = ans * x % mod;
			}
			x = x * x % mod; //一周する度にx, x^2, x^4, x^8となる.
			n >>= 1; //桁をずらす n = n >> 1
		}
		return ans;
	}

	/* 逆元を求める(a^{-1} mod を計算する)
	 * (refer to https://qiita.com/drken/items/3b4fdf0a78e7a138cd9a)
	 *  ex : 2^−1≡72−1≡7 (2×7=14≡1(mod13)2×7=14≡1(mod13)のため)
	 *  2/3 (mod 13) = 2 * 3^-1 (mod 13) ※ 3^-1は3の逆元
	 */
	public static long inv(long a, long mod) {
		return modpow(a, mod - 2, mod);
	}

}

class BigDecimalLibrary {

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
	 * @return aの平方根を求める(scaleは切り捨てる桁) 50と記載したら50桁までもとまる
	 * ex : 1.41421356237309504880168872420969807856967187537695
	 */
	public static BigDecimal sqrt(BigDecimal a, int scale) {
		//とりあえずdoubleのsqrtを求める
		BigDecimal x = new BigDecimal(
				Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
		if (scale < 17)
			return x;

		BigDecimal b2 = new BigDecimal(2);
		for (int tempScale = 16; tempScale < scale; tempScale *= 2) {
			//x = x - (x * x - a) / (2 * x);
			x = x.subtract(
					x.multiply(x).subtract(a).divide(
							x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
		}
		return x;
	}

	/**
	 * 繰り返し２乗法を使ったべき乗計算(mod)
	 */
	public static BigDecimal modpow(long x, long n, long mod) { //x^n 計算量O(log n)
		BigDecimal ans = BigDecimal.valueOf(1);
		while (n > 0) {
			if ((n & 1) == 1) {
				ans = multiply(ans, x);
				ans = remainder(ans, mod);
			}
			x = x * x % mod; //一周する度にx, x^2, x^4, x^8となる.
			n >>= 1; //桁をずらす n = n >> 1
		}
		return ans;
	}

	/**
	 * 繰り返し２乗法を使ったべき乗計算(mod)
	 */
	public static long modpowlong(long x, long n, long mod) { //x^n 計算量O(logn)
		long ans = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				ans = ans * x % mod;
			}
			x = x * x % mod; //一周する度にx, x^2, x^4, x^8となる.
			n >>= 1; //桁をずらす n = n >> 1
		}
		return ans;
	}

	/**
	 *
	 * @param n
	 * @param m
	 * @return Combinationの数を返す
	 */
	static BigDecimal nCa(long n, long a, long mod) {
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

	/* 逆元を求める(a^{-1} mod を計算する)
	 * (refer to https://qiita.com/drken/items/3b4fdf0a78e7a138cd9a)
	 *  ex : 2^−1≡72−1≡7 (2×7=14≡1(mod13)2×7=14≡1(mod13)のため)
	 *  2/3 (mod 13) = 2 * 3^-1 (mod 13) ※ 3^-1は3の逆元
	 */
	public static long inv(long a, long mod) {
		return modpowlong(a, mod - 2, mod);
	}

}

//高速なScanner
class FastScannerMainDSol2 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMainDSol2(InputStream in) {
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
