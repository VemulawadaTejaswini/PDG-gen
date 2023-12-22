import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        Map<Integer, Integer> aMap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            Integer key = sc.nextInt();
            aMap.put(key, aMap.getOrDefault(key, 0) + 1);
        }

        Map<Integer, Integer> bMap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            Integer key = sc.nextInt();
            bMap.put(key, bMap.getOrDefault(key, 0) + 1);
        }

        Map<Integer, Integer> cMap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            Integer key = sc.nextInt();
            cMap.put(key, cMap.getOrDefault(key, 0) + 1);
        }

        long ans = 0;
        for (Entry<Integer, Integer> a : aMap.entrySet()) {
            for (Entry<Integer, Integer> b : bMap.entrySet()) {
                if (b.getKey() <= a.getKey()) {
                    break;
                }

                for (Entry<Integer, Integer> c : cMap.entrySet()) {
                    if (c.getKey() > b.getKey()) {
                        ans += a.getValue() * b.getValue() * c.getValue();
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
