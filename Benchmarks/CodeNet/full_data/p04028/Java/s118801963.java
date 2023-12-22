import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class Main {
    static class Scanner {
        BufferedReader br;
        StringTokenizer tk = new StringTokenizer("");

        public Scanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        public int nextInt() throws IOException {
            if (tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return nextInt();
        }

        public long nextLong() throws IOException {
            if (tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return nextLong();
        }

        public String next() throws IOException {
            if (tk.hasMoreTokens())
                return (tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return next();
        }

        public String nextLine() throws IOException {
            tk = new StringTokenizer("");
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            if (tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return nextDouble();
        }

        public char nextChar() throws IOException {
            if (tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk = new StringTokenizer(br.readLine());
            return nextChar();
        }

        public int[] nextIntArray(int n) throws IOException {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) throws IOException {
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        public int[] nextIntArrayOneBased(int n) throws IOException {
            int a[] = new int[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArrayOneBased(int n) throws IOException {
            long a[] = new long[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = nextLong();
            return a;
        }


    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new Runnable() {
            public void run() {
                try {
                    solve();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 26).start();

    }
    static long mod=1000000007;
    static int dp[][];
    static int N;
    static void solve() throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        N=in.nextInt();
        int n=in.next().length();
        dp=new int[N+1][N+1];
        for(int i=0;i<=N;i++)
            Arrays.fill(dp[i], -1);
        dp[0][0]=1;
        for(int i=1;i<=N;i++)
            dp[i][0]=0;
        long ans=sol(n, N);
        for(int i=0;i<n;i++){
            ans*=500000004;
            ans%=mod;
        }
        out.println(ans);
        out.close();

    }

    private static long sol(int i, int j) {
        if(i<0)
            return 0;
        if(i>N)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        dp[i][j]=(int)(2*sol(i-1, j-1));
        if(dp[i][j]>=mod)
            dp[i][j]-=mod;
        dp[i][j]+=(int)sol(i+1, j-1);
        if(i==0){
            dp[i][j]+=(int)sol(i,j-1);
            if(dp[i][j]>=mod)
                dp[i][j]-=mod;
        }
        if(dp[i][j]>=mod)
            dp[i][j]-=mod;
        return dp[i][j];
    }
}
