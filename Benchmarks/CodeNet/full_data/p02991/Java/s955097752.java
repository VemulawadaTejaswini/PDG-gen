import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
    private static FastScanner sc = new FastScanner();
    static Node[] V;
    static Node[] V2;
    static ArrayDeque<Stack> stk = new ArrayDeque<>();
    static PriorityQueue<Node> pq;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	V = new Node[N];
    	for(int i=0; i<N; i++) {
    		V[i] = new Node();
    		V[i].idx = i;
    	}
    	for(int i=0; i<M; i++) {
    		int a = sc.nextInt() - 1;
    		int b = sc.nextInt() - 1;
    		V[a].nbr.add(b);
    	}
    	V2 = new Node[N];
    	for(int i=0; i<N; i++) {
    		V2[i] = new Node();
    		V2[i].idx = i;
    	}
    	int S = sc.nextInt() - 1;
    	int T = sc.nextInt() - 1;
    	pq = new PriorityQueue<>((a, b) -> a.d - b.d);
    	V[S].dfs(-1, -1, -1);
    	V2[S].d = 0;

    	while(!pq.isEmpty()) {
    		Node no = pq.poll();
    		for(int x : no.nbr) {
    			if(V2[x].d > no.d + 1) {
    				V2[x].d = no.d + 1;
    				pq.add(V2[x]);
    			}
    		}
    	}
    	if(V2[T].d == 10000000) {
    		System.out.println(-1);
    	} else {
        	System.out.println(V2[T].d);
    	}

    }

    static class Node {
        HashSet<Integer> nbr = new HashSet<>();
        boolean vst = false;
        int idx;
        int d = 10000000;
        void dfs(int last1, int last2, int last3) {
        	pq.add(V2[idx]);
        	if(last3 != -1) {
        		if(V2[last3].nbr.contains(idx)) {
        			return;
        		}
        		V2[last3].nbr.add(idx);
        	}
        	for(int x : nbr) {
        		V[x].dfs(idx, last1, last2);
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
