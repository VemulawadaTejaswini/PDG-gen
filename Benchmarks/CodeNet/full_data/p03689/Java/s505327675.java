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
            int H = in.nextInt();
            int W = in.nextInt();
            int h = in.nextInt();
            int w = in.nextInt();
            if (H % h == 0 && W % w == 0) {
                out.println("No");
            } else {
                out.println("Yes");
                for (int r = 0; r < H; ++r) {
                    for (int c = 0; c < W; ++c) {
                        if (r % h == 0 && c % w == 0) {
                            out.print((int) 1e9 - 1);
                        } else if (r % h == h - 1 && c % w == w - 1) {
                            out.print((int) -1e9);
                        } else {
                            out.print(0);
                        }
                        out.print(" ");
                    }
                    out.println();
                }
            }
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

