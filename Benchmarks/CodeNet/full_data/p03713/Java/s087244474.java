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
 * @author toshif
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyReader in = new MyReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        long mi = 1000_000_000_000_000_000L;

        public void solve(int testNumber, MyReader in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();

            calc(H, W);
            calc(W, H);

            out.println(mi);
        }

        void calc(int h, int w) {
            for (int i = 1; i < h - 1; i++) {
                int h1 = i;
                int h2 = h - i;

                long S1 = 1L * h1 * w;

                // split h2
                {
                    int h21 = h2 / 2;
                    int h22 = h2 - h21;

                    if (h21 != 0 && h22 != 0) {
                        long S2 = 1L * h21 * w;
                        long S3 = 1L * h22 * w;

                        long diff = Math.max(S1, Math.max(S2, S3));
                        diff -= Math.min(S1, Math.min(S2, S3));
                        mi = Math.min(mi, diff);
                    }
                }

                // split w
                {
                    int w1 = w / 2;
                    int w2 = w - w1;

                    if (w1 != 0 && w2 != 0) {
                        long S2 = 1L * h2 * w1;
                        long S3 = 1L * h2 * w2;

                        long diff = Math.max(S1, Math.max(S2, S3));
                        diff -= Math.min(S1, Math.min(S2, S3));
                        mi = Math.min(mi, diff);
                    }
                }
            }
        }

    }

    static class MyReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public MyReader(InputStream stream) {
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

