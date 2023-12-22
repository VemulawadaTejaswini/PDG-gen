import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//System.out.println();
public class Main implements Runnable { //クラス名はMain

    public static void main(String[] args) {
    	Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }

    public void run() {
    	try {
	    	FastScannerMain4 sc = new FastScannerMain4(System.in);
	        int n = sc.nextInt();
	        int a = sc.nextInt();
	        int b = sc.nextInt();



	        long sum =0;
	        sum = (long) Math.pow(2 , n);

	        //System.out.println(sum);

	        sum -= 1;
	        sum -= calcCombination(n , a);
	        sum -= calcCombination(n , b);

	        //System.out.println(((long) Math.pow(10 , 9) + 7));

	        sum = sum % ((long) Math.pow(10 , 9) + 7);

	        System.out.println(sum);





    	}catch(Exception e) {
    		e.printStackTrace();
    	}

    }

    /**
     * 組合せ (nCm) を求めるメソッド.
     * n は任意の非負整数, m は 0 以上 m 以下の整数.
     * 値によってはオーバーフローする可能性がある.
     */
    private long calcCombination( int n, int m ) {
        if( n < m || m < 0 ) {
            throw new IllegalArgumentException( "引数の値が不正です ( n : " + n + ", m : " + m + ")" );
        }
        long c = 1;
        m = ( n - m < m ? n - m : m );
        for( int ns = n - m + 1, ms = 1; ms <= m; ns ++, ms ++ ) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}


//高速なScanner
class FastScannerMain4 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain4(InputStream in) {
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
