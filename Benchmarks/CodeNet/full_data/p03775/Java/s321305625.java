import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.HashMap;
import java.util.NoSuchElementException;


public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	//static String S;
	static long n;
	//static int m;
	static Deque <Long> p;
	static Deque <Long> q;
	
	
	public static void main(String[] args) {
		n = sc.nextLong();
		
		p = new ArrayDeque <Long> ();
		q = new ArrayDeque <Long> ();
		
		if (n!=1) {
			p.add((long) 1);
			q.add((long) 1);
		}
		
		factorize (n);
		
		int size = q.size();
		
		long left [] = new long [size];
	
		int d = 0;
		int i = 0;
		long pr = 1;
		long copy = 1;
		
		for (long k: q) {
			pr *= k;
			copy = pr;
			d = 1;
			while (pr>=10) {
				pr/=10;
				d++;
			}
			left[i] = d;
			pr = copy;
			i++;
		}
		
		long right [] = new long [size+1];
		
		i = size-1;
		pr = 1;
			
		while (!p.isEmpty()) {
			pr*=p.pollLast();
			copy = pr;
			d = 1;
			while (pr>=10) {
				pr/=10;
				d++;
			}
			right[i] = d;
			pr = copy;
			i--;
		}
		right[size] = 1;
		
		long ans = 1_000_000_000_000L;
		for (i=0; i<size; i++) {
			//out.println(left[i]+" "+right[i+1]);
			ans = Math.min(ans, Math.max(left[i], right[i+1]));
		}
		
		if (ans == 1_000_000_000_000L)
			out.println(1);
		
		else 
			out.println(ans);

		
		
		out.flush();
		
	}
	
	static void factorize (long j) {
		
		for (long i=2; i*i<=j; i++){
        	while (j%i==0) {
        		j/=i;
        		q.add(i);
        		p.add(i);
        	}
		}
        if (j!=1) {
        	q.add(j);
        	p.add(j);
        }
        
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



