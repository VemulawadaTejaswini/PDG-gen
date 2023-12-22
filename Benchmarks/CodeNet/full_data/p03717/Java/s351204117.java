import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
    static ArrayList<Integer> g[][];
    static int n, m;
    static int dp[][][][];
    static void solve() throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n=in.nextInt();
        m=in.nextInt();
        g=new ArrayList[n+1][4];
        for(int i=0;i<=n;i++)
            for(int j=0;j<4;j++)
                g[i][j]=new ArrayList<>();

        dp=new int[n+1][3][][];
        for(int i=1;i<=n;i++)
            for(int j=0;j<3;j++){
                dp[i][j]=new int[i][i];
                for(int k=0;k<i;k++)
                    Arrays.fill(dp[i][j][k], -1);
            }

        for(int i=0;i<m;i++){
            int l=in.nextInt();
            int r=in.nextInt();
            int x=in.nextInt();
            g[r][x].add(l);
        }
        out.println(sol(1,0,0,0));
        out.close();

    }
    static int mod=1000000007;
    static int sol(int i, int lcu, int c1,int c2){
        if(i!=n+1 && dp[i][lcu][c1][c2]!=-1)
            return dp[i][lcu][c1][c2];
        for(int ct=1;ct<=3;ct++){
            for(int x:g[i-1][ct]){
                int vv=1;
                if(c1>=x)
                    vv++;
                if(c2>=x)
                    vv++;
                if(vv!=ct)
                    if(i==n+1)
                        return 0;
                    else
                        return dp[i][lcu][c1][c2]=0;
            }


        }
        if(i==n+1)
            return 1;
        dp[i][lcu][c1][c2]=sol(i+1,lcu,c1,c2);
        dp[i][lcu][c1][c2]+=sol(i+1, (lcu+1)%3, c2, i-1);
        dp[i][lcu][c1][c2]%=mod;
        dp[i][lcu][c1][c2]+=sol(i+1, (lcu+2)%3, i-1, c1);
        return dp[i][lcu][c1][c2]%=mod;
    }
}
