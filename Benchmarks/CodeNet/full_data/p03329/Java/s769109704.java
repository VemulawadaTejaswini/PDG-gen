import java.util.Scanner;

class Main {
    static int[] dp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n + 1];
        dp[0] = 0;
        // 1円ずつ払う
        for (int i = 1; i < n + 1; i++) {
            dp[i] = dp[i - 1] + 1;
        }
        for (int six = 1; six <= n; six *= 6) {
            for (int j = 1; j < n + 1; j++) {
                if (j - six < 0) {
                    continue;
                }
                dp[j] = Math.min(dp[j - six] + 1, dp[j]);
            }
        }
        for (int nine = 1; nine < n + 1; nine *= 9) {
            for (int j = 1; j < n + 1; j++) {
                if (j - nine < 0) {
                    continue;
                }
                dp[j] = Math.min(dp[j - nine] + 1, dp[j]);
            }
        }
        System.out.println(dp[n]);
        sc.close();
    }
}