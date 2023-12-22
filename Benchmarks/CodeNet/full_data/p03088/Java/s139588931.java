import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static long BASE = 1000000007;
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[][][][] dp = new int[N + 1][4][4][4];
        dp[0][3][3][3] = 1;
        for (int length = 0; length < N; length++) {
            // 最後から3文字目
            for (int x = 0; x < 4; x++) {
                // 最後から2文字目
                for (int y = 0; y < 4; y++) {
                    // 最後から1文字目
                    for (int z = 0; z < 4; z++) {
                        // 追加予定の文字
                        for (int n = 0; n < 4; n++) {
                            if (dp[length][x][y][z] == 0) {
                                continue;
                            }
                            if (!this.ok(x, y ,z, n)) {
                                continue;
                            }
                            dp[length + 1][y][z][n] += dp[length][x][y][z];
                            dp[length + 1][y][z][n] %= BASE;
                        }
                    }
                }
            }
        }
        int sum = 0;
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 4; z++) {
                    sum += dp[N][x][y][z];
                    sum %= BASE;
                }
            }
        }
        System.out.println(sum);
    }
    public boolean ok(int x, int y, int z, int n) {
        if (y == 0 && z == 1 && n == 2) {
            return false;
        }
        if (y == 1 && z == 0 && n == 2) {
            return false;
        }
        if (y == 0 && z == 2 && n == 1) {
            return false;
        }
        if (x == 0 && z == 1 && n == 2) {
            return false;
        }
        if (x == 0 && y == 1 && n == 2) {
            return false;
        }
        return true;
    }
}
