import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	static BigDecimal[] fact = new BigDecimal[51];
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int P = sc.nextInt();
		
		fact[0] = new BigDecimal(1);
		for(int i=1; i<fact.length; i++) {
			fact[(int)i] = fact[(int)i-1].multiply(new BigDecimal(i));
		}
		
		int even = 0;
		int odd = 0;
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			if(a%2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		
		BigDecimal sum = new BigDecimal(0);
		if(P == 0) {
			for(int j=0; j<=odd; j+=2) {
				sum = sum.add(nck(odd, j));
			}
		} else {
			for(int j=1; j<=odd; j+=2) {
				sum = sum.add(nck(odd, j));
			}
		}
		
		for(int i=0; i<even; i++) {
			sum = sum.multiply(new BigDecimal(2));
		}
		
		System.out.println(sum.toPlainString());
	}
	
	static BigDecimal nck(int n, int k) {
		return fact[n].divide(fact[k], RoundingMode.HALF_UP).divide(fact[n-k], RoundingMode.HALF_UP);
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