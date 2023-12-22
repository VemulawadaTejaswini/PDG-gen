import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ps = new int[m];
        int[] ys = new int[m];
        HashMap<Integer, Map<Integer, Integer>> pyMap = new HashMap<>(n);
        for (int i = 0; i < m; i++) {
            ps[i] = sc.nextInt();
            ys[i] = sc.nextInt();
            pyMap.computeIfAbsent(ps[i], (e) -> new TreeMap<Integer, Integer>()).put(ys[i], i);
        }

        String[] ans = new String[m];
        for (Entry<Integer, Map<Integer, Integer>> e : pyMap.entrySet()) {
            int index = 1;
            for (Entry<Integer, Integer> y : e.getValue().entrySet()) {
                ans[y.getValue()] = String.format("%06d%06d", e.getKey(), index++);
            }
        }

        for (String s : ans) {
            System.out.println(s);
        }
    }
}
