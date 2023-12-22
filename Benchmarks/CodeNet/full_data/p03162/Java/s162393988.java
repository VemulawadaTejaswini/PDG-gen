import java.io.*;
import java.util.*;

class Main {

  public static void main(String[] args) {
  
  	try {
    
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s = br.readLine();
      int n = Integer.parseInt(s);
	  int[][] dp = new int[n][3];
      for(int i = 0 ; i < n ; i++) {
	        s = br.readLine();
        	String[] actions = s.split(" ");
        	if(i == 0) {
              dp[i][0] = Integer.parseInt(actions[0]);
              dp[i][1] = Integer.parseInt(actions[1]);
              dp[i][2] = Integer.parseInt(actions[2]);
            } else {
            	dp[i][0] = Integer.parseInt(actions[0]) + Math.max(dp[i-1][1], dp[i-1][2]);
				dp[i][1] = Integer.parseInt(actions[1]) + Math.max(dp[i-1][0], dp[i-1][2]);
                dp[i][2] = Integer.parseInt(actions[2]) + Math.max(dp[i-1][0], dp[i-1][1]);
            }
      }
      System.out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
		                         
    } catch(Exception ex) {
    
    }
  
  }
     

}