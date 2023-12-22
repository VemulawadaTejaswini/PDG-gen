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

        Block[] blocks = new Block[n];

        for (int i = 0; i < n; i++) {
            blocks[i] = new Block(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(blocks);

        long[] dp = new long[1001];

        for (int i = 0; i <= 1000; i++) {
            dp[i] = -1;
        }

        dp[0] = 0;

        for (Block block: blocks) {
            for (int i = 1000; i >= 0; i--) {
                if (i + block.weight <= 1000 && dp[i] != -1) {
                    if (block.solidness >= i) {
                        dp[i + block.weight] = Math.max(dp[i + block.weight], dp[i] + block.value);
                    }
                }
            }
        }

        long result = 0;

        for (int i = 0; i <= 1000; i++) {
            result = Math.max(result, dp[i]);
        }

        pw.println(result);

        pw.close();
    }

    static class Block implements Comparable<Block> {
        int weight, solidness, value;

        Block(int weight , int solidness, int value) {
            this.weight = weight;
            this.solidness = solidness;
            this.value = value;
        }

        @Override
        public int compareTo(Block o) {
            return (this.weight + this.solidness) - (o.weight + o.solidness);
        }
    }
}


