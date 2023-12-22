import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

class D {
    static class Node extends ArrayList<Node> {
        final int id;
        int depth = -1;
        boolean visited = false;
        int parent = -1;

        public Node(int id) {
            this.id = id;
        }
    }

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final Node[] ns = new Node[N];
        for (int i = 0; i < N; i++)
            ns[i] = new Node(i);
        for (int i = 0; i < N + M - 1; i++) {
            final int A = sc.nextInt() - 1;
            final int B = sc.nextInt() - 1;
            ns[A].add(ns[B]);
        }
        final ArrayDeque<Node> topological = new ArrayDeque<>();
        final ArrayDeque<Node> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++)
            if (!ns[i].visited) {
                stack.offerFirst(ns[i]);
                while (!stack.isEmpty()) {
                    final Node n = stack.pollFirst();
                    if (n.visited) {
                        topological.offerFirst(n);
                    } else {
                        n.visited = true;
                        stack.offerFirst(n);
                        for (final Node child : n)
                            stack.offerFirst(child);
                    }
                }
            }
        topological.peekFirst().depth = 0;
        while(!topological.isEmpty()) {
            final Node n = topological.pollFirst();
            for(final Node child : n)
                if(child.depth < n.depth + 1) {
                    child.depth = n.depth + 1;
                    child.parent = n.id;
                }
        }
        final PrintWriter pw = new PrintWriter(System.out, false);
        for (int i = 0; i < N; i++)
            pw.println(ns[i].parent + 1);
        pw.flush();
    }
}
public class Main {
    public static void main(String... args) {
        D.main();
    }
}
