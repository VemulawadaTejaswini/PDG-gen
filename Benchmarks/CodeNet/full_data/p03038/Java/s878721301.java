import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        TreeMap<Integer, Long> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.compute(scanner.nextInt(), (key, value) -> value == null ? 1 : value + 1);
        }

        for (int i = 0; i < m; i++) {
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            for (Map.Entry<Integer, Long> entry : new TreeMap<>(map).entrySet()) {
                if (entry.getKey() < c) {
                    long j = Math.min(b, entry.getValue());
                    b -= j;
                    if (entry.getValue() == j) {
                        map.remove(entry.getKey());
                    } else {
                        map.replace(entry.getKey(), entry.getValue() - j);
                    }
                    map.compute(c, (key, value) -> value == null ? j : value + j);

                    if (b <= 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        long sum = 0;
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            sum += entry.getKey() * entry.getValue();
        }
        System.out.println(sum);
    }
}