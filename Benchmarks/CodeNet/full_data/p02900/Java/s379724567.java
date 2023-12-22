
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main implements Runnable { // クラス名はMain1

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	/**
	 * for (int i = 0; i < N; i++) {} System.out.println(); HashMap<Integer,
	 * Integer> hm = new HashMap<>(); int[] s = new int[M]; ArrayDeque<Integer> deq
	 * = new ArrayDeque<>();
	 *
	 * 文字列のSort String sorted = S.chars() .sorted() .collect(StringBuilder::new,
	 * StringBuilder::appendCodePoint, StringBuilder::append) .toString(); for (char
	 * i = 'a'; i <= 'z'; i++) {}
	 * System.out.println("i:" + i + " ,j:" + j);
	 *
	 * あいうえお → い
	 * S.substring(1,2)
	 */
	public void run() {
		FastScannerMain1 sc = new FastScannerMain1(System.in);

		try {
			// S.substring(0,1) // 1文字目をとりたいとき
			// String S = sc.nextLine().trim();

			// int[] a = new int[N];
			// long l = sc.nextLong();
			// ArrayList<Integer> arr = new ArrayList<Integer>();
			// for (int i = 0; i < N; i++) {}
			// for (char i = 'a'; i <= 'z'; i++) {}
			long A = sc.nextLong();
			long B = sc.nextLong();

			int gc = (int) Gcd.getGcd(A, B);
			//System.out.println(gc);

			ArrayList<Integer> arrA = PrimeNumber.primefactorization(A);
			ArrayList<Integer> arrB = PrimeNumber.primefactorization(B);

			int[] gca = new int[gc + 1];
			gca[1] = 1;
			for (int i = 0; i < arrA.size(); i++) {
				//System.out.println(arrA.get(i));
				if (gc >= arrA.get(i)) {
					gca[arrA.get(i)] = 1;
				}
			}
			//System.out.println("--------------");
			int[] gcb = new int[gc + 1];
			gcb[1] = 1;
			for (int i = 0; i < arrB.size(); i++) {
				//System.out.println(arrB.get(i));
				if (gc >= arrB.get(i)) {
					gcb[arrB.get(i)] = 1;
				}
			}

			int[] pr = PrimeNumber.judgePrimesLikeNumber(0, (int) gc);
			//System.out.println(Arrays.toString(gca));
			//System.out.println(Arrays.toString(pr));
			int ans = 0;
			for (int i = 1; i <= gc; i++) {
				if (pr[i] > 0 && gca[i] > 0 && gcb[i] > 0) {
					ans++;
				}
			}
			System.out.println(ans);

		} catch (ArithmeticException ae) {
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

class Gcd {
	/**
	 * ユークリッドの互除法で最大公約数を求める
	 *
	 * ユークリッドの互除法の使い方
	 * 	a(割られる数) = b(割る数) * q(商) + r(余り)
	 * 	【1】大きい数を小さい数で割る場合の商と余りの関係式を作る。
	 * 	3231=2853⋅1+378
	 * 	【2】割る数（2853）を余り（378）で割る場合の関係式を作る。
	 * 	2853=378⋅7+207
	 * 	【3】【2】と同様の計算を余りが出なくなる（割り切れる）まで続ける。
	 * 	378=207⋅1+171
	 * 	207=171⋅1+36
	 * 	171=36⋅4+27
	 * 	36=27⋅1+9
	 * 	27=9⋅3
	 * 	【4】最後の式の「割る数」が2つの数の最大公約数となる。
	 * 	最後の式の「割る数」は9なので、3231と2853の最大公約数は9です。
	 */
	public static long getGcd(long a, long b) {
		if (b == 0)
			return a;
		return getGcd(b, a % b);
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return 最小公倍数(a=2,b=3であれば6を返却)
	 */
	public long lcm(long a, long b) {
		return a * b / getGcd(a, b);
	}

	/**
	 *
	 * @param a 2つ以上の数字
	 * @return 配列全ての最小公倍数
	 */
	public long lcms(long[] a) {
		long ans = a[0];
		for (int i = 1; i < a.length; i++) {
			ans = lcm(ans, a[i]);
		}
		return ans;
	}

	/**
	 * 配列全ての最大公約数を求める。
	 */
	public long getGcds(int n, long[] a) {
		long cmd = a[0];
		//最大公約数を前から順次計算していく。
		for (int i = 1; i < n; i++) {
			cmd = this.getGcd(cmd, a[i]);
		}
		return cmd;
	}

	/**<h1>拡張ユークリッド互除法</h1>
	 * <p>ax + by = gcd(a, b) となる a, b の最大公約数と解 x, y を求める。</p>
	 * @param a ： 数値１(>0)
	 * @param b ： 数値２(>0)
	 * @return<b>int[]</b> ： {[0]:gcd, [1]:x, [2]:y}：最大公約数(なし=1 [互いに素])と解 x, y
	 */
	public static final int[] extgcd(int a, int b) {
		int x0 = 1, x1 = 0;
		int y0 = 0, y1 = 1;

		while (b != 0) {
			int q = a / b;
			int r = a % b;
			int x2 = x0 - q * x1;
			int y2 = y0 - q * y1;

			a = b;
			b = r;
			x0 = x1;
			x1 = x2;
			y0 = y1;
			y1 = y2;
		}

		return new int[] { a, x0, y0 };
	}

}

class PrimeNumber {

	/*
	 * 素因数分解の値を返却する
	 */
	public static ArrayList<Integer> primefactorization(long number) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int devideNum = 2;
		while (number % devideNum == 0) {
			arr.add(devideNum);
			number /= 2;
		}

		devideNum++;
		while (number != 1) {
			if (number % devideNum == 0) {
				arr.add(devideNum);
				number /= devideNum;
			} else {
				devideNum += 2;
			}
		}

		return arr;
	}

	/**
	 * 素数の場合、Trueを返す
	 * @param N
	 * @return
	 */
	public static boolean judgePrime(int N) {
		for (int i = 2; i * i <= N; i++) {
			if (N % i == 0) {
				return false;
			}
		}
		if (N == 1) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * nまでの間の素数の数を返却
	 * 素数の一覧が欲しい場合はprimeを使用(2以上の値が素数。0もあるので、注意)
	 * 素数の数を返す
	 *
	 * 累積和で使えるようにsからeの中で素数の箇所に1を立てた配列を返却したい場合は、is_primesを使用してください。下記がSample
	 * s = 2, e = 7の場合 → [0,0,1,1,0,1,0,1]
	 * @param n
	 * @return
	 */
	public static int judgePrimes(int n) {
		int count = 0;
		boolean[] is_prime = new boolean[n + 1];
		int[] prime = new int[n];
		int[] is_primes = new int[n + 1];//0,1で返却
		for (int i = 0; i <= n; i++)
			is_prime[i] = true;
		for (int i = 2; i <= n; i++) {
			if (is_prime[i]) {
				is_primes[i] = 1;//0,1で返却
				prime[count++] = i;
				for (int j = 2 * i; j <= n; j += i) {
					is_prime[j] = false;
				}
			}
		}

		return count;
	}

	/**
	 * sからeまでの間の素数の数を返却(sとeも素数だったら含む)
	 * 素数の一覧が欲しい場合はprimeを使用
	 * 素数の数を返す
	 *
	 * 累積和で使えるようにsからeの中で素数の箇所に1を立てた配列を返却したい場合は、is_primesを使用してください。下記がSample
	 * s = 2, e = 7の場合 → [0,0,1,1,0,1,0,1]
	 * @param s,e
	 * @return
	 */
	public int judgePrimes(int s, int e) {
		int count = 0;
		boolean[] is_prime = new boolean[e + 1];
		int[] prime = new int[e];
		int[] is_primes = new int[e + 1];//0,1で返却
		for (int i = 0; i <= e; i++)
			is_prime[i] = true;
		for (int i = 2; i <= e; i++) {
			if (is_prime[i]) {
				for (int j = 2 * i; j <= e; j += i) {
					is_prime[j] = false;
					//System.out.println("i:" + i + " , j:" + j);
				}
				//Startより出かければCount
				if (i >= s) {
					is_primes[i] = 1;
					prime[count++] = i;
				}
			}
		}
		//System.out.println(Arrays.toString(prime));

		return count;
	}

	/**
	 * 累積和で使えるようにsからeの中で素数の箇所に1を立てた配列を返却する。
	 * s = 2, e = 7の場合 → [0,0,1,1,0,1,0,1]
	 * https://atcoder.jp/contests/abc084/tasks/abc084_d Atcoder用
	 * sからeまでの間の素数の数を返却(sとeも素数だったら含む)
	 * 素数の一覧が欲しい場合はprimeを使用
	 * 素数の場合、Trueを返す
	 * @param s,e
	 * @return
	 */
	public static int[] judgePrimesLikeNumber(int s, int e) {
		int count = 0;
		boolean[] is_prime = new boolean[e + 1];
		int[] is_primes = new int[e + 1];
		int[] prime = new int[e];
		is_primes[1] = 1;
		for (int i = 0; i <= e; i++)
			is_prime[i] = true;
		for (int i = 2; i <= e; i++) {
			if (is_prime[i]) {
				for (int j = 2 * i; j <= e; j += i) {
					is_prime[j] = false;
					//System.out.println("i:" + i + " , j:" + j);
				}
				//Startより出かければCount
				if (i >= s) {
					//(N+1)/2も素数なら数える(Atcoder用)

					is_primes[i] = 1;
					prime[count++] = i;

				}
			}
		}
		//System.out.println(Arrays.toString(prime));
		return is_primes;
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
