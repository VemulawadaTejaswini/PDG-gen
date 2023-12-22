import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i += 2) {
            int value1 = 1;
            int value2 = 1;
            if (map1.containsKey(v[i])) {
                value1 += map1.get(v[i]);
            }
            if (map2.containsKey(v[i + 1])) {
                value2 += map2.get(v[i + 1]);
            }
            map1.put(v[i], value1);
            map2.put(v[i + 1], value2);
        }
        int max1 = 0;
        int max_key1 = -1;
        for (int key : map1.keySet()) {
            max1 = Math.max(max1, map1.get(key));
            if (max1 == map1.get(key)) {
                max_key1 = key;
            }
        }
        int next_max1 = 0;
        int next_max_key1 = -1;
        for (int key : map1.keySet()) {
            if (map1.get(key) != max1 && key != max_key1) {
                next_max1 = Math.max(next_max1, map1.get(key));
                if (next_max1 == map1.get(key)) {
                    next_max_key1 = key;
                }
            }
        }

        int max2 = 0;
        int max_key2 = -1;
        for (int key : map2.keySet()) {
            max2 = Math.max(max2, map2.get(key));
            if (max2 == map2.get(key)) {
                max_key2 = key;
            }
        }
        int next_max2 = 0;
        int next_max_key2 = -1;
        for (int key : map2.keySet()) {
            if (map2.get(key) != max2 && key != max_key2) {
                next_max2 = Math.max(next_max2, map2.get(key));
                if (next_max2 == map2.get(key)) {
                    next_max_key2 = key;
                }
            }
        }
        int res1 = max1;
        int res2 = max2;
        if (max_key1 == max_key2) {
            res1 = Math.max(max1, max2);
            res2 = Math.max(next_max1, next_max2);
        }
        System.out.println(n / 2 - res1 + n / 2 - res2);
        sc.close();
    }
}