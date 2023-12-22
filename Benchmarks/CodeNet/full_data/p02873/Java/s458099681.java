import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
            String s = in.next();
            int N = s.length() + 1;
            int a[] = new int[N];
            Arrays.fill(a, Constants.INT_INFINITY);
            if (s.charAt(0) == '<') {
                a[0] = 0;
            }
            if (s.charAt(N - 2) == '>') {
                a[N - 1] = 0;
            }
            for (int i = 1; i < N - 1; i++) {
                if (s.charAt(i) == '<' && s.charAt(i - 1) == '>') {
                    a[i] = 0;
                }
            }
            for (int i = 0; i < N; i++) {
                if (a[i] == 0) {
                    int j = i - 1;
                    int c = 1;
                    while (j >= 0 && s.charAt(j) == '>') {
                        if (a[j] == Constants.INT_INFINITY) {
                            a[j] = c;
                        } else {
                            a[j] = Math.max(c, a[j]);
                        }
                        c++;
                        j--;
                    }
                    j = i + 1;
                    c = 1;
                    while (j < N && s.charAt(j - 1) == '<') {
                        if (a[j] == Constants.INT_INFINITY) {
                            a[j] = c;
                        } else {
                            a[j] = Math.max(c, a[j]);
                        }
                        c++;
                        j++;
                    }
                }
            }
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += a[i];
            }
            out.printLine(sum);
        }

    }

    static class Constants {
        public static final Integer INT_INFINITY = (int) 2e9;

    }

    static class OutputWriter {
        PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
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

    }
}

