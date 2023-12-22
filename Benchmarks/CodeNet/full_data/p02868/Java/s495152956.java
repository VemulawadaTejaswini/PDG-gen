import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int M;
    static int[] d;
    static List<List<Edge>> edges;

    
    public static void main(String[] args) {
        N = sc.nextInt();
        M = sc.nextInt();
        d = new int[N];
        edges = new ArrayList<List<Edge>>(N);
        for (int i = 0; i < N; i++) {
            edges.add(new ArrayList<Edge>());
            if (i > 0) {
                edges.get(i).add(new Edge(i - 1, 0));
            }
        }
        for (int i = 0; i < M; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int c = sc.nextInt();
            edges.get(l).add(new Edge(r, c));
        }
        for (int i = 0; i < N; i++) d[i] = Integer.MAX_VALUE;
        //Dijkstra 
        PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>();
        pq.add(new Vertex(0,0));
        while (pq.size() > 0) {
            Vertex v = pq.poll();
            d[v.id] = Math.min(d[v.id],v.distance);
            for (Edge edge : edges.get(v.id)) {
                int newCost = d[v.id] + edge.cost;
                if (d[edge.dest] <= newCost) continue;
                pq.add(new Vertex(edge.dest, newCost));
            }
        }
        int answer;
        if (d[N-1] == Integer.MAX_VALUE) {
            answer = -1;
        } else {
            answer = d[N-1];
        }
        // writer.println(Arrays.toString(d));
        writer.println(answer);
        writer.flush();
    }

    public static class Edge {
        public int dest;
        public int cost;
        public Edge(int d, int c) {
            this.dest = d;
            this.cost = c;
        }
    }

    public static class Vertex implements Comparable<Vertex> {
        public int id;
        public int distance;

        public Vertex(int id, int distance) {
            this.id = id;
            this.distance = distance;
        }

        public int compareTo(Vertex v) {
            return this.distance - v.distance;
        }

    }

    static final FastScanner sc = new FastScanner(System.in);
    static PrintWriter writer = new PrintWriter(System.out);

    static class FastScanner {
        Reader input;
 
        FastScanner() {
            this(System.in);
        }
 
        FastScanner(InputStream stream) {
            this.input = new BufferedReader(new InputStreamReader(stream));
        }
 
        int nextInt() {
            return (int) nextLong();
        }
 
        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
 
        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }
 
        char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
 
        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
    }
    //FAST SCANNER END HERE
}
