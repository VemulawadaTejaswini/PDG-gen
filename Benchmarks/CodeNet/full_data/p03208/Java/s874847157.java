import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nk = sc.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        SortedMap<Integer, Integer> tm = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            Integer h = Integer.parseInt(sc.nextLine());
            if (tm.containsKey(h)) {
                tm.replace(h, tm.get(h) + 1);
            } else {
                tm.put(h, 1);
            }
        }

        int min = Integer.MAX_VALUE;
        int hmin = 0;
        int hmax = 0;
        int trees = 0;
        for (Map.Entry<Integer, Integer> e: tm.entrySet()) {
            if (e.getValue() >= k) {
                System.out.println(0);
                System.exit(0);
            }
            if (trees == 0) {
                hmin = e.getKey();
            }
            if (hmax < e.getKey()) {
                hmax = e.getKey();
            }
            trees += e.getValue();
            if (trees == k) {
                min = Math.min(min, hmax - hmin);
                trees = 0;
            } else if (trees > k) {
                min = Math.min(min, hmax - hmin);
                trees = trees - k;
                hmin = e.getKey();
            }
        }
        System.out.println(min);
    }
}