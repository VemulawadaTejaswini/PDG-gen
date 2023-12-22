
import static java.util.stream.Collectors.toSet;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.LongStream;

public class Main {
    static final long MOD = 998244353;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long num = scanner.nextLong();

        final String prefix = num <= 999 ? "ABC" : "ABD";
        final long n = num <= 999 ? num : num - 999;

        System.out.println(prefix);
    }

    long c(final long p, final long q) {
        if (q == 1) {
            return p;
        }

        if (q * 2 < p) {
            return c(p, p - q);
        }

        long result = 1;
        final Set<Long> hashSet = new TreeSet<>(LongStream.rangeClosed(2, q).boxed().collect(toSet()));
        for (long i = p; i > p - q; --i) {
            final long i_ = i;
            final Long div = hashSet.stream().filter(k -> i_ % k == 0).findFirst().orElse(1L);
            hashSet.remove(div);
            result *= (i / div);
            if (result > MOD) {
                result = result % MOD;
            }
        }
        return result;
    }
}
