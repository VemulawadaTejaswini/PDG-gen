import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner cin = new Scanner(System.in);
        N = cin.nextInt();
        M = cin.nextInt();
        Q = cin.nextInt();
        L = new int[M];
        R = new int[M];
        for (int i = 0; i < M; i++) {
            L[i] = cin.nextInt();
            R[i] = cin.nextInt();
        }
        p = new int[Q];
        q = new int[Q];
        for (int i = 0; i < Q; i++) {
            p[i] = cin.nextInt();
            q[i] = cin.nextInt();
        }

        dp = new int[N + 1][N + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                dp[i][j] = -1;
            }
        }

        calc();
    }

    int N, M, Q;
    int[] L, R;
    int[] p, q;
    int[][] table;
    int[][] dp; // subquery(l, r)の結果をメモする。

    void calc() {
        //table[i][j] : L=i, R=jとなる列車がいくつあるか
        table = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            table[L[i]][R[i]]++;
        }

        for (int i = 0; i < Q; i++) {
            System.out.println(query(p[i], q[i]));
        }
    }

    //区間[l, r]に含まれる列車の数を返す
    int query(int p, int q) {
        int ans = 0;
        //L,Rが両方ともp以上q以下であるものを、サブクエリで計算する
        return subquery(q, q) - subquery(q, p - 1) - subquery(p - 1, q) - subquery(p - 1, p - 1);
    }

    // Lがl以下、Rがr以下の個数を返す
    int subquery(int l, int r) {
        // lかrが0であれば、条件に当てはまる列車が存在しないので0を返す
        if (l == 0 || r == 0) return 0;
        //すでに計算済みであれば答えを返す
        if (dp[l][r] != -1) return dp[l][r];
        //subqueryを使って計算する
        int ans = subquery(l - 1, r) + subquery(l, r - 1) - subquery(l - 1, r - 1) + table[l][r];
        return dp[l][r] = ans;
    }
}
