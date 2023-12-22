import java.io.BufferedReader;

import static java.util.Comparator.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
//	public static Set<String> mem = new HashSet<String>();
//	public static boolean[] mem_1 = new boolean[100];
//	public static boolean[] mem_2 = new boolean[100];
//	public static Set<Integer> mem = new TreeSet<Integer>();
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
    	
		List<Pair<Integer, Integer>> lP = new ArrayList<Pair<Integer, Integer>>();
		List<Pair<Integer, Integer>> lAns = new ArrayList<Pair<Integer, Integer>>();

		long[] s = null;
		long[] t = null;

		long[] binarySearch(long[] array, long key, int flag) {
			int pLeft = 0;
			int pRight = array.length - 1;

			int center = 0;
			long[] ans = new long[2];
			do {
				center = (pLeft + pRight) / 2;

				if (array[center] == key) {
					ans[0] = 0L;
					ans[1] = key;
					return ans;
				} else if (array[center] < key){
					pLeft = center + 1; //真ん中の一つ右側を左端とする
				} else {
					pRight = center - 1;
				}
			} while (pLeft <= pRight);
			if(flag == 0 && pLeft >= 0 && pLeft < array.length) {
				ans[0] = Math.abs(array[pLeft] - key);
				ans[1] = array[pLeft];
			} else if(pRight >= 0 && pRight < array.length){
				ans[0] = Math.abs(array[pRight] - key);
				ans[1] = array[pRight];
			} else {
			    ans[0] = 99999999999L;
			}
			return ans;
		}
		
		long calc(long x) {
			long ans = 99999999999L;
			long[] wk = null;
			long[] wk2 = null;

			wk = binarySearch(s, x, 0);
			if(wk[0] < 99999999999L) {
    			wk2 = binarySearch(t, wk[1], 0);
    			ans = Math.min(ans, wk[0] + wk2[0]);
			}
			wk = binarySearch(s, x, 1);
			if(wk[0] < 99999999999L) {
			    wk2 = binarySearch(t, wk[1], 1);
			    ans = Math.min(ans, wk[0] + wk2[0]);
			}
			wk = binarySearch(s, x, 0);
			if(wk[0] < 99999999999L) {
			    wk2 = binarySearch(t, wk[1], 1);
			    ans = Math.min(ans, wk[0] + wk2[0]);
			}
			wk = binarySearch(s, x, 1);
			if(wk[0] < 99999999999L) {
			    wk2 = binarySearch(t, wk[1], 0);
			    ans = Math.min(ans, wk[0] + wk2[0]);
			}

			wk = binarySearch(t, x, 0);
			if(wk[0] < 99999999999L) {
			    wk2 = binarySearch(s, wk[1], 0);
			    ans = Math.min(ans, wk[0] + wk2[0]);
			}
			wk = binarySearch(t, x, 1);
			if(wk[0] < 99999999999L) {
			    wk2 = binarySearch(s, wk[1], 1);
			    ans = Math.min(ans, wk[0] + wk2[0]);
			}
			wk = binarySearch(t, x, 0);
			if(wk[0] < 99999999999L) {
			    wk2 = binarySearch(s, wk[1], 1);
			    ans = Math.min(ans, wk[0] + wk2[0]);
			}
			wk = binarySearch(t, x, 1);
			if(wk[0] < 99999999999L) {
    			wk2 = binarySearch(s, wk[1], 0);
    			ans = Math.min(ans, wk[0] + wk2[0]);
			}	
			return ans;
		}
		
		public void solve(int testNumber, MyInput in, PrintWriter out) {
			int A = in.nextInt();
			int B = in.nextInt();
			int Q = in.nextInt();
			s = new long[A];
			t = new long[B];
			long x = 0L;
			for(int i=0; i < A; i++) {
				s[i] = in.nextLong();
			}
			for(int i=0; i < B; i++) {
				t[i] = in.nextLong();
			}
			for(int i=0; i < Q; i++) {
				x = in.nextLong();
				out.println(calc(x));
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
