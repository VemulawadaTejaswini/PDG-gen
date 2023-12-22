import java.util.*;
import java.io.*;
class Main{
  public static void main(String arg[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inps[] = br.readLine().split(" ");
    int n = Integer.parseInt(inps[0]);
    int W = Integer.parseInt(inps[1]);
    int vals[][] = new int[n][2];
    for(int i=0;i<n;i++){
      inps = br.readLine().split(" ");
      vals[i][0] = Integer.parseInt(inps[0]);
      vals[i][1] = Integer.parseInt(inps[1]);
    }
    long dp[][] = new long[n][W+1];
    for(int i=0;i<=W;i++){
      if(vals[0][0] > i) dp[0][i] = 0;
      else dp[0][i] = vals[0][1];
    }
   // for(int i=0;i<n;i++)
    //  System.out.println(Arrays.toString(dp[i]));
    for(int i=1;i<n;i++){
      for(int j = 0; j<=W;j++){
      	long included = (j>=vals[i][0] ? dp[i-1][j-vals[i][0]] + vals[i][1]: 0);
		long not_inc = dp[i-1][j];
        dp[i][j] = Math.max(included, not_inc);
      }
    }
   // System.out.println("AFTER");
   // for(int i=0;i<n;i++)
    //  System.out.println(Arrays.toString(dp[i]));
     
    
    System.out.println(dp[n-1][W]);
  }
}
          
          
        