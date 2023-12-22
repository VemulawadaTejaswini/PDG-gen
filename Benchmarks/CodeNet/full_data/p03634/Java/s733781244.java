import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        Map<Integer, Integer>[] connect = IntStream.range(0, n).mapToObj(i -> new HashMap<>()).toArray(HashMap[]::new);
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            int c = scanner.nextInt();
            connect[a].put(b, c);
            connect[b].put(a, c);
        }

        int q = scanner.nextInt();
        int k = scanner.nextInt() - 1;

        long[] dist2 = new long[n];
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(k);

        while (!deque.isEmpty()) {
            int i = deque.poll();
            for (Map.Entry<Integer, Integer> entry : connect[i].entrySet()) {
                if (dist2[entry.getKey()] == 0) {
                    dist2[entry.getKey()] = dist2[i] + entry.getValue();
                    deque.add(entry.getKey());
                }
            }
        }

        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            System.out.println(dist2[x] + dist2[y]);
        }
    }
}