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
        dp[1][1] = init;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                int temp = c[i - 1][j - 1] == '.' ? 0 : 1;
                int cw;
                int ch;
                if (i == 1 && j == 1) {
                    continue;
                }
                if (i == 1) {
                    cw = c[i - 1][j - 2] == '.' ? 0 : 1;
                    if (cw == 0) {
                        dp[i][j] = dp[i][j - 1] + temp;
                    } else {
                        dp[i][j] = dp[i][j - 1];
                    }
                } else if (j == 1) {
                    ch = c[i - 2][j - 1] == '.' ? 0 : 1;
                    if (ch == 0) {
                        dp[i][j] = dp[i - 1][j] + temp;
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    ch = c[i - 2][j - 1] == '.' ? 0 : 1;
                    cw = c[i - 1][j - 2] == '.' ? 0 : 1;
                    int temp2 = cw == 0 ? temp : 0;
                    int temp3 = ch == 0 ? temp : 0;
                    if (dp[i - 1][j] > dp[i][j - 1]) {
                        dp[i][j] = dp[i][j - 1] + temp2;
                    } else if (dp[i - 1][j] < dp[i][j - 1]) {
                        dp[i][j] = dp[i - 1][j] + temp3;
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + Math.min(temp2, temp3);
                    }
                }
            }
        }
        System.out.println(dp[h][w]);
    }
}