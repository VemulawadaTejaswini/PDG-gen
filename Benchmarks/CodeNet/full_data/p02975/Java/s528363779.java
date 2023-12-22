
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();

        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.compute(in.nextInt(), (k, v) -> {
                if (v == null) {
                    return 1;
                }
                return v + 1;
            });
        }

        if (map.size() == 1) {
            if (map.keySet().contains(0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            return;
        }

        if (n % 3 != 0) {
            System.out.println("No");
            return;
        }

        if (map.size() > 3) {
            System.out.println("No");
            return;
        }

        if (map.size() == 2) {
            if (map.keySet().contains(0) && map.get(0) == n / 3) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            return;
        }

        final Iterator<Integer> iterator = map.keySet().iterator();
        final Integer[] counts = map.values().toArray(new Integer[0]);
        if ((iterator.next() ^ iterator.next()) == iterator.next()
                && counts[0].intValue() == counts[1].intValue()
                && counts[0].intValue() == counts[2].intValue()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
