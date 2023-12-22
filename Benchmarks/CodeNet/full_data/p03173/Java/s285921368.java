import java.io.*;
import java.util.*;
import java.math.*;

public class Main {


    public static void solve() {
        int n = in.nextInt();
        int[] nodes = new int[n];

        for(int i = 0; i < n; i += 1)
            nodes[i] = in.nextInt();

        long[] sum = new long[n+1];

        for(int i = 0; i < n ; i += 1) {
            sum[i+1] = sum[i] + nodes[i];
        }

        long[][] store = new long[n][n];

        for(int i = n-1; i >= 0; i -= 1) {
            for(int j = i; j < n; j += 1) {
                if(i == j)
                    store[i][j] = 0;
                else {
                    store[i][j] = Long.MAX_VALUE;

                    for(int l = i; l < j; l += 1) {
                        store[i][j] = Math.min(store[i][j], store[i][l] + store[l+1][j] + sum[j+1]-sum[i]);
                    }
                }
            }
        }

        out.println(store[0][n-1]);
    }


    public static InputReader in = new InputReader();
    public static PrintWriter out;

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        /**
         * When you call next(), that entire line will be skipped.
         * No flushing buffers.
         * Doesn't work when you want to scan the remaining line.
         *
         * @return entire line
         */
        public String nextLine() {
            String str = "";
            try {
                str = reader.readLine();
                tokenizer = null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }
    }
}