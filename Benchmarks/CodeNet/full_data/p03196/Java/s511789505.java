import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long P = sc.nextLong();

        Map<Long, Integer> map = primeFactorization(P);

        long ans = map.entrySet()
                .stream()
                .filter(e -> e.getValue() >= N)
                .mapToLong(e -> e.getKey())
                .reduce(1, (a, b) -> a * b);

        System.out.println(ans);
    }

    private static Map<Long, Integer> primeFactorization(long n) {
        Map<Long, Integer> primeFactor = new HashMap<>();
        long m = n;
        int count = 0;
        while (m % 2 == 0) {
            count++;
            m = m / 2;
        }
        primeFactor.put(2L, count);

        for (int i = 1; i < m; i++) {
            count = 0;
            long a = 2 * i + 1;

            if (m % a != 0) {
                continue;
            }

            while (m % a == 0) {
                count++;
                m /= a;
            }
            primeFactor.put(a, count);
        }

        return primeFactor;
    }
}