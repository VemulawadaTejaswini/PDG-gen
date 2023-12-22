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

        long cake1[] = new long[x], cake2[] = new long[y], cake3[] = new long[z];
        for (int i = 0; i < x; i++) {
            cake1[i] = sc.nextLong();
        }
        for (int i = 0; i < y; i++) {
            cake2[i] = sc.nextLong();
        }
        for (int i = 0; i < z; i++) {
            cake3[i] = sc.nextLong();
        }

        Map<Long, Integer> map1 = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < x; i++) {
            mapSet(map1, cake1[i], 1);
        }
        Map<Long, Integer> map2 = new TreeMap<>(Comparator.reverseOrder());
        for (Long key : map1.keySet()) {
            for (int i = 0; i < y; i++) {
                mapSet(map2, key + cake2[i], map1.get(key));
            }
        }
        Map<Long, Integer> map3 = new TreeMap<>(Comparator.reverseOrder());
        for (Long key : map2.keySet()) {
            for (int i = 0; i < z; i++) {
                mapSet(map3, key + cake3[i], map2.get(key));
            }
        }
        int count = 0;
        for (Long key :map3.keySet()) {
            int size = map3.get(key);
            for (int i = 0; i < size ; i++) {
                System.out.println(key);
                count++;
                if(count == k) return;
            }
        }
    }
}