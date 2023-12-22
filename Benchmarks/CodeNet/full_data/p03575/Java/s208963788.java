import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Edge[] edges = new Edge[m];
        boolean[][] adj = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            edges[i] = new Edge(a, b);
            adj[a][b] = adj[b][a] = true;
        }
        int num = 0;
        for (int i = 0; i < m; i++) {
            Set<Integer> visited = new HashSet<>();
            Queue<Integer> toVisit = new PriorityQueue<>();
            toVisit.add(1);
            visited.add(1);
            int count = 0;
            adj[edges[i].a][edges[i].b] = adj[edges[i].b][edges[i].a] = false;
            while (!toVisit.isEmpty()) {
                int a = toVisit.remove();
                count++;
                for (int j = 0; j < n + 1; j++) {
                    if (adj[a][j] && !visited.contains(j)) {
                        visited.add(j);
                        toVisit.add(j);
                    }
                }
            }
            adj[edges[i].a][edges[i].b] = adj[edges[i].b][edges[i].a] = true;
            if (count != n) {
                num++;
            }
        }
        System.out.println(num);
    }
}

class Edge {
    int a, b;
    boolean active = true;
    public Edge(int c, int d) {
        a = c; b = d;
    }
}
