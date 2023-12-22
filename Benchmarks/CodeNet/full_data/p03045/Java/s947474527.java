import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static boolean DEBUG_FLG = false;
    static Node[] V;
    static int num1 = 0;
    static int num2 = 0;
    static int num3 = 0;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	V = new Node[N];
    	for(int i=0; i<N; i++) {
    		V[i] = new Node();
    	}
    	for(int i=0; i<M; i++) {
    		int X = sc.nextInt() - 1;
    		int Y = sc.nextInt() - 1;
    		int Z = sc.nextInt();
    		V[X].nbr.add(Y);
    		V[Y].nbr.add(X);
    	}

    	int ans = 0;
    	for(int i=0; i<N; i++) {
    		if(!V[i].vst) {
    			num1 = 0;
    			num2 = 0;
    			num3 = 0;
    			V[i].dfs(0);
    			int x = Math.min(num1, Math.min(num2, num3));
        		if(x == 0) x = 1;
        		ans += x;
    		}
    	}
    	System.out.println(ans);
    }

    static class Node {
        HashSet<Integer> nbr = new HashSet<>();
        boolean vst = false;
        void dfs(int mode) {
        	vst = true;
        	if(mode == 0) {
        		num1++;
        	} else if(mode == 1) {
        		num2++;
        	} else {
        		num3++;
        	}
        	for(int x : nbr) {
        		if(!V[x].vst) {
        			V[x].dfs((mode+1)%3);
        		}
        	}
        }
    }

    static void debug(long... args) {
    	if(!DEBUG_FLG) return;
    	boolean flg = false;
    	for(long s : args) {
    		if(flg) System.out.print(" ");
    		flg = true;
    		System.out.print(s);
    	}
    	System.out.println();
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
