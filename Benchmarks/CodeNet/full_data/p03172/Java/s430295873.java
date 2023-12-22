import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        try
        {
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out);
            long M=(int)1e9+7;
            int n=in.ni();
            int k=in.ni();
            int m[]=new int[n+1];
            long dp[][]=new long[n+1][k+1];
            for(int i=1;i<=n;i++)
                m[i]=in.ni();
            dp[0][0]=1;
            long a[]=new long[k+1];
            for(int i=0;i<n;i++)
            {
                Arrays.fill(a,0);
                for(int j=0;j<=k;j++)
                {
                    if(dp[i][j]==0)
                        continue;
                    dp[i][j]%=M;
                    a[j]=a[j]+dp[i][j];
                    if(j+m[i+1]+1<=k)
                        a[j+m[i+1]+1]=a[j+m[i+1]+1]-dp[i][j];
                }
                long sum=0;
                for(int j=0;j<=k;j++)
                {
                    //out.print(a[j]+" ");
                    sum=(sum+a[j]+M)%M;
                    dp[i+1][j]=sum;
                }
                //out.println();
            }
            /*for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=k;j++)
                    out.print(dp[i][j]+" ");
                out.println();
            }*/
            out.println(dp[n][k]);
            out.close();
        }
        catch(Exception e){
            return;
        }
    }
    static class InputReader {

        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int ni() {
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
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nl() {
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
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }

        public String readString() {
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

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

    }
}
