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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FIntervalRunning solver = new FIntervalRunning();
        solver.solve(1, in, out);
        out.close();
    }

    static class FIntervalRunning {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long[] t = in.readLongArray(2);
            long[] a = in.readLongArray(2);
            long[] b = in.readLongArray(2);

            long A = 0, B = 0;
            for (int i = 0; i < 2; i++) {
                A += a[i] * t[i];
                B += b[i] * t[i];
            }

            if (A == B) {
                out.println("infinity");
                return;
            }

            if (A < B) {
                long tmp = A;
                A = B;
                B = tmp;
                long[] tmp2 = a;
                a = b;
                b = tmp2;
            }
            // now A eventually leaves B completely

            long X = t[0] * a[0];
            long Y = t[0] * b[0];

            if (X > Y) {
                out.println(0);
                return;
            }

            long D1 = Math.abs(X - Y);
            long D2 = Math.abs(A - B);
            long answer = (D1 + D2 - 1) / D2;
            answer *= 2;
            if (D1 % D2 != 0)
                answer--;
            out.println(answer);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] readLongArray(int n) {
            long[] x = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextLong();
            }
            return x;
        }

    }
}

