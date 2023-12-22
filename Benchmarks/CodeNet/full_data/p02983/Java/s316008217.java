import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int l = sc.nextInt() % 2019;
        int r = sc.nextInt() % 2019;
        int mini = 2019;
        for (int i = l + 1; i <= r; i++) {
            for (int j = l; j < i; j++) {
                if ((j * i) % 2019 < mini) {
                    mini = (j * i) % 2019;
                }
            }
        }
        if(mini ==2019){
        	mini = l;
        }
        System.out.println(mini);
    }


    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }


        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}