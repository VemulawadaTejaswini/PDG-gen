import java.util.*;
import java.io.*;
public class Main {
    public static long solve(int[] h, int[] b, int i, int prev, long[][] dp){
        if(i >= h.length){
            return 0;
        }
        if(dp[i][prev+1] > 0){
            return dp[i][prev+1];
        }
        long ans = Integer.MIN_VALUE;
        if(prev < 0 || h[i] > h[prev]){
            ans = Math.max(ans, b[i] + solve(h, b, i+1, i, dp));
        }
        ans = Math.max(ans, solve(h, b, i+1, prev, dp));
        return dp[i][prev+1] = ans;
        
    }
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer str;
      int n = Integer.parseInt(br.readLine());
      int[] h = new int[n];
      int[] b = new int[n];
      str = new StringTokenizer(br.readLine()," ");
      int i = 0;
      while(str.hasMoreTokens()){
          h[i] = Integer.parseInt(str.nextToken());
          i++;
      }
      str = new StringTokenizer(br.readLine()," ");
      i = 0;
      while(str.hasMoreTokens()){
          b[i] = Integer.parseInt(str.nextToken());
          i++;
      }
      long[][] dp = new long[n+1][n+1];
      System.out.println(solve(h, b, 0, -1, dp));
    }
}