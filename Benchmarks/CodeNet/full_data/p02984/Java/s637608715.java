import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRainFlowsIntoDams solver = new DRainFlowsIntoDams();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRainFlowsIntoDams {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long a[] = new long[n];
            long ans[] = new long[n];
            long sum = 0;
            long temp = in.nextLong();
            ArrayList<Long> b = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                a[i] = in.nextLong();
                if (i % 2 == 0) sum += a[i];
                else sum -= a[i];
            }
            a[n - 1] = temp;
            sum += a[n - 1];
            long x = sum / 2;
            temp = 2 * x;
            for (int i = 0; i < n; i++) {
                b.add(2 * x);
                x = (a[i] - x);
            }
            out.print(b.get(n - 1) + " ");
            for (int i = 0; i < b.size() - 1; i++) out.print(b.get(i) + " ");


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

