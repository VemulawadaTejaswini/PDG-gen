import java.util.Arrays;
import java.util.Scanner;

public class Main{
    private static int h[] = new int[(int) (1e5 + 1)];
    private static int dp[] = new int[(int) (1e5 + 1)];
    private static int n,k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0;i < n;i++)
            h[i] = sc.nextInt();
        Arrays.fill(dp,0,n,Integer.MAX_VALUE);
        System.out.println(dp(0));
    }

    private static int dp(int idx) {
        if(idx == n - 1)
            return 0;
        if(dp[idx] != Integer.MAX_VALUE)
            return dp[idx];
        for (int kk = 1;kk <= k;kk++){
          if(idx + kk < n)
             dp[idx] = Math.min(dp[idx], Math.abs(h[idx] - h[idx + kk]) + dp(idx + kk));
        }
        return dp[idx];
    }
}