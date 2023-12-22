import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGoodSequence solver = new CGoodSequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGoodSequence {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            Map<Integer, Integer> m = new HashMap<>();
            int n = in.ints();
            int[] a = in.ints(n);
            int ans = 0;
            for (int x : a) {
                m.merge(x, 1, (p, q) -> p + q);
            }
            for (Map.Entry<Integer, Integer> e : m.entrySet()) {
                if (e.getValue() >= e.getKey()) {
                    ans += e.getValue() - e.getKey();
                } else {
                    ans += e.getValue();
                }
            }
            out.println(ans);
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

    }
}

