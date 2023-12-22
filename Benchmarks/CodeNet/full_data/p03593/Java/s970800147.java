import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int[] alp = new int[26];
		for(int i=0; i<H; i++) {
			char[] c = sc.next().toCharArray();
			for(int j=0; j<W; j++) {
				alp[c[j] - 'a']++;
			}
		}
		
		int set4 = 0;
		int set2 = 0;
		int set1 = 0;
		if(H%2 == 0 && W%2 == 0) {
			set4 = H * W / 4;
		} else if(H%2 == 0) {
			set2 = H / 2;
			set4 = (W-1) * H / 4;
		} else if(W%2 == 0){
			set2 = W / 2;
			set4 = (H-1) * W / 4;
 		} else {
			set1 = 1;
			set2 = (H-1) / 2 + (W-1) / 2;
			set4 = (H-1) * (W-1) / 4;
		}
		
//		System.out.println(set4 + " " + set2 + " " + set1);
		
		int pos = 0;
		while(pos < 26) {
			if(alp[pos] == 0) {
				pos++;
				continue;
			}
			
			if(alp[pos]%4 == 0) {
				if(set4 > 0) {
					set4--;
					alp[pos] -= 4;
				} else if(set2 >= 2){
					set2 -= 2;
					alp[pos] -= 4;
				} else {
					System.out.println("No");
					return;
				}
			} else if(alp[pos] %2 == 0){
				if(set2 > 0) {
					set2--;
					alp[pos] -= 2;
				} else {
					System.out.println("No");
					return;
				}
			} else {
				if(set1 > 0) {
					set1--;
					alp[pos] -= 1;
				} else {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
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
