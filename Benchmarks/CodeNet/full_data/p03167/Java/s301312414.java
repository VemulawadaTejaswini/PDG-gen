import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProblemH.main();
    }
}

class ProblemH {
    private static int H;
    private static int W;
    private static int[][] dp;
    private static int m = (int) Math.pow(10,9) + 7;

    static void main() {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[H][W];
        dp = new int[H][W];
        for (int i = 0; i < H; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }
        // initial assertion
        for (int j = W-1; j>=0; j--) {
            if (grid[H-1][j] == '#') {
                break;
            } else {
                dp[H - 1][j] = 1;
            }
        }
        for (int i = H-2; i>=0; i--) {
            if (grid[i][W-1] == '#') {
                break;
            } else {
                dp[i][W - 1] = 1;
            }
        }
        // compute dp
        for (int i = H-2; i >= 0; i--) {
            for (int j = W-2; j >= 0; j--) {
                if (grid[i][j] == '.') {
                    dp[i][j] = dp[i+1][j] +  dp[i][j+1];
                    dp[i][j] %= m;
                } else {
                    continue;
                }
            }
        }
        // compute modulus
        int ans = dp[0][0] % m;
        System.out.println(ans);
    }
}
