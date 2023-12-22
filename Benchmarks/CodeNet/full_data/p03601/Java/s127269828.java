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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSugarWater solver = new CSugarWater();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSugarWater {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int w1 = 100 * in.nextInt();
            int w2 = 100 * in.nextInt();
            int s1 = in.nextInt();
            int s2 = in.nextInt();
            int ratio = in.nextInt();
            int capacity = in.nextInt();

            int water = 0, sugar = 0;

            int answerW = w1, answerS = 0;

            for (int a = 0; water + sugar + w1 * a <= capacity; a++) {
                water += w1 * a;

                for (int b = 0; water + sugar + w2 * b <= capacity; b++) {
                    water += w2 * b;

                    for (int c = 0; water + sugar + s1 * c <= capacity; c++) {
                        sugar += s1 * c;

                        for (int d = 0; water + sugar + s2 * d <= capacity; d++) {
                            sugar += s2 * d;

                            if (!(sugar > ratio * water / 100)) {
                                if (sugar * answerW > answerS * water) {
                                    answerW = water;
                                    answerS = sugar;
                                }
                            }

                            sugar -= s2 * d;
                        }

                        sugar -= s1 * c;
                    }

                    water -= w2 * b;
                }

                water -= w1 * a;
            }

            out.println((answerS + answerW) + " " + answerS);
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

