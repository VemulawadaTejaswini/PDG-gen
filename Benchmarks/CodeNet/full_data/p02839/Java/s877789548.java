import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] field = new int[h + 1][w + 1];
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                field[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                field[i][j] = Math.abs(field[i][j] - sc.nextInt());
            }
        }
        boolean[][][] dp = new boolean[h + 1][w + 1][(h + w) * 80 + 1];
        for (int i = 1; i <= h; i++) {
            dp[i][0][0] = true;
        }
        for (int i = 1; i <= w; i++) {
            dp[0][i][0] = true;
        }
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                for (int k = 0; k <= (i + j - 2) * 80; k++) {
                    if (dp[i - 1][j][k]) {
                        dp[i][j][k + field[i][j]] = true;
                        dp[i][j][Math.abs(k - field[i][j])] = true;
                    }
                    if (dp[i][j - 1][k]) {
                        dp[i][j][k + field[i][j]] = true;
                        dp[i][j][Math.abs(k - field[i][j])] = true;
                    }
                }
            }
        }
        for (int i = 0; i < dp[h][w].length; i++) {
            if (dp[h][w][i]) {
                System.out.println(i);
                return;
            }
        }
    }
}
