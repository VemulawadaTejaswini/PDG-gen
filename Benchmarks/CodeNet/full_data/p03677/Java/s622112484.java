import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt()-1;
		}
		
		long[] b = new long[m];
		long c = 0;
		long d = 0;
		
		for(int i=1; i<n; i++) {
			int l  = (a[i] - a[i-1] - 1 + m) % m;
			if(l == 0) continue;
			b[(a[i-1] + 2)%m] += 1;
			b[(a[i-1] + 2 + l)%m] -= l+1;
			b[(a[i-1] + 3 + l)%m] += l;
			
			if(a[i-1] + 2 <= m-1 && a[i-1] + 1 + l >= m-1) {
				c += 1;
			} else if(a[i-1] + 2 + l == m-1) {
				c -= l;
			}
			
			if(a[i-1] + 2 <= m-1 && a[i-1] + 1 + l >= m-1) {
				d += m - a[i-1] - 1;
			}
			
//			System.out.println("l=" + l);
//			for(int j=0; j<m; j++) {
//				System.out.println(b[j]);
//			}
		}
		
		b[0] += c;
		for(int i=1; i<m; i++) {
			b[i] += b[i-1];
		}
		
		b[0] += d;
		for(int i=1; i<m; i++) {
			b[i] += b[i-1];
		}
		
		
		
		long max = 0;
		for(int i=0; i<m; i++) {
//			System.out.println("i=" + i + " b[i] = " + b[i]);
			if(b[i] > max) {
				max = b[i];
			}
		}
		
		long sum = 0;
		for(int i=1; i<n; i++) {
			sum += (a[i] - a[i-1] + m)%m;
		}
		
		System.out.println(sum);
		
		System.out.println(sum - max);
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