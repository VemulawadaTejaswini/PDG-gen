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
        String S = scan.next();
        char[] d = S.toCharArray();
        int[][] dp = new int[N+1][N+1];
        for (int i = N-1; 0 <= i; i--) {
            for (int j = N-1; i < j; j--) {
                if (d[i] == d[j]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i+1][j+1] + 1);
                    continue;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                ans = Math.max(ans, Math.min(j - i, dp[i][j]));
            }
        }
        System.out.println(ans);
    }
}
