import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import java.util.NoSuchElementException;


public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static int n;	
	static final int mod = 1_000_000_007;
	static long fac [];
	
	public static void main(String[] args) {
		n = sc.nextInt();
		int p = sc.nextInt();
		
		long one = 0;
		long zero = 0;
		int a = 0;
		
		for (int i=0; i<n; i++) {
			a = sc.nextInt();
			if (a%2==0)
				zero++;
			else
				one++;
		}
		
		long ans = 0;
		
		build_fac(50);
		

		long even = pow(2L, (int)zero);
		long odd = 0;
		
		for (int i=p; i<=one; i+=2) {
			odd += nCr((int)one, i);
		}

		ans = even*odd;
			
		out.println(ans);	
		
		out.flush();
		
	}

	static void build_fac(int j) {
		fac = new long [j+1];
		fac[0]=1;
		
		for (int i=1; i<=j; i++) {
			fac[i] = (i*fac[i-1])%mod;
		}
	}
	
	public static long pow (long a, int j) {
	    long res=1;
	    while (j>0) {
	        if ((j-j/2*2)==1) {
	            res=(res*a)%mod;
	        }
	        a=(a*a)%mod;
	        j>>=1;
	    }
	    return res;
	}
 
	public static long modinv(long j) {
		return pow(j, mod-2);
	}
 
	public static long nCr(int j, int r) {
		return (fac[j] * modinv(fac[j-r]) % mod * modinv(fac[r]))%mod;
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
	    
	    public double nextDouble () {
	    	return Double.parseDouble(next());
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
