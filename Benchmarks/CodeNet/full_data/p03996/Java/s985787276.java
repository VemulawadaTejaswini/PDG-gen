import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int N = in.nextInt(), M = in.nextInt(), Q = in.nextInt(), i, c = 0;
            int a[] = new int[M], b[] = new int[M];
            boolean used[] = new boolean[M];
            Stack<Integer> stack = new Stack<Integer>();
            for (i = 0; i < Q; i++) {
                int k = in.nextInt() - 1;
                a[k]++;
                //b[i] = k;
                stack.push(k);
            }
            boolean possible = true;
            int p = 0;
            int D[] = new int[M];
            while (!stack.isEmpty()) {
                int k = stack.pop();
                if (!used[k]) {
                    D[p++] = k;
                    used[k] = true;
                }
            }
            //DebugUtils.debug(D, a);
            for (i = 0; i < p; i++) {
                if (D[i] != i) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                out.printLine("Yes");
                return;
            }
            possible = true;


            for (i = 1; i < M; i++) {
                if (a[i] % N > 0) {
                    // DebugUtils.debug(i, a[i]);
                    possible = false;
                }
            }
            if (possible) {
                out.printLine("Yes");
            } else {
                out.printLine("No");
            }
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
}

