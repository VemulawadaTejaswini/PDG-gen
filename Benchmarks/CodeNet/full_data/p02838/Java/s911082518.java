
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            long num = sc.nextLong();
            A[i] = num;
        }
        int[] dp = new int[60];
        for (int k = 0; k < 60; k++) {
            long mask = 1l << k;
            for (int i = 1; i <= N; i++) {
                if ((A[i] & mask) != 0l) {
                    dp[k]++;
                }
            }
        }
        long ans = 0;
        for (int k = 0; k < 60; k++) {
            ans += (((long)dp[k] * (N - dp[k]))%MOD << k)%MOD;
            ans %= MOD;
            // System.out.println(ans + " " + Long.toBinaryString(ans));
        }
        System.out.println(ans);
    }
}