import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] hiki = scan.nextLine().split(" ");
    long n = Long.parseLong(hiki[0]);
    long C = Long.parseLong(hiki[1]);
    long[] cost = new long[n];
    long[] dp = new long[n];
    hiki = scan.nextLine().split(" ");
    for(int i = 0;i < n;i++){
      cost[i] = Integer.parseInt(hiki[i]);
      dp[i]=Long.MAX_VALUE;
    }
    dp[0]=0;
    for(int i = 1;i < n;i++){
      for(int j = 1;j < i+1;j ++){
        dp[i] = Math.min(dp[i],
        dp[i-j]+(cost[i]-cost[i-j])*
        (cost[i]-cost[i-j])+C);
      }
    }
    System.out.println(dp[n-1]);
  }
}
