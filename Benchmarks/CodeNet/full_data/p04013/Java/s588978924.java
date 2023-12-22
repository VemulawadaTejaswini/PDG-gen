import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int x = -1;
        for(int elm: nums){
            if(x < elm)
                x = elm;
        }
        x = Math.max(x, a);
        for(int i = 0; i < n; i++)
            nums[i] = nums[i] - a;
        long[][] dp = new long[n+1][2*n*x + 1];
        dp[0][n * x] = 1;
        for(int j = 1; j <= n; j++){
            for(int t = 0; t <= 2 * n * x; t++){
                if((t - nums[j - 1] < 0) || (t - nums[j - 1] > 2 * n * x))
                    dp[j][t] = dp[j - 1][t];
                else
                    dp[j][t] = dp[j - 1][t] + dp[j - 1][t - nums[j - 1]];
            }
        }
        System.out.println(dp[n][n * x] - 1);
    }
}
