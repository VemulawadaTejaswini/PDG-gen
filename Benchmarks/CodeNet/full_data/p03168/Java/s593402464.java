import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    double[] arr = new double[n];
    double ans = 0;
    String[] s = br.readLine().split(" ");
    for(int i=0;i<n;i++)
      arr[i] = Double.parseDouble(s[i]);
    double[][] dp = new double[n+1][n+1];
    
    dp[0][0] = 1.0;
    for(int i=1;i<=n;i++){
      for(int j=0;j<=n;j++){
        if(j==0)
          dp[i][j] = dp[i-1][j]*(1.0-arr[i-1]);
        else
          dp[i][j] = arr[i-1]*dp[i-1][j-1] + (1-arr[i-1])*dp[i-1][j];
      }
    }
    
    for(int i=n/2+1;i<=n;i++)
      ans += dp[i][j];
    System.out.println(ans);
  }
}