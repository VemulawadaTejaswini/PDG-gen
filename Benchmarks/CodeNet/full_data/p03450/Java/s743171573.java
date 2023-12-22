import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        int M = in.i();
        ArrayList<int[]>[] edges = new ArrayList[N];
        Arrays.setAll(edges, i -> new ArrayList<>());
        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < M; i++) {
            int L = in.i() - 1;
            int R = in.i() - 1;
            int D = in.i();
            edges[L].add(new int[]{R, D});
            edges[R].add(new int[]{L, -D});
            uf.unite(L, R);
        }
        int[] x = new int[N];
        boolean[] b = new boolean[N];
        LinkedList<Integer> list = new LinkedList<>();
        String ans = "Yes";
        ArrayList<Integer> root = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (uf.isRoot(i)) {
                root.add(i);
            }
        }
        loop:for (int i : root) {
            list.clear();
            list.push(i);
            while (list.size() > 0) {
                int u = list.pop();
                for (int[] edge : edges[u]) {
                    int v = edge[0];
                    int w = edge[1];
                    if (!b[v]) {
                        x[v] = x[u] + w;
                        b[v] = true;
                        list.push(v);
                    } else if (x[u] + w != x[v]) {
                        ans = "No";
                        break loop;
                    }
                }
            }
        }

        out.println(ans);
    }

}

class UnionFind{
    int[] par, rank, size;
    private final int MAX_N;
    UnionFind(int n){
        MAX_N = n;
        par = new int[n];
        size = new int[n];
        for(int i = 0; i < MAX_N; i++)
            par[i] = i;
        Arrays.fill(size, 1);
        rank = new int[n];
    }

    int root(int x){
        return isRoot(x) ? x : (par[x] = root(par[x]));
    }

    boolean isRoot(int x) {
        return x == par[x];
    }

    boolean same(int x, int y){
        return root(x) == root(y);
    }

    void unite(int x, int y){
        x = root(x);
        y = root(y);
        if(x == y)
            return;
        if(rank[x] < rank[y]){
            par[x] = y;
            size[y] += size[x];
        }else{
            par[y] = x;
            size[x] += size[y];
            if(rank[x] == rank[y])
                rank[x]++;
        }
    }

    int size(int x){
        return size[root(x)];
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
                tail = read(cbuf, 0, cbuf.length);
            } catch (IOException e) {}
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
                if (c != ' ' && c != '\n' && c != '\r') {
                    if (!(minus = c == '-')) back();
                    return minus;
                }
            }
        }

        void skip() {
            while (true) {
                char c = next();
                if (c != ' ' && c != '\n' && c != '\r') {
                    back();
                    break;
                }
            }
        }

        char[] s(final int N) {
            skip();
            char[] s = new char[N];
            for (int i = 0; i < s.length; i++) {
                s[i] = next();
            }
            return s;
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
