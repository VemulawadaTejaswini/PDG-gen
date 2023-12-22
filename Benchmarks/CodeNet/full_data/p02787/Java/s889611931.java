import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int[] dp = new int[h + 1];
        dp[0] = 0;
        for (int i = 1; i <= h; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                dp[i] = Math.min(dp[i], dp[Math.max(0, i - a[j])] + b[j]);
            }
        }
        System.out.println(dp[h]);
    }

}
