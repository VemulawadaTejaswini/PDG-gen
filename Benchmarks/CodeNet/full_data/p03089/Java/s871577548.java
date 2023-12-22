import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.Closeable;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ALimitedInsertion solver = new ALimitedInsertion();
        solver.solve(1, in, out);
        out.close();
    }

    static class ALimitedInsertion {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                b.add(in.nextInt());
            }
            List<Integer> ans = new ArrayList<>();
            int cnt = 0;
            while (b.size() > 0 && cnt < b.size() - 1) {
                if (b.get(cnt) > cnt + 1) {
                    out.println(-1);
                    return;
                }
                if (b.get(cnt + 1) == cnt + 2) {
                    cnt++;
                    continue;
                }
//            out.println(b.get(cnt));
                ans.add(b.get(cnt));
                b.remove(cnt);
            }
//        System.err.println(Arrays.toString(b.toArray()));
//        System.err.println(Arrays.toString(ans.toArray()));
            for (int i = 0; i < b.size(); i++) {
                out.println(b.get(i));
            }
            for (int i = ans.size() - 1; i >= 0; i--) {
                out.println(ans.get(i));
            }
        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

