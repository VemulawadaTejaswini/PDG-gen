import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long MOD = 1000000007;

            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            long ans = pow(2, N, MOD) - 1;
            ans -= combination(N, A, MOD);
            ans -= combination(N, B, MOD);

            while (ans < 0) {
                ans += MOD;
            }

            System.out.println(ans);
        }
    }

    static long combination(int N, int K, long MOD) {
        K = Math.min(K, N - K);

        long up = 1;
        long down = 1;
        for (int i = 0; i < K; i++) {
            up = up * (N - i) % MOD;
            down = down * (K - i) % MOD;
        }

        return up * pow(down, MOD - 2, MOD) % MOD;
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
