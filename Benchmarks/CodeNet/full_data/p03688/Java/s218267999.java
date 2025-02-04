import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		
		int[] a = new int[N];
		int large = -1;
		int small = -1;
		
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			
			if(large != -1 && small != -1 && a[i] != large && a[i] != small) {
				System.out.println("No");
				return;
			}
			
			if(large == -1 || a[i] == large) {
				large = a[i];
			} else {
				if(a[i] > large) {
					small = large;
					large = a[i];
				} else {
					small = a[i];
				}
			}
		}
		
		if(small != -1 && large != small + 1) {
			System.out.println("No");
			return;
		}
		
		if(small == -1 && N == large + 1) {
			System.out.println("Yes");
			return;
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == small) {
				N--;
				large--;
			}
		}
		
		if(large >= 1 && N >= large * 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
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

