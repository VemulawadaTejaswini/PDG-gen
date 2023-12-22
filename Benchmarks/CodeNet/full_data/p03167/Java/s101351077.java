
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int h = in.nextInt();
        int w = in.nextInt();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            String line = in.next();
            for (int j = 0; j < w; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        int[][] dp = new int[h][w];
        dp[0][0] = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i < h - 1 && map[i + 1][j] == '.') {
                    dp[i + 1][j] += dp[i][j];
                    dp[i + 1][j] %= 1_000_000_007;
                }
                if (j < w - 1 && map[i][j + 1] == '.') {
                    dp[i][j + 1] += dp[i][j];
                    dp[i][j + 1] %= 1_000_000_007;
                }
            }
        }
        System.out.println(dp[h - 1][w - 1]);
    }
}
