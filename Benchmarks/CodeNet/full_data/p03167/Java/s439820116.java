/*
[ ( ^ _ ^ ) ]
*/

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;


    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int m = in.nextInt();
        char wall = '#';
        char[][] g = new char[n][];
        for(int i=0; i<n; i++) {
            g[i] = in.next().trim().toCharArray();
        }
        long[][] dp = new long[n][m];
        dp[n-1][m-1] = 1;
        for(int i=n-2; i>=0; i--) {
            if(g[i][m-1]==wall) break;
            dp[i][m-1] = 1;
        }
        for(int j=m-2; j>=0; j--) {
            if(g[n-1][j]==wall) break;
            dp[n-1][j] = 1;
        }
        for(int i=n-2; i>=0; i--) {
            for(int j=m-2; j>=0; j--) {
                if(g[i][j]!=wall) {
                    dp[i][j] = (dp[i+1][j]+dp[i][j+1])%MOD;
                }
            }
        }
        out.println(dp[0][0]%MOD);
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