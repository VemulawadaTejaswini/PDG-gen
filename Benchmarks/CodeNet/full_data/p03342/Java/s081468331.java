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
 *
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DXorSum2 solver = new DXorSum2();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXorSum2 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            int qh = 0, qt = 0, countBit[] = new int[21];
            long ans = 0;

            while (qt < n) {
                for (int i = 0; i <= 20; ++i) {
                    if ((a[qt] >> i & 1) == 1) ++countBit[i];
                }
                ++qt;
                while (true) {
                    boolean ok = true;
                    for (int i = 0; i <= 20 && ok; ++i) {
                        if (countBit[i] > 1) ok = false;
                    }
                    if (ok) {
                        ans += qt - qh;
                        break;
                    }
                    for (int i = 0; i <= 20; ++i) {
                        if ((a[qh] >> i & 1) == 1) --countBit[i];
                    }
                    ++qh;
                }
            }
            out.println(ans);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

