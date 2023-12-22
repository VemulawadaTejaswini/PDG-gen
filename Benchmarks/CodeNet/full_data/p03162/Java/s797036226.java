import java.util.*;

public class Main {
    static int N;
    static int[][]dp = new int[100000][3];
    static int[][]plans = new int[100000][3];
    static int res;
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        for(int i = 0 ; i < N ; ++i){
            for(int j = 0 ; j < 3 ; ++j){
                plans[i][j] = in.nextInt();
            }
        }
        solve();
        System.out.println(res);
    }

    private static void solve() {
        dp[0] = plans[0];  
        for(int i = 1 ; i < N ; ++i){
            for(int j = 0 ; j < 3 ; ++j){
                dp[i][j] = Math.max(dp[i-1][ (j+1) % 3] , dp[i-1][(j+2) % 3])+plans[i][j];
            }
        }
        for(int j = 0 ; j < 3 ; ++j){
            res = Math.max(res, dp[N-1][j]);
        }
    }
}