import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static boolean solve(boolean player, Boolean[] vertices, Map<Integer, List<Integer>> nodes)
    {
        boolean put = false;
        for (int i = 0; i < vertices.length; i++) {
            Boolean v = vertices[i];
            if (v == null) {
                continue;
            }

            if ((player && v) || (!player && !v)) {
                List<Integer> dstList = nodes.get(i);
                if (dstList == null) {
                    continue;
                }
                for (int dst : dstList) {
                    if (vertices[dst] == null) {
                        Boolean[] newVertices = Arrays.copyOf(vertices, vertices.length);
                        newVertices[dst] = player;
                        if (!solve(!player, newVertices, nodes)) {
                            put = true;
                        }
                    }
                }
            }
        }
        return put;
    }

    private static class Step {
        final Step prev;
        final int pos;

        public Step(Step prev, int pos)
        {
            this.prev = prev;
            this.pos = pos;
        }
    }

    private static List<Integer> shortestRoute(int goal, Map<Integer, List<Integer>> nodes)
    {
        LinkedList<Step> queue = new LinkedList<>();
        queue.add(new Step(null, 1));

        while (true) {
            Step step = queue.pop();

            if (step.pos == goal) {
                LinkedList<Integer> route = new LinkedList<>();
                Step cur = step;
                while (true) {
                    route.addFirst(cur.pos);
                    if (cur.prev == null) {
                        return route;
                    }
                    cur = cur.prev;
                }
            }

            for (int next : nodes.get(step.pos)) {
                queue.add(new Step(step, next));
            }
        }
    }

    private static void prevail(boolean[] vertices, int cur, List<Integer> shortestRoute, Map<Integer, List<Integer>> nodes) {
        vertices[cur] = true;
        for (int next : nodes.get(cur)) {
            if (!vertices[next] && !shortestRoute.contains(next)) {
                prevail(vertices, next, shortestRoute, nodes);
            }
        }
    }

    private static int dfs(boolean[] vertices, int cur, Map<Integer, List<Integer>> nodes, int[] cut)
    {
        int moves = 0;
        for (int next : nodes.get(cur)) {
            if (cur == cut[0] && next == cut[1]
            || cur == cut[1] && next == cut[0]) {
                continue;
            }
            if (!vertices[next]) {
                vertices[next] = true;
                moves++;
                moves += dfs(vertices, next, nodes, cut);
            }
        }
        return moves;
    }

    public static void main(String[] args)
            throws FileNotFoundException
    {
//        Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(new FileInputStream("/Users/komamitsu/tmp/atcoder.txt"));
        int n = scanner.nextInt();
        Map<Integer, List<Integer>> nodes = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            nodes.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            nodes.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        List<Integer> shortestRoute = shortestRoute(n, nodes);

        int conflictPos = (int) Math.ceil(shortestRoute.size() / 2.0);
        int[] cut = new int[] { shortestRoute.get(conflictPos - 1), shortestRoute.get(conflictPos)};

        boolean[] vertices = new boolean[n + 1];
        /*
        for (int i = 0; i < Math.ceil(shortestRoute.size() / 2.0); i++) {
            prevail(vertices, shortestRoute.get(0), shortestRoute, nodes);
        }

        int fennecCells = 0;
        for (boolean b : vertices) {
            if (b) {
                fennecCells++;
            }
        }
         */

        int fennecCells = dfs(vertices, 1, nodes, cut);

        if (fennecCells > (n - fennecCells)) {
            System.out.println("Fennec");
        }
        else {
            System.out.println("Snuke");
        }
    }
}

