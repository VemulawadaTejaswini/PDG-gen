import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        
        Solver solver = new Solver();
        solver.solve(1, in, out);
        
        out.close();
    }
    
    // ======================================================================
    //
    static class Solver {

    	int[] par;	    			// [子番号] = 親番号(親の場合、メンバ数のマイナス値)
    								// [1]=3 [2]=-1 [3]=-2  なら　１　と　３　は　同じグループ

    	// 親の番号を返す（この中で親に直接つなぎ変えている）
    	int root(int x) {			
    		if(par[x] < 0)     	return x;	// 親の場合はマイナスが入っている
    		else                return par[x] = root(par[x]);
    	}
    	// 同じグループなら true を返す
    	boolean same(int x, int y) {	
    		return root(x) == root(y);
    	}
    	// メンバ数を返す
    	int size(int x) {
    		return -par[root(x)];
    	}
    	// 同じ親につなげる
    	void connect(int x, int y) {	
    		x = root(x);			// 親を取得する
    		y = root(y);			// 親を取得する
    		if(x == y)  return;		// 同じなので処理しない
    		if(size(x) > size(y)) {	// メンバ数が多い方にくっつける
    			par[x] += par[y];	//   メンバ数を更新する
    			par[y] = x;			//   親番号を設定する
    		} else {
    			par[y] += par[x];
    			par[x] = y;
    		}
    	}
    	// 初期化
    	void init() {
    		for(int i = 0; i < par.length; i++) {
    			par[i] = -1;		// 全部が親で、メンバ数を　１　とする
    		}
    	}
    	// check
    	void dump(PrintWriter out) {
    		for(int i = 0; i < par.length; i++) {
    		    out.println("par[" + i + "] = " + par[i]);
    		}
    		out.println("");
    	}
    	
    	public void solve(int testNumber, MyInput in, PrintWriter out) {
       		int N = in.nextInt();
       		int M = in.nextInt();
       		par = new int[N + 1];
       		int[] A = new int[M];
       		int[] B = new int[M];
       		for(int i=0; i < M; i++) {
       			A[i] = in.nextInt();
       			B[i] = in.nextInt();
       		}
       		init();
       		long[] ans = new long[M];
       		ans[M - 1] = (long)N * (N - 1) / 2;
       		for(int i= M - 1; i >= 1; i--) {
       		    ans[i - 1] = ans[i];
       		    if(!same(A[i],B[i])) {
           			ans[i-1] -= (long)size(A[i]) * size(B[i]);
           			connect(A[i],B[i]);
       		    }
       		}
       		for(int i=0; i < M; i++) {
       			out.println(ans[i]);
       		}
        }
    }
    // ======================================================================
    static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
        /** serialVersionUID. */
        private static final long serialVersionUID = 6411527075103472113L;

        public Pair(final K key, final V value) {
            super(key, value);
        }
     }    
    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];
 
        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }
 
        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }
 
        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }
 
        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }
 
        public String nextString() {
        	String ret = new String(nextDChar()).trim();
            return ret;
        }
 
        public char[] nextDChar() {
            int len = 0;
            len = reads(len, isSpace);
            char[] ret = new char[len + 1];
            for (int i=0; i < len; i++)		ret[i] = str[i];
            ret[len] = 0x00;
            return ret;
        }
 
        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }
 
        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }
 
        static class EndOfFileRuntimeException extends RuntimeException {
        }
    }
}
