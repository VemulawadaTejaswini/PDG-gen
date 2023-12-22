import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve2(N, K, A));
    }

    private static long solve2(int N, int K, int[] A) {
        long count = 0;
        Arrays.sort(A);
        long[] fact = factInit(N, MOD);


        for (int i=0; i<N-K+1; i++) {
            long comb = combination(N-i-1, K-1, MOD, fact);
            count -= A[i] * comb % MOD;
            count %= MOD;
            // System.err.println("min:" + A[i] + ", comb:" + comb + ", count:" + count);
        }


        for (int i=N-1; i>=K-1; i--) {
            long comb = combination(i, K-1, MOD, fact);
            count += A[i]*comb%MOD;
            count %= MOD;
            // System.err.println("max:" + A[i] + ", comb:" + comb + ", count:" + count);
        }


        return (count + MOD)%MOD;
    }

    public static long combination(int n, int r, long p, long[] fact) {
        if (n == 0 && r == 0) return 1;
        if (n < r || n < 0)   return 0;

        return (fact[n] * power((fact[r]), p-2, p) % p) * power(fact[n-r], p-2, p) % p;
    }

    public static long[] factInit(int n, long p) {
        long[] fact = new long[n+1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i=2; i<=n; i++) {
            fact[i] = i * fact[i-1] % p;
        }

        return fact;
    }

    public static long power(long base, long t, long p) {
        long ans = 1;

        while (t > 0) {
            if (t%2 == 1) {
                ans = ans * base % p;
            }

            t /= 2;
            base = base * base % p;
        }

        return ans;
    }
}