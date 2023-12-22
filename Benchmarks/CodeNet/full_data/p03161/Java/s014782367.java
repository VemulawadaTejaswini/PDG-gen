import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] h = new int[n+k];
        for (int i = 0; i < n; i++) {
            h[i] = scan.nextInt();
        }
        long[] dp = new long[n+k];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i+j] = Math.min(dp[i+j],dp[i] + Math.abs(h[i+j]-h[i]));
            }
        }
        System.out.println(dp[n-1]);
    }
}
