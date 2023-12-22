import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author toshif
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyReader in = new MyReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, MyReader in, PrintWriter out) {
            int N0 = in.nextInt();
            int N = N0 * 3;
            long[] a = new long[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextLong();
            }

            PriorityQueue<Long> lp = new PriorityQueue<>();
            PriorityQueue<Long> rp = new PriorityQueue<>();
            long[] ls = new long[N];
            long[] rs = new long[N];
            Arrays.fill(ls, (long) 1E18);
            Arrays.fill(rs, (long) -1E18);
            long l = 0;
            for (int i = 0; i < N; i++) {
                lp.add(a[i]);
                l += a[i];

                if (lp.size() > N0) {
                    l -= lp.poll();
                }
                ls[i] = l;
            }
            long r = 0;
            for (int i = N - 1; i >= 0; i--) {
                rp.add(-a[i]);
                r += a[i];

                if (rp.size() > N0) {
                    r -= -rp.poll();
                }
                rs[i] = r;
            }

            long ma = (long) -1E18;
            for (int i = N0 - 1; i < 2 * N0; i++) {
                ma = Math.max(ma, ls[i] - rs[i + 1]);
            }

            out.println(ma);
        }

    }

    static class MyReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public MyReader(InputStream stream) {
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

