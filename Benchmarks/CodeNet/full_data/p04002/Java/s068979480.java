import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long h = scanner.nextInt();
        long w = scanner.nextInt();
        int n = scanner.nextInt();
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long a = scanner.nextInt();
            long b = scanner.nextInt();

            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if ((b + dx) > 1 && (b + dx) < w && (a + dy) > 1 && (a + dy) < h) {
                        map.compute((b + dx) * h + (a + dy), (key, value) -> value == null ? 0 : value + 1);
                    }
                }
            }
        }

        long sum = 0;
        int[] count = new int[9];
        for (int i : map.values()) {
            count[i]++;
            sum++;
        }
        System.out.println((h - 2) * (w - 2) - sum);
        Arrays.stream(count).forEach(System.out::println);
    }
}