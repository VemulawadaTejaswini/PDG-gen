import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.Writer;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author palayutm
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            long K = (1L + n) * n / 2 / 2 + 1;
            int low = 1, high = (int) 1e9;
            while (low <= high) {
                int mid = (low + high) / 2;
                FenwickTree ft = new FenwickTree(n * 2 + 1);
                long sum = 0;
                int now = n;
                ft.add(now, 1);
                for (int i = 0; i < n; i++) {
                    if (a[i] < mid) now--;
                    else now++;
                    sum += ft.query(now + 1, n * 2);
                    ft.add(now, 1);
                }
                if (sum < K) low = mid + 1;
                else high = mid - 1;
            }
            out.println(high);
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream out) {
            super(out);
        }

        public OutputWriter(Writer out) {
            super(out);
        }

        public void close() {
            super.close();
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0;
        private int ptrbuf = 0;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int readByte() {
            if (lenbuf == -1) throw new UnknownError();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = stream.read(inbuf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
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

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

    }

    static class FenwickTree {
        long[] data;

        public FenwickTree(int n) {
            data = new long[n + 1];
        }

        public void add(int at, long value) {
            at++;
            for (int i = at; i < data.length; i += (i & -i)) {
                data[i] += value;
            }
        }

        public long query(int at) {
            at++;
            long res = 0;
            for (int i = at; i > 0; i -= (i & -i)) {
                res += data[i];
            }
            return res;
        }

        public long query(int from, int to) {
            return query(to) - query(from - 1);
        }

    }
}

