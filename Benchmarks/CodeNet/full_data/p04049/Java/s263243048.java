import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringJoiner;

public class Main {
    private static class CustomTree {
        private CustomNode[] nodes;

        public CustomTree(int size) {
            nodes = new CustomNode[size];
            for (int i = 0; i < size; i++) {
                nodes[i] = new CustomNode(i + 1);
            }
        }

        public CustomNode get(int id) {
            return nodes[id - 1];
        }

        public void addEdge(int a, int b) {
            get(a).neighbors.add(get(b));
            get(b).neighbors.add(get(a));
        }

        public int getMaxSizeWithDiameter(int diameter) {
            int radius = diameter / 2;
            int[] treeSizes = new int[nodes.length];

            for (int i = 0; i < treeSizes.length; i++) {
                treeSizes[i] = nodes[i].countNodesWithinDistance(radius, null);
            }

            Arrays.sort(treeSizes);
            return treeSizes[treeSizes.length - 1];
        }

        public String toString() {
            StringJoiner sj = new StringJoiner("\n");
            for (CustomNode node : nodes) {
                sj.add(node.toString());
            }
            return sj.toString();
        }
    }

    private static class CustomNode {
        public final int id;
        public Set<CustomNode> neighbors;

        public CustomNode(int id) {
            this.id = id;
            neighbors = new HashSet<>();
        }

        public int getId() {
            return id;
        }

        public int countNodesWithinDistance(int dist, CustomNode parent) {

            if (dist == 0) {
                return 1;
            }

            int nodeCount = 1;
            for (CustomNode neighbor : neighbors) {
                if (neighbor != parent) {
                    nodeCount += neighbor.countNodesWithinDistance(dist - 1, this);
                }
            }
            return nodeCount;
        }

        @Override
        public String toString() {
            Integer[] neighborIds = neighbors
                    .stream()
                    .map(CustomNode::getId)
                    .sorted()
                    .toArray(Integer[]::new);

            String neighborStr = Arrays.toString(neighborIds);
            return "{\n  id: " + id + "\n  neighbors: " + neighborStr + "\n}";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        CustomTree tree = new CustomTree(n);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            tree.addEdge(a, b);
        }

        System.out.println(Math.max(n - tree.getMaxSizeWithDiameter(k), 0));
    }
}
