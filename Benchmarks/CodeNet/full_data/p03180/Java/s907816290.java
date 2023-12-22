import java.util.*;
import java.io.*;

public class Main {

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

        public float nextFloat() {
            return Float.parseFloat(next());
        }

        public double nextDouble() {
            return Float.parseFloat(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    static InputReader sc;
    static PrintWriter pw;


    public static void main(String[] args) throws Exception {
        sc = new InputReader(System.in);
        pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        long[] dp = new long[1 << n];

        for (int i = 1; i < (1 << n); i++) {
            dp[i] = Integer.MIN_VALUE;
        }

        // iterate over the masks
        for (int i = 0; i < 1 << n; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            // iterate through the rabbits that we can add
            for (int j = 0; j < n; j++) {
                if (((1 << j) & i) == 0) { // check that the current rabbit is not used
                    arrayList.add(j);
                }
            }

            int number = arrayList.size();

            for (int j = 1; j < 1 << number; j++) {

                ArrayList<Integer> arr = new ArrayList<>(); // the array with the chosen values for a specific group

                String s = Integer.toBinaryString(j);

                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == '1') arr.add(arrayList.get(s.length() - 1 - k));
                }

                /*for (int k = 0; k < number; k++) {
                    System.out.println(Integer.toBinaryString(1 << k));
                    System.out.println(Integer.toBinaryString(j));
                    if (((1 << k) & j) == 1) { // check that the current value is in the group
                        arr.add(arrayList.get(k)); // add to the group array
                    }
                }*/

                long sum = 0;

                for (int k = 0; k < arr.size(); k++) {
                    for (int l = k+1; l < arr.size(); l++) {
                        sum += grid[arr.get(k)][arr.get(l)];
                    }
                }

                int newBitMasks = i;

                for (int k: arr) {
                    newBitMasks |= 1 << k;
                }

                dp[newBitMasks] = Math.max(dp[newBitMasks], sum + dp[i]);
            }

        }

        pw.println(dp[(1 << n) - 1]);

        pw.close();
    }
}


