import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	//static String S;
	static int n;
	//static int m;
	static long m;
	final static int mod = 1_000_000_007;
	static HashMap <Long, Integer> map;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextLong();
		
		map = new HashMap <Long, Integer>();
		
		factorize (m);
		
		int b=0;
		long ans = 1;
		
		for (long i: map.keySet()) {
			b = map.get(i);
			ans*=(kCr(b+n-1, b)%mod);
			ans%=mod;
		}
		out.println(ans%mod);
		out.flush();
	}
	
	public static long factorial(int k) {
		long tmp = 1;
		for (int i=k; i>0; i--) {
			tmp = (tmp*i)%mod;
		}
		return tmp;
	}
	
	public static long pow(long key, int v) {
	    long res=1;
	    while (v>0) {
	        if ((v-v/2*2)==1) {
	            res=(res*key)%mod;
	        }
	        key=(key*key)%mod;
	        v>>=1;
	    }
	    return res;
	}
 
	public static long modinv(long i) {
		return pow(i, mod-2);
	}
	
	public static long kCr(int k, int r) {
		return factorial(k) * modinv(factorial(k-r)) % mod * modinv(factorial(r)) % mod;
	}
	
	static void factorize (long j) {
		for (long i=2; i*i<=j; i++){
			int cnt = 0;
			
        	while (j%i==0) {
        		j/=i;
        		cnt++;
        	}
        	if (cnt!=0)
        		map.put(i, cnt);	
        }
		
        if (j!=1) 
        	map.put(j, 1);
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



