import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    static ArrayList<Integer>g[];
    static int dp[];
    static int ans=0;
    static int vis[];
    static void dfs(int u)
    {
        vis[u]=1;
        dp[u]=1;
        int max1=0,max2=0;
        for(int v : g[u])
        {
            if(vis[v]==1)
            {
                if(dp[v]>max1)
                {
                    max2=max1;
                    max1=dp[v];
                }
                else if(dp[v]>max2)
                {
                    max2=dp[v];
                }
            }
            else
            {
                dfs(v);
                if(dp[v]>max1)
                {
                    max2=max1;
                    max1=dp[v];
                }
                else if(dp[v]>max2)
                {
                    max2=dp[v];
                }
            }
        }
        dp[u]+=max1;
    }
    public static void main(String args[])throws Exception
    {
        try
        {
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out);
            int n=in.ni();
            int m=in.ni();
            dp=new int[n+1];
            g=new ArrayList[n+1];
            vis=new int[n+1];
            for(int i=0;i<=n;i++)
                g[i]=new ArrayList<>();
            for(int i=1;i<=m;i++)
            {
                int u=in.ni();
                int v=in.ni();
                g[u].add(v);
            }
            for(int i=1;i<=n;i++)
            {
                if(vis[i]==0)
                {
                    dfs(i);
                }
            }
            for(int i=1;i<=n;i++)
                ans=Math.max(ans,dp[i]);
            out.println(ans-1);
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
