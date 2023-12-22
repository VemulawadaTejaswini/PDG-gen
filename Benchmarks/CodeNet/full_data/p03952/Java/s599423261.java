import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int X = in.nextInt();

            if (N == 2) {
                if (X == 2) {
                    out.println("Yes");
                    for (int i = 1; i <= 3; i++) out.println(i);
                } else {
                    out.println("No");
                }
                return;
            }

            if (X == 1 || X == 2 * N - 1) {
                out.println("No");
                return;
            }


            out.println("Yes");
            int ans[] = new int[2 * N];

            ans[N - 1] = X + 1;
            ans[N] = X;
            ans[N + 1] = X - 1;
            int tmp = 0;
            if (X == 2 * N - 2) {
                ans[N + 2] = X - 2;
                tmp = ans[N + 2];
            } else {
                ans[N - 2] = X + 2;
                tmp = ans[N - 2];
            }
            TreeSet<Integer> all = new TreeSet<>();
            for (int i = 1; i <= 2 * N - 1; i++) {
                if (i != X - 1 && i != X && i != X + 1 && i != tmp) {
                    all.add(i);
                }
            }


            for (int i = 1; i < 2 * N; i++) {
                if (ans[i] == 0) {
                    ans[i] = all.pollFirst();
                }
            }

            for (int i = 1; i < 2 * N; i++) {
                out.println(ans[i]);
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
