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
            int n = in.nextInt();
            int m = in.nextInt();
            int[] rep = new int[n];
            for (int i = 0; i < n; i++)
                rep[i] = -1;
            boolean ok = true;
            for (int i = 0; i < m; i++) {
                int pos = in.nextInt() - 1;
                int val = in.nextInt();
                if (rep[pos] == -1)
                    rep[pos] = val;
                else {
                    if (rep[pos] != val)
                        ok = false;
                }
            }
            if (ok) {
                int r = 0;
                int l = 0;
                if (n == 1) {
                    l = 0;
                    r = 9;
                }
                if (n == 2) {
                    l = 10;
                    r = 99;
                }
                if (n == 3) {
                    l = 100;
                    r = 999;
                }
                for (int x = l; x <= r; x++) {
                    String v = Integer.toString(x);
                    boolean f = true;
                    for (int i = 0; i < n; i++) {
                        if (rep[i] != -1) {
                            if (v.charAt(i) - '0' != rep[i]) {
                                f = false;
                                break;
                            }
                        }
                    }
                    if (f) {
                        out.println(x);
                        return;
                    }
                }
                out.println(-1);
            } else {
                out.println("-1");
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

