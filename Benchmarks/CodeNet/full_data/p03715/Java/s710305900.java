import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        CChocolateBar solver = new CChocolateBar();
        solver.solve(1, in, out);
        out.close();
    }

    static class CChocolateBar {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long h = in.nextInt(), w = in.nextInt();

            long answer = Long.MAX_VALUE;
            answer = Math.min(answer, sameDirection(h, w));
            answer = Math.min(answer, sameDirection(w, h));
            answer = Math.min(answer, differentDirection(h, w));
            answer = Math.min(answer, differentDirection(w, h));

            out.println(answer);
        }

        static long sameDirection(long w, long h) {
            if (w % 3 == 0) {
                return 0;
            }
            return h;
        }

        static long differentDirection(long w, long h) {
            long ans = Long.MAX_VALUE;

            for (long w1 = w / 3; w1 <= w / 3 + 1; w1++) {
                long[] areas = {w1 * h, (w - w1) * (h / 2), (w - w1) * ((h + 1) / 2)};
                Arrays.sort(areas);
                ans = Math.min(ans, areas[2] - areas[0]);
            }

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

