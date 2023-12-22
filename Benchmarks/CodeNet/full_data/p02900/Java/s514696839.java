
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long tmp = 0;
        while ((tmp = a % b) != 0) {
            a = b;
            b = tmp;
        }

        final Map<Integer, AtomicInteger> countMap = new HashMap<>();

        for (int i = 2; b != 1; i++) {
            if (b % i == 0) {
                countMap.computeIfAbsent(i, v -> new AtomicInteger()).incrementAndGet();
                b /= i;
                i--;
            }
        }
        System.out.println(countMap.size() + 1);
    }
}
