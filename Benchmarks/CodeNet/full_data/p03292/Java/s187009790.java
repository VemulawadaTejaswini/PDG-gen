    import java.io.*;
    import java.util.*;

    public class Main {


        private void solve(InputReader in, PrintWriter out) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                count += Math.abs(arr[i] - arr[i + 1]);
            }
            out.println(count);
            
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
