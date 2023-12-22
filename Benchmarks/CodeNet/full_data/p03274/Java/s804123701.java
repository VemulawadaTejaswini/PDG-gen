import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        long sum = 0;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n - (k - 1); i++) {
            if (arr[i] < 0 && arr[i + (k - 1)] < 0) {
                sum = Math.abs(arr[i]);
            } else if (arr[i] < 0 && arr[i + (k - 1)] > 0) {
                sum = Math.abs(arr[i] * 2) + arr[i + (k - 1)];
            } else {
                sum = arr[i + (k - 1)];
            }
            min = Math.min(min, sum);

        }
        for (int i = n - 1; i > n - (k - 1); i--) {
            if (arr[i] < 0 && arr[i - (k - 1)] < 0) {
                sum = Math.abs(i - (k - 1));
            } else if (arr[i] > 0 && arr[i - (k - 1)] < 0) {
                sum = (arr[i]) + Math.abs(arr[i - (k - 1)] * 2);
            } else {
                sum = arr[i];
            }
            min = Math.min(min, sum);

        }
        out.println(min);

    }


    public static void main(String[] args) {
        new Solution().run();
    }

    private void run() {
        try (
                InputReader in = new InputReader(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }


    static class InputReader implements AutoCloseable {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

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

        @Override
        public void close() {

        }
    }
}
