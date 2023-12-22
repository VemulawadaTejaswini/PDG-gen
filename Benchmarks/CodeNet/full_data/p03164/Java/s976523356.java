import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.HashMap;
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
        EKnapsack2 solver = new EKnapsack2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2 {
        long[] val;
        long[] wei;
        HashMap<Long, Long> hm;

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            long ww = in.scanLong();
            val = new long[n];
            wei = new long[n];

            hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                wei[i] = in.scanInt();
                val[i] = in.scanInt();
            }
            out.println(findit(n, ww));

        }

        long findit(int n, long WW) {
            if (n <= 0 || WW <= 0) return 0;

            long state = CodeX.compute_hash(n, WW);
            if (hm.containsKey(state)) {
                return hm.get(state);
            }

            if (WW >= wei[n - 1]) {
                long ss = findit(n - 1, WW - wei[n - 1]) + val[n - 1];
                long tt = findit(n - 1, WW);
                hm.put(state, Math.max(ss, tt));
            } else {
                long tt = findit(n - 1, WW);
                hm.put(state, tt);
            }
            return hm.get(state);

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

    static class CodeX {
        public static long compute_hash(long a, long b) {
            return (((a * 1456973978l) % 8008808808808813l) + ((b * 234792734l) % 8008808808808813l)) % 8008808808808813l;
        }

    }
}

