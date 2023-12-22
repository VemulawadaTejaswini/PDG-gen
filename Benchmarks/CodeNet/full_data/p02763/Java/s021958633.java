import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ESimpleStringQueries solver = new ESimpleStringQueries();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESimpleStringQueries {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            StringBuilder x = new StringBuilder(in.next());
            SegmentT st[] = new SegmentT[26];
            for (int i = 0; i < 26; i++) {
                long a[] = new long[n];
                for (int j = 0; j < n; j++) {
                    if (x.charAt(j) == ('a' + i)) {
                        a[j] = 1;
                    } else {
                        a[j] = 0;
                    }
                }
                st[i] = new SegmentT(a);
            }
            int q = in.nextInt();
            while (q-- > 0) {
                int t = in.nextInt();
                if (t == 1) {
                    int indi = in.nextInt() - 1;
                    Character c = in.next().charAt(0);
                    if (x.charAt(indi) != c) {
                        st[c - 'a'].add(indi, 1);
                        st[x.charAt(indi) - 'a'].add(indi, -1);
                    }
                    x.setCharAt(indi, c);
                } else {
                    int l = in.nextInt() - 1;
                    int r = in.nextInt() - 1;
                    int ans = 0;
                    for (int i = 0; i < 26; i++) {
                        if (st[i].get(l, r + 1) > 0) {
                            ans++;
                        }
                    }
                    out.println(ans);
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

    static class SegmentT {
        int n;
        long[] node;

        public SegmentT(int size) {
            n = 1;
            while (n < size) n <<= 1;
            node = new long[2 * n - 1];
            Arrays.fill(node, 0);
        }

        public SegmentT(long[] a) {
            n = 1;
            while (n < a.length) n <<= 1;
            node = new long[2 * n - 1];
            System.arraycopy(a, 0, node, n - 1, a.length);
            Arrays.fill(node, n - 1 + a.length, 2 * n - 1, 0);
            for (int i = n - 2; i >= 0; i--) {
                node[i] = node[i * 2 + 1] + node[i * 2 + 2];
            }
        }

        long value(long x, long y) {
            return x + y;
        }

        void add(int i, int x) {
            i += n - 1;
            node[i] += x;
            while (i > 0) {
                i = (i - 1) / 2;
                node[i] = node[i * 2 + 1] + node[i * 2 + 2];
            }
        }

        long get(int l, int r) {
            return getValue(l, r, 0, 0, n);
        }

        long getValue(int a, int b, int k, int l, int r) {
            if (r <= a || b <= l) return 0;
            if (a <= l && r <= b) return node[k];
            long vl = getValue(a, b, k * 2 + 1, l, (l + r) / 2);
            long vr = getValue(a, b, k * 2 + 2, (l + r) / 2, r);
            return value(vl, vr);
        }

    }
}

