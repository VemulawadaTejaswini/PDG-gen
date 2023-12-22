import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.IOException;
import java.util.HashMap;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int[] A;
        int N;
        Map<int[], Integer> xc = new HashMap<>();
        Map<int[], Integer> yc = new HashMap<>();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            N = in.nextInt();
            int Z = in.nextInt();
            int W = in.nextInt();
            A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            out.println(msx(0, Z, W));
        }

        private int msx(int idx, int xi, int yi) {
            if (idx == N) {
                return Math.abs(xi - yi);
            }
            int[] key = {idx, xi, yi};
            Integer c = xc.get(key);
            if (c != null) return c;
            int ans = 0;
            for (int i = idx; i < N; i++) {
                ans = Math.max(ans, msy(i + 1, A[i], yi));
            }
            xc.put(key, ans);
            return ans;
        }

        private int msy(int idx, int xi, int yi) {
            if (idx == N) {
                return Math.abs(xi - yi);
            }
            int[] key = {idx, xi, yi};
            Integer c = yc.get(key);
            if (c != null) return c;

            int ans = Integer.MAX_VALUE;
            for (int i = idx; i < N; i++) {
                ans = Math.min(ans, msx(i + 1, xi, A[i]));
            }
            yc.put(key, ans);
            return ans;
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

