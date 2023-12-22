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
        int n = ni();
        long c = nl();
        long[] h = new long[n], dp = new long[n];
        dp[0] = 0;
        for(int i=0; i<n; i++) h[i] = nl();
        
        for(int i=1; i<n; i++) {
            long min = Long.MAX_VALUE;
            for(int j=i-1; j>=0; j--) {
                long diff = h[i] - h[j];
                diff *= diff; diff += c;
                diff += dp[j];
                if(min < diff) break;
                min = diff;
            }
            dp[i] = min;
        }
        
        //pl(Arrays.toString(dp));
        
        pl(dp[dp.length - 1]);
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