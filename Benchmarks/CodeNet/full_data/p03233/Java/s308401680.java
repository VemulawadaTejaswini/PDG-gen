
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static class Node {
        public long aValue;
        public long bValue;

        public Node(final long aValue, final long bValue) {
            this.aValue = aValue;
            this.bValue = bValue;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return aValue == node.aValue &&
                    bValue == node.bValue;
        }

        @Override
        public int hashCode() {
            return Objects.hash(aValue, bValue);
        }
    }
    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final PriorityQueue<Long> a = new PriorityQueue<>();
        final PriorityQueue<Long> b = new PriorityQueue<>(
                Comparator.reverseOrder()
        );
        final Map<Node, Integer> nodes = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            long currentA = scanner.nextLong();
            long currentB = scanner.nextLong();
            a.add(currentA);
            b.add(currentB);
            final Node node = new Node(currentA, currentB);
            final int count = nodes.getOrDefault(node, 0);
            nodes.put(node, count + 1);
        }
        long result = 0;

        while (!a.isEmpty()) {
            long aValue = a.poll();
            long bValue = b.poll();
            Node currentNode = new Node(aValue, bValue);
            if (nodes.containsKey(currentNode) && nodes.get(currentNode) == 1) {
                long newBValue = b.poll();
                result += Math.min(aValue, newBValue);
                b.add(bValue);
            } else if (!nodes.containsKey(currentNode)) {
                result += Math.min(aValue, bValue);
            } else {
                result += Math.min(aValue, bValue);
            }
        }
        System.out.println(result);
    }
}
