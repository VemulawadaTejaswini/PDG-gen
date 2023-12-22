import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        Graph g = new Graph(in);
        int Q = in.i();
        int K = in.i() - 1;
        long[] d = g.dijkstra(K);
        for (int i = 0; i < Q; i++) {
            int x = in.i() - 1;
            int y = in.i() - 1;
            out.println(d[x] + d[y]);
        }
        out.flush();
    }
}

class Graph {
    private static final long INF = Long.MAX_VALUE / 2;

    int V;
    int E;

    ArrayList<int[]>[] T;

    Graph(MyReader in) {
        V = in.i();
        E = V - 1;
        T = new ArrayList[V];

        Arrays.setAll(T, i -> new ArrayList<>());

        for (int i = 0; i < E; i++) {
            int u = in.i() - 1;
            int v = in.i() - 1;
            int w = in.i();
            T[u].add(new int[]{v, w});
            T[v].add(new int[]{u, w});
        }
    }

    long[] dijkstra(int s) {
        long[] d = new long[V];
        Arrays.fill(d, INF);
        d[s] = 0;

        PriorityQueue<Integer> A = new PriorityQueue<>((x, y) -> {
            long z = d[x] - d[y];
            return z > 0 ? 1 : z == 0 ? 0 : -1;
        });
        A.add(s);

        while (!A.isEmpty()) {
            int v = A.poll();
            for(int[] edge : T[v]){
                int u = edge[0];
                int w = edge[1];
                if(d[u] == INF){
                    d[u] = d[v] + w;
                    A.add(u);
                } else if(d[u] - d[v] > w){
                    d[u] = d[v] + w;
                }
            }
        }
        return d;
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = super.read(cbuf, 0, cbuf.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            head = 0;
        }
        return cbuf[head++];
    }

    void back() {
        head--;
    }

    boolean minus() {
        boolean minus;
        while (true) {
            char c = next();
            if (!isDelimiter(c)) {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (isDelimiter(next()));
        back();
    }

    char[] s(int N) {
        char[] cbuf = new char[N];
        read(cbuf, 0, N);
        return cbuf;
    }

    public int read(char[] cbuf, int off, int len) {
        skip();
        int i;
        for (i = 0; i < cbuf.length; i++) {
            char c = next();
            if (isDelimiter(c)) {
                break;
            }
            cbuf[i] = c;
        }
        return i;
    }

    boolean isDelimiter(char c) {
        return c == ' ' || c == '\n' || c == '\r';
    }

    int i() {
        boolean minus = minus();
        int n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        boolean minus = minus();
        long n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }
}
