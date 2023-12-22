import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        DGridGame solver = new DGridGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGridGame {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int h = in.ints(), w = in.ints(), n = in.ints();
            List<List<Integer>> a = new ArrayList<>();
            for (int i = 0; i <= h; i++) {
                a.add(new ArrayList<>());
            }
            for (int i = 0; i < n; i++) {
                int x = in.ints(), y = in.ints();
                a.get(y).add(x);
            }
            for (int i = 1; i <= h; i++) {
                a.get(i).sort(Comparator.naturalOrder());
            }
            int ans = w;
            int minx = 1;
            for (int i = 1; i <= h; i++) {
                if (minx > w) {
                    break;
                }
                //System.out.println("FOR " + i + " minx " + minx);
                for (Integer d : a.get(i)) {
                    if (d > minx) {
                        //System.out.println("FOUND " + d);
                        ans = Math.min(ans, d - 1);
                        break;
                    }
                }
                minx++;
                if (i < h && a.get(i + 1).contains(minx)) {
                    minx++;
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

    }
}

