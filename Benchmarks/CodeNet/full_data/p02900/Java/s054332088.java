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
        long N = Long.parseLong(scanner.next());
        long M = Long.parseLong(scanner.next());
        long gcd = gcd(N, M);
        Map<Long, Integer> m = factorize(gcd);
        System.out.println(m.size() + 1);
    }

    static long gcd(long x, long y) {
        if (x < y) {
            return gcd(y, x);
        }
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    static TreeMap<Long, Integer> factorize(long n) {
        TreeMap<Long, Integer> primes = new TreeMap<>();
        for (long i = 2; i * i <= n; i++) {
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

}
