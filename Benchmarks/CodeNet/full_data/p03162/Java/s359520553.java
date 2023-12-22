import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = cin.nextInt();
            B[i] = cin.nextInt();
            C[i] = cin.nextInt();
        }

        int[][] dp = new int[N][3]; //dp[i][j] = i+1日目で最後にjを選んだときの最大幸福度
        // 1日目の幸福度は初期値として入れる
        dp[0][0] = A[0];
        dp[0][1] = B[0];
        dp[0][2] = C[0];
        //2日目以降は、前の最大幸福度から計算する
        for (int i = 1; i < N; i++) {
            //行動Aを選ぶのは、前に行動B,Cを選んだ場合なので、そのどちらかの最大値から足し算する
            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + A[i];
            //行動Bも同様に、直前の行動がA,Cのものから選ぶ
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + B[i];
            //行動Cも同様に選ぶ
            dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + C[i];
        }
        // 答えは、最後に行動A,B,Cそれぞれを選んだものの最大値となる
        int ans = Math.max(dp[N - 1][0], Math.max(dp[N - 1][1], dp[N - 1][2]));
        System.out.println(ans);
    }
}
