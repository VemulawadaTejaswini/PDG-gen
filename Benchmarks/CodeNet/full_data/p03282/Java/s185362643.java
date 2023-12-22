import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {


    private void solve(InputReader in, PrintWriter out) {
        String s = in.next();
        long k = in.nextLong();
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("1")) {
                if (i + 1 == k) {
                    out.println(arr[i]);
                    return;
                }
            } else {
                out.println(arr[i]);
                return;
            }

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
