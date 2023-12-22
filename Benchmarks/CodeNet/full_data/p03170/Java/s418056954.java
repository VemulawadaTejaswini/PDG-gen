import java.io.*;
import java.util.*;


public class Main{
    static HashSet<Integer> set;
    static int [] dp;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        long MOD = 1000000007;
        //int t = sc.nextInt();
        int t = 1;

        while(t -- > 0)
        {
            set = new HashSet<>();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] a = new int[n];
            dp = new int[k + 1];
            Arrays.fill(dp, -1);
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                set.add(a[i]);
            }
            int res = 0;
            if(n == 1) res = (k / a[0] + 1) % 2;
            else res = solve(k);
            out.println(res == 0 ? "First" : "Second");
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
    public static int solve(int k)
    {
        if(dp[k] != -1) return dp[k];
        int res = 1;
        if(!set.contains(k))
        {
            res = 0;
            for(int i : set)
                if(k > i)
                    res = Math.max(res, solve(k - i));
        }
        dp[k] = 1 - res;
        return 1 - res;
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