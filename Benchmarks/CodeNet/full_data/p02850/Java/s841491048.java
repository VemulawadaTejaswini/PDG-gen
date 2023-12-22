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
        Map<Map<Integer, Integer>, Integer> map = new HashMap<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        Set<Integer> seen = new HashSet<>();
        seen.add(0);
        while (queue.size() != 0) {
            int now = queue.poll();
            int color[] = new int[k];
            for (Integer x : list[now]) {
                Map<Integer, Integer> map2 = new HashMap<>();
                map2.put(Math.min(x, now), Math.max(x, now));
                if (map.containsKey(map2)) {
                    color[map.get(map2)]++;
                }
            }
            for (Integer x : list[now]) {
                if (!seen.contains(x)) {
                    Map<Integer, Integer> map2 = new HashMap<>();
                    map2.put(Math.min(x, now), Math.max(x, now));
                    for (int i = 0 ; i < k ; i++) {
                        if (color[i] == 0) {
                            map.put(map2, i);
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
            Map<Integer, Integer> map2 = new HashMap<>();
            map2.put(a[i], b[i]);
            System.out.print(map.get(map2) + 1);
            System.out.print("\n");
        }

    }
