
import java.util.*;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt() - 1;
        int y = scanner.nextInt() - 1;

        final Map<Integer, Set<Map.Entry<Integer, Integer>>> result = new HashMap<>();
        Map<Integer, List<Integer>> connections = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            connections.putIfAbsent(i, new ArrayList<>());
            connections.putIfAbsent(i+1, new ArrayList<>());
            connections.get(i).add(i+1);
            connections.get(i+1).add(i);
        }
        connections.get(x).add(y);
        connections.get(y).add(x);

        for (int i = 0; i < n; i++) {
            bfs(connections, i, result, i);
        }

        for (int i = 1; i < n; i++) {
            if (result.containsKey(i)) {
                System.out.println(result.get(i).size());
            } else {
                System.out.println(0);
            }
        }
    }

    static void bfs(Map<Integer, List<Integer>> connections, int node, Map<Integer, Set<Map.Entry<Integer, Integer>>> result, int source) {
        Set<Integer> visited = new HashSet<>();

        Queue<Map.Entry<Integer, Integer>> q = new LinkedList<>();
        visited.add(node);
        q.add(new AbstractMap.SimpleEntry<>(node, 0));
        while (!q.isEmpty()) {
            Map.Entry<Integer, Integer> poll = q.poll();
            int cur = poll.getKey();
            int dist = poll.getValue();

            for (final Integer next_node : connections.get(cur)) {
                if (visited.contains(next_node)) {
                    continue;
                }
                visited.add(next_node);
                q.add(new AbstractMap.SimpleEntry<>(next_node, dist + 1));
                if (!result.containsKey(dist+1)) {
                    result.put(dist+1, new HashSet<>());
                }
                result.get(dist+1).add(new AbstractMap.SimpleEntry<>(
                        Math.min(source, next_node),
                        Math.max(source, next_node)));
            }
        }
    }
}
