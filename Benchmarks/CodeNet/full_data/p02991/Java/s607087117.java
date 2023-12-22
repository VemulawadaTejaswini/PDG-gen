import java.util.*;

public class Main {
    private static final int INF = 1001001001;
    private static int dist[][] = new int[100005][3];

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> to[] = new ArrayList[n];
        for (int i=0;i<n;i++) {
            to[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            u--;
            v--;
            to[u].add(v);
        }

        int s = sc.nextInt();
        int t = sc.nextInt();
        s--;
        t--;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                dist[i][j] = INF;
            }
        }

        // BSF
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();

        q.add(new Pair<>(s, 0));
        dist[s][0] = 0;
        while (!q.isEmpty()) {
            int v = q.peek().first;
            int l = q.peek().second;
            q.poll();
            for (int u : to[v]) {
                int nl = (l + 1) % 3;
                if (dist[u][nl] != INF) continue;
                dist[u][nl] = dist[v][l] + 1;
                q.add(new Pair<>(u, nl));
            }
        }
        int ans = dist[t][0];
        if (ans == INF) ans = -1;
        else ans /= 3;
        System.out.println(ans);
    }

    static class Pair<F, S> {
        public final F first;
        public final S second;

        Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }
    }
}