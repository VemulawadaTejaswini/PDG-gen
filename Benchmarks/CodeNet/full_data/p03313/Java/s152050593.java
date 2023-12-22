import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        int[] ans;

        public void solve(int testNumber, MyScan in, PrintWriter out) {
            int n = in.nextInt();
            ans = in.na(1 << n);
            int[][] best = new int[ans.length][1];
            for (int x = 0; x < ans.length; x++) {
                best[x][0] = x;
            }
            for (int s = 0; s < n; s++) {

                for (int i = 0; i < ans.length; i++) {

                    best[(i) | (1 << s)] = m(best[(i) | (1 << s)], best[i]);

                }
            }
            int prev = 0;
            for (int s = 1; s < (1 << n); s++) {
                prev = Math.max(prev, ans[best[s][0]] + ans[best[s][1]]);
                out.print(prev);
                out.print(' ');
            }
        }

        private int[] m(int[] ints, int[] ints1) {
            if (ints.length == 1 && ints1.length == 1 && ints[0] == ints1[0]) return ints;
            int[] ret = new int[2];
            int s0 = 0;
            int s1 = 0;
            if (ans[ints[s0]] > ans[ints1[s1]]) {
                ret[0] = ints[s0];
                s0++;
            } else {
                ret[0] = ints1[s1];
                if (ints[s0] == ints1[s1]) {
                    s0++;
                    s1++;
                } else {
                    s1++;
                }
            }

            if (ints1.length == s1 || ints.length > s0 && ans[ints[s0]] > ans[ints1[s1]]) {
                ret[1] = ints[s0];
            } else {
                ret[1] = ints1[s1];
            }

            return ret;
        }

    }

    static class MyScan {
        private final InputStream in;
        private byte[] inbuf = new byte[1024];
        public int lenbuf = 0;
        public int ptrbuf = 0;

        public MyScan(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = in.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public int[] na(int n) {
            int[] k = new int[n];
            for (int i = 0; i < n; i++) {
                k[i] = nextInt();
            }
            return k;
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

    }
}

