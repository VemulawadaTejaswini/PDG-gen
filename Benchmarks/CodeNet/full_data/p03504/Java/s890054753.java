import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        int[] s = new int[N];
        int[] t = new int[N];
        int[] c = new int[N];
        int[] dp = new int[200002];
        int[] sum = new int[200002];
        for (int i = 0; i < N; i++) {
            s[i] = scan.nextInt();
            t[i] = scan.nextInt();
            c[i] = scan.nextInt()-1;
        }
        for (int i = 0; i < C; i++) {
            Arrays.fill(dp, 0);
            for (int j = 0; j < N; j++) {
                if (c[j] != i) {
                    continue;
                }
                dp[2*s[j]-1] += 1;
                dp[2*t[j]] -= 1;
            }
            for (int j = 1; j <= 200001; j++) {
                dp[j] += dp[j-1];
            }
            for (int j = 0; j <= 200001; j++) {
                if (0 < dp[j]) {
                    sum[j] += 1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= 200001; i++) {
            ans = Math.max(ans, sum[i]);
        }
        System.out.println(ans);
    }
}
