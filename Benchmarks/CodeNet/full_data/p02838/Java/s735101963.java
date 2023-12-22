import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        int n = nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nextLong();
        int[][] bits = new int[n][62];
        for (int j = 0; j < bits[0].length; j++) {
            long twoPow = (1L << j);
            for (int i = 0; i < n; i++) {
                long num = a[i];
                bits[i][j] = (int)((num & twoPow)>>j);
            }
        }

        long[][][] prefixSum = new long[n][62][2];

        long mod = 1000000007;
        for (int j = 0; j < prefixSum[0].length; j++) {
            for (int i = 0; i < n; i++) {
                int bit = bits[i][j];
                prefixSum[i][j][bit]++;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < prefixSum[i].length; j++) {
                prefixSum[i][j][0] += prefixSum[i - 1][j][0];
                prefixSum[i][j][1] += prefixSum[i - 1][j][1];
            }
        }

        long ans = 0;
        for (int j = 0; j < prefixSum[0].length; j++) {
            long sum = 0;
            long twoPow = (1L << j);
            for (int i = 0; i < n; i++) {
                int bit = bits[i][j];
                sum = (sum + prefixSum[n - 1][j][(bit + 1) % 2] - prefixSum[i][j][(bit + 1) % 2]) % mod;
            }

            sum = (sum * (twoPow % mod)) % mod;
            ans = (ans + sum) % mod;
        }

        System.out.println(ans);
//        System.out.println(bruteForce(a, mod));
    }

//    private static long bruteForce(long[] nums, long mod) {
//        long ans = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                ans = (ans + (nums[i] ^ nums[j])) % mod;
//            }
//        }
//        return ans;
//    }

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

    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}