import java.io.*;
import java.util.*;

public class Main {


    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        out.println(convertToNegBinary(n));
    }

    private static String convertToNegBinary(long num) {
        if (num == 0) {
            return "0";
        } else {
            StringBuilder result = new StringBuilder();
            while (num != 0) {
                if ((num < 0) && (num % 2 != 0)) {
                    result.insert(0, String.valueOf(Math.abs(num % -2)));
                    num /= -2;
                    num++;
                } else {
                    result.insert(0, String.valueOf(Math.abs(num % -2)));
                    num /= -2;
                }
            }
            return result.toString();
        }
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
