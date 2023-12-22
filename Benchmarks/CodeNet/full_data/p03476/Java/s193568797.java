import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * for (int i = 0; i < N; i++) {}
 * System.out.println();
 * HashMap<Integer, Integer> hm = new HashMap<>();
 * int[] s = new int[M];
 * ArrayDeque<Integer> deq = new ArrayDeque<>();
 * 10^5 = 100000
 *
 */
public class Main implements Runnable { //クラス名はLikeNumber

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerLikeNumber sc = new FastScannerLikeNumber(System.in);
		PrimeNumber primeNumber = new PrimeNumber();

		try {
			//String S = sc.nextLine().trim();
			//long N = sc.nextlong();
			int Q = sc.nextInt();

			int l = 0;
			int r = 0;

			int[] re = primeNumber.judgePrimesLikeNumber(1, 100000);
			for (int i = 1; i <= 100000; i++) {
				re[i] += re[i - 1];
			}

			for (int i = 0; i < Q; i++) {
				l = sc.nextInt();
				r = sc.nextInt();
				System.out.println(re[r] - re[l - 1]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class PrimeNumber {

	/**
	 * 素数の場合、Trueを返す
	 * @param N
	 * @return
	 */
	public boolean judgePrime(int N) {
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
	 * 素数の場合、Trueを返す
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
	 * 素数の場合、Trueを返す
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

//高速なScanner
class FastScannerLikeNumber {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerLikeNumber(InputStream in) {
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
