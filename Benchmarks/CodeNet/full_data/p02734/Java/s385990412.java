import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        long MOD = 998244353;
        int n = sc.nextInt(), s = sc.nextInt();
        int a[] = new int[n];
        long dp[][] = new long[n + 1][s + 1];
        long res = 0l;
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0;i <= n; i++) dp[i][0] = i + 1;
        for(int i = 1;i <= n; i++)
        {
            if(a[i - 1] > s) continue;
            for(int j = 1; j < a[i - 1]; j ++) dp[i][j] = dp[i - 1][j];
            for(int j = a[i - 1]; j < s; j ++) dp[i][j] = (dp[i - 1][j - a[i - 1]] + dp[i - 1][j]) % MOD;
            dp[i][s] = dp[i - 1][s - a[i - 1]];
            res += dp[i][s] * (n - i + 1);
        }
        out.println(res % MOD);
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