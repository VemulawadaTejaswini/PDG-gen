import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000007;
    private static final int MAX_N = 200005;
    private static final int[] MODULAR_INVERSE = new int[MAX_N];
    private static final int[] FACTORIAL = new int[MAX_N];

    private static long pow(long base, int exp) {
        long ret = 1;
        while (exp != 0) {
            if ((exp & 1) != 0) ret = (ret * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return ret;
    }


    private static void pre(int N) {
        FACTORIAL[0] = 1;
        for (int i = 1; i < MAX_N; i++) FACTORIAL[i] = (FACTORIAL[i - 1] * i) % MOD;
        MODULAR_INVERSE[0] = 1;
        MODULAR_INVERSE[N] = (int) pow(FACTORIAL[N], MOD - 2);
        for (int i = N - 1; i > 0; i--)
            MODULAR_INVERSE[i] = MODULAR_INVERSE[i + 1] * (i + 1) % MOD;
    }

    private static long combination(int n, int r) {
        if (n < 0 || r < 0) return 1;
        return FACTORIAL[n] * MODULAR_INVERSE[r] % MOD * MODULAR_INVERSE[n - r] % MOD;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = H + W - 2;
            pre(N);
            long ans = 0;
            for (int i = B + 1; i <= W; i++) {
                ans += (combination(H - A + i - 2, i - 1) * combination(A + W - i - 1, A - 1)) % MOD;
                ans %= MOD;
            }
            System.out.println(ans);
        }
    }
}
