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

                nodes[a - 1].children[nodes[a - 1].childCount] = nodes[b - 1];
                nodes[a - 1].childCount++;
                nodes[b - 1].parent = nodes[a - 1];
            }

            for (int i = 0; i < Q; i++) {
                int p = sc.nextInt();
                int x = sc.nextInt();

                nodes[p - 1].counter += x;
            }

            addCounter(nodes[0]);

            System.out.print(nodes[0].counter);
            for (int i = 1; i < N; i++) {
                System.out.print(" " + nodes[i].counter);
            }
        }
    }

    public static void addCounter(Node parent) {
        for (Node node : parent.children) {
            if (node != null) {
                node.counter += parent.counter;
                addCounter(node);
            }
        }
    }

    public static class Node {

        public int number;

        public long counter = 0;

        public Node parent = null;

        public Node[] children = new Node[200000];

        public int childCount = 0;

        public Node(int number) {
            this.number = number;
        }

    }

}
