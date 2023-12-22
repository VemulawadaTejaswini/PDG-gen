import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        int N;
        int[] A;
        Integer[] last;

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            A = in.nextIntArray(N);
            last = new Integer[N];
            Arrays.fill(last, Integer.MAX_VALUE);

            for (int a : A) {
                int idx = Bisect.lowerBound(a, last);
                if (idx > 0) {
                    last[idx - 1] = a;
                } else {
                    last[N - 1] = a;
                }
                Arrays.sort(last);
            }

            for (int i = 0; i < N; ++i) {
                if (last[i] == Integer.MAX_VALUE) {
                    out.println(i);
                    return;
                }
            }
            out.println(N);
        }
    }

    static class Bisect {
        static int lowerBound(int x, Integer[] arr) {
            int low = 0, high = arr.length;
            while (low < high - 1) {
                int mid = (low + high) / 2;
                if (x <= arr[mid]) {
                    high = mid;
                } else if (x > arr[mid]) {
                    low = mid;
                }
            }
            return arr[low] < x ? high : low;
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