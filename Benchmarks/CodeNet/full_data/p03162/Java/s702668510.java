import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main{
    static int max(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
    static int funct3(int a,int b,int a2,int b2,int c2)
    {
        int s=0;
        int max=Math.max(a,b);
        if(max==a)
            s=a+Math.max(b2,c2);
        else
            s=b+Math.max(a2,c2);
        return s;
    }
    static int funct2(int a,int c,int a2,int b2,int c2)
    {
        int s=0;
        int max=Math.max(a,c);
        if(max==a)
            s=a+Math.max(b2,c2);
        else
            s=c+Math.max(a2,b2);
        return s;
    }
    static int funct1(int b,int c,int a2,int b2,int c2)
    {
        int s=0;
        int max=Math.max(b,c);
        if(max==b)
            s=b+Math.max(a2,c2);
        else
            s=c+Math.max(a2,b2);
        return s;
    }
    public static void task(InputReader in){
        //---------------------------------Solve here---------------------------------------------------------------------------------
        int n=in.nextInt();
        int a[]=new int[n+1];
        int b[]=new int[n+1];
        int c[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            a[i]=in.nextInt();
            b[i]=in.nextInt();
            c[i]=in.nextInt();
        }
        int dp[][]=new int[n+1][4];
        dp[1][1]=a[1];
        dp[1][2]=b[1];
        dp[1][3]=c[1];
        dp[0][1]=0;
        dp[0][2]=0;
        dp[0][3]=0;
        //out.println(dp[1][1]+" "+dp[1][2]+" "+dp[1][3]);
        for(int i=2;i<=n;i++)
        {
           /* int v=max(dp[i-2][1],dp[i-2][2],dp[i-2][3]);
            dp[i][1]=v+Math.max(b[i-1],c[i-1])+a[i];
            dp[i][2]=v+Math.max(a[i-1],c[i-1])+b[i];
            dp[i][3]=v+Math.max(b[i-1],a[i-1])+c[i];
            out.println(dp[i][1]+" "+dp[i][2]+" "+dp[i][3]);*/
            dp[i][1]=funct1(b[i-1],c[i-1],dp[i-2][1],dp[i-2][2],dp[i-2][3])+a[i];
            dp[i][2]=funct2(a[i-1],c[i-1],dp[i-2][1],dp[i-2][2],dp[i-2][3])+b[i];
            dp[i][3]=funct3(a[i-1],b[i-1],dp[i-2][1],dp[i-2][2],dp[i-2][3])+c[i];
           // dp
            
        }
        int r=max(dp[n][1],dp[n][2],dp[n][3]);
        out.print(r);
        //---------------------------------------------------------------------------------------------------------------------------- 
    }
    public static void main(String[] args)throws IOException {
        try{
            InputStream inputStream = System.in;
            InputReader in = new InputReader(inputStream);
            task(in);
            out.close();
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
    public static class InputReader {
        /*
        String-nextString()
        int   -nextInt()
        double-nextDouble()
        long  -nextLong()
        char  -nextChar()
        line  -nextLine()
        */
		private InputStream stream;
		private byte[] buf = new byte[8192];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;
		public InputReader(InputStream stream) {
			this.stream = stream;
		}
		public int read() {
			if (numChars == -1) {
				throw new InputMismatchException();
			}
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0) {
					return -1;
				}
			}
			return buf[curChar++];
		}
		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9') {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
		public String nextString() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}
		public double nextDouble() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			double res = 0;
			while (!isSpaceChar(c) && c != '.') {
				if (c == 'e' || c == 'E') {
					return res * Math.pow(10, nextInt());
				}
				if (c < '0' || c > '9') {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = read();
			}
			if (c == '.') {
				c = read();
				double m = 1;
				while (!isSpaceChar(c)) {
					if (c == 'e' || c == 'E') {
						return res * Math.pow(10, nextInt());
					}
					if (c < '0' || c > '9') {
						throw new InputMismatchException();
					}
					m /= 10;
					res += (c - '0') * m;
					c = read();
				}
			}
			return res * sgn;
		}
		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9') {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
		public String nextLine() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }
        public char nextChar(){
            return nextString().charAt(0);
        }
		public boolean isSpaceChar(int c) {
			if (filter != null) {
				return filter.isSpaceChar(c);
			}
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
		public String next() {
			return nextString();
		}
		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
		private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
	}
}