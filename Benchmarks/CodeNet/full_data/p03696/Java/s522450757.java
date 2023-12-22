import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		char[] c = sc.next().toCharArray();
		ArrayList<Character> str = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			str.add(c[i]);
		}
		
		int kakko = 0;
		int kakko_l = 0;
		int kakko_r = 0;
		int kakko_max = 0;
		int kakko_min = 0;
		for(int i=0; i<N; i++) {
			if(str.get(i) == '(') {
				kakko++;
				kakko_l++;
				if(kakko > kakko_max) {
					kakko_max = kakko;
				}
			} else if(str.get(i) == ')'){
				kakko--;
				kakko_r++;
				if(kakko < kakko_min) {
					kakko_min = kakko;
				}
			}
		}
		

		for(int i=1; i<=kakko_min * (0-1); i++) {
			str.add(0, '(');
			kakko_l++;
			kakko++;
		}
		
		for(int i=1; i<=kakko; i++) {
			str.add(')');
			kakko_r++;
		}
		
		
		if(kakko_l < kakko_r) {
			for(int i=1; i<=kakko_r-kakko_l; i++) {
				str.add(0, '(');
			}
		} else if(kakko_l > kakko_r) {
			for(int i=1; i<=kakko_l-kakko_r; i++) {
				str.add(')');
			}
		}
		
		
		
		for(int i=0; i<str.size(); i++) {
			System.out.print(str.get(i));
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

