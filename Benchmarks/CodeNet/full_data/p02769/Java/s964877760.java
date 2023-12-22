import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long MOD = 1000000007;

            int N = sc.nextInt();
            int K = sc.nextInt();

            long[] fact = new long[N + 1];
            fact[0] = 1;
            for (int i = 1; i <= N; i++) {
                fact[i] = fact[i - 1] * i % MOD;
            }

            long ans = 0;
            for (int i = 0; i <= K; i++) {
                if (N - i <= 0) {
                    break;
                }

                ans = (ans + combination(fact, N, N - i, MOD) * combination(fact, N - 1, i, MOD)) % MOD;
            }

            System.out.println(ans);
        }
    }

    static long combination(long[] fact, int N, int K, long MOD) {
        long comb = fact[N];
        comb = comb * pow(fact[K], MOD - 2, MOD) % MOD;
        comb = comb * pow(fact[N - K], MOD - 2, MOD) % MOD;
        return comb;
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
