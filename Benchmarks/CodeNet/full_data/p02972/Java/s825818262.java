
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main implements Runnable { // クラス名はMain1

	//static int MOD = 1000000000 + 7; //10^9+7

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
			int[] A = new int[N + 1];
			int[] Ans = new int[N + 1];

			for (int i = 1; i <= N; i++) {
				A[i] = sc.nextInt();
			}

			// System.out.println(Arrays.toString(A));
			TreeSet<Integer> ts = new TreeSet<>();
			for (int i = N; i > N / 2; i--) {
				//System.out.println(i + " " + A[i]);
				//半分以上であれば必ずA[i]と同じにならないと成り立たない
				//約数にもボールをいれる
				if (A[i] == 1) {
					ts.add(i);
					for (int j = 1; j * j <= i; j++) {
						if (i % j == 0) {
							Ans[j] += 1;
							//System.out.println(" " + j);
							// 重複しないならば i の相方である N/i も push
							if (i / j != j) {
								//半分以上であれば必ずA[i]と同じにならないと成り立たない
								Ans[i / j] += 1;
								//System.out.println(" " + (i / j));
							}
						}
					}
				}
			}

			for (int i = N / 2; i > 0; i--) {
				if (Ans[i] % 2 == A[i]) {
					continue;
				} else {
					ts.add(i);
					//ボールをいれる場合
					for (int j = 1; j * j <= i; j++) {
						if (i % j == 0) {
							Ans[j] += 1;
							//System.out.println(" " + j);
							// 重複しないならば i の相方である N/i も push
							if (i / j != j) {
								//半分以上であれば必ずA[i]と同じにならないと成り立たない
								Ans[i / j] += 1;
								//System.out.println(" " + (i / j));
							}

						}
					}
				}
			}

			//System.out.println(Arrays.toString(A));
			//System.out.println(Arrays.toString(Ans));

			System.out.println(ts.size());
			while (ts.size() > 0) {
				System.out.print(ts.pollFirst() + " ");
			}

			System.out.println();

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

class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(judgePrimes(0, 11));
		System.out.println(Arrays.toString(judgePrimesLikeNumbers(0, 11)));
	}

	/*
	 * 約数列挙(O(√N ))
	 */
	public static ArrayList<Integer> enum_divisors(int number) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i * i <= number; i++) {
			if (number % i == 0) {
				arr.add(i);
				// 重複しないならば i の相方である N/i も push
				if (number / i != i)
					arr.add(number / i);
			}
		}

		Collections.sort(arr);

		return arr;
	}

	/*
	 * 素因数分解の値を返却する（重複も全て） (O(√N ))
	 */
	public static ArrayList<Long> primefactorization(long number) {
		ArrayList<Long> arr = new ArrayList<Long>();
		for (long i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				while (number % i == 0) {
					arr.add(i);
					number /= i;
				}
			}
		}
		// 最後に残った数について
		if (number != 1) {
			arr.add(number);
		}

		return arr;
	}

	/*
	 * 素因数分解の値を返却する（重複は除外） (O(√N ))
	 */
	public static Set<Long> primefactorizationexclude(long number) {
		Set<Long> arr = new HashSet<Long>();
		for (long i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				while (number % i == 0) {
					arr.add(i);
					number /= i;
				}
			}
		}
		// 最後に残った数について
		if (number != 1) {
			arr.add(number);
		}

		return arr;
	}

	/**
	 * 素数の場合、Trueを返す (O(√N ))
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
	 *
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
	 * sからeまでの間の素数の数を返却
	 *
	 * @param s,e
	 * @return
	 */
	public static int judgePrimes(int s, int e) {
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
	 * 累積和で使えるようにsからeの中で素数の箇所に1を立てた配列を返却する。(1は素数ではないので、含まない)
	 * s = 2, e = 7の場合 → [0,0,1,1,0,1,0,1]
	 *
	 * sからeまでの間の素数の数を返却(sとeも素数だったら含む)
	 * 素数の一覧が欲しい場合はprimeを使用
	 * 素数の場合、Trueを返す
	 * @param s,e
	 * @return
	 */
	public static int[] judgePrimesLikeNumbers(int s, int e) {
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
					is_primes[i] = 1;
					prime[count++] = i;
				}
			}
		}
		//System.out.println(Arrays.toString(prime));
		return is_primes;
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
