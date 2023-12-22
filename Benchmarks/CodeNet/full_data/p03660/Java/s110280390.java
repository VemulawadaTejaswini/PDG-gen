import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static class Step {
        final Step prev;
        final int pos;

        Step(Step prev, int pos)
        {
            this.prev = prev;
            this.pos = pos;
        }
    }

    private static List<Integer> shortestRoute(int goal, Map<Integer, List<Integer>> nodes)
    {
        LinkedList<Step> queue = new LinkedList<>();
        queue.add(new Step(null, 0));

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
                if (step.prev != null && next == step.prev.pos) {
                    continue;
                }
                queue.add(new Step(step, next));
            }
        }
    }

    private static void dfs(Boolean[] vertices, Map<Integer, List<Integer>> nodes, int[] cut)
    {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(0);

        while (true) {
            if (stack.isEmpty()) {
                return;
            }

            Integer pos = stack.removeLast();

            for (int next : nodes.get(pos)) {
                if (vertices[next] != null) {
                    continue;
                }
                if (cut[0] == pos && cut[1] == next
                        || cut[1] == pos && cut[0] == next) {
                    continue;
                }
                vertices[next] = true;
                stack.addLast(next);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, List<Integer>> nodes = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;

            nodes.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            nodes.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        List<Integer> shortestRoute = shortestRoute(n - 1, nodes);

        int conflictPos = (int) Math.ceil(shortestRoute.size() / 2.0);
        int[] cut = new int[] { shortestRoute.get(conflictPos - 1), shortestRoute.get(conflictPos)};

        Boolean[] vertices = new Boolean[n];
        vertices[0] = true;
        vertices[n - 1] = false;
        dfs(vertices, nodes, cut);

        int fennecCells = 0;
        for (Boolean b : vertices) {
            if (b != null && b) {
                fennecCells++;
            }
        }

        if (fennecCells > (n - fennecCells)) {
            System.out.println("Fennec");
        }
        else {
            System.out.println("Snuke");
        }
    }
}

