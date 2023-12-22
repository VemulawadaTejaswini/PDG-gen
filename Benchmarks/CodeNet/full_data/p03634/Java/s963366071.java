import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        List<List<Edge>> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            edges.get(e[0] - 1).add(new Edge(e[1] - 1, e[2]));
            edges.get(e[1] - 1).add(new Edge(e[0] - 1, e[2]));
        }
        String[] qv = scanner.nextLine().split(" ");
        int Q = Integer.parseInt(qv[0]);
        int via = Integer.parseInt(qv[1]) - 1;
        dist = new long[N];
        Arrays.fill(dist, -1);
        es = edges;
        getDist(via, 0);
        for (int i = 0; i < Q; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int from = q[0] - 1;
            int to = q[1] - 1;
            System.out.println(dist[from] + dist[to]);
        }
    }

    static long[] dist;
    static List<List<Edge>> es;

    static void getDist(int s, long cost) {
        if (dist[s] >= 0) {
            return;
        }
        dist[s] = cost;
        for (Edge next : es.get(s)) {
            getDist(next.to, cost + (long) next.cost);
        }
    }

    static class Edge {
        int to;
        int cost;

        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

}