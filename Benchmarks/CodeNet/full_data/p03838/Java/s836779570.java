import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Taska solver = new Taska();
        solver.solve(1, in, out);
        out.close();
    }

    static class Taska {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            if (x == y) {
                out.println(0);
                return;
            }
            int d = Math.abs(Math.abs(x) - Math.abs(y));
            int ans = d;
            // make abs equal
            if (Math.abs(x + d) == Math.abs(y)) {
                if ((x + d) != y) ans++;
                out.println(ans);
                return;
            }
            ans++;
            x *= -1;
            if ((x + d) != y) ans++;
            out.println(ans);
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

    }
}

