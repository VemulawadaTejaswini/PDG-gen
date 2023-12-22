import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (map.keySet().contains(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        Map<String, Integer> sorted = new TreeMap<>(map);
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            if (entry.getValue() != max) {
                continue;
            }
            System.out.println(entry.getKey());
        }
        sc.close();
    }
}