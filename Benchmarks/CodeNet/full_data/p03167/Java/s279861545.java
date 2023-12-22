import java.util.*;

public class Main {
  public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        boolean[][] grid = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            String row = sc.next();
            int j = 0;
            for (char ch : row.toCharArray()) {
                grid[i][j] = ch == '.';
                j++;
            }
        }

        grid[0][0] = true;
        grid[H-1][W-1] = true;

        long[][] dp = new long[H][W];
        dp[0][0] = 1;

        for (int i = 1; i < W; i++) {
            if (grid[0][i]) {
                dp[0][i] = 1;
            } else {
                break;
            }
        }
        for (int i = 1; i < H; i++) {
            if (grid[i][0]) {
                dp[i][0] = 1;
            } else {
                break;
            }
        }

//        print(dp);

        for (int i = 1; i < H; i++) {
            for (int j = 1; j < W; j++) {
                if (grid[i][j]) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1] ;
//                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1])% 1000_000_007;
                } else {
                    dp[i][j] = 0;
                }
            }
        }

//        print(dp);

        long res = dp[H-1][W-1];
        System.out.println(res % 1000_000_007);
//        System.out.println(res);

    
  }
}
