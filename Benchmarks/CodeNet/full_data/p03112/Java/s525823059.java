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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public long max = 100000000000L;

        public long func(long x[], long val) {
            int l = 0;
            int r = x.length - 1;
            while (l < r) {
                int mid = (l + r) / 2;
                if (x[mid] < val) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }

//        System.out.println(l);
            return (x[l] - val) >= 0 ? x[l] - val : max;
        }

        public long func2(long x[], long val) {
            int l = 0;
            int r = x.length - 1;
            while (l < r) {
                int mid = (l + r) / 2;
                if (x[mid] < val) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
            if ((val - x[l]) >= 0) {
                return (val - x[l]);
            }
            return l > 0 && (val - x[l - 1]) >= 0 ? val - x[l - 1] : max;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int q = in.nextInt();
            long s[] = new long[a];
            long t[] = new long[b];
            for (int i = 0; i < a; i++) s[i] = in.nextLong();
            for (int i = 0; i < b; i++) t[i] = in.nextLong();

            while (q-- > 0) {
                long ans = max;
                long x = in.nextLong();
                if (func(s, x) != max && func(t, x) != max) {
                    ans = Math.min(ans, Math.max(func(s, x), func(t, x)));
                }
                if (func(s, x) != max && func2(t, x) != max) {
                    ans = Math.min(ans, 2 * Math.min(func(s, x), func2(t, x)) + Math.max(func(s, x), func2(t, x)));
                }
                if (func2(s, x) != max && func(t, x) != max) {
                    ans = Math.min(ans, 2 * Math.min(func2(s, x), func(t, x)) + Math.max(func2(s, x), func(t, x)));
                }
                if (func2(s, x) != max && func2(t, x) != max) {
                    ans = Math.min(ans, Math.max(func2(s, x), func2(t, x)));
                }
                out.println(ans);

//           out.println(func(s,x));
//           out.println(func(t,x));
//           out.println(func2(s,x));
//           out.println(func2(t,x));
//           out.println(Math.min(Math.max(func(s,x),func(t,x)),Math.max(func2(s,x),func2(t,x))));
            }
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

