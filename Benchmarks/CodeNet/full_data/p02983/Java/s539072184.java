import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CRemainderMinimization2019 solver = new CRemainderMinimization2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRemainderMinimization2019 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long l = in.nextLong();
            long r = in.nextLong();
            int count = 0;
            PriorityQueue<Long> ts = new PriorityQueue<>();
            for (long i = l; i + count <= 2 * 2019; i++) {
                count++;
                if (i <= r) {
                    ts.add(i % 2019);
                }
            }
            out.println(((ts.poll()) * (ts.poll())) % 2019);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

