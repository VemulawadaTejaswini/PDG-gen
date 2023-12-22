import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] tmp = in.nextLine().trim().split("\\s");
        int h = Integer.parseInt(tmp[0]);
        int w = Integer.parseInt(tmp[1]);
        char[][] grid = new char[h][w];
        for(int i = 0; i < h; i++){
            String temp = in.nextLine();
            for(int j = 0; j < w; j++){
                grid[i][j] = temp.charAt(j);
            }
        }

        int[][] dp = new int[h+1][w+1];
        dp[1][1] = 1;
        int MOD = 1_000_000_007;
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= w; j++){
                if(grid[i-1][j-1] != '#'){
                    dp[i][j] += (i > 1 && grid[i-2][j-1] != '#') ? dp[i-1][j] : 0;
                    dp[i][j] %= MOD;
                    dp[i][j] += (j > 1 && grid[i-1][j-2] != '#') ? dp[i][j-1] : 0;
                    dp[i][j] %= MOD;
                }
            }
        }
        in.close();
        System.out.println(dp[h][w]);
    }
}