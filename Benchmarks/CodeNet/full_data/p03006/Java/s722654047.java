import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhas Jain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPickingUp solver = new BPickingUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPickingUp {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.ni();
            if (n == 1) {
                out.print(1);
                return;
            }
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; ++i) {
                x[i] = in.ni();
                y[i] = in.ni();
            }
            int pr = Integer.MAX_VALUE;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    int p = x[j] - x[i];
                    int q = y[j] - y[i];
                    DJSet set = new DJSet(n);
                    for (int i1 = 0; i1 < n; ++i1) {
                        for (int j1 = i1 + 1; j1 < n; ++j1) {
                            if (x[j1] - x[i1] == p && y[j1] - y[i1] == q) {
                                set.merge(i1, j1);
                            }
                        }
                    }
                    pr = Math.min(pr, set.compo);
                }
            }
            out.print(pr);
        }

        public class DJSet {
            int[] id;
            int[] size;
            int compo;

            DJSet(int n) {
                id = new int[n];
                size = new int[n];
                for (int i = 0; i < n; ++i) {
                    id[i] = i;
                    size[i] = 1;
                }
                compo = n;
            }

            int root(int p) {
                while (id[p] != p) {
                    id[p] = id[id[p]];
                    p = id[p];
                }
                return p;
            }

            void merge(int p, int q) {
                p = root(p);
                q = root(q);
                if (p == q) return;
                compo--;
                if (size[p] > size[q]) {
                    int temp = q;
                    q = p;
                    p = temp;
                }
                id[p] = q;
                size[q] += size[p];
                size[p] = 0;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ni() {
            return Integer.parseInt(next());
        }

    }
}

