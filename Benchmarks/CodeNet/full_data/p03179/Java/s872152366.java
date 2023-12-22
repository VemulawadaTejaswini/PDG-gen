/*
[ ( ^ _ ^ ) ]
*/

// problem: atc/dp_t

// package atc.t;

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    char lt = '>';
    int n;
    HashMap<String, Long> mp;

    long go(int x, int lst, boolean[] vis, char[] s) {
        if(x>=n) {
            return 1;
        }
        String k = x +" "+lst;
        for(boolean v: vis) k = k + (v?1:0);
        if(mp.containsKey(k)) {
            return mp.get(k);
        }
        long rs = 0;
        for(int i=0; i<n; i++) {
            if(!vis[i]) {
                if(s[x]==lt && lst > i) {
                    vis[i] = true;
                    rs += go(x+1, i, vis, s);
                    vis[i] = false;
                } else if(s[x]!=lt && i > lst) {
                    vis[i] = true;
                    rs += go(x+1, i, vis, s);
                    vis[i] = false;
                }
                if(rs >= MOD) rs %= MOD;
            }
        }
        mp.put(k, rs);
        return rs;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        n = in.nextInt();
        char[] s = (" "+in.next().trim()).toCharArray();
        // long rs = 0;
        // boolean[] vis = new boolean[n];
        // mp = new HashMap<>();
        // for(int i=0; i<n; i++) {
        //     vis[i] = true;
        //     rs += go(1, i, vis, s);
        //     vis[i] = false;
        //     if(rs >= MOD) rs -= MOD;
        // }
        // out.println(rs);
        // show("", s);
        long[][] dp = new long[n][n];
        dp[0][0] = 1;
        for(int i=1; i<n; i++) {
            for(int j=0; j<=i; j++) {
                if(s[i]==lt) {
                    dp[i][j] = dp[i-1][i-1] - (j>0?dp[i-1][j-1]:0);
                    dp[i][j] = (dp[i][j]%MOD + MOD)%MOD;
                } else {
                    if(j>0) dp[i][j] = dp[i-1][j-1];
                }
                if(j>0) dp[i][j] = (dp[i][j] + dp[i][j-1])%MOD;
            }
            // show("", dp[i]);
        }
        out.println(dp[n-1][n-1]);
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