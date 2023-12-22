//package arc086;

import java.io.*;
import java.util.*;

public class Main {
    public FastScanner in;
    public PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] counter = new int[n + 1];
        for (int i = 0; i < counter.length; i++) counter[i] = 0;
        for (int i = 0; i < n; i++) counter[in.nextInt()]++;
        int numbers = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) numbers++;
        }
        Arrays.sort(counter);
        int ans = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 0) continue;
            if (numbers - k <= 0) break;
            ans += counter[i];
            numbers--;
        }
        out.println(ans);
    }

    public void runIO() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    public void run() {
        try {
            in = new FastScanner(new File("input.txt"));
            out = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        solve();

        out.close();
    }

    public class FastScanner {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public FastScanner(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public FastScanner(File file) {
            try {
                reader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
