import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
//	public static Set<String> mem = new HashSet<String>();
//	public static boolean[] mem_1 = new boolean[100];
//	public static boolean[] mem_2 = new boolean[100];
	public static Set<Integer> mem = new TreeSet<Integer>();
//	public static Map<String, Integer> mem_1= new HashMap<String, Integer>();
//	public static Map<String, Integer> mem_2 = new HashMap<String, Integer>();
	
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
    static class Solver {
//    	// １０進数の各桁の数を足した結果を返す　　１０２　→　１＋０＋２　＝３
//    	public int calc(int d) {
//    		if(d < 10)	return d;
//    		return d % 10 + calc(d / 10);
//    	}
//    	public int calc(int a, int max) {
//    		int ans = 0;
//    		int d = 1;
//    		for(int i=0; d <= max; i++) {
//    			ans = ans + i * a + 1;
//    		}
//    		return ans;
//    	}
//    	public boolean check(int x, PrintWriter out) {
//    		if(x == 0)			return false;
//    		else if(x < 10)		return true;
//    		
//    		String s = Integer.toString(x);
//    		boolean ans = true;
//			for(int i=0; i < s.length()/2; i++) {
//				if(s.charAt(i) != s.charAt(s.length()-1-i)) {
//					ans = false;
//				}
//    		}
//			return ans;
//    	}

    	public void solve(int testNumber, MyInput in, PrintWriter out) {
        	int ans = 0;
//        	char[] s = in.nextDChar();

        	int N = in.nextInt();
        	Integer[] a = new Integer[N];
        	for(int i = 0; i < N; i++) {
        		a[i] = new Integer(in.nextInt());
//        		out.println("[" + a[i] + "]");
        	}
        	Arrays.sort(a, Comparator.reverseOrder()); // 降順になる
        	for(int i = 0; i < N; i++) {
        		if(i % 2 == 0)	ans += a[i];
        		else			ans -= a[i];
        	}

        	out.println(ans);
        }
    }
    // ======================================================================
    
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
