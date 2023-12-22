
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    private static final long MOD = 1000000007;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final Map[] maps = new Map[n];
        final Map<Integer, Integer> primeCounter = new HashMap<>();
        for (int i = 0; i < n; i++) {
            final Map<Integer, Integer> primeFactorization = primeFactorization(scanner.nextInt());
            maps[i] = primeFactorization;
            for (final Map.Entry<Integer, Integer> primeAndCount : primeFactorization.entrySet()) {
                final int key = primeAndCount.getKey();
                final int value = primeAndCount.getValue();

                if (primeCounter.get(key) == null) {
                    primeCounter.put(key, value);
                } else {
                    final int value2 = primeCounter.get(key);
                    primeCounter.put(key, Math.max(value, value2));
                }
            }
        }

        long answer = 0;
        for (final Map<Integer, Integer> map : maps) {
            long tmp = 1;
            for (final Map.Entry<Integer, Integer> primeAndCount : primeCounter.entrySet()) {
                final int diff = map.get(primeAndCount.getKey()) != null ? map.get(primeAndCount.getKey()) : 0;
                tmp *= bigPow(primeAndCount.getKey().longValue(), primeAndCount.getValue() - diff) % MOD;
                tmp %= MOD;
            }
            answer += tmp;
            answer %= MOD;
        }

        System.out.println(answer);
    }

    private static long bigPow(final long a, final int b) {
        long returnValue = 1;
        for (int i = 0; i < b; i++) {
            returnValue *= a;
            returnValue %= MOD;
        }

        return returnValue;
    }

    private static Map<Integer, Integer> primeFactorization(long n) {
        final double sqrt = Math.sqrt(n);
        final Map<Integer, AtomicInteger> countMap = new HashMap<>();
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                countMap.computeIfAbsent(i, v -> new AtomicInteger()).incrementAndGet();
                n /= i;
                i--;
            }
        }

        if (n != 1) {
            countMap.computeIfAbsent((int) n, v -> new AtomicInteger()).incrementAndGet();
        }

        return countMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entrySet -> entrySet.getValue().get()));
    }
}
