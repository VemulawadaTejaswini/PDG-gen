import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
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
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;				

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

    static class Solver {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
        	int N = in.nextInt();
        	int A = in.nextInt();
        	int B = in.nextInt();
        	int C = in.nextInt();
        	int D = in.nextInt();
        	String S = in.nextString();
        	int ss = 0, bb = 0;
        	boolean ng = false, area = false;
        	for(int i=0; i < N; i++) {
        		if(S.charAt(i) == '#') {
        			ss++;
        			bb = 0;
//        			out.println("壁　ss = " + ss + "  (i+1) = " + (i+1) + "  A = " + A + "  C = " + C + "  B = " + B + "  D = " + D);
        			if(ss >= 2 && ((A < (i+1) && C > (i+1)) || (B < (i+1) && D > (i+1)))) {
//        				out.println(" (i+1) = " + (i+1) + "  -->  ng !");
        				ng = true;
        				break;
        			}
        		} else {
        			bb++;
        			ss = 0;
//        			out.println("空　bb = " + bb + "  (i+1) = " + (i+1) + "  B = " + B + "  D = " + D);
        			if(bb >= 3 && ((B <= (i+1) && D >= (i+1)) || (D == i && C == (i+1)))) {
//        				out.println(" (i+1) = " + (i+1) + "  -->  area ON !");
        				area = true;
        			}
        		}
        	}
        	if(ng || (C > D && !area)) {
            	out.println("No");
        	} else {
        		out.println("Yes");
        	}
        }
    }

    static class PPP {
    	public int key, val;
    	public PPP(int key, int val) {
    		this.key = key;
    		this.val = val;
    	}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
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
