import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		ArrayList<Integer> P1 = new ArrayList<>();
		ArrayList<Integer> P2 = new ArrayList<>();
		for(int i=0; i<N; i++) {
			int temp = sc.nextInt()-1;
			P1.add(temp);
			P2.add(temp);
		}
		Collections.reverse(P2);
		int i = 0;
		int num = 0;
		int seq = 0;
		int maxseq = 0;
		while(true) {
			if(i == P1.size()) {
				if(seq > maxseq) maxseq = seq;
				seq = 0;
				i = 0;
				if(P1.size() == 0) {
					break;
				}
			} else if(P1.get(i) == num) {
				num++;
				seq++;
				P1.remove(i);
			} else {
				i++;
			}
		}
		num = N - 1;
		while(true) {
			if(i == P2.size()) {
				if(seq > maxseq) maxseq = seq;
				seq = 0;
				i = 0;
				if(P2.size() == 0) {
					break;
				}
			} else if(P2.get(i) == num) {
				num--;
				seq++;
				P2.remove(i);
			} else {
				i++;
			}
		}
		System.out.println(N - maxseq);
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
