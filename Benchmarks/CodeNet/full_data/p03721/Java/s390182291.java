import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        Map<Integer, Long> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            long value = sc.nextLong();
            long count = map.getOrDefault(key, 0L);
            map.put(key, value + count);
        }

        for (Map.Entry<Integer, Long> e : map.entrySet()) {
            if (k > e.getValue()) {
                k -= e.getValue();
            } else {
                System.out.println(e.getKey());
                return;
            }
        }
    }
}