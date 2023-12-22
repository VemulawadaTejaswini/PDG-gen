import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

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

    static boolean loop(Map<Integer, List<Node>> map, Integer node, Set<Integer> visited, Set<Integer> processing) {
        boolean res = false;
        processing.add(node);
        for (Node n: map.get(node)) {
            if (visited.contains(n.to)) {
                continue;
            }
            if (processing.contains(n.to)) {
                return true;
            }
            res |= loop(map, n.to, visited, processing);
        }
        processing.remove(node);
        visited.add(node);
        return res;
    }

    static Consumer<List<String>> solve() {
        return args -> {
            int N = Integer.parseInt(args.get(0).split(" ")[0]);
            long[] dist = new long[N];
            Arrays.fill(dist, Long.MAX_VALUE / 2);
            Map<Integer, List<Node>> edges = new HashMap<>();
            for (int i = 0; i < N; i++) {
                edges.put(i, new ArrayList<>());
            }
            for (int i = 1; i < args.size(); i++) {
                int[] edge = Arrays.stream(args.get(i).split(" ")).mapToInt(Integer::parseInt).toArray();
                int from = edge[0] - 1, to = edge[1] - 1, cost = -edge[2];
                edges.get(from).add(new Node(to, cost));
            }

            if (loop(edges, 0, new HashSet<>(), new HashSet<>())) {
                System.out.println("inf");
                return;
            }

            Queue<Node> ns = new PriorityQueue<>(Comparator.comparingLong(x -> x.cost));
            ns.add(new Node(0, 0));
            while (!ns.isEmpty()) {
                Node n = ns.poll();
                if (dist[n.to] < n.cost) {
                    continue;
                }
                dist[n.to] = n.cost;
                for (Node nt: edges.get(n.to)) {
                    ns.add(new Node(nt.to, dist[n.to] + nt.cost));
                }
            }

            System.out.println(-dist[N - 1]);
        };
    }

    static class Node {
        int to;
        long cost;
        public Node(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}