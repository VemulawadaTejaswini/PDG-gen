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
 * @author khokharnikunj8
 */

public class Main {
    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            public void run() {
                new Main().solve();
            }
        }, "1", 1 << 26).start();
    }

    void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BGraphPartition solver = new BGraphPartition();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGraphPartition {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            char[][] ar = new char[n][];
            for (int i = 0; i < n; i++) ar[i] = in.scanString().toCharArray();
            int ans = -1;
            int[] which = new int[n];
            out:
            for (int ii = 0; ii < n; ii++) {
                Arrays.fill(which, Integer.MIN_VALUE / 2);
                which[ii] = 1;
                ArrayList<Integer> cur = new ArrayList<>();
                ArrayList<Integer> nex = new ArrayList<>();
                cur.add(ii);
                int temp = 0;
                for (int i = 1; cur.size() != 0; i++) {
                    temp = Math.max(temp, i);
                    for (int j : cur) {
                        for (int k = 0; k < n; k++)
                            if (ar[j][k] == '1') {
                                if (which[k] == i - 1) continue;
                                if (which[k] == i + 1) continue;
                                if (which[k] != Integer.MIN_VALUE / 2) {
                                    continue out;
                                }
                                which[k] = i + 1;
                                nex.add(k);
                            }
                    }
                    if (nex.size() == 0) {
                        for (int j = 0; j < n; j++)
                            if (which[j] == Integer.MIN_VALUE / 2) {
                                nex.add(j);
                                break;
                            }

                    }
                    cur = nex;
                    nex = new ArrayList<>();
                }
                ans = Math.max(ans, temp);
            }
            out.println(ans);

        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int index;
        private BufferedInputStream in;
        private int total;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (index >= total) {
                index = 0;
                try {
                    total = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (total <= 0) return -1;
            }
            return buf[index++];
        }

        public int scanInt() {
            int integer = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                }
            }
            return neg * integer;
        }

        public String scanString() {
            int c = scan();
            if (c == -1) return null;
            while (isWhiteSpace(c)) c = scan();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = scan();
            } while (!isWhiteSpace(c));
            return res.toString();
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

