import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int n = nextInt(), k = nextInt();

        int[] h = new int[n];

        for (int i = 0; i < h.length; i++) h[i] = nextInt();

        int[] dp = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) dp[i] = 0;
            if (i + 1 < dp.length) dp[i] = dp[i + 1] + Math.abs(h[i + 1] - h[i]);
            for (int j = i + 2; j <= Math.min(dp.length - 1, i + k); j++) {
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(h[j] - h[i]));
            }
        }

        System.out.println(dp[0]);
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

//    private static long nextLong() throws IOException {
//        return Long.parseLong(next());
//    }
//
//    //    Get a whole line.
//    private static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    private static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}