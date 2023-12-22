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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.nextString();

            int cnt1 = count(n, s, ')');
            int cnt2 = count(n, new StringBuilder(s).reverse().toString(), '(');

            for (int i = 0; i < cnt1; i++) {
                s = "(" + s;
            }
            for (int i = 0; i < cnt2; i++) {
                s += ")";
            }

            out.println(s);
        }

        private int count(int n, String s, char c) {
            int cnt = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    if (sum > 0) {
                        sum--;
                    } else {
                        cnt++;
                    }
                } else {
                    sum++;
                }
            }

            return cnt;
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

