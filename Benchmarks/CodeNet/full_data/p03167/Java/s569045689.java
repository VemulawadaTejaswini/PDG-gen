import java.util.Scanner;

/**
 * Created by Harry on 4/2/20.
 */
//https://atcoder.jp/contests/dp/tasks/dp_h
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int mod = 1000000007;
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        char[][] grid = new char[H][W];
        for(int r=0; r<H; r++){
            String line = scanner.next();
            for(int c=0; c<W; c++){
                grid[r][c] = line.charAt(c);
            }
        }
        int[][] dp = new int[H][W];
        dp[0][0] = 1;
        for(int r=0; r<H; r++){
            for(int c=0; c<W; c++){
                char cur = grid[r][c];
                if(cur=='#'){
                    dp[r][c]=-1;
                    continue;
                }
                if(r>0 && c>0){
                    dp[r][c] = ((dp[r-1][c]==-1 ? 0 : dp[r-1][c])+(dp[r][c-1]==-1 ? 0 : dp[r][c-1]))%mod;
                }
                else if(r>0){
                    dp[r][c] = (dp[r-1][c]==-1 ? 0 : dp[r-1][c])%mod;
                }
                else if(c>0){
                    dp[r][c] = (dp[r][c-1]==-1 ? 0 : dp[r][c-1])%mod;
                }
            }
        }
        System.out.print(dp[H-1][W-1]);
    }
}
