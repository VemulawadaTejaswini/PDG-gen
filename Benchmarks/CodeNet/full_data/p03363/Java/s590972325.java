import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long cnt = 0;
        long sum = 0;
        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (map.containsKey(sum)) {
                cnt += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0L) + 1);
        }
        System.out.println(cnt);
    }

}
