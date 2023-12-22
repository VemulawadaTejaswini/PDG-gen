import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    static int n,w;
    static int val[],wt[];
    static long dp[][];
    public static void main(String args[])throws Exception
    {
        try
        {
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out);
            n=in.ni();
            w=in.ni();
            val=new int[n+1];
            wt=new int[n+1];
            dp=new long[n+1][w+1];
            Arrays.fill(dp[0],-1);
            for(int i=1;i<=n;i++)
            {
                wt[i]=in.ni();
                val[i]=in.ni();
                Arrays.fill(dp[i],-1);
            }
            dp[0][0]=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=w;j++)
                {
                    if(dp[i][j]!=-1)
                    {
                        dp[i+1][j]=Math.max(dp[i+1][j],dp[i][j]);
                        if(j+wt[i+1]<=w)
                        {
                            dp[i + 1][j + wt[i + 1]] = Math.max(dp[i][j] + val[i + 1], dp[i + 1][j + wt[i + 1]]);
                        }
                    }
                }
            }
            long ans=0;
            for(int j=0;j<=w;j++)
            {
                ans=Math.max(ans,dp[n][j]);
            }
            out.println(ans);
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
