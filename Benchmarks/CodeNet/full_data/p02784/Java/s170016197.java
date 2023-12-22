import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static final int MOD = (int) (1e9 + 7);

    public void solve(InputReader in, PrintWriter out) {
        int h = in.nextInt(), n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += in.nextInt();
        }
        out.println((sum >= h ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Main().solve(in, out);
        out.flush();
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

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}