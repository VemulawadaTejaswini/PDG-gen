import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[][] b = new int[K][K];
		int[][] w = new int[K][K];
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			char c = sc.next().charAt(0);
			if(c == 'B') {
				if((x % (2 * K) < K && y % (2 * K) < K) || (x % (2 * K) >= K && y % (2 * K) >= K)) {
					b[x % K][y % K]++;
				} else {
					w[x % K][y % K]++;
				}
			} else {
				if((x % (2 * K) < K && y % (2 * K) < K) || (x % (2 * K) >= K && y % (2 * K) >= K)) {
					w[x % K][y % K]++;
				} else {
					b[x % K][y % K]++;
				}
			}
		}
		for(int i=0; i<K; i++) {
			for(int j=K-2; j>=0; j--) {
				b[i][j] += b[i][j+1];
			}
			for(int j=1; j<K; j++) {
				w[i][j] += w[i][j-1];
			}
		}
		int max = 0;
		for(int j=0; j<K; j++) {
			int sum = 0;
			for(int i=0; i<K; i++) {
				sum += b[i][j];
				if(j != 0) sum += w[i][j-1];
			}
			for(int i=0; i<K; i++) {
//				System.out.println(i + " " + j + " " + sum + " " + (N - sum));
				if(sum > max) max = sum;
				if(N - sum > max) max = N - sum;
				sum += b[i][0] - b[i][j] * 2;
				if(j != 0) {
					sum += w[i][K-1] - w[i][j-1] * 2;
				} else {
					sum += w[i][K-1];
				}
			}
			for(int i=0; i<K; i++) {
//				System.out.println(i + " " + j + " " + sum + " " + (N - sum));
				if(sum > max) max = sum;
				if(N - sum > max) max = N - sum;
				sum -= b[i][0] - b[i][j] * 2;
				if(j != 0) {
					sum -= w[i][K-1] - w[i][j-1] * 2;
				} else {
					sum -= w[i][K-1];
				}
			}
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
