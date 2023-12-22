import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        BigInteger[][] dp = new BigInteger[N][K];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], new BigInteger("-1"));
        }
        dp[0][0] = BigInteger.ZERO;
        if (a[0] <= K) {
            dp[0][a[0]] = BigInteger.ONE;
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < K; j++) {
                if (a[i] <= j) {
                    if (!dp[i - 1][j - a[i]].equals(new BigInteger("-1"))) {
                        dp[i][j] = dp[i - 1][j - a[i]].or(BigInteger.ONE.shiftLeft(i));
                    }
                }
            }
            for (int j = 0; j < K; j++) {
                if (!dp[i - 1][j].equals(new BigInteger("-1"))) {
                    if (!dp[i][j].equals(new BigInteger("-1"))) {
                        dp[i][j] = dp[i][j].and(dp[i - 1][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = Math.max(0, K - a[i]); j < K; j++) {
                if (!dp[N - 1][j].equals(new BigInteger("-1")) && !dp[N - 1][j].shiftRight(i).mod(new BigInteger("2")).equals(BigInteger.ZERO)) {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(N - ans);
    }
}
