import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        Arrays.sort(a);

        Map<Long, Integer> map = new HashMap<>();
        for (Long l : a) map.put(l, map.getOrDefault(l, 0) + 1);

        long ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (map.get(a[i]) == 0) continue;
            map.put(a[i], map.get(a[i]) - 1);
            long diff = 2 * Long.highestOneBit(a[i]) - a[i];
            if (map.containsKey(diff) && map.get(diff) > 0) {
                ans++;
                map.put(diff, map.get(diff) - 1);
            }
        }
        System.out.println(ans);
    }
}