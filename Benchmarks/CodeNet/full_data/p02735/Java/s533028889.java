import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] c = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                c[i][j] = s.charAt(j);
            }
        }
        int[][] dp = new int[h + 1][w + 1];
        int init = c[0][0] == '.' ? 0 : 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                int temp = c[i - 1][j - 1] == '.' ? 0 : 1;
                if (i == 1 && j != 1) {
                    dp[i][j] = Math.max(init, dp[i][j - 1]) + temp;
                } else if (i != 1 && j == 1) {
                    dp[i][j] = Math.max(dp[i - 1][j], init) + temp;
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + temp;
                }
            }
        }
        System.out.println(dp[h][w]);
    }
}