
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + k + 2];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // dp[i] ... 足場iに辿りつくまでに支払うこすとの最小値
        long[] dp = new long[n + k + 2];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(arr[i + j] - arr[i]));
            }
        }
//        debug(dp);
        System.out.println(dp[n - 1]);

    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
