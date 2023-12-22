import java.util.*;

public class Main {
    static int n;
    static int[] a;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        dp = new int[n+1];
        dp[0] = 0;
        for (int i=1; i<n; i++) {
            if (i == 1) {
                dp[i] = Math.abs(a[i] - a[i-1]);
            } else {
                dp[i] = Math.min(Math.abs(a[i] - a[i-1]) + dp[i-1], Math.abs(a[i] - a[i-2]) + dp[i-2]);
            }
        }
        System.out.println(dp[n-1]);
    }
}