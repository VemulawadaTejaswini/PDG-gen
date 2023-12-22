import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int path(Edge[] edges, Vertex[] vertices){
        int sum = 0;
        int[] in_degree = new int[vertices.length];
        boolean[] visited = new boolean[vertices.length];
        Arrays.fill(in_degree, 0);
        Arrays.fill(visited, false);
        for (Edge e : edges){
            in_degree[e.dst-1]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < vertices.length; i++) {
            if (!visited[i] && in_degree[i] == 0){
                queue.add(i);
            }
        }
        int[] path = new int[vertices.length];
        Arrays.fill(path, 0);
        while (!queue.isEmpty()){
            int v = queue.poll();
            visited[v] = true;
            for (Edge e: vertices[v].edges){
                in_degree[e.dst-1]--;
                if (path[e.src-1] + 1 > path[e.dst - 1]){
                    path[e.dst-1] = path[e.src-1] + 1;
                }
                if (in_degree[e.dst-1] == 0){
                    queue.add(e.dst-1);
                }
            }
        }
        for (int i = 0; i < vertices.length; i++) {
            if (path[i] > sum){
                sum = path[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Edge[] edges = new Edge[M];
        Vertex[] vertices = new Vertex[N];
        for (int i = 0; i < N; i++) {
            vertices[i] = new Vertex();
            vertices[i].edges = new Vector<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(reader.readLine());
            edges[i] = new Edge();
            edges[i].src = Integer.parseInt(st.nextToken());
            edges[i].dst = Integer.parseInt(st.nextToken());
            vertices[edges[i].src-1].edges.add(edges[i]);
        }
        System.out.println(path(edges, vertices));
    }

    private static class Edge{
        int src;
        int dst;
    }

    private static class Vertex{
        Vector<Edge> edges;
    }
}
