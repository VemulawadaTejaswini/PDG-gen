// package app;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        Map<Integer, Long> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (!map.containsKey(a[i])) {
                map.put(a[i], (long) 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }

        long all = 0;

        for (int key : map.keySet()) {
            all += map.get(key) * (map.get(key) - 1) / 2;
        }

        for (int i = 0; i < n; i++) {
            long tmp = map.get(a[i]);
            System.out.println(all - (tmp - 1));
        }
    }
}