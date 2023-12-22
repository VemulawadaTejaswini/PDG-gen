import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0, sum = 0; i < n; i++) {
            sum = (sum + scanner.nextInt()) % m;
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(map.values().stream().mapToLong(i -> i * (i - 1) / 2).sum());
    }
}