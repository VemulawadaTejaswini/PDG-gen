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

        List<Integer> ans = new ArrayList<>();
        Set<Integer> ansBeen = new HashSet<>();
        Map<Integer, Integer> been = new HashMap<>();

        dfs(graph, s, t, 0, ans, ansBeen, been, "");
        // out.println(ansBeen);
        // out.println(been);
        out.println(ans.isEmpty() ? -1 : ans.get(0));
    }

    private static void dfs(Map<Integer, Set<Integer>> graph, int start, int target, int depth, List<Integer> ans, Set<Integer> ansBeen, Map<Integer, Integer> been, String log) {


        // out.println("Depth " + depth + " " + log);
        if (depth % 3 == 0) {
            if (start == target) {
                if (ans.isEmpty())
                    ans.add(depth / 3);
                else if (ans.get(0) > depth / 3)
                    ans.set(0, depth / 3);
            } else {
                if (been.containsKey(start) && been.get(start) <= depth/3)
                    return;
                been.put(start, depth/3);
            }

            log = "";
        } else {
            if (start == target) {
                if (ansBeen.contains(depth % 3))
                    return;
                ansBeen.add(depth % 3);
            }
        }

        // 5 1 5
        // 1 4 6

        if (!graph.containsKey(start))
            return;
        Set<Integer> to = graph.get(start);
        for (int dest : to) {
            dfs(graph, dest, target, depth+1, ans, ansBeen, been, log + dest);
        }
    }

}
