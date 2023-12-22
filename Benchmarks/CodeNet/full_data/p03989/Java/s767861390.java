
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    long MOD = 924844033L;

    long[] pns;
    int n, k;

    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        int len = 2 * (n - k);
        long[][][] dp = new long[n + 1][len + 1][2];

        List<Integer> ss = new ArrayList<>();

        for (int i = 1; i <= k; i++) {
            int size = 0;
            for (int j = i; j <= n; j += k) size++;
            if (size == 1) continue;
            ss.add(size - 1);
            ss.add(size - 1);
        }
        debug(ss);

        for (int i = 0; i <= len; i++) dp[0][i][0] = 1;

        for (int i = 1; i <= n; i++) {
            int l = 1;
            for (int j = 0; j < ss.size(); j++) {
                dp[i][l][0] = (dp[i][l][0] + dp[i][l - 1][0] + dp[i][l - 1][1]) % MOD;
                dp[i][l][1] = (dp[i][l][1] + dp[i - 1][l - 1][0] + dp[i - 1][l - 1][1]) % MOD;
                for (int k = 1; k < ss.get(j); k++) {
                    dp[i][l + k][0] = (dp[i][l + k][0] + dp[i][l + k - 1][0] + dp[i][l + k - 1][1]) % MOD;
                    dp[i][l + k][1] = (dp[i][l + k][1] + dp[i - 1][l + k - 1][0]) % MOD;
                }
                l += ss.get(j);
            }
        }

        calc();
        debug(pns);

        long ans = pns[n];
        for (int i = 1; i <= n; i++) {
            debug(dp[i]);
            long f = i % 2 == 0 ? 1 : -1;
            long sum = (dp[i][len][0] + dp[i][len][1]) % MOD;
            sum = (sum * pns[n - i]) % MOD;
            ans = (ans + MOD + f * sum) % MOD;
        }
        System.out.println(ans);
    }

    void calc() {
        pns = new long[n + 1];
        pns[0] = 1;
        for (int i = 1; i <= n; i++) {
            pns[i] = (pns[i - 1] * i) % MOD;
        }
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
