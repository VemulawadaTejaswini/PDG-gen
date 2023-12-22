import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        final long INF = 0x7ffffff;
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int R = scanner.nextInt();
        int[] r = IntStream.range(0, R).map(i -> scanner.nextInt() - 1).toArray();
        long[][] dist = new long[N][N];
        Arrays.stream(dist).forEach(array -> Arrays.fill(array, INF));
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            int c = scanner.nextInt();
            dist[a][b] = dist[b][a] = c;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
                }
            }
        }

        long ans = INF;
        Queue<List<Integer>> queue = new ArrayDeque<>();
        queue.add(Collections.emptyList());
        while (!queue.isEmpty()) {
            List<Integer> list = queue.poll();
            if (list.size() == R) {
                long a = 0;
                for (int i = 1, l = list.get(0); i < R; i++) {
                    a += dist[r[l]][r[l = list.get(i)]];
                }
                ans = Math.min(ans, a);
            } else {
                for (int i = 0; i < R; i++) {
                    if (!list.contains(i)) {
                        List<Integer> list1 = new ArrayList<>(list);
                        list1.add(i);
                        queue.add(list1);
                    }
                }
            }
        }

        System.out.println(ans);
    }
}