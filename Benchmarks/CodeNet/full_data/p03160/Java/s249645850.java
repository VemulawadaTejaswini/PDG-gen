import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner cin = new Scanner(System.in);
        N = cin.nextInt();
        H = new int[N + 1]; //参照先がオーバーすることがあるので1余計に取る
        dp = new int[N];
        for (int i = 0; i < N; i++){
            H[i] = cin.nextInt();
            dp[i] = -1; //未記録なものは-1としておく
        }
        System.out.println(dfs(0));
    }

    int N;
    int[] H;
    int[] dp;
    //今の場所からのゴールまでの最小コストを返す
    int dfs(int pos) {
        //オーバーしてた場合は、十分大きいコストを返す
        if (pos >= N) return 99999999;
        //ゴールしてたらこれ以上のコストはかからないので、0を返す
        if (pos == N - 1) return 0;
        //すでにdfs(pos)の結果を計算済みであれば、その値を返す
        if(dp[pos] != -1) return dp[pos];
        //途中であれば、1つ進む場合と2つ進む場合を比較し、今後の歩数が少なくて済む方を返す
        int step1 = dfs(pos + 1) + Math.abs(H[pos + 1] - H[pos]);
        int step2 = dfs(pos + 2) + Math.abs(H[pos + 2] - H[pos]);
        //値を返す際に、dp配列に答えを保存する
        return dp[pos] = Math.min(step1, step2);
    }
}

