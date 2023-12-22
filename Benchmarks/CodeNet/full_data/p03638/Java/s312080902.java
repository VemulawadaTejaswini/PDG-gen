import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author phantom11
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int H = in.nextInt(), W = in.nextInt();
            int N = in.nextInt();
            int a[] = new int[N], i, j;
            for (i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }
            int ans[][] = new int[H][W];
            i = 0;
            j = 0;
            int k = 0;
            for (i = 0; i < H; i++) {
                if (i % 2 == 0) {
                    for (j = 0; j < W; j++) {
                        ans[i][j] = k + 1;
                        a[k]--;
                        if (a[k] == 0) {
                            k++;
                        }
                    }
                } else {
                    for (j = W - 1; j >= 0; j--) {
                        ans[i][j] = k + 1;
                        a[k]--;
                        if (a[k] == 0) {
                            k++;
                        }
                    }
                }
            }
            for (i = 0; i < H; i++) {
                for (j = 0; j < W - 1; j++) {
                    out.print(ans[i][j] + " ");
                }
                out.printLine(ans[i][j]);
            }
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tokenizer = null;

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(in.readLine());
                }
                return tokenizer.nextToken();
            } catch (IOException e) {
                return null;
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0)
                    writer.print(' ');
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

