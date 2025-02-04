
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        long n = scanner.nextLong();
        Map<String, Integer> map = new HashMap<>();
        for (long i = 0; i < n; i++) {
            int ax = scanner.nextInt() - 1;
            int ay = scanner.nextInt() - 1;
            for (int x = -1; x <= 1; x++) {
                for (int y = -1; y <= 1; y++) {
                    if (ax + x >= 1 && ax + x < w - 1) {
                        if (ay + y >= 1 && ay + y < h - 1) {
                            String key = (ax + x) + "," + (ay + y);
                            Integer compute = map.compute(key, (s, integer) -> {
                                if (integer == null) {
                                    return 1;
                                } else {
                                    return integer + 1;
                                }
                            });

                        }
                    }
                }
            }
        }
        int[] r = new int[10];
        Object[] values = map.values().toArray();
        BigDecimal all = new BigDecimal(w - 2).multiply(new BigDecimal(h - 2));
        for (int i = 0; i < values.length; i++) {
            r[(Integer) values[i]]++;
        }
        for (int i = 0; i < r.length; i++) {
            all = all.subtract(new BigDecimal(r[i]));
        }
        System.out.println(all);
        for (int i = 1; i < r.length; i++) {
            System.out.println(r[i]);
        }

    }

}