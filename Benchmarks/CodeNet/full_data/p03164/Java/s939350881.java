/*
[ ( ^ _ ^ ) ]
*/

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    long abs(long x) {
        return Math.abs(x);
    }

    long max(long ... x) {
        long rs = x[0];
        for(long y: x) rs = Math.max(rs, y);
        return rs;
    }

    HashMap<Long, Long> mp;

    long go(int n, int m, long[] w, long[] v, long rem, int i) {
        if(rem<0) {
            return -INF;
        }
        if(i>=n || rem==0) {
            return 0;
        }
        long k = rem * 10000l + i;
        if(mp.containsKey(k)) return mp.get(k);

        long x = go(n, m, w, v, rem, i+1);
        long y = go(n, m, w, v, rem-w[i], i+1) + v[i];
        long rs = max(x, y);
        mp.put(k, rs);
        // show(rem, i, rs);
        return rs;
    }

    long[][] dp;

    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int m = in.nextInt();
        long[] w = new long[n];
        long[] v = new long[n];
        for(int i=0; i<n; i++) {
            w[i] = in.nextInt();
            v[i] = in.nextInt();
        }
        // mp = new HashMap<Long, Long>();
        // long rs = go(n, m, w, v, m, 0);
        // out.println(rs);
        dp = new long[2][m+1];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                dp[i%2][j] = dp[(i+1)%2][j];
                if(j-w[i-1]>=0) {
                    dp[i%2][j] = max(dp[i%2][j], dp[(i+1)%2][(int)(j-w[i-1])] + v[i-1]);
                }
            }
        }
        out.println(dp[n%2][m]);
    }
    

    public static void main(String[] args) throws IOException {
        if(args.length>0 && args[0].equalsIgnoreCase("d")) {
            DEBUG_FLAG = true;
        }
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;//in.nextInt();
        long start = System.nanoTime();
        while(t-- >0) {
            new Main().solve(in, out);
        }
        long end = System.nanoTime();
        debug("\nTime: " + (end-start)/1e6 + " \n\n");
        out.close();
    }
    
    static boolean DEBUG_FLAG = false;
    static void debug(String s) {
        if(DEBUG_FLAG) System.out.print(s);
    }
    
    public static void show(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }
    
    static class InputReader {
        static BufferedReader br;
        static StringTokenizer st;
    
        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
    }
}