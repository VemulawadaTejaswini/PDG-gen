import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long, Long> an = new HashMap<Long, Long>();
        for (int i = 0; i < n; i++) {
            long k = sc.nextLong();
            if (an.containsKey(k)) {
                an.put(k, an.get(k)+1);
            } else {
                an.put(k, 1L);
            }
        }

        List<Long> l1 = new ArrayList<Long>();
        List<Long> l2 = new ArrayList<Long>(); // 正方形
        for (Entry<Long, Long> e : an.entrySet()) {
            if (e.getValue() >= 2) {
                l1.add(e.getKey());
            }
            if (e.getValue() >= 4) {
                l2.add(e.getKey());
            }
        }

        Collections.sort(l1);
        Collections.sort(l2);

        int s1 = l1.size();
        int s2 = l2.size();
        if (s1 < 1 && s2 < 1) {
            System.out.println(0);
            System.exit(0);
        }

        long a = 0;
        if (s1 == 1) {
            a = l1.get(s1-1) * l1.get(s1-1);
        } else if (s1 >= 2) {
            a = l1.get(s1-2) * l1.get(s1-1);
        }
        long b = 0;
        if (s2 > 0) {
            b = l2.get(s2-1) * l2.get(s2-1);
        }

        System.out.println(Math.max(a, b));
    }

}