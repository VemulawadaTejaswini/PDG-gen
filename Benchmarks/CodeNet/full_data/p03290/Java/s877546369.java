import java.io.*;
import java.util.*;

public class Main {


    private void solve(InputReader in, PrintWriter out) {
        int D = in.nextInt();
        long G = in.nextLong();
        int[] p = new int[D];
        int[] c = new int[D];
        for (int i = 0; i < D; i++) {
            p[i] = in.nextInt();
            c[i] = in.nextInt();
        }
        int res = Integer.MAX_VALUE;
        long max = 0;
        int count = 0;
        for (int i = D - 1; i >= 0; i--) {

            for (int j = 1; j <= p[i]; j++) {
                count++;
                max += (i + 1) * 100;
                if (max >= G) {
                    break;
                }
            }
            max += c[i];
            if (max >= G) {
                res = Math.min(res, count);
                count = 0;
                max = 0;
            }
        }
        out.println(res);
    }


    public static void main(String[] args) {
        new Main().run();
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
