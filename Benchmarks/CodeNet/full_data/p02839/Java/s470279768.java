
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

        VS[][] dp1 = new VS[2][W + 2], dp2 = new VS[2][W + 2];
        for (int i = 0; i < W + 2; i++) {
            dp1[0][i] = new VS();
            dp2[0][i] = new VS();
        }
        dp1[0][1].add(0);
        dp2[0][W].add(0);
        int x = 0;
        for (int h = 1; h <= H / 2; h++) {
            x = 1 - x;
            dp1[x][0] = new VS();
            for (int w = 1; w <= W; w++) {
                dp1[x][w] = new VS();
                for (int v : dp1[1 - x][w]) {
                    dp1[x][w].add(v + a[h][w] - b[h][w]);
                    dp1[x][w].add(v + b[h][w] - a[h][w]);
                }
                for (int v : dp1[x][w - 1]) {
                    dp1[x][w].add(v + a[h][w] - b[h][w]);
                    dp1[x][w].add(v + b[h][w] - a[h][w]);
                }
            }
        }

        for (int h = H; h > H / 2; h--) {
            x = 1 - x;
            dp2[x][W + 1] = new VS();
            for (int w = 1; w <= W; w++) {
                dp2[x][W - w + 1] = new VS();
                for (int v : dp2[1 - x][W - w + 1]) {
                    dp2[x][W - w + 1].add(v + a[h][W - w + 1] - b[h][W - w + 1]);
                    dp2[x][W - w + 1].add(v + b[h][W - w + 1] - a[h][W - w + 1]);
                }
                for (int v : dp2[x][W - w + 2]) {
                    dp2[x][W - w + 1].add(v + a[h][W - w + 1] - b[h][W - w + 1]);
                    dp2[x][W - w + 1].add(v + b[h][W - w + 1] - a[h][W - w + 1]);
                }
            }
        }
        int ans = 1 << 30;

//        debug(dp1[x]);
//        debug(dp2[x]);

        for (int i = 1; i <= W; i++) {
            for (int v1 : dp1[x][i]) for (int v2 : dp2[x][i]) {
                ans = Math.min(ans, Math.abs(v1 + v2));
            }
        }

        for (int v : dp1[x][W]) ans = Math.min(ans, Math.abs(v));
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
