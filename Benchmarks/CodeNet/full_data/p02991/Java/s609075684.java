import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = readIntArray(reader);
            int N = array[0];
            int M = array[1];

            List<Edge>[] edges = new List[N * 3];
            for (int i = 0; i < N * 3; i++) {
                edges[i] = new ArrayList<>();
            }
            for (int i = 0; i < M; i++) {
                array = readIntArray(reader);
                int u = array[0] - 1;
                int v = array[1] - 1;

                edges[u * 3].add(new Edge(v * 3 + 1, 1));
                edges[u * 3 + 1].add(new Edge(v * 3 + 2, 1));
                edges[u * 3 + 2].add(new Edge(v * 3, 1));
            }

            array = readIntArray(reader);
            int S = array[0] - 1;
            int T = array[1] - 1;

            long[] distances = dijkstra(edges, S * 3);

            long distance = distances[T * 3] != -1 ? distances[T * 3] / 3 : -1;

            System.out.println(distance);
        }
    }

    public static long[] dijkstra(List<Edge>[] edges, int start) {
        long[] distances = new long[edges.length];
        for (int i = 0; i < edges.length; i++) {
            distances[i] = -1;
        }

        PriorityQueue<Vertex> queue = new PriorityQueue<>(new Comparator<Vertex>() {
            @Override
            public int compare(Vertex o1, Vertex o2) {
                return Long.compare(o1.distance, o2.distance);
            }
        });

        queue.add(new Vertex(start, 0));

        while (queue.size() > 0) {
            Vertex vertex = queue.poll();

            if (distances[vertex.n] != -1) {
                continue;
            }

            distances[vertex.n] = vertex.distance;

            for (Edge edge : edges[vertex.n]) {
                if (distances[edge.to] == -1) {
                    queue.add(new Vertex(edge.to, vertex.distance + edge.distance));
                }
            }
        }

        return distances;
    }

    public static class Edge {

        public int to;

        public long distance;

        public Edge(int to, long distance) {
            this.to = to;
            this.distance = distance;
        }

    }

    public static class Vertex {

        public int n;

        public long distance;

        public Vertex(int n, long distance) {
            this.n = n;
            this.distance = distance;
        }

    }

    public static String readString(BufferedReader reader) throws Exception {
        return reader.readLine();
    }

    public static int readInt(BufferedReader reader) throws Exception {
        return Integer.parseInt(reader.readLine());
    }

    public static long readLong(BufferedReader reader) throws Exception {
        return Long.parseLong(reader.readLine());
    }

    public static double readDouble(BufferedReader reader) throws Exception {
        return Double.parseDouble(reader.readLine());
    }

    public static String[] readStringArray(BufferedReader reader) throws Exception {
        return reader.readLine().split(" ");
    }

    public static int[] readIntArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        return array;
    }

    public static long[] readLongArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        long[] array = new long[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Long.parseLong(str[i]);
        }
        return array;
    }

    public static double[] readDoubleArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        double[] array = new double[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Double.parseDouble(str[i]);
        }
        return array;
    }

    public static int[][] readIntMatrix(BufferedReader reader, int N) throws Exception {
        int[][] matrix = new int[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readIntArray(reader);
        }
        return matrix;
    }

    public static long[][] readLongMatrix(BufferedReader reader, int N) throws Exception {
        long[][] matrix = new long[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readLongArray(reader);
        }
        return matrix;
    }

    public static double[][] readDoubleMatrix(BufferedReader reader, int N) throws Exception {
        double[][] matrix = new double[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readDoubleArray(reader);
        }
        return matrix;
    }

    public static int[] extractArray(int[][] matrix, int index) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

    public static long[] extractArray(long[][] matrix, int index) {
        long[] array = new long[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

    public static double[] extractArray(double[][] matrix, int index) {
        double[] array = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

}
