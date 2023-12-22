import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        int[] p = new int[q];
        int[] x = new int[q];
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            p[i] = sc.nextInt();
            x[i] = sc.nextInt();
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            List<Integer> list;
            if (map.containsKey(a[i])) {
                list = map.get(a[i]);
            } else {
                list = new ArrayList<>();
            }
            list.add(b[i]);
            map.put(a[i], list);
        }

        for (int i = 0; i < q; i++) {
            ans.put(p[i], ans.getOrDefault(p[i], 0) + x[i]);
            if (!map.containsKey(p[i])) {
                continue;
            }
            Deque<Integer> queue = new ArrayDeque<>(map.get(p[i]));
            while (!queue.isEmpty()) {
                int node = queue.remove();
                ans.put(node, ans.getOrDefault(node, 0) + x[i]);
                if (!map.containsKey(node)) {
                    continue;
                }
                List<Integer> l = map.get(node);
                queue.addAll(l);
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(ans.get(i));
        }
    }

}
