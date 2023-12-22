import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static List<Integer>[] edges;
    static int N;

    static void solve(Scanner scanner) {
        N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        edges = new List[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int s = Integer.parseInt(scanner.next()) - 1;
            int t = Integer.parseInt(scanner.next()) - 1;
            edges[s].add(t);
        }

        List<Integer> minPath = Collections.emptyList();
        for (int i = 0; i < N; i++) {
            List<Integer> path = bfs(i);
            if (minPath.isEmpty()) {
                minPath = path;
                continue;
            }
            if (!path.isEmpty() && path.size() < minPath.size()) {
                minPath = path;
            }
        }

        if (minPath.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(minPath.size());
            for (int n : minPath) {
                System.out.println(n + 1);
            }
        }
    }

    static List<Integer> bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);

        int[] dist = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;

        int[] prev = new int[N];
        Arrays.fill(prev, -1);

        Set<Integer> visited = new HashSet<>();
        visited.add(s);

        while (!q.isEmpty()) {
            Integer top = q.poll();
            for (int next : edges[top]) {
                if (visited.add(next)) {
                    dist[next] = dist[top] + 1;
                    prev[next] = top;
                    q.add(next);
                }
            }
        }

        int mind = Integer.MAX_VALUE;
        int to = -1;
        for (int i = 0; i < N; i++) {
            if (i == s) continue;
            if (edges[i].contains(s)) {
                if (mind > dist[i]) {
                    mind = dist[i];
                    to = i;
                }
            }
        }

        if (to == -1) {
            return Collections.emptyList();
        }
        List<Integer> path = new ArrayList<>();
        int curr = to;
        while (prev[curr] != -1) {
            path.add(curr);
            curr = prev[curr];
        }
        path.add(curr);

        return path;
    }
}
