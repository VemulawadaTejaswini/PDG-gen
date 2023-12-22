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
            int[] arr = new int[n];
            int[] colors = new int[8];
            for (int i = 0; i < n; ++i) arr[i] = in.nextInt();
            int[] l = {1, 400, 800, 1200, 1600, 2000, 2400, 2800};
            int[] r = {399, 799, 1199, 1599, 1999, 2399, 2799, 3199};
            int ad = 0, cur = 0;
            for (int i = 0; i < n; ++i) {
                int x = arr[i];
                boolean ok = false;
                for (int j = 0; j < 8; ++j) {
                    if (x >= l[j] && x <= r[j]) {
                        ok = true;
                        colors[j]++;
                        cur = j;
                    }
                }
                if (ok) continue;
                colors[cur]++;
                ++ad;
            }
            int res = 0;
            for (int x : colors) if (x > 0) ++res;
            out.println(res + " " + (res + ad));
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

