import java.util.*;

public class Main{
    static int[]dp = new int[100000];
    static int[]stones = new int[100000];
    static int N;
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        for(int i = 0 ; i < N ; ++i)
            stones[i] = in.nextInt();
        solve();
        System.out.println(dp[N-1]);
    }
    public static void solve(){
        dp[0] = 0;
        dp[1] = Math.abs(stones[1]-stones[0]);
        for(int i = 2 ; i < N ; ++i){
            dp[i] = Math.min(dp[i-1] + Math.abs(stones[i]-stones[i-1]),
            dp[i-2]+Math.abs(stones[i]-stones[i-2]));
        }
    }
}