package ploblem07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int mx = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
            mx = Math.max(mx, map.get(s));
        }

        final int max = mx;
        new ArrayList<>(map.entrySet())
                .stream()
                .filter(e -> e.getValue() == max)
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(e -> e.getKey())
                .forEach(System.out::println);

        sc.close();

    }

}