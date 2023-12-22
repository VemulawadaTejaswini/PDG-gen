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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        private String s;
        private int n;
        private Pair[] tree;
        private int sz;
        private int L;
        private int R;
        private int pos;
        private char c;
        private boolean[] res;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            s = in.next();
            buildSegmentTree();
            res = new boolean[26];
            int q = in.nextInt();
            L = 1;
            R = sz;
            for (; q > 0; q--) {
                int type = in.nextInt();
                if (type == 1) {
                    pos = in.nextInt() - 1;
                    c = in.next().charAt(0);
                    update();
                } else {
                    int l = in.nextInt();
                    int r = in.nextInt();
                    res = new boolean[26];
                    query(1, l, r, L, R);
                    int ans = 0;
                    for (int j = 0; j < 26; j++)
                        if (res[j]) {
                            ans++;
                        }
                    out.println(ans);
                }
            }
        }

        private void query(int curV, int ql, int qr, int L, int R) {
            int M = (L + R) / 2;
            if (ql == L && qr == R) {
                merge(tree[curV].cnt);
            } else {
                if (ql <= M) {
                    query(2 * curV, ql, Math.min(qr, M), L, M);
                }
                if (qr >= M + 1) {
                    query(2 * curV + 1, Math.max(M + 1, ql), qr, M + 1, R);
                }
            }
        }

        private void update() {
            int charPos = pos + sz;
            tree[charPos] = new Pair(c - 'a');
            int v = pos + sz;
            v /= 2;
            while (v >= 1) {
                tree[v] = new Pair(tree[2 * v].merge(tree[2 * v + 1]));
                v /= 2;
            }
        }

        private void buildSegmentTree() {
            sz = 1;
            while (sz < n)
                sz *= 2;
            if (n == 1)
                sz = 2;
            tree = new Pair[2 * sz];
            for (int i = 0; i < sz; i++) {
                if (i < n)
                    tree[i + sz] = new Pair(s.charAt(i) - 'a');
                else
                    tree[i + sz] = new Pair();
            }
            for (int i = sz - 1; i >= 1; i--) {
                tree[i] = new Pair(tree[2 * i].merge(tree[2 * i + 1]));
            }
        }

        private void merge(boolean[] ar) {
            for (int i = 0; i < 26; i++)
                if (res[i] || ar[i])
                    res[i] = true;
                else
                    res[i] = false;
        }

        private class Pair {
            private int dif;
            private boolean[] cnt;

            public Pair() {
                this.dif = 0;
                this.cnt = new boolean[26];
            }

            public Pair(int pos) {
                this.dif = 1;
                this.cnt = new boolean[26];
                this.cnt[pos] = true;
            }

            public Pair(Pair p) {
                this.dif = p.dif;
                this.cnt = new boolean[26];
                for (int i = 0; i < 26; i++)
                    this.cnt[i] = p.cnt[i];
            }

            public Pair(int dif, boolean[] cnt) {
                this.dif = dif;
                this.cnt = new boolean[26];
                for (int i = 0; i < 26; i++)
                    this.cnt[i] = cnt[i];
            }

            public Pair merge(Pair ex) {
                int diff = 0;
                boolean[] res = new boolean[26];
                for (int i = 0; i < 26; i++)
                    if (this.cnt[i] || ex.cnt[i]) {
                        diff++;
                        res[i] = true;
                    }
                return new Pair(diff, res);
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

