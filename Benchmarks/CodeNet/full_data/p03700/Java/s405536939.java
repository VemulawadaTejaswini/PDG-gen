import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.function.Function;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        DWidespread solver = new DWidespread();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWidespread {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int total = in.nextInt(), b = in.nextInt();
            final int a = total - b; // a is now only EXTRA damage

            List<Integer> monsters = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                monsters.add(in.nextInt());
            }

            Function<Long, Boolean> canKill = (attacks) -> {
                long splash = attacks * b;
                for (int m : monsters) {
                    long attacksToKill = (m - splash) / a;
                    if (attacksToKill * a < m - splash) {
                        attacksToKill++;
                    }
                    attacks -= attacksToKill;
                }

                return attacks >= 0;
            };

            long answer = binarySearch(canKill);

            out.println(answer);
        }

        long binarySearch(Function<Long, Boolean> bigEnough) {
            long tooSmall = 0, tooBig;
            for (tooBig = 1; !bigEnough.apply(tooBig); tooBig *= 2) ;

            if (!bigEnough.apply(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                long center = (tooBig + tooSmall) / 2;
                if (!bigEnough.apply(center)) {
                    tooSmall = center;
                } else {
                    if (!bigEnough.apply(center - 1)) {
                        return center;
                    }
                    tooBig = center;
                }
            }

            return tooBig;
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

