import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();

    public static void main(String[] args) {
    	int n = sc.nextInt();
    	int sum = n * (n + 1) / 2;
    	if(n%2 == 0) {
    		System.out.println(n * (n-2) / 2);
    		for(int i=1; i<=n; i++) {
    			for(int j=i+1; j<=n; j++) {
    				if(i+j == n+1) continue;
    				System.out.println(i + " " + j);
    			}
    		}
    	} else {
    		System.out.println((n-1) + (n-1) * (n-3) / 2);
    		for(int i=1; i<=n-1; i++) {
    			System.out.println(i + " " + n);
    		}
    		for(int i=1; i<=n-1; i++) {
    			for(int j=i+1; j<=n-1; j++) {
    				if(i+j == n) continue;
    				System.out.println(i + " " + j);
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
