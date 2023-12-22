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
        int n = ni(), m = ni();
        long[][] map = new long[n][m];
        for(int i=0; i<n; i++) {
            String s = nt();
            for(int j=0; j<m; j++) {
                map[i][j] = (s.charAt(j) == '.') ? 0 : Integer.MAX_VALUE;
            }
        }
        map[0][0] = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(map[i][j] == Integer.MAX_VALUE) continue;
                try {
                    if(map[i-1][j] != Integer.MAX_VALUE) {
                        map[i][j] += map[i-1][j];
                    }
                } catch(Exception ex) {}
                try {
                    if(map[i][j-1] != Integer.MAX_VALUE) {
                        map[i][j] += map[i][j-1];
                    }
                } catch(Exception ex) {}
                map[i][j] %= 1000000007L;
            }
        }
        
        pl(map[n-1][m-1] % 1000000007L);
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