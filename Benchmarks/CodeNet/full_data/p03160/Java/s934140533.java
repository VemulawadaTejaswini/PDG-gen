import java.util.Scanner;

/**
 * Created by Harry on 3/31/20.
 */
//https://atcoder.jp/contests/dp/tasks/dp_a
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cost = new int[n];
        for(int i=0; i<n; i++){
            cost[i] = scanner.nextInt();
        }
        System.out.println(findMinCost(n, cost));
    }

    public static int findMinCost(int n, int[] cost){
        int[] dp = new int[n+1];
        dp[1] = cost[0];
        for(int i=2; i<=n; i++){
            dp[i] = Math.min(dp[i-1]+Math.abs(cost[i-2]-cost[i-1]), i-3>=0?dp[i-2]+Math.abs(cost[i-3]-cost[i-3]):Integer.MAX_VALUE);
        }
        return dp[n];
    }
}
