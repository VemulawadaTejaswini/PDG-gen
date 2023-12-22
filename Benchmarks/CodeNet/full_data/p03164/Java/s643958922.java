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
      int vsum = 0;
      for(int i = 0 ; i < n ; i++) {
      	strLine = br.readLine();
        wv[i][0] = Integer.parseInt(strLine.split(" ")[0]);
        wv[i][1] = Integer.parseInt(strLine.split(" ")[1]);
        vsum += wv[i][1];
      }
      long[] dp = new long[vsum+1];
      for(int i = 0 ; i <= vsum ; i++) {
      	dp[i] = Integer.MAX_VALUE;
      }
      dp[0] = 0;
      for(int i = 1 ; i <= n; i++) {
        int w = wv[i-1][0];
        int v = wv[i-1][1];
        for(int j = vsum ; j >= v ; j--) {
          	dp[j] = Math.min(dp[j], dp[j-v] + w);
        }
      }
      long maxValue = Integer.MIN_VALUE;
      for(int i = vsum ; i >= 0 ; i--) {
        if(dp[i] <= W) {
        	System.out.println(i);
            break;
        }
      }
      
    } catch(Exception ex) {
    
    }
  }
}