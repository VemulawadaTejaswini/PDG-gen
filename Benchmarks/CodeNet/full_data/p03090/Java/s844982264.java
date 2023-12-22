import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        BBalancedNeighbors solver = new BBalancedNeighbors();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBalancedNeighbors {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            List<Pair<Integer, Integer>> ans = new ArrayList<>();
            int notTake;

            if (n % 2 == 1) {
                notTake = n - 1;
            } else {
                notTake = n;
            }

            for (int i = 1; i < n; i++) {
                for (int h = i + 1; h <= n; h++) {
                    if (h != notTake) {
                        ans.add(new Pair<>(i, h));
                    }
                }
                notTake--;
            }

            out.println(ans.size());
            for (int i = 0; i < ans.size(); i++) {
                out.println(String.format("%d %d", ans.get(i).fs, ans.get(i).sc));
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

    static class Pair<T, K> {

        T fs;
        K sc;

        public Pair(T fs, K sc) {
            this.fs = fs;
            this.sc = sc;
        }
    }
}

