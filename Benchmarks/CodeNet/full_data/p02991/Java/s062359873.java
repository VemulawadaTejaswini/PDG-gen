import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final BigInteger MOD = BigInteger.valueOf((long) 1e9 + 7);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();

        for (int i=0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();

            if (!graph.containsKey(u))
                graph.put(u, new HashSet<>());
            graph.get(u).add(v);
        }

        // out.println(graph);

        int s = in.nextInt();
        int t = in.nextInt();

        Map<Integer, Set<Integer>> graph2 = new HashMap<>();
        for (Map.Entry<Integer, Set<Integer>> e : graph.entrySet()) {
            for (int i=0; i < 3; i++) {
                if (!graph2.containsKey(e.getKey()*3 + i))
                    graph2.put(e.getKey()*3 + i, new HashSet<>());
                int finalI = i;
                e.getValue().forEach(v -> graph2.get(e.getKey()*3 + finalI).add(v*3 + (finalI +1)%3));
            }
        }

        Set<Integer> been = new HashSet<>();
        ArrayDeque<Map.Entry<Integer, Integer>> toVisit = new ArrayDeque<>();

        int ans = -1;
        if (graph2.containsKey(s*3))
            graph2.get(s*3).forEach(v -> toVisit.addLast(new AbstractMap.SimpleEntry<>(v, 1)));
        while (!toVisit.isEmpty()) {
            Map.Entry<Integer, Integer> e = toVisit.poll();
            if (been.contains(e.getKey()))
                continue;

            if (e.getKey() == t * 3) {
                ans = e.getValue() / 3;
                break;
            }
            been.add(e.getKey());
            if (graph2.containsKey(e.getKey()))
                graph2.get(e.getKey()).forEach(v -> toVisit.addLast(new AbstractMap.SimpleEntry<>(v, e.getValue() + 1)));
        }

        out.println(ans);
    }

}
