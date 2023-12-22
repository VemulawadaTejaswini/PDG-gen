import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 0);
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            new HashMap<>(dp).entrySet().stream().filter(entry -> entry.getKey() + a <= w).forEach(entry -> dp.merge(entry.getKey() + a, entry.getValue() + b, Math::max));
        }
        System.out.println(dp.values().stream().mapToInt(Integer::intValue).max().getAsInt());
    }
}