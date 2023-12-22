import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        char[][] map = new char[H][W];
        for (int i=0;i<H;i++) {
            String S = sc.next();
            for (int j=0;j<W;j++) {
                map[i][j] = S.charAt(j);
            }
        }

        int[][] dp = new int[H+1][W+1];
        dp[1][1] = 1;
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                if (map[i][j]=='.') {
                    dp[i+1][j+1] = dp[i][j+1]+dp[i+1][j];
                }
            }
        }
        System.out.println(dp[H][W]);
    }
}