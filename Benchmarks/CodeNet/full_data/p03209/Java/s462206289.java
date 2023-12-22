
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.NoSuchElementException;


/** D */
public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();	// 50まで
		long X =  sc.nextInt();

		long[] sou = new long[N+1];
		long[] kosu = new long[N+1];

		dfsSou(N, sou);
		dfsP(N, kosu);

		long ans = keisan(sou, kosu, X, N);


		//************************************/
		// ここから出力処理
		//************************************/
		PrintWriter out = new PrintWriter(System.out);


		out.println(ans);

		// 最後に必ずFlush
		out.flush();
	}

	// 層数を計算
	static void dfsSou(int N, long[] sou) {
		if(N == 0) {
			sou[0] = 1;
			return;
		}

		if(sou[N-1] == 0) {
			dfsSou(N-1, sou);
		}
		sou[N] = 2*sou[N-1] + 3;
		return;
	}

	// 層ごとPの数を計算
	static void dfsP(int N, long[] kosu) {
		if(N == 0) {
			kosu[0] = 1;
			return;
		}

		if(kosu[N-1] == 0) {
			dfsP(N-1, kosu);
		}
		kosu[N] = 2*kosu[N-1] + 1;
		return;
	}

	static long keisan(long[] sou, long[ ] P, long X, int N) {
		if(X == 0) {
			return 1;
		}

		if(X == 1 + sou[N-1]) {
			return P[N-1] + 1;
		}

		if(X == sou[N] -1) {
			return P[N];
		}

		if(X <1 + sou[N-1]) {
			return keisan(sou, P, X-1, N);
		}

		else{
			return P[N-1] + keisan(sou, P, X-(sou[N-1]+2), N-1);
		}
	}
}

///** C */
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		int N = sc.nextInt();
//		int K =  sc.nextInt();
//
//		int[] ary = new int[N];
//		for(int i = 0; i < N; i++) {
//			ary[i] = sc.nextInt();
//		}
//
//		Arrays.sort(ary);
////
////		int[] ruiseki = new int[N+1];
////		for(int i = 0; i < N; i++) {
////			ruiseki[i+1] = ary[i] + ruiseki[i];
////		}
//
//	    int ans = ary[N-1] - ary[0];
//	    int tmp = 99999999;
//	    for (int i=0; i < N-K+1; i++) {
//	        tmp = ary[i+K-1] - ary[i];
//	        if (ans > tmp) {
//	            ans = tmp;
//	        }
//	    }
//
//
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
//
//
//		out.println(ans);
//
//		// 最後に必ずFlush
//		out.flush();
//	}
//}


///** ABC115-A */
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		int N = sc.nextInt();
//
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
//
//
//		if(N == 25){
//			out.println("Christmas");
//
//		}else if(N == 24) {
//			out.println("Christmas Eve");
//
//		}else if(N == 23) {
//			out.println("Christmas Eve Eve");
//
//		}else if(N == 22) {
//			out.println("Christmas Eve Eve Eve");
//
//		}
//
//		// 最後に必ずFlush
//		out.flush();
//	}
//}

//
/////** B */
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		int N = sc.nextInt();
//		int[] ary = new int[N];
//		int sum = 0;
//
//		for(int i = 0; i < N; i++) {
//			ary[i] = sc.nextInt();
//			sum += ary[i];
//		}
//
//		Arrays.sort(ary);
//
//		sum -= (ary[N-1] /2);
//
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
//
//
//		out.println(sum);
//
//		// 最後に必ずFlush
//		out.flush();
//	}
//}





///** テンプレート */
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		int N = sc.nextInt();
//		int M =  sc.nextInt();
//
//		int[] ary = new int[N];
//		for(int i = 0; i < N; i++) {
//			ary[i] = sc.nextInt();
//		}
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
//
//
//		out.println("hoge");
//
//		// 最後に必ずFlush
//		out.flush();
//	}
//}

/** スキャン用 */
class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	/** クラス内部用だよ */
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

	/** クラス内部用だよ */
	private int readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	/**
	 * クラス内部用だよ
	 * ASCII の文字の内、表示用の文字を返す関数
	 *
	 * @return 改行とか制御文字じゃない、表示用文字ならtrue
	 * */
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	/**
	 * @return 改行文字とか空白以外を除いた、次の文字があればtrue
	 * */
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}

	/**
	 *
	 * @return 次の文字列
	 */
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}

		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	/**
	 *
	 * @return 次のLong
	 */
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

	/**
	 *
	 * @return 次のInt
	 */
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	/**
	 *
	 * @return 次のDouble
	 */
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
	/** serialVersionUID. */
	private static final long serialVersionUID = 6411527075103472113L;

	public Pair(final K key, final V value) {
		super(key, value);
	}
}
