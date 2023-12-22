package JOI;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine());
    int[] cost = new int[n];
    String[] hiki = scan.nextLine().split(" ");
    for(int i = 0;i < n;i++){
      cost[i] = Integer.parseInt(hiki[i]);
    }
    int[] dp = new int[n];
    dp[0]=0;
    dp[1]=Math.abs(cost[1]-cost[0]);
    for(int i = 2;i < n;i++){
      dp[i]+=
      Math.min(dp[i-2]+Math.abs(cost[i]-cost[i-2]),
      dp[i-1]+Math.abs(cost[i]-cost[i-1]));
    }
    System.out.println(dp[n-1]);
  }
  
}
