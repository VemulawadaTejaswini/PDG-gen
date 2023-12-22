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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public void solve(int testNumber, MyScan in, PrintWriter out) {


            int n = in.nextInt();
            long res = 0;
            while (n-- > 0) {
                int i1 = in.nextInt();
                int i2 = in.nextInt();
                res ^= ans(i1, i2);
            }
            if (res != 0) {
                out.println("Takahashi");
            } else {
                out.println("Aoki");
            }

        }

        private long ans(int i1, int i2) {
            long max = i1 / i2;
            long left = i1;

            long s = max;
            for (; s > 0; s--) {
                long start = s * i2;
                if ((left - start) % (s + 1) == 0) {
                    break;
                }
                left -= (left - start) / (s + 1) + 1;
            }
            return s;
        }

    }

    static class MyScan {
        BufferedReader br;
        StringTokenizer st;

        MyScan(BufferedReader br) {
            this.br = br;
        }

        public MyScan(InputStream in) {
            this(new BufferedReader(new InputStreamReader(in)));
        }

        public void findToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            findToken();
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

