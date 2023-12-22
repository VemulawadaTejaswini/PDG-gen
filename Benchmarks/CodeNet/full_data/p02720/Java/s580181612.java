import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Deque;
import java.util.ArrayDeque;
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
        DLunlunNumber solver = new DLunlunNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLunlunNumber {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int k = in.nextInt();
            Deque<Long> h = new ArrayDeque<>();
            if (k < 10) {
                out.println(k);
                return;
            }
            for (long i = 1; i < 10; i++) {
                h.addLast(i);
            }
            int cnt = 9;
            while (true) {
                long x = h.pollFirst();
                long b = x % 10;
                if (b != 0) {
                    h.addLast(x * 10 + b - 1);
                    cnt++;
                    if (cnt == k) break;
                }
                h.addLast(x * 10 + b);
                cnt++;
                if (cnt == k) break;
                if (b != 9) {
                    h.addLast(x * 10 + b + 1);
                    cnt++;
                    if (cnt == k) break;
                }
            }
            out.println(h.peekLast());
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

