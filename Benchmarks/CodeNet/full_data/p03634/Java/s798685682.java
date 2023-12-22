import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    int N;
    Scanner scanner = new Scanner(System.in);
    Node[] nodes;
    long[] memo;

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        N = scanner.nextInt();
        nodes = new Node[N];
        memo = new long[N];
        for (int i = 0; i < N; i++) {
            nodes[i] = new Node(i);
        }
        for (int i = 0; i < N; i++) {
            memo[i] = -1;
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

        long[] costs = new long[N];
        for (int i = 0; i < N; i++) {
            costs[i] = cost(nodes[i], nodes[K - 1], null);
        }

        for (int i = 0; i < Q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(costs[x - 1] + costs[y - 1]);
        }

    }

    long cost(Node x, Node y, Node prev) {
        if (memo[x.num] != -1) {
            return memo[x.num];
        }
        if (x == y) {
            memo[x.num] = 0;
            return 0;
        }
        for (int i = 0; i < x.nexts.size(); i++) {
            Node next = x.nexts.get(i);
            if (prev == next) {
                continue;
            }
            long nextCost = cost(next, y, x);
            if (nextCost != -1) {
                memo[x.num] = nextCost + x.distances.get(i);
                return nextCost + x.distances.get(i);
            }
        }
        return -1;
    }

    class Node {

        int num;
        List<Node> nexts = new ArrayList<>();
        List<Long> distances = new ArrayList<>();

        void add(Node next, long distance) {
            nexts.add(next);
            distances.add(distance);
        }

        Node(int num) {
            this.num = num;
        }
    }
}
