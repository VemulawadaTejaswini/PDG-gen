import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    long mod = (long)1e9+7;
    long cur = 1;
    long[][] dp = new long[s.length()+1][3];
    for(int i=0;i<s.length();++i){
      dp[i+1][0] = dp[i][0];
      dp[i+1][1] = dp[i][1];
      dp[i+1][2] = dp[i][2];
      if(s.charAt(i)=='?'){
        dp[i+1][0]=(3*dp[i][0]+cur)%mod;
        dp[i+1][1]=(3*dp[i][1]%mod+dp[i][0]%mod)%mod;
        dp[i+1][2]=(3*dp[i][2]%mod+dp[i][1]%mod)%mod;
        cur = (cur*3)%mod;
      }else if(s.charAt(i)=='A')dp[i+1][0]=(dp[i][0]+cur)%mod;
      else if(s.charAt(i)=='B')dp[i+1][1]=(dp[i][1]+dp[i][0]%mod)%mod;
      else dp[i+1][2]=(dp[i][2]+dp[i][1]%mod)%mod;
    }
    System.out.println(dp[s.length()][2]);
  }
}