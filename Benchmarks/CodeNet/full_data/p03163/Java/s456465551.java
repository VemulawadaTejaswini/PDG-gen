import java.io.*;
import java.util.*;

class Main {

  public static void main(String[] args) {
  
  	try {
    
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String strLine = br.readLine();
      String[] nwInput = strLine.split(" ");
      int n = Integer.parseInt(nwInput[0]);
      int W = Integer.parseInt(nwInput[1]);
      int[][] wv = new int[n][2];
      for(int i = 0 ; i < n ; i++) {
      	strLine = br.readLine();
        wv[i][0] = Integer.parseInt(strLine.split(" ")[0]);
        wv[i][1] = Integer.parseInt(strLine.split(" ")[1]);
      }
      long[] dp = new long[W+1];
      for(int i = 0 ; i <= W ; i++) {
      	dp[i] = 0;
      }
      for(int i = 1 ; i <= n; i++) {
        int w = wv[i-1][0];
        int v = wv[i-1][1];
        for(int j = w ; j <= W ; j++) {
          	dp[j] = Math.max(dp[j], dp[j-w] + v);
        }
      }
      long maxValue = Integer.MIN_VALUE;
      for(int i = 1 ; i <= W ; i++) {
        maxValue = Math.max(maxValue, dp[i]);
      }
      System.out.println(maxValue);
    } catch(Exception ex) {
    
    }
  }
}