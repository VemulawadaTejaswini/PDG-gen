import java.util.Scanner;

public class Main{
    private static int n,maxWeight;
    private static int weights[] = new int[101];
    private static long values[] = new long[101];
    private static long dp[][] = new long[101][(int) (1e5 + 1)];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        maxWeight = sc.nextInt();
        for (int i = 0;i < n;i++){
            weights[i] = sc.nextInt();
            values[i] = sc.nextLong();
        }
        for (int i = 0;i < n;i++){
            for (int j = 0;j <= maxWeight;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(dp(0,maxWeight));
    }
    private static long dp(int idx,int rem){
        if(idx == n)
            return 0;
        if(rem - weights[idx] < 0)
            return 0;
        if(dp[idx][rem] != -1)
            return dp[idx][rem];
        dp[idx][rem] = dp(idx + 1,rem);
        dp[idx][rem] = Math.max(dp[idx][rem], values[idx] + dp(idx + 1,rem - weights[idx]));
        return dp[idx][rem];
    }
}