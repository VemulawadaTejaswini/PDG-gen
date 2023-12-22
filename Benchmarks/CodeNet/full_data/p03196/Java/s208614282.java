import java.util.*;

class A {
    static final int S = 1_000_000;

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final long N = sc.nextLong();
        final long P = sc.nextLong();
        final boolean[] notPrime = new boolean[S + 1];
        for (int i = 2; i * i <= S; i++)
            if (!notPrime[i])
                for (int j = i * i; j <= S; j += i)
                    notPrime[j] = true;
        final List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= S; i++)
            if (!notPrime[i])
                primes.add(i);
        final Map<Long, Integer> map = new HashMap<>();
        long l = P;
        for (final int prime : primes)
            if (l % prime == 0) {
                int power = 0;
                while (l % prime == 0) {
                    power++;
                    l /= prime;
                }
                map.put((long) prime, power);
            }
        if (l > 0)
            map.put(l, 1);
        long ans = 1l;
        for (final long prime : map.keySet())
            for (int i = 0; i < map.get(prime) / N; i++)
                ans *= prime;
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String...args) {
        A.main();
    }
}
