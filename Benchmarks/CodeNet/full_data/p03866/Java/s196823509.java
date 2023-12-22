import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import static java.lang.Math.hypot;
import static java.lang.Math.max;
import static java.util.Arrays.fill;



public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        long xs = fsc.nextLong();
        long ys = fsc.nextLong();
        long xt = fsc.nextLong();
        long yt = fsc.nextLong();
        int n = fsc.nextInt();
        long[][] xyr = new long[n + 2][3];
        xyr[0][0] = xs;
        xyr[0][1] = ys;
        xyr[0][2] = 0;
        for (int i = 1; i <= n; i++) {
            long x = fsc.nextLong();
            long y = fsc.nextLong();
            long r = fsc.nextLong();
            xyr[i][0] = x;
            xyr[i][1] = y;
            xyr[i][2] = r;
        }
        xyr[n + 1][0] = xt;
        xyr[n + 1][1] = yt;
        xyr[n + 1][2] = 0;
        ArrayList<Edge>[] edges = new ArrayList[n + 2];
        for (int i = 0; i <= n + 1; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i <= n + 1; i++) {
            for (int j = i + 1; j <= n + 1; j++) {
                double d = hypot(xyr[i][0] - xyr[j][0], xyr[i][1] - xyr[j][1]);
                double cost = max(d - xyr[i][2] - xyr[j][2], 0);
                edges[i].add(new Edge(i, j, cost));
                edges[j].add(new Edge(j, i, cost));
            }
        }
        double ans = dijkstra(edges, 0)[n + 1];
        System.out.println(ans);
    }

    public static double[] dijkstra(ArrayList<Edge>[] edges, int s) {
        int n = edges.length;
        int[] prev = new int[n];
        double[] d = new double[n];
        Queue<Integer> pq = new PriorityQueue<>((u, v) -> Double.compare(d[u], d[v]));
        fill(d, Double.POSITIVE_INFINITY);
        d[s] = 0;
        pq.add(s);
        while (pq.size() > 0) {
            int now = pq.poll();
            for (Edge e : edges[now]) {
                int next = e.to;
                double c = e.cost;
                if (d[now] + c < d[next]) {
                    d[next] = d[now] + c;
                    prev[next] = now;
                    pq.add(next);
                }
            }
        }
        return d;
    }

    static class Edge {
        public int from;
        public int to;
        public double cost;

        protected Edge(int from, int to, double cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
}


class FastScanner {
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
