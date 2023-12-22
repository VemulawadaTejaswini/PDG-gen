import java.io.*;
import java.util.*;
import java.math.*;

public class Main {


    public static void solve() {
        int n = in.nextInt();
        int k = in.nextInt();

        int[] moves = new int[n];
        for(int i = 0; i < n;i += 1)
            moves[i] = in.nextInt();

        boolean[] store = new boolean[k+1];

        for(int i = 1; i <= k; i += 1) {
            for(int m: moves) {
                if (m <= i && !store[i - m]) {
                    store[i] = true;
                    break;
                }
            }
        }

        String result = store[k] ? "First" : "Second";
        out.println(result);
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