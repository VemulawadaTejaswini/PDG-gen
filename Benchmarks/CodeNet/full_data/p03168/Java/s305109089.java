import java.util.*;

public class Main {

    static List<List<Integer>> edges = new ArrayList<>();
    static int[] dp = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] ps = new double[N];
        for (int i = 0; i < N ; i++) {
            ps[i] = sc.nextDouble();
        }

        double ans = 0;

        double[][] dp= new double[N+1][N+1];
        dp[0][0] =1;
        for (int i = 1; i <= N ; i++) {
            for (int j = 0; j <= i+1 && j<=N  ; j++) {
                if(j ==0 ){
                    dp[j][i]  =dp[j][i-1]* (1- ps[i-1]);
                }else{
                    dp[j][i]  =dp[j-1][i-1]* ps[i-1]
                                +dp[j][i-1]* (1- ps[i-1]);
                }
            }
        }

        for (int i = (N+1)/2; i <=N ; i++) {
            ans += dp[i][N];
        }

        System.out.println(ans);
    }

}
