import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    static Node[] V;
    static ArrayDeque<Stack> stk = new ArrayDeque<>();

    public static void main(String[] args) {
    	int n = sc.nextInt();
    	V = new Node[n];
    	for(int i=0; i<n; i++) {
    		V[i] = new Node();
    	}
    	for(int i=0; i<n-1; i++) {
    		int a = sc.nextInt() - 1;
    		int b = sc.nextInt() - 1;
    		int w = sc.nextInt();
    		if(w%2 == 0) {
    			V[a].evennbr.add(b);
        		V[b].evennbr.add(a);
    		} else {
    			V[a].oddnbr.add(b);
        		V[b].oddnbr.add(a);
    		}
    	}
    	V[0].dfs(false);
    	for(int i=0; i<n; i++) {
    		if(V[i].color) {
    			System.out.println(0);
    		} else {
    			System.out.println(1);
    		}
    	}
    }

    static class Node {
        HashSet<Integer> oddnbr = new HashSet<>();
        HashSet<Integer> evennbr = new HashSet<>();
        boolean vst = false;
        boolean color;
        void dfs(boolean mode) {
        	vst = true;
        	color = mode;
        	for(int x : oddnbr) {
        		if(!V[x].vst) {
        			V[x].dfs(!mode);
        		}
        	}
        	for(int x : evennbr) {
        		if(!V[x].vst) {
        			V[x].dfs(mode);
        		}
        	}
        }
    }

    static class Stack {
    	int idx;
		Stack(int idx) {
			this.idx = idx;
		}

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
