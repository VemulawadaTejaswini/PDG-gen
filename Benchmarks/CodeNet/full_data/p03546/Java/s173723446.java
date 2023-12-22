import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    int[][] d = new int[10][10];

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                d[i][j] = sc.nextInt();
            }
        }
        int[][] a = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        washall_floyd();
        long ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (a[i][j] != -1) {
                    ans += d[a[i][j]][1];
                }
            }
            System.out.println();
        }
        System.out.println(ans);
    }

    void washall_floyd() {
        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    d[i][j] = Math.min((int) d[i][j], (int) d[i][k] + (int) d[k][j]);
                }
            }
        }
    }
}