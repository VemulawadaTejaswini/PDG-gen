import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static boolean DEBUG_FLG = false;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	PriorityQueue<Integer> A = new PriorityQueue<>();
    	for(int i=0; i<N; i++) {
    		A.add(sc.nextInt());
    	}
    	Set[] set = new Set[M];
    	for(int i=0; i<M; i++) {
    		set[i] = new Set(sc.nextInt(), sc.nextInt());
    	}
    	Arrays.sort(set, (a, b) -> b.C - a.C);
    	for(int i=0; i<M; i++) {
    		for(int j=0; j<set[i].B; j++) {
    			int x = A.poll();
    			if(x >= set[i].C) {
    				A.add(x);
    				break;
    			} else {
    				A.add(set[i].C);
    			}
    		}
    	}
    	long sum = 0;
    	for(int i=0; i<N; i++) {
    		sum += (long)A.poll();
    	}
    	System.out.println(sum);
    }

    static class Set {
    	int B;
    	int C;
		public Set(int b, int c) {
			B = b;
			C = c;
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
