import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPapersPlease solver = new BPapersPlease();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPapersPlease {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            boolean f = true;
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                if (x % 2 == 0) {
                    if (x % 3 != 0 && x % 5 != 0) {
                        f = false;
                        break;
                    } else {
                        continue;
                    }
                }
            }
            if (f) out.println("APPROVED\n");
            else out.println("DENIED\n");
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

