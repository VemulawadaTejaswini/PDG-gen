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
            long need = 1;
            while (getCookies(need) < n) {
                need *= 2;
            }
            long lo = need / 2, hi = need;
            while (lo < hi) {
                long mid = (lo + hi) / 2;
                if (getCookies(mid) < n) lo = mid + 1;
                else hi = mid;
            }
            out.println(lo);
        }

        public long getCookies(long days) {
            if (days == 0) return 0;
            if (days == 1) return 1;
            if (days == 2) return 2;
            Long x = mp.get(days);
            if (x != null) return x;
            long make = days;
            long lo = a, hi = days - 1;
            while (hi - lo > 5) {
                long f1 = (2 * lo + hi) / 3, f2 = (lo + 2 * hi) / 3;
                long a1 = getCookies(f1 - a) * (days - f1);
                long a2 = getCookies(f2 - a) * (days - f2);
                if (a1 < a2) {
                    lo = f1;
                } else {
                    hi = f2;
                }
            }
            for (long i = lo; i <= hi; i++) {
                make = Math.max(make, getCookies(i - a) * (days - i));
            }
            mp.put(days, make);
            return make;
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

