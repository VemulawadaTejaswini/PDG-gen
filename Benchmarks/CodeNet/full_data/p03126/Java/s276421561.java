import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cnt = new int[M];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int K = sc.nextInt();
            for (int j = 0; j < K; j++) {
                cnt[sc.nextInt()-1]++;
            }
        }
        for (int i = 0; i < M; i++) {
            if (cnt[i] == N)
                ans++;
        }
        System.out.println(ans);
    }
}