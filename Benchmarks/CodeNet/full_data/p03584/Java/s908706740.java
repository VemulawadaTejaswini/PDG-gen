import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		long K = sc.nextLong();
		
		long[] A = new long[N];
		long[] B = new long[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		
		boolean[] digit = new boolean[31];
		for(int i=0; i<31; i++) {
			digit[i] = ((K >> i) & 1) == 1 ? true : false;
		}
		long max = 0;
		a:
		for(int i=0; i<N; i++) {
			for(int j=0; j<31; j++) {
				if(!digit[j] && ((A[i] >> j) & 1) == 1) {
					continue a;
				}
			}
			max += B[i];
		}

		for(int i=1; i<31; i++) {
			if(!digit[i]) continue;
			boolean[] digit2 = new boolean[31];
			for(int j=0; j<31; j++) {
				if(j == i) {
					digit2[j] = false;
				} else if(j < i) {
					digit2[j] = true;
				} else {
					digit2[j] = digit[j];
				}
			}
			long ans = 0;
			b:
			for(int k=0; k<N; k++) {
				for(int j=0; j<31; j++) {
					if(!digit2[j] && ((A[k] >> j) & 1) == 1) {
						continue b;
					}
				}
				ans += B[k];
			}
			
			if(ans > max) max = ans;
		}
		
		System.out.println(max);
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
