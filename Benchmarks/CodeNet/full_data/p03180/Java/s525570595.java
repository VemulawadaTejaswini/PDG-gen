import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jenish
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        UGrouping solver = new UGrouping();
        solver.solve(1, in, out);
        out.close();
    }

    static class UGrouping {
        long[] dp;
        long[][] arr;
        long[] pre;
        int n;
        ArrayList<Integer> not_taken;

        void rec(int i, int mask, long score_so_far, int group) {
            if (i == not_taken.size()) {
                dp[mask] = Math.max(dp[mask], score_so_far + pre[group]);
                return;
            }

            rec(i + 1, mask, score_so_far, group);
            rec(i + 1, mask ^ (1 << not_taken.get(i)), score_so_far, group ^ (1 << not_taken.get(i)));

        }

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            n = in.scanInt();
            arr = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = in.scanLong();
                }
            }


            pre = new long[(1 << n)];
            for (int mask = 0; mask < (1 << n); mask++) {
                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) != 0) {
                        for (int j = i + 1; j < n; j++) {
                            if ((mask & (1 << j)) != 0) {
                                pre[mask] += arr[i][j];
                            }
                        }
                    }
                }
            }

            dp = new long[(1 << n)];
            Arrays.fill(dp, Long.MIN_VALUE / 2);
            dp[0] = 0;
            for (int mask = 0; mask < (1 << n); mask++) {
                not_taken = new ArrayList<>();
                for (int i = 0; i < n; i++) if ((mask & (1 << i)) == 0) not_taken.add(i);
                rec(0, mask, dp[mask], 0);
            }
            out.println(dp[(1 << n) - 1]);


        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int INDEX;
        private BufferedInputStream in;
        private int TOTAL;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (INDEX >= TOTAL) {
                INDEX = 0;
                try {
                    TOTAL = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TOTAL <= 0) return -1;
            }
            return buf[INDEX++];
        }

        public int scanInt() {
            int I = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    I *= 10;
                    I += n - '0';
                    n = scan();
                }
            }
            return neg * I;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

        public long scanLong() {
            long I = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    I *= 10;
                    I += n - '0';
                    n = scan();
                }
            }
            return neg * I;
        }

    }
}

