import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
        HashMap<Integer, List<Integer>> pyMap = new HashMap<>(n);
        for (int i = 0; i < m; i++) {
            ps[i] = sc.nextInt();
            ys[i] = sc.nextInt();

            List<Integer> pylist = pyMap.getOrDefault(ps[i], new ArrayList<Integer>(m));
            pylist.add(ys[i]);
            pyMap.put(ps[i], pylist);
        }

        for (Integer key : pyMap.keySet()) {
            List<Integer> pylist = pyMap.get(key);
            Collections.sort(pylist);
        }

        for (int i = 0; i < m; i++) {
            int order = Collections.binarySearch(pyMap.get(ps[i]), ys[i]) + 1;
            System.out.println(String.format("%06d%06d", ps[i], order));
        }
    }
}
