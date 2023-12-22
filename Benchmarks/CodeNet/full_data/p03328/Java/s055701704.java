
import static java.util.stream.Collectors.toSet;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.LongStream;

public class Main {
    static final long MOD = 998244353;
    private final long a;
    private final long b;

    public Main(final long a, final long b) {
        this.a = a;
        this.b = b;
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();

        final long result = new Main(a, b).calculate();

        System.out.println(result);
    }

    long calculate() {
        final long rightLastLength = b - a;

        final long rightTotalLength = (rightLastLength * (rightLastLength + 1)) / 2;

        return rightTotalLength - b;
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
