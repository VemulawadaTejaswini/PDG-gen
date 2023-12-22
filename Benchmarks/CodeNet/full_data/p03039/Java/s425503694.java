import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static long mod = 1000000007;

    public static void main(String[] args) {
    	long N = sc.nextLong();
    	long M = sc.nextLong();
    	long K = sc.nextLong();
    	long[] frac = new long[(int)N * (int)M];
    	frac[0] = 1;
    	for(int i=1; i<N*M; i++) {
    		frac[i] = frac[i-1] * i % mod;
    	}
    	long C = frac[(int)N*(int)M-2] * power(frac[(int)K-2], mod-2) % mod * power(frac[(int)N*(int)M-(int)K], mod-2) % mod;
    	//System.out.println(C);
    	long sum = 0;
    	for(int i=0; i<N; i++) {
    		for(int j=0; j<M; j++) {
    			sum += (M-1-j) * (M-1-j + 1) / 2 % mod;
    			sum += ((M-1-j) * (M-1-j + 1) / 2 + (j) * (j + 1) / 2) * (N-1-i) % mod;
    			sum += ((N-1-i) * (N-1-i + 1) / 2) * M % mod;
    		}
    	}
    	System.out.println(sum * C % mod);
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
