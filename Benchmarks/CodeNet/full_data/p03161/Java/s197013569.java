import java.io.*;
import java.util.*;

class Main {

  public static void main(String[] args) {
  
  	try {
    
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String strLine = br.readLine();
      String costsLine = br.readLine();
      String[] nkLine = strLine.split(" ");
      int n = Integer.parseInt(nkLine[0]);
      int k = Integer.parseInt(nkLine[1]);
      String[] costs = costsLine.split(" ");
	  int[] dp = new int[n];
      dp[0] = 0;
      dp[1] = Math.abs(Integer.parseInt(costs[1]) - Integer.parseInt(costs[0]));
      for(int i = 2; i < n ; i++) {
      	dp[i] = Integer.MAX_VALUE;
        for(int j = Math.max(0, i-k) ; j < i ; j++) {
        dp[i] = Math.min(dp[i], dp[j] + Math.abs(Integer.parseInt(costs[i])
                                            - Integer.parseInt(costs[j])));
        }
      } 
    
      System.out.println(dp[n-1]);
		                         
    } catch(Exception ex) {
    
    }
  
  }

}