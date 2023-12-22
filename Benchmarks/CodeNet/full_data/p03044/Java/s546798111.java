import java.util.*;
 
public class Main {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] d = new int[n];
        Arrays.fill(d, 1, n, Integer.MAX_VALUE);
        Map<Integer, Map<Integer, Integer>> dist = new HashMap<>();
        for (int i = 0; i < n; i++) {
            dist.put(i, new HashMap<>());
        }
 
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int w = scanner.nextInt() & 1;
            dist.get(u).put(v, w);
            dist.get(v).put(u, w);
        }
 
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);
        while (!deque.isEmpty()) {
            int i = deque.poll();
            for (Map.Entry<Integer, Integer> entry : dist.get(i).entrySet()) {
                if (d[entry.getKey()] > d[i] + entry.getValue()) {
                    d[entry.getKey()] = d[i] + entry.getValue();
                    deque.add(entry.getKey());
                }
            }
        }
 
        for (int i : d) {
            System.out.println(i & 1);
        }
    }
}