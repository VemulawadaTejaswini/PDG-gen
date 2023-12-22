
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

/** テンプレート */
public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		PrintWriter out = new PrintWriter(System.out);

		for (int i = 0; i < N; i++) {
			char c = S.charAt(i);
			if(i != K-1) {
				out.print(c);
			}else {
				out.print(Character.toLowerCase(c));
			}
		}



//
//		Pair[] a = { new Pair(0, 5), new Pair(1, 10), new Pair(2, 3) };
//		Arrays.sort(a, new Comparator<Pair>() {
//			public int compare(Pair o1, Pair o2) {
//				return Integer.compare(o1.v, o2.v); //Java7以降
//			}
//		});

		//************************************/
		// ここから出力処理
		//************************************/
	//	PrintWriter out = new PrintWriter(System.out);


		// 最後に必ずFlush
		out.flush();
	}
}

///** テンプレート */
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//
//		int[] ary = new int[N];
//		for (int i = 0; i < N; i++) {
//			ary[i] = sc.nextInt();
//		}
////
////		Pair[] a = { new Pair(0, 5), new Pair(1, 10), new Pair(2, 3) };
////		Arrays.sort(a, new Comparator<Pair>() {
////			public int compare(Pair o1, Pair o2) {
////				return Integer.compare(o1.v, o2.v); //Java7以降
////			}
////		});
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
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

class Pair {
	int k;
	int v;

	public Pair(int k, int v) {
		this.k = k;
		this.v = v;
	}
}

//class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
//	/** serialVersionUID. */
//	private static final long serialVersionUID = 6411527075103472113L;
//
//	public Pair(final K key, final V value) {
//		super(key, value);
//	}
//}
