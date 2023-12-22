import java.util.Arrays;
import java.util.Scanner;

/**
 * Change a Little Bit
 * 
 * https://atcoder.jp/contests/abc150/tasks/abc150_e
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long MOD = 1000000007;

            int N = sc.nextInt();
            long[] C = new long[N];
            for (int i = 0; i < N; i++) {
                C[i] = sc.nextLong();
            }

            Arrays.sort(C);

            long P = pow(2, N - 1, MOD);

            long ans = 0;
            for (int i = 0; i < N; i++) {
                ans = (ans + C[i] * (P + P * (N - i))) % MOD;
            }

            ans = (ans * P) % MOD;

            System.out.println(ans);
        }
    }

    static long pow(long A, long B, long MOD) {
        if (B == 0) {
            return 1;
        } else if (B % 2 == 0) {
            long C = pow(A, B / 2, MOD);
            return C * C % MOD;
        } else {
            long C = pow(A, B - 1, MOD);
            return A * C % MOD;
        }
    }

}
