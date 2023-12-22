import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    int N;
    Scanner scanner = new Scanner(System.in);
    Node[] nodes;

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        N = scanner.nextInt();
        nodes = new Node[N];
        for (int i = 0; i < N; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            long c = scanner.nextLong();
            nodes[a - 1].add(nodes[b - 1], c);
            nodes[b - 1].add(nodes[a - 1], c);
        }
        int Q = scanner.nextInt();
        int K = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(cost(nodes[x - 1], nodes[K - 1], null) + cost(nodes[K - 1], nodes[y - 1], null));
        }

    }

    long cost(Node x, Node y, Node prev) {
        if (x == y) {
            return 0;
        }
        for (int i = 0; i < x.nexts.size(); i++) {
            Node next = x.nexts.get(i);
            if (prev == next) {
                continue;
            }
            long nextCost = cost(next, y, x);
            if (nextCost != -1) {
                return nextCost + x.distances.get(i);
            }
        }
        return -1;
    }

    class Node {

        List<Node> nexts = new ArrayList<>();
        List<Long> distances = new ArrayList<>();

        void add(Node next, long distance) {
            nexts.add(next);
            distances.add(distance);
        }
    }
}
