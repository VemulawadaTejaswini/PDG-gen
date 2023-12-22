import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[][] dp = new long[2001][2001];
    long mod = 1000000007;
    for(int i=1;i<=2000;i++){
      dp[i][0]=1;
      dp[i][1]=i;
    }
    for(int i=2;i<=2000;i++){
      for(int j=1;j<=i;j++){
        dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
      }
    }
    for(int i=1;i<=k;i++){
      long ans = (dp[n-k+1][i]*dp[k-1][i-1])%mod;
      System.out.println(ans);
    }
  }
}