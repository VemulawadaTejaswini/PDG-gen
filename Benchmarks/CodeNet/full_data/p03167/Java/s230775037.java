import java.util.Scanner;

public class Main {
    static char[][]grid = new char[1000][1000];
    static int[][]dp = new int[1000][1000];
    static int H, W;
    static int MOD = 1000000007;
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        H = in.nextInt();
        W = in.nextInt();
        in.nextLine();
        for(int i = 0 ; i < H ; ++i){
            char[]g = in.nextLine().toCharArray();
            for(int j = 0 ; j < W ; ++j){
                grid[i][j] = g[j];
            }

        }
        solve();
        System.out.println(dp[H-1][W-1]);
    }

    private static void solve() {
        dp[0][1] = grid[0][1] != '#' ? 1 : 0;
        dp[1][0] = grid[1][0] != '#' ? 1 : 0;
        for(int j = 2 ; j < W ; ++j){
            if(grid[0][j]=='#')
                    continue;
            dp[0][j] = dp[0][j-1] != 0 ? 1 : 0;
        }
        for(int i = 2 ; i < H ; ++i){
            if(grid[i][0]=='#')
                    continue;
            dp[i][0] = dp[i-1][0] != 0 ? 1 : 0;
        }
        for(int i = 1 ; i < H ; ++i){
            for(int j = 1 ; j < W ; ++j){
                if(grid[i][j]=='#')
                    continue;
                dp[i][j] = (dp[i][j-1]+dp[i-1][j]) % MOD;
            }
        }
    }
}