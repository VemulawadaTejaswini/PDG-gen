import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
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
    	// N! を素因数分解する				
    	int[] E = null;		// [i] : i の何乗かを設定する　 4! = 2^2 * 3 = --> [2]=2 [3]=1		
    	void calc(int N, PrintWriter out) {				
    		int cur;			
    		for(int i=2; i <= N; i++) {			// ２～Ｎを個別に素因数分解する
    			cur = i;		
    			for(int j=2; j*j <= i; j++) {		
    				while(cur % j == 0) {	
    					E[j]++;
    					cur = cur / j;
    				}	
    			}		
    			if(cur > 1)	E[cur]++;
    		}			
//    		for(int i=2; i <= N; i++)	out.println("E[" + i + "] = " + E[i]);
    	}

    	public void solve(int testNumber, MyInput in, PrintWriter out) {
			int N = in.nextInt();
			E = new int[N+1];
			calc(N, out);
			int cnt74=0, cnt24=0, cnt14=0, cnt4=0, cnt2=0;
			for(int i=2; i <= N; i++) {
				if(E[i] >= 74)			cnt74++;
				else if(E[i] >= 24)		cnt24++;
				else if(E[i] >= 14)		cnt14++;
				else if(E[i] >= 4)		cnt4++;
				else if(E[i] >= 2)		cnt2++;
			}
//			out.println("cnt74 = " + cnt74 + "  cnt24 = " + cnt24 + "  cnt14 = " + cnt14 + "  cnt4 = " + cnt4 + "  cnt2 = " + cnt2);

			int ans = cnt74 + (cnt74+cnt24)*(cnt74+cnt24+cnt14+cnt4+cnt2-1)
						+ (cnt74+cnt24+cnt14)*(cnt74+cnt24+cnt14+cnt4-1)
						+ (cnt74+cnt24+cnt14+cnt4)*(cnt74+cnt24+cnt14+cnt4-1)
												*(cnt74+cnt24+cnt14+cnt4+cnt2-2)/2;
			out.println(ans);
        }
    }
    // ======================================================================
    static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
        /** serialVersionUID. */
        private static final long serialVersionUID = 6411527075103472113L;

        public Pair(final K key, final V value) {
            super(key, value);
        }
        public String getString() {
            return "[" + getKey() + "] [" + getValue() + "]";
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
 
        public long nextLong() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            long ret = 0L;
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
