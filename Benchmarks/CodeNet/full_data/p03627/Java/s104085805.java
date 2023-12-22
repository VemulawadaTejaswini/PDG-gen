import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.io.IOException;
import java.util.stream.Stream;
import java.io.Closeable;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Comparator;
import java.util.NoSuchElementException;
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
        CMakeARectangle solver = new CMakeARectangle();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMakeARectangle {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] A = in.nextIntArray(N);
            HashMap<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < N; i++) {
                m.merge(A[i], 1, Integer::sum);
            }
            long cnt1 = m.entrySet().stream().filter(i -> i.getValue() >= 2).count();
            long cnt2 = m.entrySet().stream().filter(i -> i.getValue() >= 4).count();
            if (cnt1 < 2 && cnt2 < 4) {
                out.println(0);
                return;
            }
            Integer[] l = m.entrySet().stream().filter(i -> i.getValue() >= 2).map(i -> i.getKey()).toArray(Integer[]::new);
            int l2 = m.entrySet().stream().filter(i -> i.getValue() >= 4).map(i -> i.getKey()).max(Comparator.naturalOrder()).orElse(0);
            Arrays.sort(l);
            long ans = Math.max((long) l[l.length - 1] * l[l.length - 2], (long) l2 * l2);
            out.println(ans);
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

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
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

