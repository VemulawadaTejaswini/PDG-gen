import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            Pair[] ar = new Pair[n];
            for (int i = 0; i < n; i++) {
                int units = in.nextInt();
                int deadLine = in.nextInt();
                ar[i] = new Pair(units, deadLine);
            }
            Arrays.sort(ar, Comparator.comparingInt(o -> o.deadline));
            int time = 0;
            int work = 0;
            while (work < n) {
                time += ar[work].takesUnit;
                if (time > ar[work].deadline) {
                    out.println("No");
                    return;
                } else
                    work++;
            }
            out.println("Yes");
        }

        private class Pair {
            private int takesUnit;
            private int deadline;

            public Pair(int takesUnit, int deadline) {
                this.takesUnit = takesUnit;
                this.deadline = deadline;
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

