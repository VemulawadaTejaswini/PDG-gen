import java.util.*;
import java.io.*;

//atcoder need change class name to Main
//F - LCS
//refer to http://www.mathcs.emory.edu/~cheung/Courses/323/Syllabus/DynProg/LCS-2.html

//https://atcoder.jp/contests/dp/tasks/dp_f

//tabular (bottom-up) dynamic programming

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 
    public static void main(String[] args) throws IOException {
  
        String s = next(); 
        String t = next(); 
 
        int[][] dp = new int[s.length()+1][t.length()+1]; 
        // Initialize to 0
        String[][] dp1 = new String[s.length()+1][t.length()+1]; 
        //Arrays.fill(dp1, "");
        for (int i=0; i<=s.length();  i++) {
            for (int j=0; j<=t.length();  j++) {
                dp1[i][j] = "";
            }
        }
        for (int i=1; i<=s.length();  i++) {
            for (int j=1; j<=t.length();  j++) {
                if ( s.charAt(i-1) == t.charAt(j-1) )
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    dp1[i][j] = dp1[i-1][j-1] + s.charAt(i-1);
                }
                else
                {
                    dp[i][j] = Math.max (dp[i-1][j], dp[i][j-1] );
                    if(dp[i-1][j]> dp[i][j-1] ){
                        dp1[i][j] = dp1[i-1][j];
                    }
                    else{
                        dp1[i][j] = dp1[i][j-1];
                    }
                }
            }
        }
        //System.out.println(dp[s.length()][t.length()] );
        System.out.println(dp1[s.length()][t.length()] );
        
    }
    

    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}