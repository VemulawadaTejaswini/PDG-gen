import java.io.*;
import java.util.*;

public class Main {

    static int N = 100000;

    static int n; // array size

    // Max size of tree
    static long[] tree = new long[2 * N];

    // function to build the tree
    static void build(long[] arr) {

        // insert leaf nodes in tree
        for (int i = 0; i < n; i++)
            tree[n + i] = arr[i];

        // build the tree by calculating
        // parents
        for (int i = n - 1; i > 0; --i)
            tree[i] = tree[i << 1] +
                    tree[i << 1 | 1];
    }

    // function to update a tree node
    static void updateTreeNode(int p, int value) {

        // set value at position p
        tree[p + n] = value;
        p = p + n;

        // move upward and update parents
        for (int i = p; i > 1; i >>= 1)
            tree[i >> 1] = tree[i] + tree[i ^ 1];
    }

    // function to get sum on
    // interval [l, r)
    static int query(int l, int r) {
        int res = 0;

        // loop to find the sum in the range
        for (l += n, r += n; l < r;
             l >>= 1, r >>= 1) {
            if ((l & 1) > 0)
                res += tree[l++];

            if ((r & 1) > 0)
                res += tree[--r];
        }

        return res;
    }


    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        int count = 0;
        build(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (query(i, j) % m == 0) {
                    count++;
                }
            }
        }
        out.println(count);
    }


    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try (
                InputReader in = new InputReader(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }


    static class InputReader implements AutoCloseable {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        @Override
        public void close() {

        }
    }


}
