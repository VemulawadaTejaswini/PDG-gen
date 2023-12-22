import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 256 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), m = sc.nextInt();
        int p[] = new int[n + 1];
        for (int i = 1; i < n + 1; i++) { // [0] dummy
            p[i] = sc.nextInt();
        }
        List<List<Integer>> neighbors = Stream.generate(ArrayList<Integer>::new)
                .limit(n + 1)
                .collect(Collectors.toList());
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            neighbors.get(a).add(b);
            neighbors.get(b).add(a);
        }
        BFS.Vertex[] g = new BFS.Vertex[n + 1];
        for (int i = 1; i < n + 1; i++) {
            g[i] = new BFS.Vertex(i, neighbors.get(i));
        }

        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            BFS.clear(g);
            if (BFS.hasPath(g, i, p[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class BFS {

    static boolean hasPath(Vertex[] g, int start, int end) {
        Queue<Vertex> stack = new ArrayDeque<>();
        g[start].visited = true;
        stack.add(g[start]);
        while (!stack.isEmpty()) {
            Vertex p = stack.poll();
            if (p.id == g[end].id) {
                return true;
            }
            for (int i = 0; i < p.neighbors.size(); i++) {
                if (!g[p.neighbors.get(i)].visited) {
                    g[p.neighbors.get(i)].visited = true;
                    stack.add(g[p.neighbors.get(i)]);
                }
            }
        }
        return false;
    }

    static void clear(Vertex[] g) {
        for (Vertex gg : g) {
            if (gg != null) {
                gg.visited = false;
            }
        }
    }

    static class Vertex {

        Vertex(int id, List<Integer> neighbors) {
            this.id = id;
            this.neighbors = neighbors;
        }

        int id;
        List<Integer> neighbors;
        boolean visited;
    }
}