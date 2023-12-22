import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];
        int[][] dp = new int[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        if (s[0][0] == '#') {
            dp[0][0] = 1;
        }
        int[][] dxdy = { { 1, 0 }, { 0, 1 } };
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                for (int k = 0; k < dxdy.length; k++) {
                    int x = i + dxdy[k][0];
                    int y = j + dxdy[k][1];
                    if (x >= h || y >= w) {
                        continue;
                    }
                    if (s[i][j] == '.' && s[x][y] == '#') {
                        dp[x][y] = Math.min(dp[i][j] + 1, dp[x][y]);
                    } else {
                        dp[x][y] = Math.min(dp[i][j], dp[x][y]);
                    }
                }
            }
        }
        System.out.println(dp[h - 1][w - 1]);
    }

}
