import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        List<Integer>[] list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            list[a[i]].add(b[i]);
            list[b[i]].add(a[i]);
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            k = Math.max(k, list[i].size());
        }
        Map<Long, Integer> map = new HashMap<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        Set<Integer> seen = new HashSet<>();
        seen.add(0);
        while (queue.size() != 0) {
            int now = queue.poll();
            int color[] = new int[k];
            for (Integer x : list[now]) {
                long max = Math.min(now, x);
                long min = Math.max(now, x);
                if (map.containsKey(100000 * max + min)) {
                    color[map.get(100000 * max + min)]++;
                }
            }
            for (Integer x : list[now]) {
                if (!seen.contains(x)) {
                    long max = Math.min(now, x);
                    long min = Math.max(now, x);
                    for (int i = 0 ; i < k ; i++) {
                        if (color[i] == 0) {
                            map.put(100000 * max + min, i);
                            color[i]++;
                            break;
                        }
                    }
                    queue.add(x);
                    seen.add(x);
                }
            }
        }

        System.out.println(k);
        for (int i = 0; i < n - 1; i++) {
            System.out.print(map.get((long) a[i] * 100000 + b[i]) + 1);
            System.out.print("\n");
        }

    }

}
