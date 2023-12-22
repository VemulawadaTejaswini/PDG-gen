import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        long[][] dp = new long[N+1][100_001];
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {//
            for (int j = 1; j < 100_001 ; j++) {
                dp[i][j] = (long)Integer.MAX_VALUE;
            }
        }

        for (int i = 1; i <= N ; i++) {//item
            for (int j = 1; j <=10_000 ; ++j) {// sum(v)
                if(j-v[i-1] >=0){
                    long w1 = dp[i-1][j-v[i-1]]+w[i-1];
                    long w2 = dp[i-1][j];
                    dp[i][j] = Math.min(w1,w2);
                }else{
                    dp[i][j] =  dp[i-1][j];
                }
            }
        }

        int ans = -1;
        for (int i = 0; i <=10_000; i++) {
            if(dp[N][i] <= W){
                ans = i;
            }
        }

        System.out.println(ans);
    }

}
