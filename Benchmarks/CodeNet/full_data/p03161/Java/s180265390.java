import java.io.*;
import java.util.*;
import java.math.*;

public class Main {


    public static void solve() {
        int n = in.nextInt();
        int k = in.nextInt();

        int[] stones = new int[n];
        for(int i = 0; i < n; i += 1)
            stones[i] = in.nextInt();

        int[] store = new int[n];

        for(int i = 1; i < n; i += 1) {
            store[i] = Integer.MAX_VALUE;

            for(int j = 1; j <= k; j += 1) {
                if(i-j >= 0)
                    store[i] = Math.min(store[i], store[i-j] + Math.abs(stones[i] - stones[i-j]));
            }
        }

        out.println(store[n-1]);
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