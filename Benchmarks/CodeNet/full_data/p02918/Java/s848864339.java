import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		
		if (n==1)
			out.println (0);
		
		else if (n==2)
			out.println (1);
		
		else {
			int s1=1;
			int sn=0;
			
			if (s.charAt(0)=='L')
				s1=0;
			
			if (s.charAt(0)=='R' && s.charAt(n-1)=='L')
				sn=1;
			
			int cnt = 0;
			int rl=0;
			
			for (int i=0; i<n-1; i++){
				if (s.charAt(i)==s.charAt(i+1))
					cnt++;
				
				if (s.charAt(i)=='R' && s.charAt(i+1)=='L')
					rl++;
			}
			
			if (rl==0) {
				if (cnt!=n-1)
					cnt++;			
			}
			
			else if (k<=rl) {
				cnt+=(2*k);
				if (cnt>=n)
					cnt=n-1;
			}
			
			else if (k-rl==1) {
				cnt+=(2*rl+Math.max(s1, sn));
				if (cnt>=n)
					cnt=n-1;
			}
			
			else if (k-rl==2) {
				cnt+=(2*rl+s1+sn);
				if (cnt>=n)
					cnt=n-1;
			}
			
			else {
				cnt+=(2*rl+s1+sn+(k-2-rl));
				if (cnt>=n)
					cnt=n-1;
			}
			
			out.println(cnt);	
		}
		
        out.flush();
	}
	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;

	    private boolean hasNextByte() {
	      if (ptr < buflen) {
	        return true;
	      } else {
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

	    private int readByte() {
	      if (hasNextByte()) return buffer[ptr++];
	      else return -1;
	    }

	    private static boolean isPrintableChar(int c) {
	      return 33 <= c && c <= 126;
	    }

	    private void skipUnprintable() {
	      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
	    }

	    public boolean hasNext() {
	      skipUnprintable();
	      return hasNextByte();
	    }

	    public String next() {
	      if (!hasNext()) throw new NoSuchElementException();
	      StringBuilder sb = new StringBuilder();
	      int b = readByte();
	      while (isPrintableChar(b)) {
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
	      while (true) {
	        if ('0' <= b && b <= '9') {
	          n *= 10;
	          n += b - '0';
	        } else if (b == -1 || !isPrintableChar(b)) {
	          return minus ? -n : n;
	        } else {
	          throw new NumberFormatException();
	        }
	        b = readByte();
	      }
	    }

	    public int nextInt() {
	      return (int) nextLong();
	    }

	    public int[] nextIntArray(int N, boolean oneBased) {
	      if (oneBased) {
	        int[] array = new int[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      } else {
	        int[] array = new int[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      }
	    }

	    public long[] nextLongArray(int N, boolean oneBased) {
	      if (oneBased) {
	        long[] array = new long[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      } else {
	        long[] array = new long[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      }
	    }
	  }

	}	 




		
