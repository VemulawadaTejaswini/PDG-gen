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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++)
                ar[i] = in.nextInt();
            boolean ok = true;
            for (int i = 0; i < n - 1; i++)
                if (ar[i] > ar[i + 1]) {
                    ok = false;
                    break;
                }
            if (ok) {
                out.println("YES");
                return;
            }
            for (int i = 0; i < n - 1; i++)
                for (int j = i + 1; j < n; j++) {
                    int t = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t;
                    ok = true;
                    for (int k = 0; k < n - 1; k++)
                        if (ar[k] > ar[k + 1]) {
                            ok = false;
                            break;
                        }
                    if (ok) {
                        out.println("YES");
                        return;
                    } else {
                        t = ar[i];
                        ar[i] = ar[j];
                        ar[j] = t;
                    }
                }
            out.println("NO");
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