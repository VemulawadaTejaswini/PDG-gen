import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		FastScanner scc= new FastScanner();
		long N, L;
		N = scc.nextLong();
		L = scc.nextLong();
		long[] a = new long[(int) N];
		long q = 0;
		long[] w = new long[(int) (N - 1)];
		for (int i = 0; i < a.length; i++) {
			a[i] = scc.nextLong();
			q += a[i];
		}
		int forword = 0, last = (int) (N - 1);
		for (int i = 0; i < N - 1; i++) {
			if (q < L)
				break;
			if (a[forword] <= a[last]) {
				q = q - a[forword];
				forword++;
				w[i] = forword;
			} else {
				q = q - a[last];
				w[i] = last;
				last--;
			}
		}
		if (forword == last) {
			System.out.println("Possible");
			for (int i = 0; i < w.length; i++) {
				System.out.println(w[i]);
			}
		} else {
			System.out.println("Impossible");
		}
	}
	
	
}
class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
	    private boolean hasNextByte() {
	        if (ptr < buflen) {
	            return true;
	        }else{
	            ptr = 0;
	            try {
	                buflen = in.read(buffer);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            if (buflen <= 0) {
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
	        if (!hasNext()) throw new NoSuchElementException();
	        long n = 0;
	        boolean minus = false;
	        int b = readByte();
	        if (b == '-') {
	            minus = true;
	            b = readByte();
	        }
	        if (b < '0' || '9' < b) {
	            throw new NumberFormatException();
	        }
	        while(true){
	            if ('0' <= b && b <= '9') {
	                n *= 10;
	                n += b - '0';
	            }else if(b == -1 || !isPrintableChar(b)){
	                return minus ? -n : n;
	            }else{
	                throw new NumberFormatException();
	            }
	            b = readByte();
	        }
	    }
	}