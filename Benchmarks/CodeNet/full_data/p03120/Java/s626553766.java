import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        static final long MODULO = (long) (1e9 + 7);
        int[] inters;
        long[] normal;
        long[] plusOne;
        int[] color;

        static long inv(long a) {
            return pow(a, MODULO - 2);
        }

        private static long pow(long a, long k) {
            if (k == 0) return 1;
            if (k % 2 == 0) return pow(a * a % MODULO, k / 2);
            return a * pow(a, k - 1) % MODULO;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            int[] l = new int[q];
            int[] r = new int[q];
            Set<Integer> interesting = new HashSet<>();
            for (int i = 0; i < q; ++i) {
                l[i] = in.nextInt() - 1;
                r[i] = in.nextInt();
                interesting.add(l[i]);
                interesting.add(r[i]);
            }
            interesting.add(0);
            interesting.add(n);
            inters = new int[interesting.size()];
            int ptr = 0;
            for (int x : interesting) inters[ptr++] = x;
            Arrays.sort(inters);
            color = new int[inters.length];
            Arrays.fill(color, -1);
            int next = 0;
            for (int i = 0; i < inters.length; ++i)
                if (color[i] < 0) {
                    dfs(color, l, r, i, next++);
                }
            normal = new long[inters.length - 1];
            plusOne = new long[inters.length - 1];
            long base = 1;
            for (int i = 0; i + 1 < inters.length; ++i) {
                long len = inters[i + 1] - inters[i];
                normal[i] = (pow(10, len) - 1 + MODULO) * inv(9) % MODULO;
                plusOne[i] = (normal[i] + 1) * inv(normal[i]) % MODULO;
                base = base * normal[i] % MODULO;
            }
            long[] extra = new long[1 << next];
            long[] by = new long[1 << next];
            for (int take = 0; take < by.length; ++take) {
                by[take] = 1;
                for (int i = 0; i + 1 < color.length; ++i) {
                    if ((((take >> color[i]) & 1) != 0) && (((take >> color[i + 1]) & 1) != 0)) {
                        by[take] = by[take] * plusOne[i] % MODULO;
                    }
                }
            }
            extra[0] = 1;
            long[] nextra = new long[1 << next];
            for (int mod = 0; mod < 9; ++mod) {
                System.arraycopy(extra, 0, nextra, 0, extra.length);
                for (int take = 1; take < (1 << next); ++take) {
                    if ((mod == 0) ^ ((take & 1) != 0)) continue;
                    long bt = by[take];
                    for (int old = 0; old < extra.length; old = ((old | take) + 1) & (~take)) {
                        nextra[old + take] = (nextra[old + take] + extra[old] * bt) % MODULO;
                    }
                }
                long[] tmp = extra;
                extra = nextra;
                nextra = tmp;
                extra[0] = 0;
            }
            out.println(base * extra[extra.length - 1] % MODULO);
            //out.println(rec(0, 1));
        }

        private void dfs(int[] color, int[] l, int[] r, int at, int val) {
            color[at] = val;
            for (int j = 0; j < l.length; ++j)
                if (l[j] == inters[at] || r[j] == inters[at]) {
                    int dest = l[j] + r[j] - inters[at];
                    for (int k = 0; k < inters.length; ++k)
                        if (inters[k] == dest && color[k] < 0) {
                            dfs(color, l, r, k, val);
                        }
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

