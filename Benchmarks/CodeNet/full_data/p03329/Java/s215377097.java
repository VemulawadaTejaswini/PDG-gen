import java.util.*;

class Main{
  static int[] dp;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    dp=new int[n+4];
    dp[1]=1; dp[2]=2; dp[3]=3;
    System.out.println(dp(n));
  }
  static int dp(int n){
    int ret=Integer.MAX_VALUE-1;
    if(n==0||dp[n]>0) return dp[n];
    for(int i=2;i<=3;i++){
      for(int j=3*i;j<=n;j*=3*i){
        ret=Math.min(ret, dp(n-j));
      }
    }
    return dp[n]=ret+1;
  }
}
