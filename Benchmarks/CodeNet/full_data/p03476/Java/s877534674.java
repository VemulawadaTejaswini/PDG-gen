import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int q = scanner.nextInt();
        int[] l = new int[q];
        int[] r = new int[q];
        int max = 0;
        for (int i = 0; i < q; i++) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
            max = Math.max(max, r[i]);
        }
        Set<Integer> primes = getPrimes(max);
        int[] primeSum = new int[max + 1];

        for (int i = 1; i <= max; i++) {
            primeSum[i] = primeSum[i - 1];
            if (i % 2 == 1 && primes.contains(i) && primes.contains((i + 1) / 2)) {
                primeSum[i]++;
            }
        }

        for (int i = 0; i < q; i++) {
            System.out.println(primeSum[r[i]] - primeSum[l[i] - 1]);
        }
    }

    static Set<Integer> getPrimes(int max) {
        Set<Integer> prime = new HashSet<>();
        if (max != 1) {
            List<Integer> target = IntStream.rangeClosed(3, max).filter(i -> i % 2 == 1).boxed().collect(Collectors.toList());
            prime.add(2);
            while (!target.isEmpty() && target.get(0) * target.get(0) <= max) {
                int i = target.get(0);
                prime.add(i);
                target.removeIf(num -> num % i == 0);
            }
            prime.addAll(target);
        }

        return prime;
    }
}