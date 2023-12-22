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

            long ans1 = 0;
            int[] a1 = new int[n];
            for (int i = 0; i < n; i++) {
                a1[i] = s.charAt(i) - '0';
            }
            for (int i = 1; i < n - 1; i++) {
                if (a1[i - 1] == 1 && a1[i] == 0 && a1[i + 1] == 1) {
                    ans1++;
                    a1[i - 1] = 0;
                    a1[i] = 1;
                    a1[i + 1] = 0;
                }
            }

            long ans2 = 0;
            int[] a2 = new int[n];
            for (int i = 0; i < n; i++) {
                a2[i] = s.charAt(i) - '0';
            }
            for (int i = n - 2; i >= 1; i--) {
                if (a2[i - 1] == 1 && a2[i] == 0 && a2[i + 1] == 1) {
                    ans2++;
                    a2[i - 1] = 0;
                    a2[i] = 1;
                    a2[i + 1] = 0;
                }
            }

            out.println(Math.max(ans1, ans2));
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

