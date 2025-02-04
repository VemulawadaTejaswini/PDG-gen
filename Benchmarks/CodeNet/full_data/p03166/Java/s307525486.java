import java.util.HashSet;
        import java.util.Objects;
        import java.util.PriorityQueue;
        import java.util.Scanner;
        import java.util.Set;

public class Main {
    public static class Node implements Comparable<Node>{
        Set<Integer> father;
        Set<Integer> son;
        int index;

        public Node() {
            father = new HashSet<>();
            son = new HashSet<>();
        }

        public Node(Set<Integer> father, Set<Integer> son, int index) {
            this.father = father;
            this.son = son;
            this.index = index;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return index == node.index &&
                    Objects.equals(father, node.father) &&
                    Objects.equals(son, node.son);
        }

        @Override
        public int hashCode() {
            return Objects.hash(father, son, index);
        }

        @Override
        public int compareTo(Node o) {
            if (this.father.size() == o.father.size()) {
                return 0;
            } else if (this.father.size() < o.father.size()) {
                return -1;
            } else {
                return 1;
            }
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Node[] graph = new Node[n + 1];
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<Node> nodes = new PriorityQueue<>();
        for (int i = 1; i <= n; ++i) {
            graph[i] = new Node();
            graph[i].index = i;
        }

        for (int i = 1; i <= m; ++i) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph[x].son.add(y);
            graph[y].father.add(x);
        }
        for (int i = 1; i <= n; ++i) {
            Node newNode = new Node(graph[i].father, graph[i].son, i);
            nodes.add(newNode);
        }

        long [] path = new long[n + 1];

        while (!nodes.isEmpty()) {
            Node currentHead = nodes.poll();
            //    System.out.println("currentHead: " + currentHead.index);
            if (visited.contains(currentHead.index)) {
                continue;
            }
            for (Integer son : graph[currentHead.index].son) {
                if (visited.contains(son)) {
                    continue;
                }
                //      System.out.println("current son: " + son);
                path[son] = Math.max(path[son], path[currentHead.index] + 1L);
                graph[son].father.remove(currentHead.index);
                //   graph[currentHead.index].son.remove(son);
                Node newSon = new Node(graph[son].father, graph[son].son, son);
                nodes.add(newSon);
            }
            graph[currentHead.index].son.clear();
            currentHead.son.clear();
            visited.add(currentHead.index);
        }

        long result = 0;
        for (int i = 1; i <= n; ++i) {
            result = Math.max(result, path[i]);
        }

        System.out.println(result);
    }
}
