import java.util.*;

public class Main {

    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<List<Integer>> out = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            out.add(new ArrayList<>());
        }

        for (int i = 0; i < N; i++) {
            String S = sc.next();
            for (int j = 0; j < N; j++) {
                if (S.charAt(j) == '1') out.get(i).add(j);
            }
        }


        boolean[] visited = new boolean[N];
        int sol = 0;
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                Set<Integer> component = component(i, out);
                for (int u : component) visited[u] = true;
                int best = 0;
                for (int u : component) {
                    int longest = bfs(u, out);
                    if (longest == -1) {
                        System.out.println(-1);
                        return;
                    }
                    best = Math.max(longest, best);
                }
                sol += best + 1;
            }
        }

        System.out.println(sol);
    }


    static Set<Integer> component(int s, List<List<Integer>> out) {
        Set<Integer> component = new HashSet<>();
        component.add(s);
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(s);

        while (!deque.isEmpty()) {
            int u = deque.pollLast();

            for (int v : out.get(u)) {
                if (!component.contains(v)) {
                    component.add(v);
                    deque.addFirst(v);
                }
            }
        }

        return component;
    }

    static int bfs(int s, List<List<Integer>> out) {
        int[] dist = new int[out.size()];
        Arrays.fill(dist, INF);
        dist[s] = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(s);

        while (!deque.isEmpty()) {
            int u = deque.pollLast();
            for (int v : out.get(u)) {
                if (dist[v] < INF && dist[v] % 2 == dist[u] % 2) return -1;
                if (dist[v] < INF) continue;
                dist[v] = dist[u] + 1;
                deque.addFirst(v);
            }
        }

        int longest = 0;
        for (int d : dist) {
            if (d < INF) longest = Math.max(d, longest);
        }

        return longest;
    }
}