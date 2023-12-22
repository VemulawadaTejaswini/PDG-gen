import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
            int[] t = in.nextIntArray(n);
            int[] v = in.nextIntArray(n);

            int sumT = Arrays.stream(t).sum();
            int m = 2 * sumT + 1;
            double[] maxV = new double[m];
            Arrays.fill(maxV, Double.MAX_VALUE);
            maxV[0] = maxV[m - 1] = 0;

            int tmpSum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= 2 * t[i]; j++) {
                    maxV[tmpSum + j] = Math.min(maxV[tmpSum + j], v[i]);
                }
                tmpSum += 2 * t[i];
            }

            for (int i = 1; i < m; i++) {
                maxV[i] = Math.min(maxV[i], maxV[i - 1] + 0.5);
            }
            for (int i = m - 2; i >= 0; i--) {
                maxV[i] = Math.min(maxV[i], maxV[i + 1] + 0.5);
            }

            double ans = 0;
            for (int i = 0; i < m - 1; i++) {
                ans += (maxV[i] + maxV[i + 1]) * 0.5 / 2;
            }

            out.println(ans);
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

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

