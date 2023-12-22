import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Nikita Mikhailov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int[] partialSumR;
        int[] partialSumG;
        int[] partialSumB;

        int[] ps(char c) {
            if (c == 'R') {
                return partialSumR;
            } else if (c == 'G') {
                return partialSumG;
            }
            return partialSumB;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.readInt();

            String s = in.readToken();

            partialSumR = new int[n];
            partialSumG = new int[n];
            partialSumB = new int[n];

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                ps('R')[i] = i > 0 ? ps('R')[i - 1] : 0;
                ps('G')[i] = i > 0 ? ps('G')[i - 1] : 0;
                ps('B')[i] = i > 0 ? ps('B')[i - 1] : 0;
                ps(c)[i] = i > 0 ? ps(c)[i - 1] + 1 : 1;
            }

            long resS = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    char first = s.charAt(i);
                    char second = s.charAt(j);

                    if (first == second) {
                        continue;
                    }
                    char third;

                    if ((first == 'R' || first == 'G') && (second == 'R' || second == 'G')) {
                        third = 'B';
                    } else if ((first == 'R' || first == 'B') && (second == 'R' || second == 'B')) {
                        third = 'G';
                    } else {
                        third = 'R';
                    }
                    int diff = j - i;

                    resS += psk(third, j + 1, j + diff - 1) + psk(third, j + diff + 1, n - 1);
                }
            }

            out.println(resS);
        }

        int psk(char c, int from, int to) {
            from = Math.max(0, from);
            to = Math.min(partialSumB.length - 1, to);

            if (from > to) {
                return 0;
            }

            return ps(c)[to] - (from == 0 ? 0 : ps(c)[from - 1]);
        }

    }

    static class FastScanner {
        private StringTokenizer st;
        private BufferedReader in;

        public FastScanner(final InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
        }

        public String readToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(readToken());
        }

    }
}

