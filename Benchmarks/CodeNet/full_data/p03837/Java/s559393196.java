import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        Graph g = new Graph(in);
        out.println(g.solve());
    }
}

class Graph {
    private static final int INF = Integer.MAX_VALUE;

    int V;
    int E;

    ArrayList<int[]>[] T;
    int[][] d;
    boolean[][] unused;

    Graph(MyReader in) {
        V = in.i();
        E = in.i();
        T = new ArrayList[V];
        unused = new boolean[V][V];

        Arrays.setAll(T, i -> new ArrayList<>());

        for (int i = 0; i < E; i++) {
            int u = in.i() - 1;
            int v = in.i() - 1;
            int w = in.i();
            T[u].add(new int[]{v, w});
            T[v].add(new int[]{u, w});
            unused[u][v] = unused[v][u] = true;
        }
    }

    int solve() {
        int ans = E;
        for (int i = 0; i < V; i++) {
            int[] par = dijkstra(i);
            for (int j = 0; j < V; j++) {
                int k = par[j];
                if (k > -1 && unused[j][k]) {
                    unused[j][k] = unused[k][j] = false;
                    ans--;
                }
            }
        }
        return ans;
    }

    int[] dijkstra(int s) {
        int[] d = new int[V];
        int[] par = new int[V];
        Arrays.fill(par, -1);
        Arrays.fill(d, INF);
        d[s] = 0;

        PriorityQueue<Integer> A = new PriorityQueue<>((x, y) -> d[x] - d[y]);
        A.add(s);

        while (!A.isEmpty()) {
            int v = A.poll();
            for(int[] edge : T[v]){
                int u = edge[0];
                int w = edge[1];
                if(d[u] == INF){
                    d[u] = d[v] + w;
                    A.add(u);
                    par[u] = v;
                } else if(d[u] - d[v] > w){
                    d[u] = d[v] + w;
                    par[u] = v;
                }
            }
        }
        return par;
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
