import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        static long MAX = 1000000000;
        long S;
        long x1 = 0, y1 = 0;
        long x2, y2, x3, y3;

        void solve(InputReader in, PrintWriter out) {
            S = in.nextLong();

            // find x2
            for (long i = 1; i <= MAX; ++i) {
                if (i*i >= S) {
                    x2 = i;
                    break;
                }
            }

            // find y3
            for (long i = x2; i >= 0; --i) {
                if (x2*i < S) {
                    y3 = i + 1;
                    break;
                }
            }

            long excess = x2*y3 - S;

            // find x3 and y2
            if (excess == 0) {
                y2 = 0;
                x3 = 0;
            } else {
                for (long i = 1; i <= y3; ++i) {
                    if (excess % i == 0 && excess / i <= MAX) {
                        y2 = i;
                        x3 = excess / i;
                        break;
                    }
                }
            }

//            out.println(x2*y3 - x3*y2);
            out.println(String.format("%d %d %d %d %d %d", x1, y1, x2, y2, x3, y3));
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}