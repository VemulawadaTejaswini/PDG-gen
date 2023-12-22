import java.util.*;

public class Main {
    static void mapSet(Map<Long, Integer> map, Long key, Integer value) {
        if(map.containsKey(key)) {
            map.put(key, map.get(key) + value);
        } else {
            map.put(key, value);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), k = sc.nextInt();

        Map<Long, Integer> map1 = new HashMap<>();
        for (int i = 0; i < x; i++) {
            mapSet(map1, sc.nextLong(), 1);
        }
        Map<Long, Integer> map2 = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < y; i++) {
            Long input = sc.nextLong();
            for (Map.Entry<Long, Integer> entry : map1.entrySet()) {
                mapSet(map2, entry.getKey() + input, entry.getValue());
            }
        }
        int ryo = 0;
        Map<Long, Integer> map3 = new TreeMap<>(Comparator.reverseOrder());
        long[] inputs = new long[z];
        for (int i = 0; i < z; i++) {
            inputs[i] = sc.nextLong();
        }
        for (Map.Entry<Long, Integer> entry : map2.entrySet()) {
            for (int i = 0; i < z; i++) {
                mapSet(map3, entry.getKey() + inputs[i], entry.getValue());
            }
            ryo += entry.getValue();
            if(ryo > k) break;
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        out:for (Long key :map3.keySet()) {
            int size = map3.get(key);
            for (int i = 0; i < size ; i++) {
                sb.append(key);
                sb.append("\n");
                count++;
                if(count == k) break out;
            }
        }
        System.out.print(sb);
    }
}