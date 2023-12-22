
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.NoSuchElementException;




/** ABC-114-B */
public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		String S = sc.next();

		char[] cary = S.toCharArray();
		int[] ary = new int[S.length()];

		for(int i = 0; i < S.length(); i++) {
			ary[i] = Character.getNumericValue(cary[i]);
		}

		int ans = 99999999;
		for(int i = 2; i < S.length(); i++) {
			int tmp = Math.abs(753 - (100 * ary[i-2] + 10 * ary[i-1]+ 1 * ary[i]));
			if(ans > tmp) {
				ans = tmp;
			}
		}


		//************************************/
		// ここから出力処理
		//************************************/
		PrintWriter out = new PrintWriter(System.out);


		out.println(ans);

		// 最後に必ずFlush
		out.flush();
	}
}


///** ABC114 -A */
///** テンプレート */
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		int N = sc.nextInt();
////		int[][] ary = new int[2][N];
////		int[] copy = new int[N];
////
////
////		int sum = 0;
////
////		for(int i = 0; i < N; i++) {
////			ary[0][i] = i;
////			ary[1][i] = sc.nextInt();
////			sum+= ary[1][i];
////		}
////
////		double ave = Math.round((double)sum / N);
////
////		Arrays.sort(ary, (a, b) -> Integer.compare(a[1], b[1]));
////
////		int ansIndex = 0;
////		double def = 99999999;
////		for(int i = 0; i < N; i++) {
////			if(def < Math.abs(ave - ary[1][i])) {
////
////			}
////		}
//
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
//
//		if(N == 3 || N == 5 || N== 7) {
//			out.println("YES");
//
//		}else {
//			out.println("NO");
//		}
//
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
        }else{
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
    	}else {
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
    	while(hasNextByte() && !isPrintableChar(buffer[ptr])) {
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
        while(isPrintableChar(b)) {
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
        if (!hasNext()) throw new NoSuchElementException();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
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

