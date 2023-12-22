import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public long n;
        public long a;
        public HashMap<Long, Long> mp;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextLong();
            a = in.nextLong();
            mp = new HashMap<>();
            out.println(minDays(n));
        }

        public long minDays(long cookies) {
            if (cookies == 0) return 0;
            if (cookies == 1) return 1;
            if (cookies == 2) return 2;
            Long x = mp.get(cookies);
            if (x != null) return x;
            long min = cookies;
            for (long grab = 1; grab * grab <= cookies; grab++) {
                min = Math.min(min, minDays(grab) + (cookies + grab - 1) / grab + a);
            }
            for (long rest = 2; rest * rest <= cookies; rest++) {
                min = Math.min(min, minDays((cookies + rest - 1) / rest) + rest + a);
            }
            mp.put(cookies, min);
            return min;
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

