import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int pow = (int) Math.pow(2, ((int) (Math.log(n) / Math.log(2))) + 1);

        int[] ha = new int[n];
        long[] ba = new long[n];
        for (int i = 0; i < n; i++) {
            ha[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ba[i] = in.nextInt();
        }

        long[] tree = new long[2 * pow];

        long ans = ba[0];
        for (int i = 0; i < n; i++) {
            long v = max(1, 1, pow, 1, ha[i], tree);
            ans = Math.max(v + ba[i], ans);
            update(1, 1, pow, ha[i], v + ba[i], tree);
        }

        out.println(ans);
        out.close();
    }

    static void update(int v, int tl, int tr, int pos, long val, long[] tree) {
        if (tl == tr) {
            tree[v] = val;
        } else {
            int tm = (tl + tr) / 2;
            if (pos <= tm)
                update(v * 2, tl, tm, pos, val, tree);
            else
                update(v * 2 + 1, tm + 1, tr, pos, val, tree);
            tree[v] = Math.max(tree[v * 2], tree[v * 2 + 1]);
        }
    }

    static long max(int v, int tl, int tr, int l, int r, long[] tree) {
        if (l > r)
            return 0;
        if (l == tl && r == tr) {
            return tree[v];
        }
        int tm = (tl + tr) / 2;
        return Math.max(max(v * 2, tl, tm, l, Math.min(r, tm), tree), max(v * 2 + 1, tm + 1, tr, Math.max(l, tm + 1), r, tree));
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}