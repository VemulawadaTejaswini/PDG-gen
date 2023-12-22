
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt();

        int[][] a = new int[H + 1][W + 1], b = new int[H + 1][W + 1];
        for (int i = 1; i <= H; i++) for (int j = 1; j <= W; j++) {
            a[i][j] = sc.nextInt();
        }
        for (int i = 1; i <= H; i++) for (int j = 1; j <= W; j++) {
            b[i][j] = sc.nextInt();
        }

        VS[][] dp = new VS[2][W + 1];
        for (int i = 0; i < W + 1; i++) {
            dp[0][i] = new VS();
        }
        dp[0][1].add(0);
        int x = 0;
        for (int h = 1; h <= H; h++) {
            x = 1 - x;
            dp[x][0] = new VS();
            for (int w = 1; w <= W; w++) {
                dp[x][w] = new VS();
                for (int v : dp[1 - x][w]) {
                    dp[x][w].add(v + a[h][w] - b[h][w]);
                    dp[x][w].add(v + b[h][w] - a[h][w]);
                }
                for (int v : dp[x][w - 1]) {
                    dp[x][w].add(v + a[h][w] - b[h][w]);
                    dp[x][w].add(v + b[h][w] - a[h][w]);
                }
            }
        }
        int ans = 1 << 30;
        for (int v : dp[x][W]) ans = Math.min(ans, Math.abs(v));
        System.out.println(ans);
    }

    class VS extends HashSet<Integer> {}

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
