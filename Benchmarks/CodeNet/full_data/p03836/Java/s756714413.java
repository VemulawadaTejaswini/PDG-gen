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
    // 1 <= R, C <= 50  : R = 行数　　C = 列数
    // Sy, Sx = スタート、　　Gy, Gx = ゴール
    // C(y, x) :  . = 道　　# = 壁
    //
    // スタートからゴールへの最小手数は？
    //
    static class Solver {
		String BLANK = "BLANK";
		char UP = 		'U';
		char DOWN = 	'D';
		char LEFT = 	'L';
		char RIGHT = 	'R';

    	boolean[][] c = new boolean[2000][2000];					// データ(true が壁）
    	Queue<Pair<Integer, Integer>> que = new ArrayDeque<>();		// キュー
    	String[][] f = new String[2000][2000];						// 道順を保存（通ったかどうかのフラグも兼ねる）

    	// 使った道を壁にする
    	public void clear(int sy, int sx, String s) {
    		char wk;
    		for(int i=0; i < s.length(); i++) {
    			wk = s.charAt(i);
    			if(wk == UP) 	sy++;
    			if(wk == DOWN)	sy--;
    			if(wk == LEFT)	sx--;
    			if(wk == RIGHT) sx++;
				c[sy][sx] = true;
    		}
    	}
    	// スタートとゴールの位置を受け取る
    	public String calc(int sy, int sx, int gy, int gx) {
    		int y, x;
    		Pair<Integer, Integer> p = null;
    		c[sy][sx] = false; 
    		c[gy][gx] = false;
    		f[sy][sx] = "";								// スタートを空とする
    		que.clear();
    		que.add(new Pair(sy, sx));					// スタートをキューに入れる
			while(que.peek() != null) {
				p = que.poll();
				y = p.getKey();
				x = p.getValue();
				if(y == gy && x == gx) {				// ゴールかの判定
					break;
				}
				// 現在位置の上下左右が道で、通っていなければ　キューに入れる
    			if(!c[y-1][x] && f[y-1][x].equals(BLANK)) {
    				que.add(new Pair(y-1, x));
    				f[y-1][x] = f[y][x] + DOWN;			// 道順を設定する
    			}
    			if(!c[y][x-1] && f[y][x-1].equals(BLANK)) {
    				que.add(new Pair(y, x-1));
    				f[y][x-1] = f[y][x] + LEFT;
    			}
    			if(!c[y][x+1] && f[y][x+1].equals(BLANK)) {
    				que.add(new Pair(y, x+1));
    				f[y][x+1] = f[y][x] + RIGHT;
    			}
    			if(!c[y+1][x] && f[y+1][x].equals(BLANK)) {
    				que.add(new Pair(y+1, x));
    				f[y+1][x] = f[y][x] + UP;
    			}
			}
			clear(sy, sx, f[gy][gx]);
    		return f[gy][gx];							// ゴールまでの道順を返す
    	}
    	
    	public void solve(int testNumber, MyInput in, PrintWriter out) {
    		int sx = in.nextInt();			// スタート
    		int sy = in.nextInt();
    		int gx = in.nextInt();			// ゴール
    		int gy = in.nextInt();

    		String ans;
    		for(int i=0; i < 2000; i++) for(int j=0; j < 2000; j++)     f[i][j] = BLANK;
        	ans = calc(sy + 1000, sx + 1000, gy + 1000, gx + 1000);
    		for(int i=0; i < 2000; i++) for(int j=0; j < 2000; j++)     f[i][j] = BLANK;
        	ans += calc(gy + 1000, gx + 1000, sy + 1000, sx + 1000);
    		for(int i=0; i < 2000; i++) for(int j=0; j < 2000; j++)     f[i][j] = BLANK;
        	ans += calc(sy + 1000, sx + 1000, gy + 1000, gx + 1000);
    		for(int i=0; i < 2000; i++) for(int j=0; j < 2000; j++)     f[i][j] = BLANK;
        	ans += calc(gy + 1000, gx + 1000, sy + 1000, sx + 1000);
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
