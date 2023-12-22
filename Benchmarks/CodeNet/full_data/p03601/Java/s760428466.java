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
 * @author HossamDoma
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();
            int f = in.nextInt();

            double den = 0;
            int tot = 0, ss = 0;

            for (int i = 0; i * a * 100 < f; ++i) {

                int water_a = i * a * 100;

                for (int j = 0; j * b * 100 + water_a < f; ++j) {

                    int water = water_a + j * b * 100;

                    if (water == 0) continue;

                    int rem_sugar = f - water;

                    for (int ii = 0; ii * c <= rem_sugar; ++ii) {

                        int sugar_c = ii * c;

                        for (int jj = 0; jj * d + sugar_c <= rem_sugar; ++jj) {

                            int sugar = sugar_c + jj * d;

                            int sugarPER100 = sugar / e + (sugar % e != 0 ? 1 : 0);
                            if (i * a + j * b < sugarPER100)
                                continue;

                            double cur_den = (sugar * 1.0) / (water + sugar);

                            if (cur_den > den) {
                                den = cur_den;
                                tot = water + sugar;
                                ss = sugar;
                            }
                        }
                    }
                }
            }

            out.println(tot + " " + ss);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public String test_string;

        public InputReader(InputStream test_stringeam) {
            reader = new BufferedReader(new InputStreamReader(test_stringeam), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    String line = null;
                    if (test_string != null) {
                        line = test_string;
                        test_string = null;
                    } else
                        line = reader.readLine();

                    tokenizer = new StringTokenizer(line);
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

