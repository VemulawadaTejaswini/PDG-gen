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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.nextString();
            int[] a = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = s.charAt(i) - '0';
            }
            for (int i = 0; i < 8; i++) {
                int tmp = a[0];
                StringBuilder sb = new StringBuilder("" + a[0]);
                for (int j = 0; j < 3; j++) {
                    if ((i >> j & 1) == 1) {
                        tmp += a[j + 1];
                        sb.append("+" + a[j + 1]);
                    } else {
                        tmp -= a[j + 1];
                        sb.append("-" + a[j + 1]);
                    }
                }
                if (tmp == 7) {
                    sb.append("=7");
                    out.println(sb.toString());
                    return;
                }
            }
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

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

