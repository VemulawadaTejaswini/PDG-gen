
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
	 */
	public void run() {
		FastScannerMainC sc = new FastScannerMainC(System.in);

		try {
			long N = sc.nextLong();
			long i = N;
			long j = 2;
			long lastj = 2;

			if (PrimeNumber.judgePrime(N)) {
				System.out.println(N - 1);
			} else {
				while (true) {
					if (i % j != 0) {
						j++;
					} else {
						i = N / j;
						lastj = j;
						j++;
					}
					//System.out.println("i:" + i + " ,j:" + j);
					if (i <= j) {
						break;
					}
				}

				//System.out.println("i:" + i + " ,j:" + j + " ,lastj:" + lastj);
				long ans = (i - 1) + (lastj - 1);
				System.out.println(ans);
			}

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

class PrimeNumber {

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
	 * 素数の場合、Trueを返す
	 * @param N
	 * @return
	 */
	public static boolean judgePrime(long N) {
		for (long i = 2; i * i <= N; i++) {
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
	public int judgePrimes(int n) {
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
	public int[] judgePrimesLikeNumber(int s, int e) {
		int count = 0;
		boolean[] is_prime = new boolean[e + 1];
		int[] is_primes = new int[e + 1];
		int[] prime = new int[e];
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
					if (judgePrime((i + 1) / 2)) {
						is_primes[i] = 1;
						prime[count++] = i;
					}
				}
			}
		}
		//System.out.println(Arrays.toString(prime));
		return is_primes;
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
