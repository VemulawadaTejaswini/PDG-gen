import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Weight = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];
        long[][] dp = new long[Weight+1][N+1];

        for(int i = 0; i<N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        for(int i = 1; i<Weight+1; i++) {
            if(w[0] <= i) dp[i][1] = v[0];
        }

        for(int j = 2; j<N+1; j++) {
            for(int i = 1; i<Weight+1; i++){

                if(i>=w[j-1]) {
                    dp[i][j] = Math.max(dp[i - w[j - 1]][j - 1] + v[j - 1], dp[i][j - 1]);

                }else{
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        System.out.println(dp[Weight][N]);

    }
}