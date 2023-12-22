import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int C = scan.nextInt();
        int[] dp = new int[200002];
        for (int i = 0; i < N; i++) {
            int s = scan.nextInt();
            int t = scan.nextInt();
            int c = scan.nextInt();
            dp[s*2-1] += 1;
            dp[t*2] -= 1;
        }
        for (int i = 1; i <= 200001; i++) {
            dp[i] += dp[i-1];
        }
        int ans = 0;
        for (int i = 0; i <= 200001; i++) {
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}
