import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    static int n;
    static int m[];
    static long dp[][][];
    static long solve(int start,int end,int k)
    {
        //System.out.println(start+" "+end+" "+k);
        if(start>end)
            return 0;
        if(dp[start][end][k]!=-1)
            return dp[start][end][k];
        if(k==0)
        {
            dp[start][end][k]=Math.max(solve(start+1,end,1)+m[start],solve(start,end-1,1)+m[end]);
        }
        else
        {
            dp[start][end][k]=Math.min(solve(start+1,end,0)-m[start],solve(start,end-1,0)-m[end]);
        }
        return dp[start][end][k];
    }
    public static void main(String args[])throws Exception
    {
        try
        {
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out);
            n=in.ni();
            m=new int[n+1];
            dp=new long[n+1][n+1][2];
            for(int i=1;i<=n;i++)
                m[i]=in.ni();
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=n;j++)
                {
                    for(int k=0;k<=1;k++)
                        dp[i][j][k]=-1;
                }
            }
            out.println(solve(1,n,0));
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
