import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static long mod = 1000000007;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	long[] frac = new long[2001];
    	frac[0] = 1;
    	for(int i=1; i<=2000; i++) {
    		frac[i] = frac[i-1] * i % mod;
    	}
    	for(int i=1; i<=K; i++) {
    		if(N-K+1 < i) {
    			System.out.println(0);
    			continue;
    		}
    		System.out.println(frac[N-K+1] * power(frac[i], mod-2) % mod *  power(frac[N-K+1-i], mod-2) % mod * frac[K-1] % mod * power(frac[i-1], mod-2) % mod *  power(frac[K-i], mod-2) % mod);
    	}
    }

    static long power(long m , long n){
    	if(n == 0) {
    		return 1;
    	}else if(n == 1){
            return m;
        }else if(n % 2 == 0){
            long s = power(m, n/2);
            return ( (s % mod) * (s % mod) ) % mod;
        }else{
            return ( (m % mod) * (power(m, n-1) % mod) ) % mod;
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
