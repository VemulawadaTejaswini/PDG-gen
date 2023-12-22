import java.util.Scanner;

/**
 * Created by Harry on 3/29/20.
 */
// https://atcoder.jp/contests/abc159/submissions/11120535
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
        }
        System.out.print(calc(n, target, nums));
    }

    public static long calc(int n, int target, int[] nums){
        long[][] dp = new long[n+1][target+1];
        long mod = 998244353;
        dp[0][0] = 1;
        for(int i=1; i<=n; i++){
            for(int k=0; k<=target; k++){
                dp[i][k] = (dp[i-1][k] + (k-nums[i-1]>=0 ? dp[i-1][k-nums[i-1]] : 0))%mod;
            }
        }
        return dp[n][target];
    }
}
