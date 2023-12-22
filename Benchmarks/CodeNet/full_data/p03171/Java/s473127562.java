import java.util.*;

public class Main {
    static long[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        //dp on the answer for [l,r]
        dp = new long[N][N];
        for(int i = 0; i < N; i++) {
            dp[i][i] = a[i];
        }
        System.out.println(rec(0,N-1,a));
    }
    public static long rec(int l,int r, int[] a){
        if(dp[l][r] > 0) return dp[l][r];
        //l < r guaranteed
        long takeLeft = a[l] - rec(l+1,r,a);
        long takeRight = a[r] - rec(l,r-1,a);
        long ans = Math.max(takeLeft,takeRight);
        dp[l][r] = ans;
        return ans;
    }
}