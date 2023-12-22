import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    private int ceil(int x, int y) {
        if (x % y == 0) {
            return x / y;
        }
        return x / y + 1;
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int A = scan.nextInt();
        int[] x = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            x[i] = scan.nextInt();
            sum += x[i];
        }
        int limit = ceil(sum, A) * A + 1;
        long[][][] dp = new long[N+1][N+1][limit];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                Arrays.fill(dp[i][j], 0);
            }
        }
        dp[0][0][0] = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k < limit; k++) {
                    // i枚目まででj枚を選択いて合計がk
                    if (x[i-1] <= k && 1 <= j) {
                        dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - x[i - 1]];
                    } else {
                        dp[i][j][k] = dp[i-1][j][k];
                    }
                }
            }
        }
        long answer = 0;
        for (int j = 1; j <= N; j++) {
            answer += dp[N][j][j*A];
        }
        System.out.println(answer);
    }
}
