import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CCatSnukeAndAVoyage solver = new CCatSnukeAndAVoyage();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCatSnukeAndAVoyage {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            HashSet<Integer> x = new HashSet<>();
            HashSet<Integer> y = new HashSet<>();

            for (int i = 0; i < m; i++) {
                int a = in.nextInt(), b = in.nextInt();
                if (a == 1) {
                    y.add(b);
                } else if (b == n) {
                    x.add(a);
                }
            }

            x.retainAll(y);

            boolean answer = !x.isEmpty();

            out.println(answer ? "POSSIBLE" : "IMPOSSIBLE");
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

