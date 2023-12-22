import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] nums = in.nextIntArr(n);
        int[] counts = new int[4];
        int sum = 0;
        for (int x : nums) {
            sum += x;
            counts[x]++;
        }
        double[][][] dp = new double[counts[3] + 1][counts[2] + 1][counts[1] + 1];
        for (double[][] x : dp) {
            for (double[] y : x) {
                Arrays.fill(y, -1);
            }
        }
        out.println(solve(sum, counts, dp));
        out.close();

    }

    static double solve(int sum, int[] counts, double[][][] dp) {
        if (sum == 0) return 0;
        if (dp[counts[3]][counts[2]][counts[1]] == -1) {
            double canChoose = 0;
            double rest = 0;
            for (int x : counts) canChoose += x;
            canChoose -= counts[0];

            for (int i = 1; i <= 3; i++) {
                if (counts[i] > 0) {
                    counts[i]--;
                    counts[i - 1]++;
                    rest += solve(sum - 1, counts, dp) * (counts[i] + 1);
                    counts[i]++;
                    counts[i - 1]--;
                }
            }
            
            dp[counts[3]][counts[2]][counts[1]] = ((canChoose + counts[0]) / canChoose) + (rest / canChoose);
        }
        return dp[counts[3]][counts[2]][counts[1]];
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(InputStream i) {
            br = new BufferedReader(new InputStreamReader(i));
            st = new StringTokenizer("");
        }
        public String next() throws IOException {
            if (st.hasMoreTokens()) {
                return st.nextToken();
            }
            else
                st = new StringTokenizer(br.readLine());
            return next();
        }
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
        public String nextLine() throws IOException {
            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
                return nextLine();
            }

            String ret = "";
            while (st.hasMoreTokens()) {
                ret += st.nextToken();
            }
            return ret;
        }
        public int[] nextIntArr(int size) throws IOException {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }
        public long[] nextLongArr(int size) throws IOException {
            long[] arr = new long[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
        public double[] nextDoubleArr(int size) throws IOException {
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nextDouble();
            }
            return arr;
        }
    }
}