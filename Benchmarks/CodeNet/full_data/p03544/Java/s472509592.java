import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long dp[] = new long[n + 1];
        if (n >= 3) {
            dp[0] = 2;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            System.out.println(dp[n]);
        }
        if (n == 1) System.out.println(2);
        if (n == 2) System.out.println(1);
    }
}
