import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
        TaskG solver = new TaskG();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskG {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int l = in.nextInt();
            String s = in.nextString();
            String t = in.nextString();

            if (s.compareTo(t) > 0) {
                String tmp = s;
                s = t;
                t = tmp;
            }

            int min = s.length();
            int max = t.length();

            if (t.startsWith(s) && min < max && s.charAt(0) > t.charAt(min)) {
                if (check(out, l, s, t, min, max)) return;
                if (check(out, l, s, t, max, min)) return;
            } else {
                if (check(out, l, s, t, max, min)) return;
            }

            throw new RuntimeException();
        }

        private boolean check(PrintWriter out, int l, String s, String t, int min, int max) {
            for (int i = 0; i * min <= l; i++) {
                if ((l - i * min) % max == 0) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < (l - i * min) / max; j++) {
                        sb.append(s);
                    }
                    for (int j = 0; j < i; j++) {
                        sb.append(t);
                    }
                    out.println(sb.toString());
                    return true;
                }
            }
            return false;
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

