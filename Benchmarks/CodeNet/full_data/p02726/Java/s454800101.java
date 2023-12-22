import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    static void bfs(int start) {
        visited[start] = true;
        Deque<Integer> deq = new ArrayDeque<>();
        deq.offer(start);

        while (!deq.isEmpty()) {
            int node = deq.poll();

            for (Edge e : graph.get(node)) {
                if (visited[e.to]) continue;
                dist[start][e.to] = dist[start][e.from] + 1;
                visited[e.to] = true;
                deq.offer(e.to);
            }
        }
    }

    static int N, X, Y;
    static List<List<Edge>> graph;
    static boolean[] visited;
    static int[][] dist;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        N = fs.nextInt();
        X = fs.nextInt() - 1;
        Y = fs.nextInt() - 1;
        graph = new ArrayList<>();
        dist = new int[N][N];
        for (int i = 0; i < N; ++i) Arrays.fill(dist[i], 0);
        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());

        for (int i = 0; i < N-1; ++i) {
            graph.get(i).add(new Edge(i, i+1));
            graph.get(i+1).add(new Edge(i+1, i));
        }
        graph.get(X).add(new Edge(X, Y));
        graph.get(Y).add(new Edge(Y, X));

        for (int i = 0; i < N; ++i) {
            visited = new boolean[N];
            bfs(i);
        }

        int[] res = new int[N];
        for (int i = 0; i < N; ++i) {
            for (int j = i + 1; j < N; ++j) {
                ++res[dist[i][j]];
            }
        }

        for (int k = 1; k < N; ++k) {
            System.out.println(res[k]);
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            }else{
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }else if(b == -1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() { return Double.parseDouble(next());}
    }

}