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
    // 1 <= N <= 8 : 頂点の数　　1 <= M <= N*(N-1)/2 : 辺の数
    // a1 b1 : 辺
    //
    // 頂点　１　から　すべての頂点を通るパスの種類の数は？
    // 
    // 深さ優先で検索して、全ての点を回る（深さが頂点の数まで行けた）かで判断する
    //
    static class Solver {

    	// 平方分割
    	int[] D = null;		// 生データ（数字の数分の配列で　存在を 0/1 で管理している）
    	int[] S = null;		// 集計値
    	int s_max = 0;
    	
    	// 初期化
    	public void init(int max, PrintWriter out) {
			s_max = (int)Math.sqrt(max) + 1;		// 最大値の平方根で分割する
// 			out.println("max = " + max + "  s_max = " + s_max);
			D = new int[max];
			S = new int[s_max];
    	}
    	// 位置　i に　値 v を足す　　→　　このケースでは　値 i に　カウント v(=1) を足す事で、値の存在を表現している
    	public void add(int i, int v, PrintWriter out) {
    		int cnt = i / s_max;
    // 		out.println("D[" + i + "],  S[" + cnt + "]  += " + v);
    		D[i] += v;
    		S[cnt] += v;
    		if(i < s_max - 1) {
    			S[cnt] += v;
    		}
    // 		out.println(" --> D[" + i + "] = " + D[i] + "  S[" + cnt + "] = " + S[cnt]);
    	}
    	// 指定範囲の値の集計（x, y とも　0 以上で、x は含む、 y は含まない）
    	public int sum(int x, int y, PrintWriter out) {
    		int ans = 0;
    		int l = 0;
    		int r = 0;;
    		for(int i = 0; i < s_max; i++) {		// 小計分　繰り返す
    			l = i * s_max;
    			r = (i + 1) * s_max;
    			if(x <= l && r <= y) {
    				ans += S[i];		// 集計値を足す
    				if(l > 1 && D[l-1] == 1) {
    					ans += 1;
    				}
    			} else if(y <= l || r <= x) {
    				continue;
    			} else {
    				for(int j=Math.max(x,  l) ; j < Math.min(y, r); j++) {
    					ans += D[j];	// 個別の値を足す
    					if(D[j] > 0 && (j+1) < y) {
    						ans += 1;
    					} else if((j-1) > 0 && D[j-1] == 1) {
    						ans += 1;
    					}
    				}
    			}
    		}
    // 		out.println("x = " + x + "  y = " + y + "  ans = " + ans + " / 2 = " + (ans/2));
    		return (ans/2);
    	}
    	
    	public void solve(int testNumber, MyInput in, PrintWriter out) {
        	int ans = 0;
        	int N = in.nextInt();
        	int Q = in.nextInt();
    		String S = in.nextString();
    		
    		init(N,out);
    		int index = 0;
			while(true) {
				index = S.indexOf("AC", index);
				if(index == -1) {
					break;
				}
				add(index, 1, out);
				index += 2;
			}
    		
    		int l, r;
    		for(int i=0; i < Q; i++) {
    			l = in.nextInt();
    			r = in.nextInt();
        		out.println(sum(l-1, r, out));
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
