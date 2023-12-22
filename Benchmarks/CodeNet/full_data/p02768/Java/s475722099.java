import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long MOD = 1000000007;

            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            long ans = 1;
            long m = N;
            long k = 2;
            while (m > 0) {
                if (m % 2 == 1) {
                    ans = ans * k % MOD;
                    m--;
                }

                k = k * k % MOD;
                m = m / 2;
            }

            ans -= 1;
            ans -= combination(N, A, MOD);
            ans -= combination(N, B, MOD);

            while (ans < 0) {
                ans += MOD;
            }

            System.out.println(ans);
        }
    }

    static long pow_mod(long a, long b, long MOD) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            long d = pow_mod(a, b / 2, MOD);
            return d * d % MOD;
        } else {
            return (a * pow_mod(a, b - 1, MOD)) % MOD;
        }
    }

    static long combination(long N, long C, long MOD) {
        long upe = 1;
        long dow = 1;
        for (int i = 1; i <= C; i++) {
            upe = upe * N % MOD;
            dow = dow * i % MOD;

            N--;
        }

        return upe * pow_mod(dow, MOD - 2, MOD) % MOD;
    }
}
