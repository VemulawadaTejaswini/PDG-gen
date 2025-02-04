import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.io.UncheckedIOException;
import java.util.stream.Stream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        BMinesweeper solver = new BMinesweeper();
        solver.solve(1, in, out);
        out.close();
    }

    static class BMinesweeper {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int h = in.ints(), w = in.ints();
            String[] s = in.string(h);
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (s[i].charAt(j) == '#') {
                        out.print('#');
                        continue;
                    }
                    AtomicInteger ans = new AtomicInteger();
                    GeoWalker.forEach8i(j, i, (x, y) -> {
                        if (0 <= x && x < w && 0 <= y && y < h && s[y].charAt(x) == '#') {
                            ans.getAndIncrement();
                        }
                    });
                    out.print(ans);
                }
                out.println();
            }
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

        public String[] string(int length) {
            return IntStream.range(0, length).mapToObj(x -> string()).toArray(String[]::new);
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }

    static final class GeoWalker {
        private static final int[] DX = {1, 0, -1, 0, 1, 1, -1, -1};
        private static final int[] DY = {0, 1, 0, -1, 1, -1, -1, 1};

        private GeoWalker() {
        }

        public static void forEach8i(int x, int y, BiIntConsumer receiver) {
            for (int i = 0; i < 8; i++) {
                receiver.accept(x + DX[i], y + DY[i]);
            }
        }

    }

    static interface BiIntConsumer {
        void accept(int t, int u);

    }
}

