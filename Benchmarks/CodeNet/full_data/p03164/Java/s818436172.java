//package solution;

import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;

public final class Main {
    BufferedReader br;
    StringTokenizer stk;

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
    
    {
        stk = null;
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    void run() throws Exception {
        int n = ni(); long w = ni();
        long[][] dp = new long[n + 1][100000 + 10];
        long[][] wv = new long[n + 1][];
        for(int i=1; i<wv.length; i++) wv[i] = new long[] {ni(), ni()};
        wv[0] = new long[] {0, 0};
        
        for(int i=0; i<dp.length; i++)
            for(int j=0; j<dp[0].length; j++)
                dp[i][j] = Integer.MAX_VALUE;
        
        dp[0][0] = 0; //this value can be synthesized
        for(int i=1; i<=n; i++) {
            long weight = wv[i][0], value = wv[i][1];
            for(int j=0; j<dp[0].length; j++) {
                if(j < value) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-(int)value] + weight);
                }
            }
        }
        
        int ans = 0;
        for(int i=dp[0].length-1; i>=0; i--) {
            if(dp[dp.length-1][i] <= w) {
                ans = i; break;
            }
        }
        
        //for(long[] a : dp) pl(Arrays.toString(a));
        
        pl(ans);
    }
    
    //Reader & Writer
    String nextToken() throws Exception {
        if (stk == null || !stk.hasMoreTokens()) {
            stk = new StringTokenizer(br.readLine(), " ");
        }
        return stk.nextToken();
    }

    String nt() throws Exception {
        return nextToken();
    }

    String ns() throws Exception {
        return br.readLine();
    }

    int ni() throws Exception {
        return Integer.parseInt(nextToken());
    }

    long nl() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nd() throws Exception {
        return Double.parseDouble(nextToken());
    }

    void p(Object o) {
        System.out.print(o);
    }

    void pl(Object o) {
        System.out.println(o);
    }
    
    void selector() {
        Random rd = new Random();
        String[] s = new String[] {"Strings", "Sorting", "Search"
                , "Graph theory", "Greedy", "Dynamic programming"
                , "Constructive algos", "Bit manipulation", "Recursion"};
        pl(s[rd.nextInt(s.length)] + " " + (rd.nextInt(5)+1));
    }
}