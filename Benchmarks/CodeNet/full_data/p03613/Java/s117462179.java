import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
            if (map.get(key) > max) {
                max = map.get(key);
            }

            if (map.containsKey(key - 1)) {
                map.put(key - 1, map.get(key - 1) + 1);
            } else {
                map.put(key - 1, 1);
            }
            if (map.get(key - 1) > max) {
                max = map.get(key - 1);
            }

            if (map.containsKey(key + 1)) {
                map.put(key + 1, map.get(key + 1) + 1);
            } else {
                map.put(key + 1, 1);
            }
            if (map.get(key + 1) > max) {
                max = map.get(key + 1);
            }
        }
        System.out.println(max);
    }
}