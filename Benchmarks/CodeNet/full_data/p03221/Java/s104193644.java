

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, TreeSet<Long>> map = new HashMap<>();
        int[] p = new int[m];
        long[] y = new long[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextLong();
            if (!map.containsKey(p[i])) {
                map.put(p[i], new TreeSet<>());
            }
            map.get(p[i]).add(y[i]);
        }
        for (int i = 0; i < m; i++) {
            System.out.println(String.format("%06d", p[i]) + String.format("%06d", map.get(p[i]).headSet(y[i]).size() + 1));
        }
    }
}
