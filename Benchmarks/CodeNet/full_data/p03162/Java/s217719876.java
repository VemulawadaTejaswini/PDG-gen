import java.util.*;
import java.io.*;

public class Main {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader() throws FileNotFoundException {
            // reader = new BufferedReader(new FileReader("count.in"));
            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
            tokenizer = null;
        }

        String next() { // reads in the next String
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() { // reads in the next int
            return Integer.parseInt(next());
        }

        public long nextLong() { // reads in the next long
            return Long.parseLong(next());
        }

        public double nextDouble() { // reads in the next double
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) arr[i] = nextInt();
            return arr;
        }

        public long[] nextLongArr(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) arr[i] = nextLong();
            return arr;
        }

        public double[] nextDoubleArr(int size) {
            double[] arr = new double[size];
            for (int i = 0; i < size; i++) arr[i] = nextDouble();
            return arr;
        }
    }

    public static void main(String[] args) throws IOException, FileNotFoundException {
        InputReader in = new InputReader();
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int[][] pts = new int[n][3];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                pts[i][j] = in.nextInt();

        int[][] dp = new int[n + 1][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i + 1][j] = Math.max(dp[i][(j + 1) % 3], dp[i][(j + 2) % 3]) + pts[i][j];
            }
        }

        /*
        for (int i = 0; i <= n; i++) {
            pw.println(Arrays.toString(dp[i]));
        }
         */
        pw.println(max(dp[n][0], dp[n][1], dp[n][2]));

        pw.close();
    }

    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
