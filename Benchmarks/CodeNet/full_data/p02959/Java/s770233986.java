import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] dp = new int[n + 2];
        int[] a = new int[n + 1];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = std.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = std.nextInt();
        }

        dp[0] = 0;

        for (int i = 0; i <= n; i++) {
            if (i < n) {
                dp[i + 1] = b[i] - a[i] + Math.max(dp[i], 0);
            } else {
                dp[i + 1] = - a[i] + Math.max(dp[i], 0);
            }
        }

        long sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += a[i] + Math.min(dp[i + 1], 0);
        }

        System.out.println(sum);
    }
}
