import java.io.*;
import java.util.*;
class Main {
    InputReader in;
    final long mod=1000000007;
    StringBuilder sb;
    public static void main(String[] args) throws java.lang.Exception {
        new Main().run();
    }
    void run() throws Exception {
        in=new InputReader(System.in);
        sb = new  StringBuilder();
        int t=1;
        while(t-->0)
            solve();
        System.out.print(sb);
    } 
    int n, dp[];
    boolean vis[];
    ArrayList<Integer> adj[];
    void dfs(int u) {
        vis[u]=true;
        for(Integer i : adj[u]) {
            if(!vis[i])
                dfs(i);
            dp[u]=Math.max(dp[u],1+dp[i]);
        }
    }
    void solve() {
        int i,j;
        int n=i(), m=i();
        char a[][]=new char[n][m];
        for(i=0;i<n;i++)
            a[i]=s().toCharArray();
        long dp[][]=new long[n][m];
        for(i=0;i<n;i++) {
            if(a[i][0]=='.')
                dp[i][0]=1;
            else
                break;
        }
        for(i=0;i<m;i++) {
            if(a[0][i]=='.')
                dp[0][i]=1;
            else
                break;
        }
        for(i=1;i<n;i++) {
            for(j=1;j<m;j++) {
                if(a[i][j]=='#') {
                    dp[i][j]=-1;
                    continue;
                }
                if(dp[i-1][j]>0)
                    dp[i][j]=(dp[i][j]+dp[i-1][j])%mod;
                if(dp[i][j-1]>0)
                    dp[i][j]=(dp[i][j]+dp[i][j-1])%mod;
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
    long power(long x, long y, long p) { 
        long res = 1;       
        x = x % p;  
        if (x == 0) return 0;   
        while (y > 0) {
            if((y & 1)==1) 
                res = (res * x) % p;  
            y = y >> 1;  
            x = (x * x) % p;  
        } 
        return res%p; 
    } 
    int gcd(int a, int b) {
        return (b==0)?a:gcd(b,a%b);
    }
    String s(){return in.next();}
    int i(){return in.nextInt();}
    long l(){return in.nextLong();}
    class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
        public int peek() {
            if (numChars == -1)
                return -1;
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    return -1;
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar];
        }
        public void skip(int x) {
            while (x-->0)
                read();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public String nextString() {
            return next();
        }
        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
 
            return res.toString();
        }
        public String nextLine() {
            StringBuffer buf = new StringBuffer();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r')
                    buf.appendCodePoint(c);
                c = read();
            }
            return buf.toString();
        }
        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
        public boolean hasNext() {
            int value;
            while (isSpaceChar(value = peek()) && value != -1)
                read();
            return value != -1;
        }
        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}