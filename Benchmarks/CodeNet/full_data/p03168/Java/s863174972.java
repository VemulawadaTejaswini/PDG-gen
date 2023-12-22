import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {

        private double res2;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int H = (N / 2) + 1;
            double[] arr = new double[N];
            for(int i = 0; i < N; i++)
                arr[i] = in.nextFloat();

            double[][] dp = new double[N][(N/2) + 1];
            for(double[] row : dp)
                Arrays.fill(row, -1);

            double res1 = probability(arr, 0, 0, dp);
            out.format("%.10f", res1);
        }

        public double probability(double[] arr, int numTails, int index, double[][] dp) {
            if(numTails > arr.length / 2)
                return 0.0;

            if(index == arr.length)
                return 1.0;

            if(dp[index][numTails] != -1)
                return dp[index][numTails];

            double heads = arr[index] * probability(arr, numTails, index + 1, dp);
            double tails = (1 - arr[index]) * probability(arr, numTails + 1, index + 1, dp);

            dp[index][numTails] = heads + tails;
            return heads + tails;
        }

        public void probability2(double[] arr, int numTails, int index, double prod) {
            if(numTails > arr.length / 2)
                return;

            if(index == arr.length) {
                res2 += prod;
                return;
            }

            probability2(arr, numTails, index + 1, prod * arr[index]);
            probability2(arr, numTails + 1, index + 1, prod * (1 - arr[index]));
        }



    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public float nextFloat() {
            return Float.parseFloat(next());
        }


    }
}

