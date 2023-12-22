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
	    int k = in.nextInt();
	    int[] a = new int[n];
	    for(int i=0;i<n;i++) {
	    		a[i] = in.nextInt();
	    }
	    int[] dp = new int[n+1];
	    
	    dp[0] = 0;
	    dp[1] = Math.abs(a[1]-a[0]);
	    for(int i=2;i<n;i++) {
	    		int mini = Integer.MAX_VALUE;
	    		int kk= k;
	    		for(int j=i-1;j>=0;j--) {
	    			if(kk==0)break;
	    			mini = Math.min(mini,dp[j]+Math.abs(a[j]-a[i]));
	    			kk--;
	    		}
	    		dp[i] = mini;
	    }
	    out.println(dp[n-1]);
	    
	    
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