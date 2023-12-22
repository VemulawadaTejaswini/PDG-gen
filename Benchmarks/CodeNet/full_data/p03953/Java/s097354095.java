import java.io.*;
import java.util.*;

/**
 * Created by fcdkbear on 15.10.16.
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        new Task().solve(in, out);
        out.close();
    }


    static class Task {

        public static final int ITERATIONS = 100000;

        public void solve(InputReader in, PrintWriter out) {

            int n = in.nextInt();
            long[][] x = new long[ITERATIONS][];
            x[0] = new long[n];
            for (int i = 0; i < n; ++i) {
                x[0][i] = in.nextInt();
            }
            int m = in.nextInt();
            long k = in.nextLong();
            int[] a = new int[m];
            for (int i = 0; i < m; ++i) {
                a[i] = in.nextInt();
                a[i]--;
            }
            int period = -1;
            for (int iteration = 1; iteration < ITERATIONS; ++iteration) {
                x[iteration] = new long[n];
                for (int i = 0; i < n; ++i) {
                    x[iteration][i] = x[iteration - 1][i];
                }
                for (int i = 0; i < m; ++i) {
                    int index = a[i];
                    x[iteration][index] = x[iteration][index - 1] + x[iteration][index + 1] - x[iteration][index];
                }
                boolean equal = true;
                for (int i = 0; i < n; ++i) {
                    if (x[iteration][i] != x[0][i]) {
                        equal = false;
                        break;
                    }
                }
                if (equal) {
                    period = iteration;
                    break;
                }
            }
            int index = (int)k % period;
            for (int i = 0; i < n; ++i) {
                out.println(x[index][i]);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}
