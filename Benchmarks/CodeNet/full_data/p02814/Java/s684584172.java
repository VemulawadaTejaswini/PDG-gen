
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public class Main implements Runnable { // クラス名はMain1

	static int mod = 1000000000 + 7; //10^9+7
	int[] dx = { 1, 0, -1, 0 }, dy = { 0, 1, 0, -1 }; //4 directions

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc = new InputReader(System.in);

		try {
			/**
			 * Bit 全探索
				//Nは要素数 (bit全探索)
				//計算量はO(2^N) Nが0-20~25 (30は多分無理)くらいまでしか使えない
				Out: for (int bit = 0; bit < (1 << N); bit++) {
					System.out.println(Integer.toBinaryString(bit));
					In: for (int j = 0; j < N; j++) {
						System.out.println(1 & (bit >> j));
						//1が立ってれば対象。例えば101だったら1桁目と3桁目は選ばれている
						//「二進数iをjだけ右にビットシフトしたときの、iの1桁目と1とでビット論理積をとって、演算結果が1であるなら処理を実行する」
						if ((1 & bit >> j) == 1) {
						}
					}
				}
			 *
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
			 *   String S = sc.next().trim();
			 *   for (char i = 'a'; i <= 'z'; i++) {}
			 *   S.substring(1,2);//あいうえお → い
			 *   S.substring(0,1); // 1文字目をとりたいとき
			 *   文字列のSort
			 *    String sorted = S.chars().sorted().collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append) .toString();
			 */
			// long l = sc.nextLong();
			//String S = sc.next().trim();
			//int N = sc.nextInt();
			//int[] A = new int[N];
			int N = sc.nextInt();
			int M = sc.nextInt();
			long[] A = new long[N];
			long[] Anext = new long[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextLong() / 2;
			}

			boolean same = true;
			int t = warunum(A[0]);
			Anext[0] = (long) (A[0] / Math.pow(2, t));
			out: for (int i = 1; i < N; i++) {
				if (warunum(A[0]) != t) {
					same = false;
					break out;
				} else {
					Anext[i] = (long) (A[i] / Math.pow(2, t));
				}
			}

			if (same) {
				//out.println(Arrays.toString(A));
				//out.println(Arrays.toString(Anext));
				//out.println(lcms(Anext));

				int Mnext = (int) (M / Math.pow(2, t));
				//out.println(Mnext);
				// 2^t で割った M = lcm * answer を満たす必要があり、
				// answer は奇数じゃないとダメなので、奇数の個数が答えになる
				Mnext /= lcms(Anext);
				//out.println(Mnext);
				//Mnextから偶数を除く。１を足しているのでは単純に3の時は2に、4の時も２にするから。
				out.println((Mnext + 1) / 2);

			} else {
				out.println(0);
			}

			//Flushしてからcloseするのが無難
			out.flush();
			out.close();

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	private int warunum(long i) {
		int res = 0;
		while (i % 2 == 0) {
			res++;
			i /= 2;
		}
		return res;
	}

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
	public static long lcm(long a, long b) {
		return a * b / getGcd(a, b);
	}

	/**
	 *
	 * @param a 2つ以上の数字
	 * @return 配列全ての最小公倍数
	 */
	public static long lcms(long[] a) {
		long ans = a[0];
		for (int i = 1; i < a.length; i++) {
			ans = lcm(ans, a[i]);
		}
		return ans;
	}

	public static long comb(long a, long b) {
		if (a < b)
			return 0;
		long res = 1;
		long inv = pow(fact(Math.min(b, a - b)), mod - 2);
		for (long i = a; i > a - Math.min(b, a - b); i--) {
			res *= i;
			res %= mod;
		}
		res *= inv;
		res %= mod;
		return res;
	}

	public static long pow(long x, long n) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				res *= x;
				res %= mod;
			}
			x *= x;
			x %= mod;
			n >>= 1;
		}
		return res;
	}

	public static long fact(long n) {
		long res = 1;
		while (n > 0) {
			res *= n;
			res %= mod;
			n--;
		}
		return res;
	}

	// 下記はオーバーフローでExceptionをキャッチするよう
	@SuppressWarnings("unused")
	private long multiple(long a, long b) {
		long ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	@SuppressWarnings("unused")
	private int multiple(int a, int b) {
		int ans = 0;
		try {
			ans = Math.multiplyExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	@SuppressWarnings("unused")
	private long add(long a, long b) {
		long ans = 0;
		try {
			ans = Math.addExact(a, b);
			return ans;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

	@SuppressWarnings("unused")
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
	@SuppressWarnings("unused")
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

	// 高速なScanner
	static class InputReader {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
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

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
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
