import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    static Node[] V;
    static int size = 0;

    public static void main(String[] args) {
    	int n = sc.nextInt();
    	Point[] p = new Point[n];
    	for(int i=0; i<n; i++) {
    		p[i] = new Point(sc.nextInt(), sc.nextInt());
    	}
    	Arrays.sort(p, (a, b) -> a.x - b.x);

    	V = new Node[100001];
    	int lastx = -1;
    	int lasty = -1;
    	for(int i=0; i<n; i++) {
    		if(V[p[i].y] == null) {
    			Node no = new Node();
    			no.y = p[i].y;
    			no.x.add(p[i].x);
    			V[p[i].y] = no;
    		} else {
    			V[p[i].y].x.add(p[i].x);
    		}
    		if(p[i].x == lastx) {
    			V[p[i].y].nbr.add(lasty);
    			V[lasty].nbr.add(p[i].y);
    		}
    		lastx = p[i].x;
    		lasty = p[i].y;
    	}
    	long ans = 0;
    	for(int i=0; i<100001; i++) {
    		if(V[i] == null) continue;
    		HashSet<Integer> xa = new HashSet<>();
    		size = 0;
    		if(!V[i].vst) V[i].dfs(xa);
    		ans += size * xa.size();
    	}
    	System.out.println(ans - n);
    }

    static class Point{
    	int x;
    	int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
    }

    static class Node {
        HashSet<Integer> nbr = new HashSet<>();
        int y;
        HashSet<Integer> x = new HashSet<>();
        boolean vst = false;
        void dfs(HashSet<Integer> xa) {
        	vst = true;
        	size++;
        	for(int xx : x) {
        		xa.add(xx);
        	}
        	for(int i : nbr) {
        		if(!V[i].vst) {
        			V[i].dfs(xa);
        		}
        	}
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
