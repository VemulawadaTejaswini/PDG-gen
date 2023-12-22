import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner cin = new Scanner(System.in);
        N = cin.nextInt();
        A = new int[N];
        B = new int[N];
        C = new int[N];
        for (int i = 0; i < N; i ++){
            A[i] = cin.nextInt();
            B[i] = cin.nextInt();
            C[i] = cin.nextInt();
        }
        dp = new int[N][3];
        for (int i=0;i<N;i++){
            for (int j=0;j<3;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(Math.max(dfs(0,0), dfs(0, 1)));
    }

    int N;  //最大日数
    int[] A, B, C;  //それぞれの行動で得られる幸福度
    int[][] dp; // day, preChoiceの2引数に対する答えを記録する -1で初期化済み
    //何日目で最後に選んだのがどれの時に、これ以降最大どれだけの幸福度が得られるかを返す
    int dfs(int day, int preChoice) {
        //もし最終日であれば、もう幸福度は得られないので、0を返す
        if (day == N) return 0;
        //答えが計算済みであれば、dp配列から答えを返す
        if (dp[day][preChoice] != -1) return -1;
        //最終日でなければ、3つの選択肢から選ぶ
        int chooseA, chooseB, chooseC;
        //選べない場合の最低値を入れておく。
        chooseA = chooseB = chooseC = Integer.MIN_VALUE;
        //A, B, Cをそれぞれ選んだ場合の幸福度を計算する
        if (preChoice != 0) chooseA = A[day] + dfs(day + 1, 0);
        if (preChoice != 1) chooseB = B[day] + dfs(day + 1, 1);
        if (preChoice != 2) chooseC = C[day] + dfs(day + 1, 2);
        //最も幸福度が高かったものを返す dp配列に記録する
        return dp[day][preChoice] = Math.max(chooseA, Math.max(chooseB, chooseC));
    }
}
