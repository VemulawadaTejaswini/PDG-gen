import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j *= 6) {
                dp[i] = Math.min(dp[i], dp[i - j] + 1);
            }
            for (int j = 1; j <= i; j *= 9) {
                dp[i] = Math.min(dp[i], dp[i - j] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}