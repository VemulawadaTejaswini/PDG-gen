import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }

        Combination comb = new Combination(100_000, MOD);

        long total = 0;
        Arrays.sort(A, (x, y) -> y - x);
        for (int i = 0; N - i >= K; i++) {
            long n = A[i];
            long c = comb.kFromN(K - 1, N - i - 1);
            total += ((n * c) % MOD);
            total %= MOD;
        }

        Arrays.sort(A);
        for (int i = 0; N - i >= K; i++) {
            long n = A[i];
            long c = comb.kFromN(K - 1, N - i - 1);
            total -= ((n * c) % MOD);
            total += MOD;
            total %= MOD;
        }

        System.out.println(total);
    }
}

class Combination {

    private final int MOD;
    private final int MAX;

    private final long[] fac, facInv, inv;

    public Combination(int max, int mod) {
        this.MAX = max + 1;
        this.MOD = mod;
        fac = new long[MAX];
        facInv = new long[MAX];
        inv = new long[MAX];

        fac[0] = fac[1] = 1;
        facInv[0] = facInv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            facInv[i] = facInv[i - 1] * inv[i] % MOD;
        }
    }

    public long kFromN(int k, int n) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (facInv[k] * facInv[n - k] % MOD) % MOD;
    }
}

