import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (int i = 0; i < m; i++) {
            int count = sc.nextInt();
            int value = sc.nextInt();
            while (count > 0 && value > map.firstKey()) {
                int x = map.firstKey();
                int y = map.get(x);
                if (y <= count) {
                    if (map.containsKey(value)) {
                        map.put(value, y + map.get(value));
                    } else {
                        map.put(value, y);
                    }
                    count -= y;
                    map.remove(x);
                } else {
                    if (map.containsKey(value)) {
                        map.put(value, map.get(value) + count);
                    } else {
                        map.put(value, count);
                    }
                    map.put(x, y - count);
                    count = 0;
                }
            }
        }
        long ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans += (long)entry.getKey() * entry.getValue();
        }
        System.out.println(ans);
    }
}