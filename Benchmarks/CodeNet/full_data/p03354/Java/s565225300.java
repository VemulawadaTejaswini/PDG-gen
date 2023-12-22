import java.util.Scanner;
import java.util.Stack;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), m = sc.nextInt();
        int p[] = new int[n + 1];
        int neighbor[][] = new int[n + 1][n + 1];
        DFS.Vertex[] g = new DFS.Vertex[n + 1];
        for (int i = 1; i < n + 1; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            neighbor[a][b] = b;
            neighbor[b][a] = a;
        }
        for (int i = 1; i < n + 1; i++) {
            g[i] = new DFS.Vertex(i, neighbor[i]);
        }

        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            DFS.clear(g);
            if (DFS.hasPath(g, i, p[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class DFS {

    static boolean hasPath(Vertex[] g, int start, int end) {
        Stack<Vertex> stack = new Stack<>();
        g[start].visit = true;
        stack.push(g[start]);
        while (!stack.isEmpty()) {
            Vertex p = stack.pop();
            if (p.id == g[end].id) {
                return true;
            }
            for (int neighbor : g[p.id].neighbor) {
                if (neighbor != 0 && !g[neighbor].visit) {
                    g[neighbor].visit = true;
                    stack.push(g[neighbor]);
                }
            }
        }
        return false;
    }

    static void clear(Vertex[] g) {
        for (int i = 0; i < g.length; i++) {
            if (g[i] != null) {
                g[i].visit = false;
            }
        }
    }

    static class Vertex {

        Vertex(int id, int[] neighbor) {
            this.id = id;
            this.neighbor = neighbor;
        }

        int id;
        int neighbor[];
        boolean visit;
    }
}
