import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        final int N = Integer.parseInt(in.readLine());
        int[] color = new int[N];
        HashMap<Integer, List<Edge>> g = new HashMap<>();
        for (int i = 1; i < N; i++) {
            int[] uvw = in.readLineAsIntArray();
            int u = uvw[0] - 1;
            int v = uvw[1] - 1;
            int w = uvw[2];
            Edge e1 = new Edge(u, v, w);
            Edge e2 = new Edge(v, u, w);
            if (!g.containsKey(u)) {
                g.put(u, new ArrayList<>());
            }
            if (!g.containsKey(v)) {
                g.put(v, new ArrayList<>());
            }
            g.get(u).add(e1);
            g.get(v).add(e2);
        }
        boolean[] visited = new boolean[N];
        color[0] = 0;
        visited[0] = true;
        int visitCnt = 1;
        int root = 0;
        dfs(0, g, color, visited);
        for (int i = 0; i < N; i++) {
            System.out.println(color[i]);
        }
    }

    private void dfs(int root, HashMap<Integer, List<Edge>> g, int[] color, boolean[] visited) {
        int rColor = color[root];
        List<Edge> next = g.getOrDefault(root, new ArrayList<>());
        for (Edge e : next) {
            if (!visited[e.to]) {
                if (e.weight % 2 == 0) {
                    color[e.to] = rColor;
                } else {
                    color[e.to] = reverse(rColor);
                }
                visited[e.to] = true;
                dfs(e.to, g, color, visited);
            }
        }
    }

    private int reverse(int col) {
        return (col == 0) ? 1 : 0;
    }

    static class Edge {
        public final int from;
        public final int to;
        public final int weight;

        public Edge(int u, int v, int w) {
            from = u;
            to = v;
            weight = w;
        }
    }

    static class CustomReader extends BufferedReader {

        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in));
        }

        public int[] readLineAsIntArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            return intArray;
        }

        public int[][] readAsIntMatrix(int rows, int columns) throws IOException {
            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                String[] r = this.readLine().split(" ");
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = Integer.parseInt(r[j]);
                }
            }
            return matrix;
        }

    }
}