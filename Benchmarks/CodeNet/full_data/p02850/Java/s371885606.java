import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            list.get(a[i]).add(b[i]);
            list.get(b[i]).add(a[i]);
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            k = Math.max(k, list.get(i).size());
        }
        Map<String, Integer> map = new HashMap<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        boolean[] seen = new boolean[n];
        seen[0] = true;
        while (queue.size() != 0) {
            int now = queue.poll();
            int color[] = new int[k];
            for (int x : list.get(now)) {
                String key = now < x ? now + ":" + x : x + ":" + now;
                if (map.containsKey(key)) {
                    color[map.get(key)]++;
                }
            }
            for (int x : list.get(now)) {
                if (!seen[x]) {
                    String key = now < x ? now + ":" + x : x + ":" + now;
                    for (int i = 0 ; i < k ; i++) {
                        if (color[i] == 0) {
                            map.put(key, i);
                            color[i]++;
                            break;
                        }
                    }
                    queue.add(x);
                    seen[x] = true;
                }
            }
        }

        System.out.println(k);
        for (int i = 0; i < n - 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a[i]);
            sb.append(":");
            sb.append(b[i]);
            System.out.print(map.get(sb.toString()) + 1);
            System.out.print("\n");
        }

    }

}