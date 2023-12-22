import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;


public class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int a [] = sc.nextIntArray(N, true);
		
		if (N==1){
			if (a[1]==0)
				out.println(0);
			else {
				out.println(1);
				out.println(1);
			}
			
		}
		else if (N==2){
			if (a[1]==0) {
				if (a[2]==0){
					out.println(0);
				}
				else {
					out.println(1);
					out.println(2);
				}	
			}
			else {
				if (a[2]==0){
					out.println(1);
					out.println(1);
				}
				else {
					out.println(1);
					out.println(2);
				}
			}
			
		}
		
		else {
			int ans [] = new int [N+1];
			int mid = N/2;
			
			for (int i=N; i>mid; i--){
				ans [i] = a[i];
				
			}
			
			if (N%2!=0)
				mid++;
			
			for (int i=mid; i>1; i--){
				int temp = 0;
				int ind = 2*i;
				
				while (ind<=N) {
					temp+=ans[ind];
					ind+=i;
				}
				
				if (temp%2!=a[i]){
					ans[i]=1;
				}		
					
			}
			
			int cnt = 0;
			//ans [1] = a[1];
			
			for (int i=2; i<N+1; i++){
				if (ans[i]==1) {
					cnt++;
				}
			}	
			if (cnt%2==a[1])
				ans[1]=0;
			else {
				ans[1]=1;
				cnt++;
			}
				
			out.println(cnt);
			
			for (int i=1; i<cnt+1; i++){
				if (ans[i]==1) {
					out.print(i+" ");
				}
				
			}
		
		
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



