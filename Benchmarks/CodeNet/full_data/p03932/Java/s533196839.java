import java.util.*;

public class Main {
    static int[][][][] dp;
    static int h;
    static int w;
    static int[][] field;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        field = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                field[i][j] = sc.nextInt();
            }
        }
        dp = new int[h][w][h][w];
        System.out.println(dfw(h - 1, w - 1, h - 1, w - 1));
    }
    
    static int dfw(int h1, int w1, int h2, int w2) {
        if (h1 == 0 && w1 == 0 && h2 == 0 && w2 == 0) {
            return field[0][0];
        }
        if (h1 < 0 || w1 < 0 || h2 < 0 || w2 < 0) {
            return -1;
        }
        if (dp[h1][w1][h2][w2] != 0) {
            return dp[h1][w1][h2][w2];
        }
        if (dp[h2][w2][h1][w1] != 0) {
            return dp[h2][w2][h1][w1];
        }
        int max = 0;
        int now;
        if (h1 == h - 1 && w1 == w - 1 && h2 == h - 1 && w2 == w - 1) {
            now = field[h - 1][w - 1];
        } else if (h1 == h2 && w1 == w2) {
            return -1;
        } else {
            now = field[h1][w1] + field[h2][w2];
        }
        max = Math.max(max, dfw(h1 - 1, w1, h2 - 1, w2));
        max = Math.max(max, dfw(h1 - 1, w1, h2, w2 - 1));
        max = Math.max(max, dfw(h1, w1 - 1, h2 - 1, w2));
        max = Math.max(max, dfw(h1, w1 - 1, h2, w2 - 1));
        dp[h1][w1][h2][w2] = max + now;
        return max + now;
    }
}

