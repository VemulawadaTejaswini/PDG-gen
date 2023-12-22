import java.util.*;

public class Main {
    static int n;
    static int k;
    static int[] a;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        dp = new int[n+1];
        dp[0] = 0;
        for (int i=1; i<n+1; i++) {
            //最小問題は最大値を代入
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i=1; i<n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j=1; j<=k; j++) {
                if (i<j) {
                    continue;
                }
                min = Math.min(min, Math.abs(a[i] - a[i-j]) + dp[i-j]);
            }
            dp[i] = min;
        }
        System.out.println(dp[n-1]);
    }
}