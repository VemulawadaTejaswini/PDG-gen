import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int W = sc.nextInt();

        dp = new long[N+1][W+1];
        for (int i = 0; i <= N ; i++) {
            Arrays.fill(dp[i],-1);
        }
        int[] w = new int[N];
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long ans = rec(w,v,0,W);

        System.out.println(ans);
    }


    static long[][] dp =null;
    static
    long rec(int[] w,int[] v ,int i, int W){

        if(i==w.length) return 0;

        if(dp[i][W] != -1){
            return dp[i][W];
        }


        long max = -1;
        //use
        if(W-w[i]>=0){
            max = Math.max(max, rec(w,v,i+1,W-w[i] ) +v[i] );
        }
        //not use
        max = Math.max(max,rec(w,v,i+1, W));

        dp[i][W] = max;

        return max;


    }

}