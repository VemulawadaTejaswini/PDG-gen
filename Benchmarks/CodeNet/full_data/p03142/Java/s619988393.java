
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static class Node {
        int current;
        int father;
        public Node(int current, int father) {
            this.current = current;
            this.father = father;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            if (current != node.current) return false;
            return father == node.father;

        }

        @Override
        public int hashCode() {
            int result = current;
            result = 31 * result + father;
            return result;
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        Map<Integer, Integer> fathers = new HashMap<>();
        Set<Integer> roots = new HashSet<>();
        for (int i = 1; i <= n; ++i) {
            roots.add(i);
        }
        for (int i = 0; i < n + m - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            Set<Integer> descendants = graph.getOrDefault(u, new HashSet<>());
            descendants.add(v);
            graph.put(u, descendants);
            roots.remove(v);
        }
        int root = -1;
        for (final int r : roots) {
            root = r;
        }
        Set<Node> addedNode = new HashSet<>();
        Queue<Node> travel = new LinkedBlockingDeque<>();
        travel.add(new Node(root, 0));
        while (!travel.isEmpty()) {
            Node currentNode = travel.poll();
            if (!graph.containsKey(currentNode.current)) {
                continue;
            }
            if (addedNode.contains(currentNode)) {
                continue;
            }

            for (int son : graph.get(currentNode.current)) {
                if (fathers.containsKey(son)) {
                    addedNode.add(new Node(son, fathers.get(son)));
                }
                travel.add(new Node(son, currentNode.current));
                fathers.put(son, currentNode.current);
            }
        }
        fathers.put(root, 0);
        for (int i = 1; i <= n; ++i) {
            System.out.println(fathers.get(i));
        }

    }
}
