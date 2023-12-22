import java.io.*;
import java.math.BigInteger;
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

        public void solve(InputReader in, PrintWriter out) {

            int n = in.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; ++i) {
                p[i] = in.nextInt();
                p[i]--;
            }
            int[] a = new int[n];
            int[] b = new int[n];
            a[0] = 1;
            for (int i = 1; i < n; ++i) {
                a[i] = a[i - 1] + n + 1;
            }
            for (int i = 0; i < n; ++i) {
                b[i] = a[n - i - 1];
            }
            int sum = a[p[0]] + b[p[0]];
            for (int i = 1; i < n; ++i) {
                int currentSum = a[p[i]] + b[p[i]];
                b[p[i]] += sum + 1 - currentSum;
                sum++;
            }
            for (int i = 0; i < n; ++i) {
                if (i > 0) {
                    out.print(" ");
                }
                out.print(a[i]);
            }
            out.println();
            for (int i = 0; i < n; ++i) {
                if (i > 0) {
                    out.print(" ");
                }
                out.print(b[i]);
            }
            out.println();
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
