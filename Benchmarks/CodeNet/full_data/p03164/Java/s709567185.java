import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int w = sc.nextInt();
        long [] dp = new long[100003];
        int [] a = new int [n+1]; int [] v = new int [n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt(); v[i] = sc.nextInt();
        }
        Arrays.fill(dp, Long.MAX_VALUE / 2);
        dp[0] = 0; long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 100000; j >= 0; j--) {
                if (j - v[i] < 0) continue;
                dp[j] = Math.min(dp[j], dp[j - v[i]] + a[i]);
                if (dp[j] <= w) ans = Math.max(ans, j);
            }
        }
        System.out.println(ans);
    }


}