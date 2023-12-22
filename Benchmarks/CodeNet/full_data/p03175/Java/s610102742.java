import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    static int n;
    static ArrayList<Integer>g[];
    static long dp[][];
    static int M=(int)1e9+7;
    static long solve(int u,int k,int p)
    {
        if(g[u].size()==1&&u!=0)
        {
            return 1;
        }
        if(dp[u][k]!=-1)
            return dp[u][k];
        dp[u][k]=1;
        for(int v : g[u])
        {
            if(v!=p)
            {
                if(k==0)
                    dp[u][k]=(dp[u][k]%M*(solve(v,0,u)%M+solve(v,1,u)%M)%M)%M;
                else
                    dp[u][k]=(dp[u][k]%M*solve(v,0,u)%M)%M;
            }
        }
        //System.out.println(u+" "+k+" "+dp[u][k]);
        return dp[u][k]%M;
    }
    public static void main(String args[])throws Exception
    {
        try
        {
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out);
            n=in.ni();
            g=new ArrayList[n+1];
            dp=new long[n+1][2];
            for(int i=0;i<=n;i++)
                Arrays.fill(dp[i],-1);
            for(int i=0;i<=n;i++)
                g[i]=new ArrayList<>();
            for(int i=1;i<n;i++)
            {
                int u=in.ni();
                int v=in.ni();
                g[u].add(v);
                g[v].add(u);
            }
            g[0].add(1);
            g[1].add(0);
            out.println(solve(0,0,0)%M);
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
