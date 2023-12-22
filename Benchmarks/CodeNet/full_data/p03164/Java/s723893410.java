import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static int n;
    static int w;
    static int[] weights;
    static int[] values;
    public static void solve() {
        n = in.nextInt();
        w = in.nextInt();

        weights = new int[n];
        values = new int[n];

        for(int i = 0; i < n; i += 1) {
            weights[i] = in.nextInt();
            values[i] = in.nextInt();
        }

        int v = 0;
        for(int value: values)
            v += value;

        long[][] store = new long[n][v+1];

        for(int j = 1; j <= v; j += 1){
            store[0][j] = values[0] == j ? weights[0] : Long.MAX_VALUE;
        }

        for(int i = 1; i < n; i += 1) {
            for(int j = 1; j <= v; j += 1) {
                store[i][j] = store[i-1][j];

                if(j-values[i] >= 0) {
                    if(store[i-1][j-values[i]] != Long.MAX_VALUE)
                        store[i][j] = Math.min(store[i][j], weights[i] + store[i-1][j-values[i]]);
                }
            }
        }
        int result = 0;
        for(int j = 1; j <= v; j += 1){
            if(store[n-1][j] <= w)
                result = Math.max(result, j);
        }
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