import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] p = new double[n+1];
    for(int i=1;i<=n;i++)p[i]=sc.nextDouble();
    double[][] dp = new double[n+1][n+1];
    dp[1][1]=p[1];
    dp[1][0]=1-p[1];
    for(int i=2;i<=n;i++){
      for(int j=0;j<=i;j++)
        if(j==0)dp[i][j]=dp[i-1][0]*(1-p[i]);
        else dp[i][j]=dp[i-1][j-1]*p[i]+dp[i-1][j]*(1-p[i]);
    }
    for(int i=0;i<=n;i++) {
    	System.out.println(Arrays.toString(dp[i]));
    }
    double ans = 0;
    for(int i=(n+1)/2;i<=n;i++)ans+=dp[n][i];
    System.out.println(ans);
  }
}