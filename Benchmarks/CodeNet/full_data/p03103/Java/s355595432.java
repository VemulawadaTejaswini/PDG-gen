import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CEnergyDrinkCollector solver = new CEnergyDrinkCollector();
        solver.solve(1, in, out);
        out.close();
    }

    static class CEnergyDrinkCollector {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            List<Pair<Long, Long>> stores = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long a = in.nextInt();
                long b = in.nextInt();
                stores.add(new Pair<>(a, b));
            }

            stores.sort(Comparator.comparingLong(a -> a.fs));

            long cur = 0;
            long cost = 0;
            for (int i = 0; i < n; i++) {
                if (cur >= m) {
                    break;
                }

                long max = m - cur;
                long take = Math.min(stores.get(i).sc, max);
                cur += take;
                cost += take * stores.get(i).fs;
            }
            out.println(cost);
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

