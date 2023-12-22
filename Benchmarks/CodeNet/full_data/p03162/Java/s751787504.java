import java.io.*;
import java.util.*;
import java.math.*;

//Mann Shah [ DAIICT ].

public class Main {
	static long mod = (long) (1e9+7);
	static InputReader in;
    static PrintWriter out;
    static Debugger deb;  

    
            
    	public static void main(String args[] ) throws NumberFormatException, IOException  {
			
		in = new InputReader(System.in);
	    out = new PrintWriter(System.out);
	    deb = new Debugger();
	    
	    int n = in.nextInt();
	    int[] a = new int[n];
	    int[] b = new int[n];
	    int[] c = new int[n];
	    for(int i=0;i<n;i++) {
	    		a[i] = in.nextInt();
	    		b[i] = in.nextInt();
	    		c[i] = in.nextInt();
	    }
	    int[][] dp = new int[n+1][3];
	    dp[0][0] = a[0];
	    dp[0][1] = b[0];
	    dp[0][2] = c[0];
	    for(int i=1;i<n;i++) {
	    		dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2])+a[i];
	    		dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2])+b[i];
	    		dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1])+c[i];
	    }	    
	    out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][2], dp[n-1][1])));
	    
	    
	    out.close();
	}

/* TC space


 */	
		static class InputReader
	    {
	        private final InputStream stream;
	        private final byte[] buf = new byte[8192];
	        private int curChar, snumChars;
	        private SpaceCharFilter filter;

	        public InputReader(InputStream stream){
	                this.stream = stream;
	        }
	        public int snext(){
                if (snumChars == -1) throw new InputMismatchException();
                if (curChar >= snumChars){
                        curChar = 0;
                        try{
                                snumChars = stream.read(buf);
                        } catch (IOException e){
                                throw new InputMismatchException();
                        }
                        if (snumChars <= 0)
                                return -1;
                }
                return buf[curChar++];
	        }

	        public int nextInt(){
	                int c = snext();
	                while (isSpaceChar(c)){
	                    c = snext();
	                }
	                int sgn = 1;
	                if (c == '-'){
                        sgn = -1;
                        c = snext();
	                }
	                int res = 0;
	                do{
                        if (c < '0' || c > '9')
                                throw new InputMismatchException();
                        res *= 10;
                        res += c - '0';
                        c = snext();
	                } while (!isSpaceChar(c));
	                return res * sgn;
	        }

	        public long nextLong()
	        {
	                int c = snext();
	                while (isSpaceChar(c))
	                {
	                        c = snext();
	                }
	                int sgn = 1;
	                if (c == '-')
	                {
	                        sgn = -1;
	                        c = snext();
	                }
	                long res = 0;
	                do
	                {
	                        if (c < '0' || c > '9')
	                                throw new InputMismatchException();
	                        res *= 10;
	                        res += c - '0';
	                        c = snext();
	                } while (!isSpaceChar(c));
	                return res * sgn;
	        }

	        public int[] nextIntArray(int n)
	        {
	                int a[] = new int[n];
	                for (int i = 0; i < n; i++)
	                {
	                        a[i] = nextInt();
	                }
	                return a;
	        }

	        public long[] nextLongArray(int n)
	        {
	                long a[] = new long[n];
	                for (int i = 0; i < n; i++)
	                {
	                        a[i] = nextLong();
	                }
	                return a;
	        }
	        
	        public ArrayList<Integer> nextArrayList(int n){
	        			ArrayList<Integer> x = new ArrayList<Integer>();
	        			for(int i=0;i<n;i++) {
	        				int v = in.nextInt();
	        				x.add(v);
	        			}
	        			return x;
	        }

	        public String readString()
	        {
	                int c = snext();
	                while (isSpaceChar(c))
	                {
	                        c = snext();
	                }
	                StringBuilder res = new StringBuilder();
	                do
	                {
	                        res.appendCodePoint(c);
	                        c = snext();
	                } while (!isSpaceChar(c));
	                return res.toString();
	        }

	        public String nextLine()
	        {
	                int c = snext();
	                while (isSpaceChar(c))
	                        c = snext();
	                StringBuilder res = new StringBuilder();
	                do
	                {
	                        res.appendCodePoint(c);
	                        c = snext();
	                } while (!isEndOfLine(c));
	                return res.toString();
	        }

	        public boolean isSpaceChar(int c)
	        {
	                if (filter != null)
	                        return filter.isSpaceChar(c);
	                return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	        }

	        private boolean isEndOfLine(int c)
	        {
	                return c == '\n' || c == '\r' || c == -1;
	        }

	        public interface SpaceCharFilter
	        {
	                public boolean isSpaceChar(int ch);
	        }

	    }
		
		static class Debugger{
			public void n(int x) {
				out.println(x);
			}
			
			public void a(int[] a) {
		        StringBuilder sb = new StringBuilder();
		        for(int i=0;i<a.length;i++) {
		        		sb.append(a[i]+" ");
		        }
		        out.println(sb.toString());
			}
		}
		
}