import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        Map<Long, Long> map = new HashMap<>();
        while (p % 2 == 0) {
            map.put(2L, map.getOrDefault(2L, 0L) + 1);
            p /= 2;
        }
        for (long i = 3; i <= Math.sqrt(p); i += 2) {
            while (p % i == 0) {
                map.put(i, map.getOrDefault(i, 0L) + 1);
                p /= i;
            }
        }
        if (p > 2) {
            map.put(p, map.getOrDefault(p, 0L) + 1);
        }
        long ans = 1;
        for (Long key : map.keySet()) {
            if (map.get(key) < n) {
                continue;
            }
            ans *= map.get(key) / n * key;
        }
        System.out.println(ans);
    }

}
