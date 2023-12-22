import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		long[] a = new long[3*n];
		for(int i=0; i<3*n; i++) {
			a[i] = sc.nextLong();
		}
		
		int l_length = 3 * n / 2;
		int r_length = 3 * n - l_length;
		
		long score_max1 = Integer.MIN_VALUE;
		while(l_length >= n && r_length >= n) {
			long[] l = new long[l_length];
			for(int i=0; i<l_length; i++) {
				l[i] = a[i];
			}
			
			long[] r = new long[r_length];
			for(int i=0; i<r_length; i++) {
				r[i] = a[l_length + i];
			}
			
			Arrays.sort(l);
			Arrays.sort(r);
			
			long l_sum = 0;
			for(int i=l_length - n; i<l_length; i++) {
				l_sum += l[i];
			}
			
			long r_sum = 0;
			for(int i=0; i<n; i++) {
				r_sum += r[i];
			}
			
			if(l_sum - r_sum > score_max1) {
				score_max1 = l_sum - r_sum;
				System.out.println(l_length + " " + r_length + " " + l_sum + " " + r_sum + " " + score_max1);
			} else {
//				break;
			}
			
			l_length--;
			r_length++;
		}
		
		long score_max2 = Integer.MIN_VALUE;
		l_length = 3 * n / 2 + 1;
		r_length = 3 * n - l_length;
		while(l_length >= n && r_length >= n) {
			long[] l = new long[l_length];
			for(int i=0; i<l_length; i++) {
				l[i] = a[i];
			}
			
			long[] r = new long[r_length];
			for(int i=0; i<r_length; i++) {
				r[i] = a[l_length + i];
			}
			
			Arrays.sort(l);
			Arrays.sort(r);
			
			long l_sum = 0;
			for(int i=l_length - n; i<l_length; i++) {
				l_sum += l[i];
			}
			
			long r_sum = 0;
			for(int i=0; i<n; i++) {
				r_sum += r[i];
			}
			
			if(l_sum - r_sum > score_max2) {
				score_max2 = l_sum - r_sum;
				System.out.println(l_length + " " + r_length + " " + l_sum + " " + r_sum + " " + score_max2);
			} else {
//				break;
			}
			
			l_length++;
			r_length--;
		}
		
		System.out.println(Math.max(score_max1, score_max2));
	}

	static class FastScanner {
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
	        return Long.parseLong(next());
	    }
	    public int nextInt(){
	    	return Integer.parseInt(next());
	    }
	}
}
