import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int Q = sc.nextInt();

            Node[] nodes = new Node[N];
            for (int i = 0; i < N; i++) {
                nodes[i] = new Node(i + 1);
            }

            for (int i = 0; i < N - 1; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                nodes[a - 1].children.add(nodes[b - 1]);
                nodes[b - 1].depth = nodes[a - 1].depth + 1;
            }

            for (int i = 0; i < Q; i++) {
                int p = sc.nextInt();
                int x = sc.nextInt();

                nodes[p - 1].counter += x;
            }

            Node[] nodes2 = Arrays.copyOf(nodes, N);
            Arrays.sort(nodes2, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o1.depth - o2.depth;
                }
            });

            for (Node node : nodes2) {
                for (Node child : node.children) {
                    child.counter += node.counter;
                }
            }

            System.out.print(nodes[0].counter);
            for (int i = 1; i < N; i++) {
                System.out.print(" " + nodes[i].counter);
            }
        }
    }

    public static class Node {

        public int number;

        public long counter = 0;

        public int depth = 0;

        public List<Node> children = new ArrayList<>();

        public Node(int number) {
            this.number = number;
        }

    }

}
