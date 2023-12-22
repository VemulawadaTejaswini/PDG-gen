import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        arc061_b solver = new arc061_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class arc061_b {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int H = in.Int();
            int W = in.Int();
            int N = in.Int();

            Map<arc061_b.Pair<Integer, Integer>, Integer> map = new HashMap<>();
            for (int n = 0; n < N; n++) {
                int a = in.Int() - 1;
                int b = in.Int() - 1;
                for (int i = 0; i < 3; i++) {
                    if (a - i < 0) continue;
                    if (a - i >= H - 2) continue;
                    for (int j = 0; j < 3; j++) {
                        if (b - j < 0) continue;
                        if (b - j >= W - 2) continue;
                        arc061_b.Pair<Integer, Integer> p = new arc061_b.Pair<>(a - i, b - j);
                        map.put(p, map.getOrDefault(p, 0) + 1);
                    }
                }
            }
            long[] ans = new long[10];
            for (Map.Entry<arc061_b.Pair<Integer, Integer>, Integer> e : map.entrySet()) {
                ans[e.getValue()]++;
            }
            ans[0] = (H - 2L) * (W - 2L) - map.size();
            for (int i = 0; i < 10; i++) {
                out.println(ans[i]);
            }
        }

        static class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<arc061_b.Pair<K, V>> {
            K k;
            V v;

            Pair(K k, V v) {
                this.k = k;
                this.v = v;
            }

            public int compareTo(arc061_b.Pair<K, V> o) {
                int c = this.k.compareTo(o.k);
                if (c == 0) c = this.v.compareTo(o.v);
                return c;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                arc061_b.Pair<?, ?> pair = (arc061_b.Pair<?, ?>) o;
                return Objects.equals(k, pair.k) &&
                        Objects.equals(v, pair.v);
            }

            public int hashCode() {
                return Objects.hash(k, v);
            }

        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

