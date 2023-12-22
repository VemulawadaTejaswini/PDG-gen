import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static class Node {
        int u;
        int v;
        long w;

        public Node(int u, int v, long w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    private static int inverse(int n) {
        if (n % 2 == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, List<Node>> uvw = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            uvw.put(i, new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            long w = sc.nextLong();
            List<Node> nodeu = uvw.get(u);
            nodeu.add(new Node(u, v, w));
            uvw.put(u, nodeu);
            List<Node> nodev = uvw.get(v);
            nodev.add(new Node(v, u, w));
            uvw.put(v, nodev);
        }
        int[] color = new int[n + 1];
        Arrays.fill(color, -1);
        for (int i = 1; i <= n; i++) {
            Deque<Node> queue = new ArrayDeque<>();
            if (color[i] == -1) {
                color[i] = 0;
                for (Node node : uvw.get(i)) {
                    queue.add(node);
                }
            }
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    Node node = queue.poll();
                    if (node.w % 2 == 0) {
                        color[node.v] = color[node.u];
                    } else {
                        color[node.v] = inverse(color[node.u]);
                    }
                    for (Node next : uvw.get(node.v)) {
                        if (color[next.v] == -1) {
                            queue.add(next);
                        }
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(color[i]);
        }
    }

}
