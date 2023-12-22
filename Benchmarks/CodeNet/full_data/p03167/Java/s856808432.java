import java.util.Scanner;

public class Main {

    static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] G = new char[H+1][W+1];
        for(int i = 1; i <= H; i++){
            char[] s = sc.next().toCharArray();
            for(int j = 1; j <= W; j++){
                G[i][j] = s[j-1];
            }
        }
        int[][] dp = new int[H+1][W+1];
        dp[1][1] = 1;
        for(int i = 1; i <= H; i++){
            for(int j = 1; j <= W; j++){
                if(G[i][j] == '.') dp[i][j] += (dp[i][j-1] + dp[i-1][j]) % MOD;
                else dp[i][j] = 0;
            }
        }
        System.out.println(dp[H][W]);
        sc.close();

    }

}
