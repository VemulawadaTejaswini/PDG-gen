import java.math.BigInteger;
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
        int[] A = new int[N];

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.next());
            for(Map.Entry<Integer, Integer> e: factorize(A[i]).entrySet()) {
                int max = Math.max(m.getOrDefault(e.getKey(), 0), e.getValue());
                m.put(e.getKey(), max);
            }
        }

        long lcm = 1;
        for(Map.Entry<Integer, Integer> e: m.entrySet()) {
            for (int i = 0; i < e.getValue(); i++) {
                lcm *= e.getKey();
                lcm %= MOD;
            }
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            long inv = pow(A[i], MOD - 2, MOD);
            ans += lcm * inv % MOD;
            ans %= MOD;
        }

        System.out.println(ans);
    }

    // Tested on AOJ
    static TreeMap<Integer, Integer> factorize(int n) {
        TreeMap<Integer, Integer> primes = new TreeMap<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                primes.put(i, primes.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n != 1) {
            primes.put(n, 1);
        }
        return primes;
    }

    static long pow(long x, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                res = res * x % mod;
            }
            x = x * x % mod;
            n >>= 1;
        }
        return res;
    }
}
