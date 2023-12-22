import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int V = in.nextInt();
            int P = in.nextInt();
            int[] A = in.nextIntArray(N);

            ArrayList<B.Pair> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(new B.Pair(i, A[i]));
            }

            boolean[] use = new boolean[N];
            while (V > 0) {
                list.sort(Comparator.naturalOrder());
                for (int i = 0; i < V; i++) {
                    list.get(i).d = M;
                }
                list.sort(Comparator.naturalOrder());
                for (int i = N - 1; i >= N - P; i--) {
                    use[list.get(i).i] = true;
                }
                for (int i = N - 1 - P - 1; i >= 0; i--) {
                    if (list.get(i).getV() == list.get(i + 1).getV()) {
                        use[list.get(i).i] = true;
                    }
                }
                V--;
            }
            int ans = 0;
            for (boolean b : use) {
                if (b) ans++;
            }
            out.println(ans);
        }

        static class Pair implements Comparable<B.Pair> {
            int i;
            int v;
            int d;

            public Pair(int i, int v) {
                this.i = i;
                this.v = v;
            }

            public int getV() {
                return v + d;
            }

            public int compareTo(B.Pair o) {
                return Integer.compare(this.v + this.d, o.v + o.d);
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
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

    }
}

