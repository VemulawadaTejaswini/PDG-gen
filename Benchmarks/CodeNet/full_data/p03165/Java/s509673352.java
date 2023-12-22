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
        String s = " " + nt(), t = " " + nt();
        int n = s.length(), m = t.length();
        
        int[][] dp = new int[n][m];
        for(int i=1; i<n; i++)
            for(int j=1; j<m; j++)
                if(s.charAt(i) == t.charAt(j))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        
        int rptr = n-1, cptr = m-1;
        char[] ans = new char[dp[rptr][cptr]];
        int ans_i = ans.length - 1;
        while(rptr > 0 && cptr > 0) {
            if(s.charAt(rptr) == t.charAt(cptr)) {
                ans[ans_i--] = s.charAt(rptr);
                rptr--; cptr--;
            } else {
                if(dp[rptr-1][cptr] > dp[rptr][cptr-1])
                    rptr--;
                else
                    cptr--;
            }
        }
        
        pl(new String(ans));
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