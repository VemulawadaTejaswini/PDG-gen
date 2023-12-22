import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n + 1];
            arr[1] = 2;
            arr[2] = 3;
            arr[3] = 5;
            for (int i = 4, j = 6; i <= n; i++, j += 2) arr[i] = j;
            SegmentTree RSQ = SegmentTree.RSumQ(n, arr);
            int toAdd = 2;
            String temp = "";
            temp += arr[1];
            out.print(arr[1]);
            for (int i = 2; i < n; i++) {
                int e = (int) RSQ.rangeQuery(i, i);
                temp += " " + e;
                out.print(" " + e);
                int sum = (int) RSQ.rangeQuery(i + 1, n);
                if (sum % e != 0) {
                    int k = 0;
                    while (gcd(sum + k * toAdd, e) == 1) k++;
                    int a = k / (n - i), b = k % (n - i);
                    int K = toAdd * a;
                    RSQ.rangeUpdate(i + 1, n, K);
                    if (b > 0) RSQ.rangeUpdate(n - b + 1, n, toAdd);
                }
                toAdd = (toAdd * e) / gcd(toAdd, e);
                if (i == n - 1) temp += " " + RSQ.rangeQuery(n, n);
            }
            out.print(" " + RSQ.rangeQuery(n, n));
        }

        int gcd(int a, int b) {
            if (b == 0) return a;
            return gcd(b, a % b);
        }

    }

    static class InputReader {
        private StringTokenizer tokenizer;
        private BufferedReader reader;

        public InputReader(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
        }

        private void fillTokenizer() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            fillTokenizer();
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static abstract class SegmentTree {
        public int n;
        public long[] arr;
        public long[] tree;
        public long[] lazy;

        public SegmentTree(int n, int[] arr) {
            this.n = n;
            this.arr = new long[n + 1];
            tree = new long[4 * n + 1];
            lazy = new long[4 * n + 1];
            for (int i = 1; i <= n; i++) {
                this.arr[i] = arr[i];
            }
            build(1, 1, n);
        }

        public SegmentTree(int n, long[] arr) {
            this.n = n;
            this.arr = new long[n + 1];
            tree = new long[4 * n + 1];
            lazy = new long[4 * n + 1];
            for (int i = 1; i <= n; i++) {
                this.arr[i] = arr[i];
            }
            build(1, 1, n);
        }

        public int left(int node) {
            return node << 1;
        }

        public int right(int node) {
            return left(node) + 1;
        }

        public int middle(int l, int r) {
            return (l + r) >> 1;
        }

        public abstract long combine(long a, long b);

        public abstract void update(int node, int l, int r, long value);

        public abstract void propagate(int node, int l, int r, long value);

        public abstract long getNeutralElement();

        public void doLazy(int node, int l, int r) {
            if (lazy[node] != 0) {
                update(node, l, r, lazy[node]);
                if (l != r) {
                    propagate(node, l, r, lazy[node]);
                }
                lazy[node] = 0;
            }
        }

        public void build(int node, int l, int r) {
            if (l == r) {
                tree[node] = arr[l];
            } else {
                int m = middle(l, r);
                build(left(node), l, m);
                build(right(node), m + 1, r);
                tree[node] = combine(tree[left(node)], tree[right(node)]);
            }
        }

        public long rangeQuery(int node, int l, int r, int s, int e) {
            doLazy(node, l, r);
            if (r < s || l > e) return getNeutralElement();
            if (s <= l && r <= e) return tree[node];
            int m = middle(l, r);
            return combine(rangeQuery(left(node), l, m, s, e), rangeQuery(right(node), m + 1, r, s, e));
        }

        public void rangeUpdate(int node, int l, int r, int s, int e, long v) {
            doLazy(node, l, r);
            if (r < s || l > e) return;
            if (s <= l && r <= e) {
                update(node, l, r, v);
                if (l != r) {
                    propagate(node, l, r, v);
                }
                return;
            }
            int m = middle(l, r);
            rangeUpdate(left(node), l, m, s, e, v);
            rangeUpdate(right(node), m + 1, r, s, e, v);
            tree[node] = combine(tree[left(node)], tree[right(node)]);
        }

        public long rangeQuery(int l, int r) {
            return rangeQuery(1, 1, n, l, r);
        }

        public void rangeUpdate(int l, int r, int v) {
            rangeUpdate(1, 1, n, l, r, v);
        }

        public static SegmentTree RSumQ(int n, int[] arr) {
            return new SegmentTree(n, arr) {

                public long combine(long a, long b) {
                    return a + b;
                }


                public void update(int node, int l, int r, long value) {
                    this.tree[node] += (r - l + 1) * value;
                }


                public void propagate(int node, int l, int r, long value) {
                    this.lazy[this.left(node)] += value;
                    this.lazy[this.right(node)] += value;
                }


                public long getNeutralElement() {
                    return 0;
                }
            };
        }

    }
}

