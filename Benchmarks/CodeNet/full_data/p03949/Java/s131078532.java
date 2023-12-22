import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int n = ni();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n - 1; i++) {
            a[i] = ni() - 1;
            b[i] = ni() - 1;
        }

        int k = ni();
        int[] v = new int[k];
        int[] p = new int[k];
        for (int i = 0; i < k; i++) {
            v[i] = ni() - 1;
            p[i] = ni();
        }

        ArrayList<ArrayList<Integer>> G = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            G.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            G.get(a[i]).add(b[i]);
            G.get(b[i]).add(a[i]);
        }

        ArrayDeque<Pair> Q = new ArrayDeque<>();
        HashMap<Integer, Pair2> H = new HashMap<>();
        for (int i = 0; i < k; i++) {
            H.put(v[i], new Pair2(p[i], p[i], p[i] % 2));
            Q.add(new Pair(v[i], p[i], p[i], p[i] % 2));
        }

        boolean[] used = new boolean[n];

        while (!Q.isEmpty()) {
            Pair pair = Q.poll();
            if (used[pair.x]) continue;
            used[pair.x] = true;
            for (int next : G.get(pair.x)) {
                if (H.containsKey(next)) {
                    Pair2 pair2 = H.get(next);
                    if (pair.y + 1 < pair2.y || pair.z - 1 > pair2.x || pair.w == pair2.w) {
                        out.println("No");
                        return;
                    }
                    H.put(next, new Pair2(Math.min(pair.y + 1, pair2.x), Math.max(pair.z - 1, pair2.y), pair.w ^ 1));
                } else {
                    H.put(next, new Pair2(pair.y + 1, pair.z - 1, pair.w ^ 1));
                }
                if (!used[next]) {
                    Q.add(new Pair(next, H.get(next).x, H.get(next).y, H.get(next).w));
                }
            }
        }

        out.println("Yes");
        for (int i = 0; i < n; i++) {
            out.println(H.get(i).x);
        }
    }

    public class Pair {
        int x, y, z, w;

        public Pair(int x, int y, int z, int w) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
        }
    }

    public class Pair2 {
        int x, y, w;

        public Pair2(int x, int y, int w) {
            this.x = x;
            this.y = y;
            this.w = w;
        }
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}