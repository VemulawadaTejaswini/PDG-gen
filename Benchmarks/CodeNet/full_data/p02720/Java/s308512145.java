import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    int[][] dp = new int[100][10];
    int K;
    String ans = "";

    Main() {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        for (int i = 0; i <= 9; i++) {
            dp[1][i] = 1;
        }
        for (int keta = 2; keta < 100; keta++) {
            for (int i = 0; i <= 9; i++) {
                if (i == 0) {
                    dp[keta][i] = dp[keta - 1][i] + dp[keta - 1][i + 1];
                } else if (i == 9) {
                    dp[keta][i] = dp[keta - 1][i] + dp[keta - 1][i - 1];
                } else {
                    dp[keta][i] = dp[keta - 1][i] + dp[keta - 1][i - 1] + dp[keta - 1][i + 1];
                }
            }
        }
        int cnt = 0;
        int keta = -1;
        int i = -1;
        count: for (keta = 1; keta < 100; keta++) {
            for (i = 1; i <= 9; i++) {
                cnt += dp[keta][i];
                if (cnt >= K)
                    break count;
            }
        }
        reduct(keta, i, cnt);
        // for (keta = 1; keta < 10; keta++) {
        //     System.err.println(Arrays.toString(dp[keta]));
        // }
    }

    void reduct(int keta, int i, int cnt) {
        int nex = cnt;
        if (cnt == K) {
            upper(keta, i);
            return;
        }
        ans += i;
        if (i == 0) {
            nex -= dp[keta - 1][i + 1];
            if (nex < K) {
                reduct(keta - 1, i + 1, cnt);
            } else {
                reduct(keta - 1, i, nex);
            }
        } else if (i == 9) {
            nex -= dp[keta - 1][i];
            if (nex < K) {
                reduct(keta - 1, i, cnt);
            } else {
                reduct(keta - 1, i - 1, nex);
            }
        } else {

            nex -= dp[keta - 1][i + 1];
            if (nex < K) {
                reduct(keta - 1, i + 1, cnt);
            } else {
                int neex = nex - dp[keta - 1][i];
                if (neex < K) {
                    reduct(keta - 1, i, nex);
                } else {
                    reduct(keta - 1, i - 1, neex);
                }
            }
        }
    }

    void upper(int keta, int i) {
        if (keta == 0) {
            System.out.println(ans);
            return;
        } else {
            ans += i;
            if (i == 9) {
                upper(keta - 1, i);
            } else {
                upper(keta - 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
