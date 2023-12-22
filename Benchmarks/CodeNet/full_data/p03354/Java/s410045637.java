import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 256 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), m = sc.nextInt();
        int p[] = new int[n + 1];
        Map<Integer, List<Integer>> neighbors = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
            neighbors.put(p[i], new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            neighbors.get(a).add(b);
            neighbors.get(b).add(a);
        }

        Map<Integer, Integer> labels = BFS.labelLinking(neighbors);
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (labels.containsKey(i) && labels.get(i).equals(labels.get(p[i]))) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class BFS {

    static Map<Integer, Integer> labelLinking(Map<Integer, List<Integer>> graph) {
        Map<Integer, Integer> labels = new HashMap<>();
        int linkId = 1;
        for (Map.Entry<Integer, List<Integer>> vertex : graph.entrySet()) {
            if (!labels.containsKey(vertex.getKey())) {
                _labelLinking(graph, labels, linkId, vertex.getKey());
                linkId++;
            }
        }
        return labels;
    }

    private static void _labelLinking(Map<Integer, List<Integer>> graph,
                                      Map<Integer, Integer> labels, int linkId, int root) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(root);
        labels.put(root, linkId);
        while (!queue.isEmpty()) {
            int parent = queue.poll();
            for (Integer child : graph.get(parent)) {
                if (!labels.containsKey(child)) {
                    labels.put(child, linkId);
                    queue.add(child);
                }
            }
        }
    }
}
