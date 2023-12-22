import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        long MOD = 1000000007;
        //int t = sc.nextInt();
        int t = 1;
        while(t -- > 0)
        {
            int n = sc.nextInt();
            int cnt[] = new int[4];
            for(int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                cnt[tmp]++;
            }
            Main sol = new Main();
            double res = sol.solve(n, cnt[1], cnt[2], cnt[3]);
            out.println(res);
            //for(int ii = 0; ii <= n; ii++) System.out.println(Arrays.toString(dp[ii]));
        }
        out.close();

        /*
        int n      = sc.nextInt();        // read input as integer
        long k     = sc.nextLong();       // read input as long
        double d   = sc.nextDouble();     // read input as double
        String str = sc.next();           // read input as String
        String s   = sc.nextLine();       // read whole line as String

        int result = 3*n;
        out.println(result);                    // print via PrintWriter
        */
        // Stop writing your solution here. -------------------------------------
        out.close();
    }
    public double[][][] dp = new double[301][301][301];

    public double solve(int n, int c1, int c2, int c3)
    {
        if(c1 < 0 || c2 < 0 || c3 < 0) return 0.0;
        if(c1 == 1 && c2 == 0 && c3 == 0) return 1.0 * n;
        if(Math.abs(dp[c1][c2][c3] - 0.0) > 1e-9) return dp[c1][c2][c3];
        double res = (c1 * solve(n, c1 - 1, c2, c3) + c2 * solve(n, c1 + 1, c2 - 1, c3)
        + c3 * solve(n, c1, c2 + 1, c3 - 1) + 1.0 * n) /(c1 + c2 + c3) ;
        dp[c1][c2][c3] = res;
        return res;
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}