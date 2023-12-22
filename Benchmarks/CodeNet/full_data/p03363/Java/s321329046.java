
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final long[] array = new long[n];

        array[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + scanner.nextInt();
        }

        final Map<Long, AtomicInteger> map = new HashMap<>();
        map.put(0L, new AtomicInteger(1));

        for (int i = 0; i < n; i++) {
            final long tmp = array[i];
            map.computeIfAbsent(tmp, e -> new AtomicInteger())
                    .incrementAndGet();
        }

        final int answer = map.values().stream()
                .filter(e -> e.get() > 1)
                .map(e -> e.get() * (e.get() - 1) / 2)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(answer);
    }
}
