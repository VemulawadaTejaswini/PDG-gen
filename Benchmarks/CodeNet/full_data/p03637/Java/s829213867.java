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
            int n = in.nextInt(), i;
            int a[] = new int[3];
            for (i = 0; i < n; i++) {
                int k = in.nextInt(), c = 0;
                while (k > 0 && k % 2 == 0) {
                    c++;
                    k /= 2;
                }
                if (c > 2) {
                    c = 2;
                }
                a[c]++;
            }
            int b[] = new int[n];
            for (i = 1; i < n; i += 2) {
                if (a[2] > 0) {
                    b[i] = 2;
                    a[2]--;
                } else if (a[1] > 0) {
                    a[1]--;
                    b[i] = 1;
                }
            }
            i = n - 1;
            if (b[i] > 0) {
                i--;
            }
            while (i > 0) {
                if (a[2] > 0) {
                    b[i] = 2;
                    a[2]--;
                } else if (a[1] > 0) {
                    b[i] = 1;
                    a[1]--;
                }
                i -= 2;
            }
            String ans = "Yes";
            for (i = 1; i < n; i++) {
                if (b[i] + b[i - 1] < 2) {
                    ans = "No";
                    break;
                }
            }
            out.printLine(ans);


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

