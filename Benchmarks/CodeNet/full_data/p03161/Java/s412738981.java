import java.util.Scanner;
public class Main {
    static int[]dp = new int[100000];
    static int[]stones = new int[100000];
    static int N, K;
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();
        for(int i = 0 ; i < N ; ++i)
            stones[i] = in.nextInt();
        solve();
        System.out.println(dp[N-1]);
    }
    public static void solve(){
        dp[0] = 0;
        dp[1] = Math.abs(stones[1]-stones[0]);
        for(int i = 2 ; i < N ; ++i){
            int min= Integer.MAX_VALUE;
            for(int j = 1 ; j <= K  && (i-j)>=0; ++j){
                min = Math.min(dp[i-j]+Math.abs(stones[i]-stones[i-j]),
                    min);
            }
            dp[i] = min;
        }
    }
}