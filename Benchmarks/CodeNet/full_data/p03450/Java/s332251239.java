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
        for (int i = 0; i < M; i++) {
            int L = in.i() - 1;
            int R = in.i() - 1;
            int D = in.i();
            edges[L].add(new int[]{R, D});
            edges[R].add(new int[]{L, -D});
        }
        int[] x = new int[N];
        boolean[] b = new boolean[N];
        LinkedList<Integer> list = new LinkedList<>();
        String ans = "Yes";
        loop:for (int i = 0; i < N; i++) {
            if (b[i]) continue;
            list.clear();
            list.push(i);
            while (list.size() > 0) {
                int u = list.pop();
                b[u] = true;
                for (int[] edge : edges[u]) {
                    int v = edge[0];
                    int w = edge[1];
                    if (!b[v]) {
                        x[v] = x[u] + w;
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

class Edge {
    int v;
    int w;
    Edge (int v, int w) {
        this.v = v;
        this.w = w;
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
