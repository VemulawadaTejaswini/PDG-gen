import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        long[][][] dp = new long[51][51][3010];
        int[] x = new int[50];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }

        dp[0][0][0] = 1;
        for (int i = 0; i < N; i++) for (int j = 0; j < i+1; j++) for (int k = 0; k < 2501; k++) {
            // 選ぶ
            dp[i+1][j][k] += dp[i][j][k];
            // 選ばない
            dp[i+1][j+1][k+x[i]] += dp[i][j][k];
        }

        long ans = 0;
        for (int i = 1; i < N; i++) {
            ans+=dp[N][i][i*A];
        }

        System.out.println(ans);
    }
}
