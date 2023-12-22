import java.util.*;
import java.io.*;
 
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    long n = Long.parseLong(s[0]);
    long W = Long.parseLong(s[1]);
    long[] val = new long[(int)n];
    long[] wt = new long[(int)n];
    int maxValue = n*1000;
    for(long i=0;i<n;i++){
      String[] str = br.readLine().split(" ");
      wt[(int)i] = Long.parseLong(str[0]);
      val[(int)i] = Long.parseLong(str[1]);
    }
    long[][] dp = new long[(int)n+1][(int)maxValue+1];
    long INF = (long) 1e9+1;
    for(int i=0;i<=maxValue;i++)
      dp[1][i] = INF;
    
    for(long i=0;i<=n;i++){
      for(long j=0;j<=W;j++){
        if(i==0 || j==0)
          dp[(int)i][(int)j] = 0;
        else if(j>=wt[(int)(i)-1])
          dp[(int)i][(int)j] = Math.max(dp[(int)(i)-1][(int)j], val[(int)(i)-1] + dp[(int)(i)-1][(int)j-(int)wt[(int)(i)-1]]);
        else
          dp[(int)i][(int)j] = dp[(int)(i)-1][(int)j];
      }
    }
    long max = 0;
    for(long i=0;i<=W;i++)
      max = Math.max(max,dp[(int)n][(int)i]);
    System.out.println(max);
  }
}
