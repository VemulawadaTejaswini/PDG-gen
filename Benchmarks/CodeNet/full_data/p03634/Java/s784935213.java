import java.util.*;
import java.util.function.Consumer;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Consumer<List<String>> consumer = solve();

    public static void main(String[] args) {
        consumer.accept(readInput());
    }

    private static List<String> readInput() {
        final List<String> lineList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lineList.add(scanner.nextLine());
        }
        return lineList;
    }

    static Consumer<List<String>> solve() {
        return args -> {
            int N = Integer.parseInt(args.get(0));
            List<List<Edge>> edges = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                edges.add(new ArrayList<>());
            }
            for (int i = 0; i < N - 1; i++) {
                int[] e = Arrays.stream(args.get(1 + i).split(" ")).mapToInt(Integer::parseInt).toArray();
                edges.get(e[0] - 1).add(new Edge(e[0] - 1, e[1] - 1, e[2]));
                edges.get(e[1] - 1).add(new Edge(e[1] - 1, e[0] - 1, e[2]));
            }
            int via = Integer.parseInt(args.get(N).split(" ")[1]) - 1;
            dist = new long[N];
            getDist(via, 0, edges, new HashSet<>());
            for (int i = N + 1; i < args.size(); i++) {
                int[] q = Arrays.stream(args.get(i).split(" ")).mapToInt(Integer::parseInt).toArray();
                int from = q[0] - 1;
                int to = q[1] - 1;
                System.out.println(dist[from] + dist[to]);
            }
        };
    }

    static long[] dist;
    static void getDist(int s, long cost, List<List<Edge>> es, Set<Integer> used) {
        used.add(s);
        dist[s] = cost;
        for (Edge next : es.get(s)) {
            if (!used.contains(next.to)) {
                getDist(next.to, cost + next.cost, es, used);
            }
        }
    }

    static class Edge {
        int from;
        int to;
        long cost;

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

}